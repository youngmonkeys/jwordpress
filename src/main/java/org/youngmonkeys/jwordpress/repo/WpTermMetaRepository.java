package org.youngmonkeys.jwordpress.repo;

import com.tvd12.ezydata.database.EzyDatabaseRepository;
import com.tvd12.ezyfox.database.annotation.EzyRepository;
import com.tvd12.ezyfox.util.Next;
import org.youngmonkeys.jwordpress.entity.WpTermMeta;

import java.math.BigInteger;
import java.util.List;

@EzyRepository
public interface WpTermMetaRepository extends EzyDatabaseRepository<BigInteger, WpTermMeta> {

    List<WpTermMeta> findByTermId(BigInteger termId);

    List<WpTermMeta> findByMetaIdGtAndMetaKey(
        BigInteger metaIdExclusive,
        String metaKey,
        Next next
    );

    List<WpTermMeta> findByMetaIdGtAndMetaKeyAndMetaValue(
        BigInteger metaIdExclusive,
        String metaKey,
        String metaValue,
        Next next
    );
}
