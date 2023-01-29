package org.youngmonkeys.jwordpress.repo;

import com.tvd12.ezydata.database.EzyDatabaseRepository;
import com.tvd12.ezyfox.database.annotation.EzyRepository;
import org.youngmonkeys.jwordpress.entity.WpCommentmeta;

import java.math.BigInteger;
import java.util.List;

@EzyRepository
public interface WpCommentmetaRepository extends EzyDatabaseRepository<BigInteger, WpCommentmeta> {

    List<WpCommentmeta> findByCommentId(BigInteger commentId);
}
