package org.youngmonkeys.jwordpress.repo;

import com.tvd12.ezydata.database.EzyDatabaseRepository;
import org.youngmonkeys.jwordpress.entity.WpTermTaxonomy;

import java.math.BigInteger;

public interface WpTermTaxonomyRepository extends EzyDatabaseRepository<BigInteger, WpTermTaxonomy> {
}
