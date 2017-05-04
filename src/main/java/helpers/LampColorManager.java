package main.java.helpers;

import static main.java.config.LampColorConfig.*;


public final class LampColorManager {

    public static StringBuilder switchRedLampForMinutes(Integer currPosition, Integer topOnLamps, StringBuilder  top) {
        if(isRedColorLampForMinutes(currPosition, topOnLamps)) {
            return switchLamp(currPosition, switchOnRedColor(), top);
        }
        return top;
    }

    public static StringBuilder switchYellowLamp(Integer currPosition, Integer topOnLamps, StringBuilder  top) {
        if(canSwitchOnLamp(currPosition, topOnLamps)) {
            return switchLamp(currPosition, switchOnYellowColor(), top);
        }
        return top;
    }

    public static StringBuilder switchRedLampForHours(Integer currPosition, Integer topOnLamps, StringBuilder  top) {
        if(canSwitchOnLamp(currPosition, topOnLamps)) {
            return switchLamp(currPosition, switchOnRedColor(), top);
        }
        return top;
    }

    public static StringBuilder switchOffLamp(Integer currPosition, Integer topOnLamps, StringBuilder  top) {
        if(canSwitchOffLamp(currPosition, topOnLamps)) {
            return switchLamp(currPosition, switchOffColor(), top);
        }
        return top;
    }

    private static StringBuilder switchLamp(Integer currPosition, String lampColor, StringBuilder top) {
        return top.replace(currPosition - 1, currPosition, lampColor);
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
