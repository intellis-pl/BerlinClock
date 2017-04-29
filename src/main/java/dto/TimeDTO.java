package main.java.dto;


import main.java.enums.TimeUnit;

import java.util.Map;

public class TimeDTO {
    private final String hour;
    private final String minute;
    private final String second;

    private TimeDTO(Builder builder) {
        this.hour = builder.hour;
        this.minute = builder.minute;
        this.second = builder.second;
    }

    public String getHour() {
        return hour;
    }

    public String getMinute() {
        return minute;
    }

    public String getSecond() {
        return second;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    public static class Builder {
        private String hour;
        private String minute;
        private String second;

        public Builder appendHours(String hour) {
            this.hour = hour;
            return this;
        }

        public Builder appendMinutes(String minute) {
            this.minute = minute;
            return this;
        }
        public Builder appendSeconds(String second) {
            this.second = second;
            return this;
        }

        public TimeDTO build() {
            return new TimeDTO(this);
        }


    }
}
