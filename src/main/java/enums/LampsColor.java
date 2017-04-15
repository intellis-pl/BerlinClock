package main.java.enums;


public enum LampsColor {
    YELLOW("Y"),
    RED("R"),
    NONE("O");

    private String color;

    private LampsColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
