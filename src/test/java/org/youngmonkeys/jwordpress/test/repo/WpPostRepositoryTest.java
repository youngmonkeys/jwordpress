package org.youngmonkeys.jwordpress.test.repo;

import com.tvd12.ezyfox.bean.EzyBeanContext;
import com.tvd12.ezyfox.util.Next;
import org.youngmonkeys.jwordpress.entity.WpPost;
import org.youngmonkeys.jwordpress.entity.WpPostMeta;
import org.youngmonkeys.jwordpress.repo.WpPostRepository;
import org.youngmonkeys.jwordpress.repo.WpPostMetaRepository;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

public class WpPostRepositoryTest {

    public static void main(String[] args) {
        final EzyBeanContext beanContext = EzyBeanContext.builder()
                .scan("org.youngmonkeys.jwordpress")
                .build();

        WpPostRepository wpPostRepository = beanContext.getBeanCast(WpPostRepository.class);
        List<WpPost> wpPosts = wpPostRepository.findLastPostByPostModifiedAndId(
            LocalDateTime.of(1970, 1, 1, 0, 0),
            BigInteger.ZERO,
            Next.limit(100)
        );
        System.out.println(wpPosts);
    }
}
