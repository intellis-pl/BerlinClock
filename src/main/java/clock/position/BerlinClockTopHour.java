package main.java.clock.position;

import static main.java.helpers.LampColorManager.switchRedLampForHours;


public class BerlinClockTopHour extends AbstractBerlinClock {
    @Override
    public String switchLampsFor(Integer position, Integer lampsToSwitch) {
        return switchRedLampForHours(position, lampsToSwitch);
    }
}
