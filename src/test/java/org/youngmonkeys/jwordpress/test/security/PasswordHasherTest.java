package org.youngmonkeys.jwordpress.test.security;

import com.tvd12.test.assertion.Asserts;
import org.testng.annotations.Test;
import org.youngmonkeys.jwordpress.security.PasswordHasher;

public class PasswordHasherTest {

    @Test
    public void hashPassword() {
        // given
        String password = "123456";

        // when
        boolean actual = new PasswordHasher().isMatch(password, "$P$6PLiKsTE.NunJPdYNUhRj9z/cY125I.");

        // then
        Asserts.assertEquals(actual, true);
    }
}
