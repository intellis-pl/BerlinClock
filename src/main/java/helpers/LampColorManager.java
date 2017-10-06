package main.java.helpers;

import static main.java.config.LampColorConfig.*;


public final class LampColorManager {

    public static String switchRedLampForMinutes(Integer currPosition, Integer topOnLamps) {
        if(isRedColorLampForMinutes(currPosition, topOnLamps)) {
            return switchOnRedColor();
        }
        return switchOffColor();
    }

    public static String switchYellowLampForMinutes(Integer currPosition, Integer topOnLamps) {
        if(canSwitchOnLamp(currPosition, topOnLamps)) {
            return switchOnYellowColor();
        }
        return switchOffColor();
    }

    public static String switchRedLampForHours(Integer currPosition, Integer topOnLamps) {
        if(canSwitchOnLamp(currPosition, topOnLamps)) {
            return switchOnRedColor();
        }
        return switchOffColor();
    }

    public static String turnOffLamp(Integer currPosition, Integer topOnLamps) {
        if(canSwitchOffLamp(currPosition, topOnLamps)) {
            return switchOffColor();
        }
        return "";
    }

    private static boolean isRedColorLampForMinutes(Integer currPosition, Integer lampsOn) {
        return currPosition % 3 == 0 && currPosition <= lampsOn;
    }

    private static boolean canSwitchOnLamp(Integer currPosition, Integer lampsOn) {
        return currPosition <= lampsOn;
    }

    private static boolean canSwitchOffLamp(Integer currPosition, Integer topOnLamps) {
        return !isRedColorLampForMinutes(currPosition, topOnLamps)
                && !canSwitchOnLamp(currPosition, topOnLamps);
    }
}
