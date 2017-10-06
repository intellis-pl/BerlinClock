package main.java.clock.position;

import static main.java.helpers.LampSwitchForMinutesManager.switchTopLampsForMinutes;


public class BerlinClockTopMinute extends AbstractBerlinClock {
    @Override
    public String switchLampsFor(Integer position, Integer lampsToSwitch) {
        return switchTopLampsForMinutes(position, lampsToSwitch);
    }
}
