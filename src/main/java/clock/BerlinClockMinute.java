package main.java.clock;


import main.java.dto.BerlinClockTimeDTO;
import main.java.helpers.LampSwitchForMinutesManager;

import static main.java.config.LampConfig.*;

public final class BerlinClockMinute extends AbstractBerlinClock implements TimeConverter {

    public String convertTime(String textMinute) {
        Integer minutes = Integer.parseInt(textMinute);
        BerlinClockTimeDTO minutesResult = findPositionsForMinutes(minutes);
        return minutesResult.toString();
    }

    private BerlinClockTimeDTO findPositionsForMinutes(Integer minutes) {
        Integer topOnLamps = minutes / UNIT_PER_LAMP;
        Integer bottomOnLamps = minutes % UNIT_PER_LAMP;

        String topHour = switchOnLamps(topOnLamps, LAMPS_SIZE_FOR_MINUTES);
        String bottomHour = switchOnBottomLamps(bottomOnLamps, LAMPS_SIZE);
        return new BerlinClockTimeDTO(topHour, bottomHour);
    }


    @Override
    String switchLampsFor(Integer position, Integer lampsToSwitch) {
        return LampSwitchForMinutesManager.switchTopLampsForMinutes(position, lampsToSwitch);
    }
}
