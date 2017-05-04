package main.java.dto;


import org.junit.Assert;
import org.junit.Test;

public class BerlinClockTimeDTOTest {

    @Test
    public void shouldContainsValidBerlinClockValues() {
        //given
        String top = "RROO";
        String bottom = "RRRO";

        //when
        BerlinClockTimeDTO berlinClockTime = new BerlinClockTimeDTO(top, bottom);

        //then
        Assert.assertEquals(top, berlinClockTime.toString().substring(0, 4));
        Assert.assertEquals(bottom, berlinClockTime.toString().substring(5, 9));
    }
}