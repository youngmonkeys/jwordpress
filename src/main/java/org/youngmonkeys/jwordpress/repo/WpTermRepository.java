package org.youngmonkeys.jwordpress.repo;

import com.tvd12.ezydata.database.EzyDatabaseRepository;
import com.tvd12.ezyfox.database.annotation.EzyRepository;
import com.tvd12.ezyfox.util.Next;
import org.youngmonkeys.jwordpress.entity.WpTerm;

import java.math.BigInteger;
import java.util.List;

@EzyRepository
public interface WpTermRepository extends EzyDatabaseRepository<BigInteger, WpTerm> {

    List<WpTerm> findByTermIdGt(
        BigInteger idExclusive,
        Next next
    );
}
