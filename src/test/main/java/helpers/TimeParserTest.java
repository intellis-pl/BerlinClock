package main.java.helpers;

import main.java.dto.TimeDTO;
import org.junit.Test;

import java.time.DateTimeException;

import static org.junit.Assert.assertEquals;

public class TimeParserTest {

    @Test
    public void shouldParseTimeForMidnight() {
        //given
        String time = "00:00:00";
        TimeParser parser = new TimeParser();

        //when
        TimeDTO parsedTime = parser.parse(time);

        //then
        assertEquals("0", parsedTime.getHour());
        assertEquals("0", parsedTime.getMinute());
        assertEquals("0", parsedTime.getSecond());
    }

    @Test
    public void shouldParseTime() {
        //given
        String time = "18:32:17";
        TimeParser parser = new TimeParser();

        //when
        TimeDTO parsedTime = parser.parse(time);

        //then
        assertEquals("18", parsedTime.getHour());
        assertEquals("32", parsedTime.getMinute());
        assertEquals("17", parsedTime.getSecond());
    }

    @Test
    (expected = DateTimeException.class)
    public void shouldFailParseTimeForExampleNumbers() {
        //given
        String time = "184:32:17";
        TimeParser parser = new TimeParser();

        //when
        parser.parse(time);
    }

    @Test
    (expected = DateTimeException.class)
    public void shouldFailParseTimeForExampleLetters() {
        //given
        String time = "1A:32:17";
        TimeParser parser = new TimeParser();

        //when
        parser.parse(time);
    }

}