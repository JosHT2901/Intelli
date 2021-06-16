package javatest.util;

import org.junit.Test;

import static javatest.util.passwordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class passwordUtilTest {
    @Test
    public void when_8_letters() {
assertEquals(WEAK,passwordUtil.assetsPassword("1234567"));
    }
    @Test
    public void when_only_letters() {
        assertEquals(WEAK,passwordUtil.assetsPassword("abcdefgh"));
    }
    @Test
    public void medium_letters_and_numbers() {
        assertEquals(MEDIUM,passwordUtil.assetsPassword("abcd1234"));
    }
    @Test
    public void strong_letters_and_numbers() {
        assertEquals(STRONG,passwordUtil.assetsPassword("abcd123!"));
    }
}