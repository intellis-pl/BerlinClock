package main.java.helpers;

import org.junit.Test;

import static main.java.helpers.LampColorManager.*;
import static main.java.config.LampConfig.*;
import static org.junit.Assert.assertEquals;

public class LampColorManagerTest {
    @Test
    public void shouldSwitchRedLampsForMinutesOnThirdPosition_15Minutes() {
        //given
        Integer countedMinutes = 15 / UNIT_PER_LAMP;
        Integer position = 3;
        StringBuilder  topLights = new StringBuilder(MINUTE_TOP_LAMPS);

        //when
        StringBuilder  switchedLights = switchRedLampForMinutes(position, countedMinutes,topLights);

        //then
        assertEquals("OOROOOOOOOO", switchedLights.toString());
    }

    @Test
    public void shouldSwitchRedLampsForMinutesOnSixthPosition_30Minutes() {
        //given
        Integer countedMinutes = 30 / UNIT_PER_LAMP;
        Integer position = 6;
        StringBuilder  topLights = new StringBuilder(MINUTE_TOP_LAMPS);

        //when
        StringBuilder  switchedLights = switchRedLampForMinutes(position, countedMinutes, topLights);

        //then
        assertEquals("OOOOOROOOOO", switchedLights.toString());
    }

    @Test
    public void shouldSwitchRedLampsForMinutesOnNinePosition_45Minutes() {
        //given
        Integer countedMinutes = 45 / UNIT_PER_LAMP;
        Integer position = 9;
        StringBuilder  topLights = new StringBuilder(MINUTE_TOP_LAMPS);

        //when
        StringBuilder  switchedLights = switchRedLampForMinutes(position, countedMinutes, topLights);

        //then
        assertEquals("OOOOOOOOROO", switchedLights.toString());
    }

    @Test
    public void shouldNotSwitchRedLampsForMinutesFor_40Minutes() {
        //given
        Integer countedMinutes = 40 / UNIT_PER_LAMP;
        Integer position = 8;
        StringBuilder  topLights = new StringBuilder(MINUTE_TOP_LAMPS);

        //when
        StringBuilder  switchedLights = switchRedLampForMinutes(position, countedMinutes, topLights);

        //then
        assertEquals("OOOOOOOOOOO", switchedLights.toString());
    }

    @Test
    public void switchOnYellowLampOnSecondPosition() {
        //given
        Integer countedMinutes = 2;
        StringBuilder  topLights = new StringBuilder(MINUTE_TOP_LAMPS);

        //when
        StringBuilder  switchedLights = switchYellowLamp(countedMinutes, 2,topLights);

        //then
        assertEquals("OYOOOOOOOOO", switchedLights.toString());
    }

    @Test
    public void shouldSwitchRedLampForHoursOnFirstPositionFor_7_O_Clock() {
        //given
        Integer countedHour = 7 / UNIT_PER_LAMP;
        Integer position = 1;
        StringBuilder  topLights = new StringBuilder(LAMPS);

        //when
        StringBuilder  switchedLights = switchRedLampForHours(position, countedHour,topLights);

        //then
        assertEquals("ROOO", switchedLights.toString());
    }

    @Test
    public void shouldSwitchRedLampForHoursOnSecondPositionFor_11_O_Clock() {
        //given
        Integer countedHour = 11 / UNIT_PER_LAMP;
        Integer position = 2;
        StringBuilder  topLights = new StringBuilder(LAMPS);

        //when
        StringBuilder  switchedLights = switchRedLampForHours(position, countedHour,topLights);

        //then
        assertEquals("OROO", switchedLights.toString());
    }

    @Test
    public void shouldSwitchRedLampForHoursOnThirdPositionFor_17_O_Clock() {
        //given
        Integer countedHour = 17 / UNIT_PER_LAMP;
        Integer position = 3;
        StringBuilder  topLights = new StringBuilder(LAMPS);

        //when
        StringBuilder  switchedLights = switchRedLampForHours(position, countedHour,topLights);

        //then
        assertEquals("OORO", switchedLights.toString());
    }

    @Test
    public void shouldSwitchRedLampForHoursOnFourthPositionFor_23_O_Clock() {
        //given
        Integer countedHour = 23 / UNIT_PER_LAMP;
        Integer position = 4;
        StringBuilder  topLights = new StringBuilder(LAMPS);

        //when
        StringBuilder  switchedLights = switchRedLampForHours(position, countedHour,topLights);

        //then
        assertEquals("OOOR", switchedLights.toString());
    }

    @Test
    public void switchOffLampForFifthPosition() {
        //given
        Integer countedMinutes = 23 / UNIT_PER_LAMP;
        Integer position = 5;
        StringBuilder  topLights = new StringBuilder("RRRRRRRRRRR");

        //when
        StringBuilder  switchedLights = switchOffLamp(position, countedMinutes,topLights);

        //then
        assertEquals("RRRRORRRRRR", switchedLights.toString());
    }

}