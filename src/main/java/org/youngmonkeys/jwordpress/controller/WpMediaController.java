package org.youngmonkeys.jwordpress.controller;

import com.tvd12.ezyfox.bean.annotation.EzyAutoBind;
import com.tvd12.ezyfox.stream.EzyInputStreamLoader;
import com.tvd12.ezyfox.util.EzyFileUtil;
import com.tvd12.ezyhttp.core.exception.HttpBadRequestException;
import com.tvd12.ezyhttp.core.resources.ResourceDownloadManager;
import com.tvd12.ezyhttp.server.core.annotation.Async;
import com.tvd12.ezyhttp.server.core.annotation.DoGet;
import com.tvd12.ezyhttp.server.core.annotation.PathVariable;
import com.tvd12.ezyhttp.server.core.handler.ResourceRequestHandler;
import com.tvd12.ezyhttp.server.core.request.RequestArguments;
import lombok.Setter;

import java.io.File;
import java.nio.file.Paths;
import java.util.function.Supplier;

import static java.util.Collections.singletonMap;

@Setter
public abstract class WpMediaController {

    @EzyAutoBind
    protected EzyInputStreamLoader inputStreamLoader;

    @EzyAutoBind
    protected ResourceDownloadManager resourceDownloadManager;

    protected final Supplier<File> uploadFolderSupplier;

    public WpMediaController(
        Supplier<File> uploadFolderSupplier
    ) {
        this.uploadFolderSupplier = uploadFolderSupplier;
    }

    @Async
    @DoGet("/wp-content/uploads/{fileName}")
    public void wpContentUploadsFileNameGet(
        RequestArguments requestArguments,
        @PathVariable("fileName") String fileName
    ) throws Exception {
        doDownloadFile(requestArguments, fileName);
    }

    @Async
    @DoGet("/wp-content/uploads/{year}/{fileName}")
    public void wpContentUploadsYearFileNameGet(
        RequestArguments requestArguments,
        @PathVariable("year") String year,
        @PathVariable("fileName") String fileName
    ) throws Exception {
        doDownloadFile(requestArguments, year, fileName);
    }

    @Async
    @DoGet("/wp-content/uploads/{year}/{month}/{fileName}")
    public void wpContentUploadsYearMonthFileNameGet(
        RequestArguments requestArguments,
        @PathVariable("year") String year,
        @PathVariable("month") String month,
        @PathVariable("fileName") String fileName
    ) throws Exception {
        doDownloadFile(requestArguments, year, month, fileName);
    }

    @Async
    @DoGet("/wp-content/uploads/{year}/{month}/{day}/{fileName}")
    public void wpContentUploadsYearMonthDayFileNameGet(
        RequestArguments requestArguments,
        @PathVariable("year") String year,
        @PathVariable("month") String month,
        @PathVariable("day") String day,
        @PathVariable("fileName") String fileName
    ) throws Exception {
        doDownloadFile(requestArguments, year, month, day, fileName);
    }

    public void doDownloadFile(
        RequestArguments requestArguments,
        String... paths
    ) throws Exception {
        validateFilePaths(paths);
        File resourcePath = Paths.get(
            this.uploadFolderSupplier.get().toString(),
            paths
        ).toFile();
        String fileName = paths[paths.length - 1];
        if (!resourcePath.exists()) {
            throw newMediaNotFoundException(fileName);
        } else {
            String extension = EzyFileUtil.getFileExtension(fileName);
            ResourceRequestHandler handler = new ResourceRequestHandler(
                resourcePath.toString(),
                resourcePath.toString(),
                extension,
                this.inputStreamLoader,
                this.resourceDownloadManager
            );
            handler.handle(requestArguments);
        }
    }

    protected abstract Exception newMediaNotFoundException(
        String fileName
    );

    private void validateFilePaths(
        String... paths
    ) {
        for (String path : paths) {
            if (path.contains("..")) {
                throw new HttpBadRequestException(
                    singletonMap("filePath", "invalid")
                );
            }
        }
    }
}
