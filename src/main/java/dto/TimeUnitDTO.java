package main.java.dto;

import main.java.enums.TimeUnit;

import java.util.HashMap;
import java.util.Map;


public class TimeUnitDTO {
    private Map<TimeUnit, String> timeUnitMap;

    public TimeUnitDTO(TimeDTO parsedTime) {
        timeUnitMap = new HashMap<>();
        timeUnitMap.put(TimeUnit.HOURS, parsedTime.getHour());
        timeUnitMap.put(TimeUnit.MINUTES, parsedTime.getMinute());
        timeUnitMap.put(TimeUnit.SECONDS, parsedTime.getSecond());
    }

    public String getUnit(TimeUnit timeUnit) {
        return timeUnitMap.get(timeUnit);
    }
}
