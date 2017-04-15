package main.java.helpers;

import static main.java.helpers.LampColorManager.*;

public final class LampSwitchManager {
    public static StringBuffer switchTopLampsForMinutes(
            Integer currIteration, Integer topOnLamps, StringBuffer top) {
        top = switchYellowLamp(currIteration, topOnLamps, top);
        top = switchRedLamp(currIteration, topOnLamps, top);
        top = switchOffLamp(currIteration, topOnLamps, top);
        return top;
    }

    public static StringBuffer switchBottomLampsForMinutes(
            Integer currIteration, Integer bottomOnLamps, StringBuffer bottom) {
        bottom = switchYellowLamp(currIteration, bottomOnLamps, bottom);
        bottom = switchOffLamp(currIteration, bottomOnLamps, bottom);
        return bottom;
    }

    public static StringBuffer switchLampsForHours(
            Integer currIteration, Integer lampsOn, StringBuffer lamps) {
        lamps = switchRedLampForHours(currIteration, lampsOn, lamps);
        lamps = switchOffLamp(currIteration, lampsOn, lamps);
        return lamps;
    }
}
