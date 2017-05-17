package main.java.clock;


import main.java.dto.BerlinClockTimeDTO;

import static main.java.helpers.LampSwitchManager.*;
import static main.java.config.LampConfig.*;

public final class BerlinClockMinute implements TimeConverter {

    public String convertTime(String textMinute) {
        Integer minutes = Integer.parseInt(textMinute);
        BerlinClockTimeDTO minutesResult = findPositionsForMinutes(minutes);
        return minutesResult.toString();
    }

    private BerlinClockTimeDTO findPositionsForMinutes(Integer minutes) {
        Integer topOnLamps = minutes / UNIT_PER_LAMP;
        Integer bottomOnLamps = minutes % UNIT_PER_LAMP;

        String topHour = switchOnTopLamps(topOnLamps);
        String bottomHour = switchOnBottomLamps(bottomOnLamps);
        return new BerlinClockTimeDTO(topHour, bottomHour);
    }

    private String switchOnTopLamps(Integer topOnLamps) {
        StringBuilder  top = new StringBuilder(MINUTE_TOP_LAMPS);
        for(int position = 1; position <= LAMPS_SIZE_FOR_MINUTES; position++) {
            top = switchTopLampsForMinutes(position, topOnLamps, top);
        }
        return top.toString();
    }

    private String switchOnBottomLamps(Integer bottomOnLamps) {
        StringBuilder  bottom = new StringBuilder(LAMPS);
        for(int position = 1; position <= LAMPS_SIZE; position++) {
            bottom = switchBottomLampsForMinutes(position, bottomOnLamps, bottom);
        }
        return bottom.toString();
    }


}
