package org.youngmonkeys.jwordpress.repo;

import com.tvd12.ezydata.database.EzyDatabaseRepository;
import com.tvd12.ezyfox.database.annotation.EzyRepository;
import org.youngmonkeys.jwordpress.entity.WpUsermeta;

import java.math.BigInteger;
import java.util.List;

@EzyRepository
public interface WpUsermetaRepository extends EzyDatabaseRepository<BigInteger, WpUsermeta> {

    List<WpUsermeta> findByUserId(BigInteger userId);
}
