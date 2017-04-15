package clock;

import main.java.clock.BerlinClockSecond;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BerlinClockSecondTest {
    private BerlinClockSecond berlinClockSecond;

    @Before
    public void init() {
        berlinClockSecond = new BerlinClockSecond();
    }

    @Test
    public void yellowLampShouldBlinkFor0Sec() {
        //given
        String second = "00";

        //when
        String secondRes = berlinClockSecond.convertTime(second);

        //then
        assertEquals("Y", secondRes);
    }

    @Test
    public void yellowLampShouldNotBlinkFor1Sec() {
        //given
        String second = "01";

        //when
        String secondRes = berlinClockSecond.convertTime(second);

        //then
        assertEquals("O", secondRes);
    }

    @Test
    public void yellowLampShouldBlinkFor2Sec() {
        //given
        String second = "02";

        //when
        String secondRes = berlinClockSecond.convertTime(second);

        //then
        assertEquals("Y", secondRes);
    }

    @Test
    public void yellowLampShouldBlinkFor4Sec() {
        //given
        String second = "04";

        //when
        String secondRes = berlinClockSecond.convertTime(second);

        //then
        assertEquals("Y", secondRes);
    }

    @Test
    public void yellowLampShouldNotBlinkFor5Sec() {
        //given
        String second = "05";

        //when
        String secondRes = berlinClockSecond.convertTime(second);

        //then
        assertEquals("O", secondRes);
    }

    @Test
    public void yellowLampShouldBlinkFor8Sec() {
        //given
        String second = "08";

        //when
        String secondRes = berlinClockSecond.convertTime(second);

        //then
        assertEquals("Y", secondRes);
    }
}
