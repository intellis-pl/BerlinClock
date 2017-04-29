package main.java.clock;


import main.java.dto.BerlinClockTimeDTO;
import main.java.helpers.LampSwitchManager;

import static main.java.config.LampConfig.*;

public final class BerlinClockHour implements TimeConverter {

    public String convertTime(String textHour) {
        Integer hours = Integer.parseInt(textHour);
        BerlinClockTimeDTO hoursResult = findHourPositions(hours);
        return hoursResult.toString();
    }

    private BerlinClockTimeDTO findHourPositions(Integer hours) {
        Integer topOnLamps = hours / UNIT_PER_LAMP;
        Integer bottomHourLamps = hours % UNIT_PER_LAMP;

        String topHour = switchOnRedLamps(topOnLamps);
        String bottomHour = switchOnRedLamps(bottomHourLamps);
        return new BerlinClockTimeDTO(topHour, bottomHour);
    }

    private String switchOnRedLamps(Integer lapmsOn) {
        StringBuilder  lamps = new StringBuilder(LAMPS);
        for(int position = 1; position <= LAMPS_SIZE; position++) {
            lamps = LampSwitchManager.switchLampsForHours(position, lapmsOn, lamps);
        }
        return lamps.toString();
    }

}
