package main.java.clock;


import static main.java.helpers.LampColorConfig.*;

public final class BerlinClockSecond implements TimeConverter {
    public String convertTime(String textSeconds) {
        Integer seconds = Integer.parseInt(textSeconds);
        if(seconds % 2 == 0) {
            return switchOnYellowColor();
        }
        return switchOffColor();
    }
}
