package main.java.helpers;


import main.java.enums.LampsColor;

public final class LampColorConfig {

    public static String switchOnYellowColor() {
        return LampsColor.YELLOW.getColor();
    }

    public static String switchOnRedColor() {
        return LampsColor.RED.getColor();
    }

    public static String switchOffColor() {
        return LampsColor.NONE.getColor();
    }
}
