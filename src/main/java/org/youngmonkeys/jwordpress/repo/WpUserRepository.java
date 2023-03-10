package org.youngmonkeys.jwordpress.repo;

import com.tvd12.ezydata.database.EzyDatabaseRepository;
import com.tvd12.ezyfox.database.annotation.EzyQuery;
import com.tvd12.ezyfox.database.annotation.EzyRepository;
import com.tvd12.ezyfox.util.Next;
import org.youngmonkeys.jwordpress.entity.WpUser;

import java.util.List;

@EzyRepository
public interface WpUserRepository extends EzyDatabaseRepository<Long, WpUser> {

    @EzyQuery(
        "SELECT e FROM WpUser e " +
            "WHERE e.id > ?0 ORDER BY e.userRegistered ASC"
    )
    List<WpUser> findByIdExclusive(Long userId, Next next);
}
