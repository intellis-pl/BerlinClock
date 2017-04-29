package main.java.helpers;

import org.junit.Test;

import static main.java.config.LampConfig.LAMPS;
import static main.java.config.LampConfig.MINUTE_TOP_LAMPS;
import static main.java.config.LampConfig.UNIT_PER_LAMP;
import static main.java.helpers.LampSwitchManager.switchBottomLampsForMinutes;
import static main.java.helpers.LampSwitchManager.switchLampsForHours;
import static main.java.helpers.LampSwitchManager.switchTopLampsForMinutes;
import static org.junit.Assert.assertEquals;


public class LampSwitchManagerTest {
    @Test
    public void switchRedColorTopLampFor_45Minutes() throws Exception {
        //given
        Integer countedMinutes = 45 / UNIT_PER_LAMP;
        Integer position = 9;
        StringBuilder  topLights = new StringBuilder(MINUTE_TOP_LAMPS);

        //when
        StringBuilder  switchedLights = switchTopLampsForMinutes(position, countedMinutes, topLights);

        //then
        assertEquals("OOOOOOOOROO", switchedLights.toString());
    }

    @Test
    public void switchYellowColorTopLampFor_44Minutes() throws Exception {
        //given
        Integer countedMinutes = 44 / UNIT_PER_LAMP;
        Integer position = 8;
        StringBuilder  topLights = new StringBuilder(MINUTE_TOP_LAMPS);

        //when
        StringBuilder  switchedLights = switchTopLampsForMinutes(position, countedMinutes, topLights);

        //then
        assertEquals("OOOOOOOYOOO", switchedLights.toString());
    }

    @Test
    public void switchYellowColorTopLampFor_50Minutes() throws Exception {
        //given
        Integer countedMinutes = 50 / UNIT_PER_LAMP;
        Integer position = 10;
        StringBuilder  topLights = new StringBuilder(MINUTE_TOP_LAMPS);

        //when
        StringBuilder  switchedLights = switchTopLampsForMinutes(position, countedMinutes, topLights);

        //then
        assertEquals("OOOOOOOOOYO", switchedLights.toString());
    }

    @Test
    public void switchBottomLampFor_7Minutes() throws Exception {
        //given
        Integer countedMinutes = 7 % UNIT_PER_LAMP;
        Integer position = 2;
        StringBuilder  topLights = new StringBuilder(LAMPS);

        //when
        StringBuilder  switchedLights = switchBottomLampsForMinutes(position, countedMinutes, topLights);

        //then
        assertEquals("OYOO", switchedLights.toString());
    }

    @Test
    public void switchBottomLampFor_3Minutes() throws Exception {
        //given
        Integer countedMinutes = 3 % UNIT_PER_LAMP;
        Integer position = 1;
        StringBuilder  topLights = new StringBuilder(LAMPS);

        //when
        StringBuilder  switchedLights = switchBottomLampsForMinutes(position, countedMinutes, topLights);

        //then
        assertEquals("YOOO", switchedLights.toString());
    }

    @Test
    public void switchBottomLampFor_9Minutes() throws Exception {
        //given
        Integer countedMinutes = 9 % UNIT_PER_LAMP;
        Integer position = 4;
        StringBuilder  topLights = new StringBuilder(LAMPS);

        //when
        StringBuilder  switchedLights = switchBottomLampsForMinutes(position, countedMinutes, topLights);

        //then
        assertEquals("OOOY", switchedLights.toString());
    }

    @Test
    public void switchTopLampFor_23Hours() throws Exception {
        //given
        Integer countedMinutes = 23 / UNIT_PER_LAMP;
        Integer position = 4;
        StringBuilder  topLights = new StringBuilder(LAMPS);

        //when
        StringBuilder  switchedLights = switchLampsForHours(position, countedMinutes, topLights);

        //then
        assertEquals("OOOR", switchedLights.toString());
    }

    @Test
    public void switchBottomLampFor_23Hours() throws Exception {
        //given
        Integer countedMinutes = 23 / UNIT_PER_LAMP;
        Integer position = 4;
        StringBuilder  topLights = new StringBuilder(LAMPS);

        //when
        StringBuilder  switchedLights = switchLampsForHours(position, countedMinutes, topLights);

        //then
        assertEquals("OOOR", switchedLights.toString());
    }

}