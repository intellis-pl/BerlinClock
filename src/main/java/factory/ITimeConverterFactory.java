package main.java.factory;

import main.java.clock.TimeConverter;
import main.java.enums.TimeUnit;


public interface ITimeConverterFactory {
    TimeConverter create(TimeUnit type);
}
