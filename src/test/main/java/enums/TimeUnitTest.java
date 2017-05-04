package main.java.enums;


import org.junit.Assert;
import org.junit.Test;

public class TimeUnitTest {

    @Test
    public void shouldHasMinuteTimeUnit() {
        //given
        String timeUnitName = "MINUTES";

        //when
        TimeUnit timeUnit = TimeUnit.valueOf(timeUnitName);

        //then
        Assert.assertEquals(timeUnitName, timeUnit.toString());
    }

    @Test
    public void shouldHasHoursTimeUnit() {
        //given
        String timeUnitName = "HOURS";

        //when
        TimeUnit timeUnit = TimeUnit.valueOf(timeUnitName);

        //then
        Assert.assertEquals(timeUnitName, timeUnit.toString());
    }

    @Test
    public void shouldHasSecondsTimeUnit() {
        //given
        String timeUnitName = "SECONDS";

        //when
        TimeUnit timeUnit = TimeUnit.valueOf(timeUnitName);

        //then
        Assert.assertEquals(timeUnitName, timeUnit.toString());
    }

}