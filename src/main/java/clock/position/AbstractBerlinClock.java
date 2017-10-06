package main.java.clock.position;

import main.java.builder.LampsBuilder;


public abstract class AbstractBerlinClock {

    public abstract String switchLampsFor(Integer position, Integer lampsToSwitch);

    public String switchOnLamps(Integer lampsOn, Integer lampsSize) {
        LampsBuilder.Builder lampsBuilder = new LampsBuilder.Builder();
        for(int position = 1; position <= lampsSize; position++) {
            lampsBuilder.appendLamps(
                    switchLampsFor(position, lampsOn)
            );
        }
        return lampsBuilder.build().getLamps();
    }
}
