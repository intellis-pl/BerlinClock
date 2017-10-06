package main.java.clock;


import main.java.clock.position.AbstractBerlinClock;
import main.java.clock.position.BerlinClockBottomMinute;
import main.java.clock.position.BerlinClockTopMinute;
import main.java.dto.BerlinClockTimeDTO;
import main.java.enums.Position;

import java.util.HashMap;
import java.util.Map;

import static main.java.config.LampConfig.*;
import static main.java.enums.Position.*;

public final class BerlinClockMinute implements TimeConverter {
    private Map<Position, AbstractBerlinClock> clockMap;

    {
        clockMap = new HashMap<>();
        clockMap.put(TOP, new BerlinClockTopMinute());
        clockMap.put(BOTTOM, new BerlinClockBottomMinute());
    }

    public String convertTime(String textMinute) {
        Integer minutes = Integer.parseInt(textMinute);
        BerlinClockTimeDTO minutesResult = findPositionsForMinutes(minutes);
        return minutesResult.toString();
    }

    private BerlinClockTimeDTO findPositionsForMinutes(Integer minutes) {
        AbstractBerlinClock topPosition = clockMap.get(TOP);
        AbstractBerlinClock bottomPosition = clockMap.get(BOTTOM);

        Integer topOnLamps = minutes / UNIT_PER_LAMP;
        Integer bottomOnLamps = minutes % UNIT_PER_LAMP;

        String topHour = topPosition.switchOnLamps(topOnLamps, LAMPS_SIZE_FOR_MINUTES);
        String bottomHour = bottomPosition.switchOnLamps(bottomOnLamps, LAMPS_SIZE);
        return new BerlinClockTimeDTO(topHour, bottomHour);
    }

}
