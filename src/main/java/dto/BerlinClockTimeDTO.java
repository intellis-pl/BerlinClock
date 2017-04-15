package main.java.dto;


public class BerlinClockTimeDTO {
    private String topTime;
    private String bottomTime;

    public BerlinClockTimeDTO(String topHours, String bottomHours) {
        this.topTime = topHours;
        this.bottomTime = bottomHours;
    }

    public String toString() {
        return topTime + "\n" + bottomTime;
    }
}
