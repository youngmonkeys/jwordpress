package org.youngmonkeys.jwordpress.test.security;

import com.tvd12.test.assertion.Asserts;
import com.tvd12.test.util.RandomUtil;
import org.testng.annotations.Test;
import org.youngmonkeys.jwordpress.security.PasswordHasher;

public class PasswordHasherTest {

    @Test
    public void verifyPasswordTest() throws Exception {
        // given
        String password = "123456";

        // when
        boolean actual = new PasswordHasher().isMatch(password, "$P$6PLiKsTE.NunJPdYNUhRj9z/cY125I.");

        // then
        Asserts.assertEquals(actual, true);
    }

    @Test
    public void verifyComplexPasswordTest() throws Exception {
        // given
        String password = "d(#eAdUqn8J#nzl7@Br!zxTq";

        // when
        boolean actual = new PasswordHasher().isMatch(password, "$P$BK2P4NGigTjicNIP5zO4eafysTs1Hr.");

        // then
        Asserts.assertEquals(actual, true);
    }

    @Test
    public void createHashTest() throws Exception {
        // given
        String password = RandomUtil.randomShortAlphabetString();
        PasswordHasher instance = new PasswordHasher();

        // when
        String actual = instance.createHash(password);

        // then
        Asserts.assertTrue(instance.isMatch(password, actual));
    }
}
