package main.java.helpers;

import main.java.dto.TimeDTO;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public final class TimeParser {

    public static TimeDTO parse(String time) throws DateTimeException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime date = LocalTime.parse(time, formatter);
        return new TimeDTO.Builder()
                .appendHours(String.valueOf(date.getHour()))
                .appendMinutes(String.valueOf(date.getMinute()))
                .appendSeconds(String.valueOf(date.getSecond()))
                .build();
    }
}
