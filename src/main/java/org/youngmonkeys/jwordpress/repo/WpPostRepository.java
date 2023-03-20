package org.youngmonkeys.jwordpress.repo;

import com.tvd12.ezydata.database.EzyDatabaseRepository;
import com.tvd12.ezyfox.database.annotation.EzyQuery;
import com.tvd12.ezyfox.database.annotation.EzyRepository;
import com.tvd12.ezyfox.util.Next;
import org.youngmonkeys.jwordpress.entity.WpPost;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

@EzyRepository
public interface WpPostRepository extends EzyDatabaseRepository<Long, WpPost> {

    List<WpPost> findByIdGtAndPostStatus(
        BigInteger idExclusive,
        String status,
        Next next
    );

    @EzyQuery(
        "SELECT e FROM WpPost e " +
            "WHERE e.postModified > ?0 OR (e.postModified = ?0 AND e.id > ?1) " +
            "ORDER BY e.postModified ASC"
    )
    List<WpPost> findLastPostByPostModifiedAndId(
        LocalDateTime postModified,
        BigInteger postIdExclusive,
        Next next
    );
}
