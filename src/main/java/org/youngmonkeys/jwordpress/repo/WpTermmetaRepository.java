package org.youngmonkeys.jwordpress.repo;

import com.tvd12.ezydata.database.EzyDatabaseRepository;
import com.tvd12.ezyfox.database.annotation.EzyRepository;
import org.youngmonkeys.jwordpress.entity.WpTermmeta;

import java.math.BigInteger;
import java.util.List;

@EzyRepository
public interface WpTermmetaRepository extends EzyDatabaseRepository<BigInteger, WpTermmeta> {

    List<WpTermmeta> findByTermId(BigInteger termId);
}
