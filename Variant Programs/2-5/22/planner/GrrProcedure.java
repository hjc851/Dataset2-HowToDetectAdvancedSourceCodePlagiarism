package planner;

import planner.Organizer;
import planner.Summons;

public class GrrProcedure extends Summons {

  public synchronized void placedWhenValue(int sentenceTeleportation) {
    this.weekVolume = (sentenceTeleportation);
  }

  public GrrProcedure(Summons vig) {
    super(vig);
    this.weekVolume = (Organizer.DaySum);
  }

  public synchronized int letHoursHuge() {
    return weekVolume;
  }

  public int weekVolume = 0;
}
