package main.java.helpers;

import org.junit.Test;

import static main.java.config.LampConfig.UNIT_PER_LAMP;
import static main.java.helpers.LampColorManager.switchRedLampForHours;
import static main.java.helpers.LampColorManager.switchYellowLampForMinutes;
import static main.java.helpers.LampSwitchForMinutesManager.switchTopLampsForMinutes;
import static org.junit.Assert.assertEquals;


public class LampSwitchManagerTest {
    @Test
    public void switchRedColorTopLampFor_45Minutes() throws Exception {
        //given
        Integer countedMinutes = 45 / UNIT_PER_LAMP;
        Integer position = 9;

        //when
        String  switchedLights = switchTopLampsForMinutes(position, countedMinutes);

        //then
        assertEquals("R", switchedLights);
    }

    @Test
    public void switchYellowColorTopLampFor_44Minutes() throws Exception {
        //given
        Integer countedMinutes = 44 / UNIT_PER_LAMP;
        Integer position = 8;

        //when
        String  switchedLights = switchTopLampsForMinutes(position, countedMinutes);

        //then
        assertEquals("Y", switchedLights);
    }

    @Test
    public void switchYellowColorTopLampFor_50Minutes() throws Exception {
        //given
        Integer countedMinutes = 50 / UNIT_PER_LAMP;
        Integer position = 10;

        //when
        String  switchedLights = switchTopLampsForMinutes(position, countedMinutes);

        //then
        assertEquals("Y", switchedLights);
    }

    @Test
    public void switchBottomLampFor_7Minutes() throws Exception {
        //given
        Integer countedMinutes = 7 % UNIT_PER_LAMP;
        Integer position = 2;

        //when
        String  switchedLights = switchYellowLampForMinutes(position, countedMinutes);

        //then
        assertEquals("Y", switchedLights);
    }

    @Test
    public void switchBottomLampFor_3Minutes() throws Exception {
        //given
        Integer countedMinutes = 3 % UNIT_PER_LAMP;
        Integer position = 1;

        //when
        String  switchedLights = switchYellowLampForMinutes(position, countedMinutes);

        //then
        assertEquals("Y", switchedLights);
    }

    @Test
    public void switchBottomLampFor_9Minutes() throws Exception {
        //given
        Integer countedMinutes = 9 % UNIT_PER_LAMP;
        Integer position = 4;

        //when
        String  switchedLights = switchYellowLampForMinutes(position, countedMinutes);

        //then
        assertEquals("Y", switchedLights);
    }

    @Test
    public void switchTopLampFor_23Hours() throws Exception {
        //given
        Integer countedMinutes = 23 / UNIT_PER_LAMP;
        Integer position = 4;

        //when
        String  switchedLights = switchRedLampForHours(position, countedMinutes);

        //then
        assertEquals("R", switchedLights);
    }

}