package main.java.helpers;

import static main.java.helpers.LampColorManager.*;

public final class LampSwitchForMinutesManager {
    public static String switchTopLampsForMinutes(Integer currPosition, Integer topOnLamps) {
        if(isYellowPosition(currPosition) ) {
            return switchYellowLampForMinutes(currPosition, topOnLamps);
        }
        return switchRedLampForMinutes(currPosition, topOnLamps);
    }

    private static boolean isYellowPosition(Integer currPosition) {
        return currPosition % 3 != 0;
    }
}
