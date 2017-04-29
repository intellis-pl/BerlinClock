package main.java.helpers;

import static main.java.helpers.LampColorManager.*;

public final class LampSwitchManager {
    public static StringBuilder switchTopLampsForMinutes(
            Integer currIteration, Integer topOnLamps, StringBuilder top) {
        top = switchYellowLamp(currIteration, topOnLamps, top);
        top = switchRedLampForMinutes(currIteration, topOnLamps, top);
        top = switchOffLamp(currIteration, topOnLamps, top);
        return top;
    }

    public static StringBuilder switchBottomLampsForMinutes(
            Integer currIteration, Integer bottomOnLamps, StringBuilder bottom) {
        bottom = switchYellowLamp(currIteration, bottomOnLamps, bottom);
        bottom = switchOffLamp(currIteration, bottomOnLamps, bottom);
        return bottom;
    }

    public static StringBuilder switchLampsForHours(
            Integer currIteration, Integer lampsOn, StringBuilder lamps) {
        lamps = switchRedLampForHours(currIteration, lampsOn, lamps);
        lamps = switchOffLamp(currIteration, lampsOn, lamps);
        return lamps;
    }
}
