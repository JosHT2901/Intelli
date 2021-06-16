package javatest.util;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class DataUtilTest {

    @Test
    public void return_true_when_xxx()
    {
    assertThat(DataUtil.isLeapYear(1600), CoreMatchers.is(true));
        assertThat(DataUtil.isLeapYear(2000), CoreMatchers.is(true));
        assertThat(DataUtil.isLeapYear(2400), CoreMatchers.is(true));
    }

    @Test
    public void return_false_when_xxx()
    {
        assertThat(DataUtil.isLeapYear(1700), CoreMatchers.is(false));
        assertThat(DataUtil.isLeapYear(1800), CoreMatchers.is(false));
        assertThat(DataUtil.isLeapYear(1900), CoreMatchers.is(false));
    }

    @Test
    public void return_true_when_divisible_by_4()
    {
        assertThat(DataUtil.isLeapYear(1996), CoreMatchers.is(true));
        assertThat(DataUtil.isLeapYear(2004), CoreMatchers.is(true));
        assertThat(DataUtil.isLeapYear(2008), CoreMatchers.is(true));
    }
    @Test
    public void return_true_when_not_divisible_by_4()
    {
        assertThat(DataUtil.isLeapYear(2017), CoreMatchers.is(false));
        assertThat(DataUtil.isLeapYear(2018), CoreMatchers.is(false));
        assertThat(DataUtil.isLeapYear(2019), CoreMatchers.is(false));
    }

}