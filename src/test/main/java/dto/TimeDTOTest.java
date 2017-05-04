package main.java.dto;

import org.junit.Assert;
import org.junit.Test;

public class TimeDTOTest {

    @Test
    public void shouldHoldMinutes() {
        //given
        String time = "23";

        //when
        TimeDTO timeDTO = new TimeDTO
                .Builder()
                .appendMinutes(time)
                .build();

        Assert.assertEquals(time, timeDTO.getMinute());
    }

    @Test
    public void shouldHoldHours() {
        //given
        String time = "11";

        //when
        TimeDTO timeDTO = new TimeDTO
                .Builder()
                .appendHours(time)
                .build();

        Assert.assertEquals(time, timeDTO.getHour());
    }

    @Test
    public void shouldHoldSeconds() {
        //given
        String time = "44";

        //when
        TimeDTO timeDTO = new TimeDTO
                .Builder()
                .appendSeconds(time)
                .build();

        Assert.assertEquals(time, timeDTO.getSecond());
    }

}