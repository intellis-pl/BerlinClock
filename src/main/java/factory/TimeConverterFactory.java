package main.java.factory;

import main.java.clock.*;
import main.java.enums.TimeUnit;

import java.util.HashMap;
import java.util.Map;


public class TimeConverterFactory implements ITimeConverterFactory {
    private Map<TimeUnit, TimeConverter> clockMap;

    {
        clockMap = new HashMap<>();
        clockMap.put(TimeUnit.HOURS, new BerlinClockHour());
        clockMap.put(TimeUnit.MINUTES, new BerlinClockMinute());
        clockMap.put(TimeUnit.SECONDS, new BerlinClockSecond());
    }

    public TimeConverter create(TimeUnit type) {
        return clockMap.get(type);
    }
}
