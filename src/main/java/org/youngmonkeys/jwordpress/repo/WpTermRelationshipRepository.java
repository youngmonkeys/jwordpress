package org.youngmonkeys.jwordpress.repo;

import com.tvd12.ezydata.database.EzyDatabaseRepository;
import com.tvd12.ezyfox.database.annotation.EzyRepository;
import org.youngmonkeys.jwordpress.entity.WpTermRelationship;

import java.math.BigInteger;

@EzyRepository
public interface WpTermRelationshipRepository extends EzyDatabaseRepository<BigInteger, WpTermRelationship> {
}
