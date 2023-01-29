package org.youngmonkeys.jwordpress.repo;

import com.tvd12.ezydata.database.EzyDatabaseRepository;
import com.tvd12.ezyfox.database.annotation.EzyQuery;
import com.tvd12.ezyfox.database.annotation.EzyRepository;
import com.tvd12.ezyfox.util.Next;
import org.youngmonkeys.jwordpress.entity.WpComment;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

@EzyRepository
public interface WpCommentRepository extends EzyDatabaseRepository<BigInteger, WpComment> {

    @EzyQuery(
        "SELECT e FROM WpComment e " +
            "WHERE e.commentDate > ?0 " +
            "OR (e.commentDate = ?0 AND e.commentId = ?1) " +
            "ORDER BY e.commentDate ASC"
    )
    List<WpComment> findLastCommendByCommentDateAndId(
        LocalDateTime commentDate,
        BigInteger commentIdExclusive,
        Next next
    );
}
