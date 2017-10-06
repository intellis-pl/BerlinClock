package main.java.clock;


import main.java.clock.position.AbstractBerlinClock;
import main.java.clock.position.BerlinClockTopHour;
import main.java.dto.BerlinClockTimeDTO;

import static main.java.config.LampConfig.LAMPS_SIZE;
import static main.java.config.LampConfig.UNIT_PER_LAMP;

public final class BerlinClockHour implements TimeConverter {

    public String convertTime(String textHour) {
        Integer hours = Integer.parseInt(textHour);
        BerlinClockTimeDTO hoursResult = switchRedLampsForHour(hours);
        return hoursResult.toString();
    }

    private BerlinClockTimeDTO switchRedLampsForHour(Integer hours) {
        AbstractBerlinClock clock = new BerlinClockTopHour();
        Integer topOnLamps = hours / UNIT_PER_LAMP;
        Integer bottomHourLamps = hours % UNIT_PER_LAMP;


        String topHour = clock.switchOnLamps(topOnLamps, LAMPS_SIZE);
        String bottomHour = clock.switchOnLamps(bottomHourLamps, LAMPS_SIZE);
        return new BerlinClockTimeDTO(topHour, bottomHour);
    }

}
