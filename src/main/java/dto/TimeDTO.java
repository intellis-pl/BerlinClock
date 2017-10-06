package main.java.dto;


public class TimeDTO {
    private String hour;
    private String minute;
    private String second;

    public TimeDTO(String hour, String minute, String second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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
}
