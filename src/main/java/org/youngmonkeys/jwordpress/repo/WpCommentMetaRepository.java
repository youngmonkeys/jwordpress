package org.youngmonkeys.jwordpress.repo;

import com.tvd12.ezydata.database.EzyDatabaseRepository;
import com.tvd12.ezyfox.database.annotation.EzyRepository;
import com.tvd12.ezyfox.util.Next;
import org.youngmonkeys.jwordpress.entity.WpCommentMeta;

import java.math.BigInteger;
import java.util.List;

@EzyRepository
public interface WpCommentMetaRepository
    extends EzyDatabaseRepository<BigInteger, WpCommentMeta> {

    List<WpCommentMeta> findByCommentId(BigInteger commentId);

    List<WpCommentMeta> findByMetaIdGtAndMetaKey(
        BigInteger metaIdExclusive,
        String metaKey,
        Next next
    );

    List<WpCommentMeta> findByMetaIdGtAndMetaKeyAndMetaValue(
        BigInteger metaIdExclusive,
        String metaKey,
        String metaValue,
        Next next
    );
}
