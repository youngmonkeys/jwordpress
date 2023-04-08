package org.youngmonkeys.jwordpress.repo;

import com.tvd12.ezydata.database.EzyDatabaseRepository;
import com.tvd12.ezyfox.database.annotation.EzyRepository;
import com.tvd12.ezyfox.util.Next;
import org.youngmonkeys.jwordpress.entity.WpUserMeta;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@EzyRepository
public interface WpUserMetaRepository extends EzyDatabaseRepository<BigInteger, WpUserMeta> {

    List<WpUserMeta> findByUserId(BigInteger userId);

    Optional<WpUserMeta> findByMetaKeyAndMetaValue(
        String metaKey,
        String metaValue
    );

    Optional<WpUserMeta> findByUserIdAndMetaKey(
        BigInteger postId,
        String metaKey
    );

    List<WpUserMeta> findByMetaIdGtAndMetaKey(
        BigInteger metaIdExclusive,
        String metaKey,
        Next next
    );

    List<WpUserMeta> findByMetaIdGtAndMetaKeyAndMetaValue(
        BigInteger metaIdExclusive,
        String metaKey,
        String metaValue,
        Next next
    );
}
