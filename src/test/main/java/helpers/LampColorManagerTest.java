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

        //when
        String switchedLights = switchRedLampForMinutes(position, countedMinutes);

        //then
        assertEquals("R", switchedLights);
    }

    @Test
    public void shouldSwitchRedLampsForMinutesOnSixthPosition_30Minutes() {
        //given
        Integer countedMinutes = 30 / UNIT_PER_LAMP;
        Integer position = 6;

        //when
        String  switchedLights = switchRedLampForMinutes(position, countedMinutes);

        //then
        assertEquals("R", switchedLights);
    }

    @Test
    public void shouldSwitchRedLampsForMinutesOnNinePosition_45Minutes() {
        //given
        Integer countedMinutes = 45 / UNIT_PER_LAMP;
        Integer position = 9;

        //when
        String  switchedLights = switchRedLampForMinutes(position, countedMinutes);

        //then
        assertEquals("R", switchedLights);
    }

    @Test
    public void shouldNotSwitchRedLampsForMinutesFor_40Minutes() {
        //given
        Integer countedMinutes = 40 / UNIT_PER_LAMP;
        Integer position = 8;

        //when
        String switchedLights = switchRedLampForMinutes(position, countedMinutes);

        //then
        assertEquals("O", switchedLights);
    }

    @Test
    public void switchOnYellowLampOnSecondPosition() {
        //given
        Integer countedMinutes = 2;

        //when
        String  switchedLights = switchYellowLampForMinutes(countedMinutes, 2);

        //then
        assertEquals("Y", switchedLights);
    }

    @Test
    public void shouldSwitchRedLampForHoursOnFirstPositionFor_7_O_Clock() {
        //given
        Integer countedHour = 7 / UNIT_PER_LAMP;
        Integer position = 1;

        //when
        String  switchedLights = switchRedLampForHours(position, countedHour);

        //then
        assertEquals("R", switchedLights);
    }

    @Test
    public void shouldSwitchRedLampForHoursOnSecondPositionFor_11_O_Clock() {
        //given
        Integer countedHour = 11 / UNIT_PER_LAMP;
        Integer position = 2;

        //when
        String  switchedLights = switchRedLampForHours(position, countedHour);

        //then
        assertEquals("R", switchedLights);
    }

    @Test
    public void shouldSwitchRedLampForHoursOnThirdPositionFor_17_O_Clock() {
        //given
        Integer countedHour = 17 / UNIT_PER_LAMP;
        Integer position = 3;

        //when
        String  switchedLights = switchRedLampForHours(position, countedHour);

        //then
        assertEquals("R", switchedLights);
    }

    @Test
    public void shouldSwitchRedLampForHoursOnFourthPositionFor_23_O_Clock() {
        //given
        Integer countedHour = 23 / UNIT_PER_LAMP;
        Integer position = 4;

        //when
        String  switchedLights = switchRedLampForHours(position, countedHour);

        //then
        assertEquals("R", switchedLights);
    }

    @Test
    public void switchOffLampForFifthPosition() {
        //given
        Integer countedMinutes = 23 / UNIT_PER_LAMP;
        Integer position = 5;

        //when
        String  switchedLights = turnOffLamp(position, countedMinutes);

        //then
        assertEquals("O", switchedLights);
    }

}