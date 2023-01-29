package org.youngmonkeys.jwordpress.test.repo;

import com.tvd12.ezyfox.bean.EzyBeanContext;
import org.youngmonkeys.jwordpress.entity.WpPostMeta;
import org.youngmonkeys.jwordpress.repo.WpPostMetaRepository;

import java.math.BigInteger;
import java.util.List;

public class WpPostmetaRepositoryTest {

    public static void main(String[] args) {
        final EzyBeanContext beanContext = EzyBeanContext.builder()
            .scan("org.youngmonkeys.jwordpress")
            .build();
        WpPostMetaRepository wpPostmetaRepository = beanContext.getBeanCast(WpPostMetaRepository.class);
        List<WpPostMeta> wpPostMetas = wpPostmetaRepository.findByPostId(BigInteger.valueOf(8876));
        System.out.println(wpPostMetas);
    }
}
