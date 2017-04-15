package main.java.clock;


import main.java.dto.BerlinClockTimeDTO;

import static main.java.helpers.LampSwitchManager.*;
import static main.java.helpers.LampConfig.*;

public final class BerlinClockMinute implements TimeConverter {

    public String convertTime(String textMinute) {
        Integer minutes = Integer.parseInt(textMinute);
        BerlinClockTimeDTO minutesResult = findMinutesPositions(minutes);
        return minutesResult.toString();
    }

    private BerlinClockTimeDTO findMinutesPositions(Integer minutes) {
        Integer topOnLamps = minutes / UNIT_PER_LAMP;
        Integer bottomOnLamps = minutes % UNIT_PER_LAMP;

        String topHour = switchOnTopLamps(topOnLamps);
        String bottomHour = switchOnYellowLamps(bottomOnLamps);
        return new BerlinClockTimeDTO(topHour, bottomHour);
    }

    private String switchOnTopLamps(Integer topOnLamps) {
        StringBuffer  top = new StringBuffer(MINUTE_TOP_LAMPS);
        for(int i = 1; i <= LAMPS_SIZE_FOR_MINUTES; i++) {
            top = switchTopLampsForMinutes(i, topOnLamps, top);
        }
        return top.toString();
    }

    private String switchOnYellowLamps(Integer bottomOnLamps) {
        StringBuffer  bottom = new StringBuffer(LAMPS);
        for(int i = 1; i <= LAMPS_SIZE; i++) {
            bottom = switchBottomLampsForMinutes(i, bottomOnLamps, bottom);
        }
        return bottom.toString();
    }


}
