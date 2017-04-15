package clock;

import main.java.clock.BerlinClockMinute;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BerlinClockMinuteTest {
    private BerlinClockMinute berlinClockMinute;

    @Before
    public void init() {
        berlinClockMinute = new BerlinClockMinute();
    }

    /*
    TOP LAMPS
     */

    @Test
    public void shouldDisplayValidResultOnTopLampsFor23Minutes() {
        //given
        String minute = "23";

        //when
        String minuteRes = berlinClockMinute.convertTime(minute);

        //then
        assertEquals("YYRYOOOOOOO", minuteRes.substring(0, 11));
    }

    @Test
    public void shouldDisplayValidResultOnTopLampsFor0Minutes() {
        //given
        String minute = "00";

        //when
        String minuteRes = berlinClockMinute.convertTime(minute);

        //then
        assertEquals("OOOOOOOOOOO", minuteRes.substring(0, 11));
    }

    @Test
    public void shouldDisplayValidResultOnTopLampsFor47Minutes() {
        //given
        String minute = "47";

        //when
        String minuteRes = berlinClockMinute.convertTime(minute);

        //then
        assertEquals("YYRYYRYYROO", minuteRes.substring(0, 11));
    }

    @Test
    public void shouldDisplayValidResultOnTopLampsFor59Minutes() {
        //given
        String minute = "59";

        //when
        String minuteRes = berlinClockMinute.convertTime(minute);

        //then
        assertEquals("YYRYYRYYRYY", minuteRes.substring(0, 11));
    }

    @Test
    public void shouldDisplayValidResultOnTopLampsFor15Minutes() {
        //given
        String minute = "15";

        //when
        String minuteRes = berlinClockMinute.convertTime(minute);

        //then
        assertEquals("YYROOOOOOOO", minuteRes.substring(0, 11));
    }

    @Test
    public void shouldDisplayValidResultOnTopLampsFor30Minutes() {
        //given
        String minute = "30";

        //when
        String minuteRes = berlinClockMinute.convertTime(minute);

        //then
        assertEquals("YYRYYROOOOO", minuteRes.substring(0, 11));
    }

    @Test
    public void shouldDisplayValidResultOnTopLampsFor45Minutes() {
        //given
        String minute = "45";

        //when
        String minuteRes = berlinClockMinute.convertTime(minute);

        //then
        assertEquals("YYRYYRYYROO", minuteRes.substring(0, 11));
    }

    @Test
    public void shouldDisplayValidResultOnTopLampsFor19Minutes() {
        //given
        String minute = "19";

        //when
        String minuteRes = berlinClockMinute.convertTime(minute);

        //then
        assertEquals("YYROOOOOOOO", minuteRes.substring(0, 11));
    }

    /*
    BOTTOM LAMPS
     */


    @Test
    public void shouldDisplayValidResultOnBottomLampsFor23Minutes() {
        //given
        String minute = "23";

        //when
        String minuteRes = berlinClockMinute.convertTime(minute);

        //then
        assertEquals("YYYO", minuteRes.substring(12, 16));
    }

    @Test
    public void shouldDisplayValidResultOnBottomLampsFor0Minutes() {
        //given
        String minute = "00";

        //when
        String minuteRes = berlinClockMinute.convertTime(minute);

        //then
        assertEquals("OOOO", minuteRes.substring(12, 16));
    }

    @Test
    public void shouldDisplayValidResultOnBottomLampsFor47Minutes() {
        //given
        String minute = "47";

        //when
        String minuteRes = berlinClockMinute.convertTime(minute);

        //then
        assertEquals("YYOO", minuteRes.substring(12, 16));
    }

    @Test
    public void shouldDisplayValidResultOnBottomLampsFor59Minutes() {
        //given
        String minute = "59";

        //when
        String minuteRes = berlinClockMinute.convertTime(minute);

        //then
        assertEquals("YYYY", minuteRes.substring(12, 16));
    }

    @Test
    public void shouldDisplayValidResultOnBottomLampsFor15Minutes() {
        //given
        String minute = "15";

        //when
        String minuteRes = berlinClockMinute.convertTime(minute);

        //then
        assertEquals("OOOO", minuteRes.substring(12, 16));
    }

    @Test
    public void shouldDisplayValidResultOnBottomLampsFor30Minutes() {
        //given
        String minute = "30";

        //when
        String minuteRes = berlinClockMinute.convertTime(minute);

        //then
        assertEquals("OOOO", minuteRes.substring(12, 16));
    }

    @Test
    public void shouldDisplayValidResultOnBottomLampsFor45Minutes() {
        //given
        String minute = "45";

        //when
        String minuteRes = berlinClockMinute.convertTime(minute);

        //then
        assertEquals("OOOO", minuteRes.substring(12, 16));
    }

    @Test
    public void shouldDisplayValidResultOnBottomLampsFor19Minutes() {
        //given
        String minute = "19";

        //when
        String minuteRes = berlinClockMinute.convertTime(minute);

        //then
        assertEquals("YYYY", minuteRes.substring(12, 16));
    }


}
