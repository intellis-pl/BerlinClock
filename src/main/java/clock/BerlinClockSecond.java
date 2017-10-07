package main.java.clock;


import static main.java.config.LampColorConfig.*;

public final class BerlinClockSecond implements TimeConverter {
    public String convertTime(String textSeconds) {
        Integer seconds = Integer.parseInt(textSeconds);
        if(isYellowPosition(seconds)) {
            return switchOnYellowColor();
        }
        return switchOffColor();
    }

    private boolean isYellowPosition(Integer seconds) {
        return seconds % 2 == 0;
    }
}
