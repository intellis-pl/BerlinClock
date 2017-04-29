package main.java.helpers;

import static main.java.config.LampColorConfig.*;


public final class LampColorManager {

    public static StringBuilder switchRedLampForMinutes(Integer currentIteration, Integer topOnLamps, StringBuilder  top) {
        if(isRedColorLampForMinutes(currentIteration, topOnLamps)) {
            return switchLamp(currentIteration, switchOnRedColor(), top);
        }
        return top;
    }

    public static StringBuilder switchYellowLamp(Integer currentIteration, Integer topOnLamps, StringBuilder  top) {
        if(canSwitchOnLamp(currentIteration, topOnLamps)) {
            return switchLamp(currentIteration, switchOnYellowColor(), top);
        }
        return top;
    }

    public static StringBuilder switchRedLampForHours(Integer currentIteration, Integer topOnLamps, StringBuilder  top) {
        if(canSwitchOnLamp(currentIteration, topOnLamps)) {
            return switchLamp(currentIteration, switchOnRedColor(), top);
        }
        return top;
    }

    public static StringBuilder switchOffLamp(int currentIteration, Integer topOnLamps, StringBuilder  top) {
        if(canSwitchOffLamp(currentIteration, topOnLamps)) {
            return switchLamp(currentIteration, switchOffColor(), top);
        }
        return top;
    }

    public static StringBuilder switchLamp(Integer currentIteration, String lampColor, StringBuilder top) {
        return top.replace(currentIteration - 1, currentIteration, lampColor);
    }

    public static boolean isRedColorLampForMinutes(Integer currentIteration, Integer lampsOn) {
        return currentIteration % 3 == 0 && currentIteration <= lampsOn;
    }

    public static boolean canSwitchOnLamp(Integer currentIteration, Integer lampsOn) {
        return currentIteration <= lampsOn;
    }

    public static boolean canSwitchOffLamp(int currentIteration, Integer topOnLamps) {
        return !isRedColorLampForMinutes(currentIteration, topOnLamps)
                && !canSwitchOnLamp(currentIteration, topOnLamps);
    }
}
