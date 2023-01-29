package org.youngmonkeys.jwordpress.test.repo;

import com.tvd12.ezyfox.bean.EzyBeanContext;
import com.tvd12.ezyfox.util.Next;
import org.youngmonkeys.jwordpress.repo.WpCommentRepository;

import java.math.BigInteger;
import java.time.LocalDateTime;

public class WpCommentRepositoryTest {

    public static void main(String[] args) {
        final EzyBeanContext beanContext = EzyBeanContext.builder()
                .scan("org.youngmonkeys.jwordpress")
                .build();

        WpCommentRepository wpPostRepository = beanContext.getBeanCast(
            WpCommentRepository.class
        );
        System.out.println(
            wpPostRepository.findLastCommendByCommentDateAndId(
                LocalDateTime.of(1970, 1, 1, 0, 0),
                BigInteger.ZERO,
                Next.fromLimit(100)
            )
        );
    }
}
