package main.java.builder;

/**
 * Created by raval on 2017-10-06.
 */
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
