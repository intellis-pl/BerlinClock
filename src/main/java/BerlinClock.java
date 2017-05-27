package main.java;

import main.java.clock.TimeConverter;
import main.java.dto.TimeDTO;
import main.java.enums.TimeUnit;
import main.java.factory.ITimeConverterFactory;
import main.java.factory.TimeConverterFactory;
import main.java.dto.TimeUnitDTO;
import main.java.helpers.TimeParser;
import org.apache.log4j.Logger;

import java.time.DateTimeException;


public class BerlinClock {
    private final static Logger LOGGER = Logger.getLogger(BerlinClock.class);

    public static void main(String[] args) {
        try {
            TimeDTO parsedTime = TimeParser.parse(args[0]);
            LOGGER.info("Current time (hh:mm:ss): " + parsedTime.toString());

            TimeUnitDTO timeManager = new TimeUnitDTO(parsedTime);
            ITimeConverterFactory timeFactory = new TimeConverterFactory();

            LOGGER.info("\nBerlin Clock time format:");
            for(TimeUnit timeUnit : TimeUnit.values()) {
                TimeConverter berlinClock = timeFactory.create(timeUnit);
                String timeValue = timeManager.getUnit(timeUnit);
                LOGGER.info(berlinClock.convertTime(timeValue));
            }
        } catch (DateTimeException e) {
            LOGGER.error(e.getMessage());
        }

    }


}
