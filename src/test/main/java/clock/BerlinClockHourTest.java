package main.java.clock;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BerlinClockHourTest {
    private BerlinClockHour berlinClockHour;

    @Before
    public void init() {
        berlinClockHour = new BerlinClockHour();
    }

    /*
    TOP LAMPS
     */

    @Test
    public void shouldDisplayValidRedLightsOnTopLampsFor11AM() {
        //given
        String hour11 = "11";

        //when
        String hour11Res = berlinClockHour.convertTime(hour11);

        //then
        assertEquals("RROO", hour11Res.substring(0, 4));
    }

    @Test
    public void shouldDisplayValidRedLightsOnTopLampsFor11PM() {
        //given
        String hour23 = "23";

        //when
        String hour23Res = berlinClockHour.convertTime(hour23);

        //then
        assertEquals("RRRR", hour23Res.substring(0, 4));
    }

    @Test
    public void shouldDisplayValidRedLightsOnTopLampsFor6PM() {
        //given
        String hour18 = "18";

        //when
        String hour18Res = berlinClockHour.convertTime(hour18);

        //then
        assertEquals("RRRO", hour18Res.substring(0, 4));
    }

    @Test
    public void shouldDisplayValidRedLightsOnTopLampsFor12AM() {
        //given
        String hour0 = "00";

        //when
        String hour0Res = berlinClockHour.convertTime(hour0);

        //then
        assertEquals("OOOO", hour0Res.substring(0, 4));
    }

    @Test
    public void shouldDisplayValidRedLightsOnTopLampsFor12PM() {
        //given
        String hour24 = "24";

        //when
        String hour24Res = berlinClockHour.convertTime(hour24);

        //then
        assertEquals("RRRR", hour24Res.substring(0, 4));
    }

    /*
    BOTTOM LAMPS
     */


    @Test
    public void shouldDisplayValidRedLightsOnBottomLampsFor11AM() {
        //given
        String hour11 = "11";

        //when
        String hour11Res = berlinClockHour.convertTime(hour11);

        //then
        assertEquals("ROOO", hour11Res.substring(5, 9));
    }

    @Test
    public void shouldDisplayValidRedLightsOnBottomLampsFor11PM() {
        //given
        String hour = "23";

        //when
        String hourRes = berlinClockHour.convertTime(hour);

        //then
        assertEquals("RRRO", hourRes.substring(5, 9));
    }

    @Test
    public void shouldDisplayValidRedLightsOnBottomLampsFor6PM() {
        //given
        String hour = "18";

        //when
        String hourRes = berlinClockHour.convertTime(hour);

        //then
        assertEquals("RRRO", hourRes.substring(5, 9));
    }

    @Test
    public void shouldDisplayValidRedLightsOnBottomLampsFor12AM() {
        //given
        String hour = "00";

        //when
        String hourRes = berlinClockHour.convertTime(hour);

        //then
        assertEquals("OOOO", hourRes.substring(5, 9));
    }

    @Test
    public void shouldDisplayValidRedLightsOnBottomLampsFor12PM() {
        //given
        String hour = "24";

        //when
        String hourRes = berlinClockHour.convertTime(hour);

        //then
        assertEquals("RRRR", hourRes.substring(5, 9));
    }


    @Test
    public void shouldReturnValidResultForHour21() {
        //given
        String hour = "21";

        //when
        String clockResult = berlinClockHour.convertTime(hour);

        //then
        assertEquals("RRRR\nROOO", clockResult);
    }
}
