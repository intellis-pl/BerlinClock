package main.java.helpers;

import static main.java.helpers.LampColorManager.*;

public final class LampSwitchManager {
    public static StringBuilder switchTopLampsForMinutes(
            Integer currPosition, Integer topOnLamps, StringBuilder top) {
        top = switchYellowLampForMinutes(currPosition, topOnLamps, top);
        top = switchRedLampForMinutes(currPosition, topOnLamps, top);
        top = turnOffLamp(currPosition, topOnLamps, top);
        return top;
    }

    public static StringBuilder switchBottomLampsForMinutes(
            Integer currPosition, Integer bottomOnLamps, StringBuilder bottom) {
        bottom = switchYellowLampForMinutes(currPosition, bottomOnLamps, bottom);
        bottom = turnOffLamp(currPosition, bottomOnLamps, bottom);
        return bottom;
    }

    public static StringBuilder switchLampsForHours(
            Integer currPosition, Integer lampsOn, StringBuilder lamps) {
        lamps = switchRedLampForHours(currPosition, lampsOn, lamps);
        lamps = turnOffLamp(currPosition, lampsOn, lamps);
        return lamps;
    }
}
