package org.youngmonkeys.jwordpress.repo;

import com.tvd12.ezydata.database.EzyDatabaseRepository;
import com.tvd12.ezyfox.database.annotation.EzyRepository;
import org.youngmonkeys.jwordpress.entity.WpPostMeta;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@EzyRepository
public interface WpPostMetaRepository extends EzyDatabaseRepository<BigInteger, WpPostMeta> {

    List<WpPostMeta> findByPostId(BigInteger postId);

    Optional<WpPostMeta> findByMetaKeyAndMetaValue(
        String metaKey,
        String metaValue
    );

    Optional<WpPostMeta> findByPostIdAndMetaKey(
        BigInteger postId,
        String metaKey
    );
}
