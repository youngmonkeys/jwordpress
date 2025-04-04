package org.youngmonkeys.jwordpress.repo;

import com.tvd12.ezydata.database.EzyDatabaseRepository;
import com.tvd12.ezyfox.database.annotation.EzyQuery;
import com.tvd12.ezyfox.database.annotation.EzyRepository;
import org.youngmonkeys.jwordpress.entity.WpTermRelationship;
import org.youngmonkeys.jwordpress.entity.WpTermRelationshipId;

import java.math.BigInteger;
import java.util.List;

@EzyRepository
public interface WpTermRelationshipRepository
    extends EzyDatabaseRepository<WpTermRelationshipId, WpTermRelationship> {

    @EzyQuery(
        "SELECT e FROM WpTermRelationship e " +
            "WHERE e.objectId > ?0 " +
            "OR (e.objectId = ?0 AND e.termTaxonomyId > ?1)"
    )
    List<WpTermRelationship> findByObjectIdGtOrEqualAndTermTaxonomyIdGt(
        BigInteger objectIdInclusive,
        BigInteger termTaxonomyId
    );
}
