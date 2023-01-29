package org.youngmonkeys.jwordpress.repo;

import com.tvd12.ezydata.database.EzyDatabaseRepository;
import com.tvd12.ezyfox.database.annotation.EzyRepository;
import org.youngmonkeys.jwordpress.entity.WpUserMeta;

import java.math.BigInteger;
import java.util.List;

@EzyRepository
public interface WpUserMetaRepository extends EzyDatabaseRepository<BigInteger, WpUserMeta> {

    List<WpUserMeta> findByUserId(BigInteger userId);
}
