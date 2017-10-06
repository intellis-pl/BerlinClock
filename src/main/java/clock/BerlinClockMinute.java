package main.java.clock;


import main.java.clock.position.BerlinClockBottomMinute;
import main.java.clock.position.BerlinClockTopMinute;
import main.java.dto.BerlinClockTimeDTO;

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

        String topHour = new BerlinClockTopMinute().switchOnLamps(topOnLamps, LAMPS_SIZE_FOR_MINUTES);
        String bottomHour = new BerlinClockBottomMinute().switchOnLamps(bottomOnLamps, LAMPS_SIZE);

        return new BerlinClockTimeDTO(topHour, bottomHour);
    }

}
