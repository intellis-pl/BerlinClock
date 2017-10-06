package main.java.builder;


public class LampsBuilder {
    private final String lamps;

    private LampsBuilder(Builder builder) {
        this.lamps = builder.lamps;
    }

    public String getLamps() {
        return lamps;
    }

    public static class Builder {
        private String lamps = "";

        public LampsBuilder.Builder appendLamps(String lamps) {
            this.lamps += lamps;
            return this;
        }

        public LampsBuilder build() {
            return new LampsBuilder(this);
        }
    }
}
