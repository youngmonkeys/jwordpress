package org.youngmonkeys.jwordpress.repo;

import com.tvd12.ezydata.database.EzyDatabaseRepository;
import com.tvd12.ezyfox.database.annotation.EzyRepository;
import org.youngmonkeys.jwordpress.entity.WpLink;

import java.math.BigInteger;

@EzyRepository
public interface WpLinkRepository extends EzyDatabaseRepository<BigInteger, WpLink> {
}
