package org.youngmonkeys.jwordpress.repo;

import com.tvd12.ezydata.database.EzyDatabaseRepository;
import org.youngmonkeys.jwordpress.entity.WpTerm;

import java.math.BigInteger;

public interface WpTermRepository extends EzyDatabaseRepository<BigInteger, WpTerm> {
}
