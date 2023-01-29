package org.youngmonkeys.jwordpress.repo;

import com.tvd12.ezydata.database.EzyDatabaseRepository;
import com.tvd12.ezyfox.database.annotation.EzyRepository;
import org.youngmonkeys.jwordpress.entity.WpTermMeta;

import java.math.BigInteger;
import java.util.List;

@EzyRepository
public interface WpTermMetaRepository extends EzyDatabaseRepository<BigInteger, WpTermMeta> {

    List<WpTermMeta> findByTermId(BigInteger termId);
}
