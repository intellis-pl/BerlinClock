package main.java.helpers;

import static main.java.helpers.LampColorManager.*;

public final class LampSwitchManager {
    public static String switchTopLampsForMinutes(Integer currPosition, Integer topOnLamps) {
        if(isYellowPosition(currPosition) ) {
            return switchYellowLampForMinutes(currPosition, topOnLamps);
        }
        return switchRedLampForMinutes(currPosition, topOnLamps);
    }

    public static String switchBottomLampsForMinutes(Integer currPosition, Integer bottomOnLamps) {
        return switchYellowLampForMinutes(currPosition, bottomOnLamps);
    }

    public static String switchLampsForHours(Integer currPosition, Integer lampsOn) {
        return switchRedLampForHours(currPosition, lampsOn);
    }

    private static boolean isYellowPosition(Integer currPosition) {
        return currPosition % 3 != 0;
    }
}
