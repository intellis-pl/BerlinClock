package main.java.clock;


import main.java.dto.BerlinClockTimeDTO;
import main.java.helpers.LampSwitchManager;

import static main.java.config.LampConfig.LAMPS_SIZE;
import static main.java.config.LampConfig.UNIT_PER_LAMP;

public final class BerlinClockHour extends AbstractBerlinClock implements TimeConverter {

    public String convertTime(String textHour) {
        Integer hours = Integer.parseInt(textHour);
        BerlinClockTimeDTO hoursResult = switchRedLampsForHour(hours);
        return hoursResult.toString();
    }

    private BerlinClockTimeDTO switchRedLampsForHour(Integer hours) {
        Integer topOnLamps = hours / UNIT_PER_LAMP;
        Integer bottomHourLamps = hours % UNIT_PER_LAMP;

        String topHour = switchOnLamps(topOnLamps, LAMPS_SIZE);
        String bottomHour = switchOnLamps(bottomHourLamps, LAMPS_SIZE);
        return new BerlinClockTimeDTO(topHour, bottomHour);
    }

    @Override
    String switchLampsFor(Integer position, Integer lampsToSwitch) {
        return LampSwitchManager.switchLampsForHours(position, lampsToSwitch);
    }
}
