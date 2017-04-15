package main.java.helpers;

import static main.java.helpers.LampColorConfig.*;


public final class LampColorManager {

    public static StringBuffer switchRedLamp(Integer currentIteration, Integer topOnLamps, StringBuffer  top) {
        if(isRedColorLamp(currentIteration, topOnLamps)) {
            return switchLampFor(currentIteration, switchOnRedColor(), top);
        }
        return top;
    }

    public static StringBuffer switchYellowLamp(Integer currentIteration, Integer topOnLamps, StringBuffer  top) {
        if(isYellowColorLampOnTop(currentIteration, topOnLamps)) {
            return switchLampFor(currentIteration, switchOnYellowColor(), top);
        }
        return top;
    }

    public static StringBuffer switchRedLampForHours(Integer currentIteration, Integer topOnLamps, StringBuffer  top) {
        if(isYellowColorLampOnTop(currentIteration, topOnLamps)) {
            return switchLampFor(currentIteration, switchOnRedColor(), top);
        }
        return top;
    }

    public static StringBuffer switchOffLamp(int currentIteration, Integer topOnLamps, StringBuffer  top) {
        if(isSwitchOffLamp(currentIteration, topOnLamps)) {
            return switchLampFor(currentIteration, switchOffColor(), top);
        }
        return top;
    }

    public static StringBuffer switchLampFor(Integer currentIteration, String lampColor, StringBuffer top) {
        return top.replace(currentIteration - 1, currentIteration, lampColor);
    }

    public static boolean isSwitchOffLamp(int currentIteration, Integer topOnLamps) {
        return !isRedColorLamp(currentIteration, topOnLamps)
                && !isYellowColorLampOnTop(currentIteration, topOnLamps);
    }

    public static boolean isRedColorLamp(Integer currentIteration, Integer lampsOn) {
        return currentIteration % 3 == 0 && currentIteration <= lampsOn;
    }

    public static boolean isYellowColorLampOnTop(Integer currentIteration, Integer lampsOn) {
        return currentIteration <= lampsOn;
    }
}
