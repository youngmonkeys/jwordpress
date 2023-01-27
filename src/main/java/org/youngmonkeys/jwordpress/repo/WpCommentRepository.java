package org.youngmonkeys.jwordpress.repo;

import com.tvd12.ezydata.database.EzyDatabaseRepository;
import org.youngmonkeys.jwordpress.entity.WpComment;

import java.math.BigInteger;

public interface WpCommentRepository extends EzyDatabaseRepository<BigInteger, WpComment> {
}
