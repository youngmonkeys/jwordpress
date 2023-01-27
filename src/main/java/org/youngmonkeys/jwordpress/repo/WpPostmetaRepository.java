package org.youngmonkeys.jwordpress.repo;

import com.tvd12.ezydata.database.EzyDatabaseRepository;
import org.youngmonkeys.jwordpress.entity.WpPostmeta;

import java.math.BigInteger;

public interface WpPostmetaRepository extends EzyDatabaseRepository<BigInteger, WpPostmeta> {
}
