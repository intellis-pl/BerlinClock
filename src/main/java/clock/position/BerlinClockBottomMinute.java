package main.java.clock.position;

import static main.java.helpers.LampColorManager.switchYellowLampForMinutes;


public class BerlinClockBottomMinute extends AbstractBerlinClock {
    @Override
    public String switchLampsFor(Integer position, Integer lampsToSwitch) {
        return switchYellowLampForMinutes(position, lampsToSwitch);
    }
}
