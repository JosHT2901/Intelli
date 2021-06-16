package javatest;
import javatest.util.StringUtil;
import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    @Test
    public void test_string_one(){
       Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void test_string_multiple(){
        Assert.assertEquals("holaholahola",StringUtil.repeat("hola", 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_strig_negativo(){
        StringUtil.repeat("hola", -1);
    }


}