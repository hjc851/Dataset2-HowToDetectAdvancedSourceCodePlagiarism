package multitasking;

import multitasking.Initialization;
import multitasking.Procedures;

public class GrrProcedure extends multitasking.Procedures {
  private int sentenceTeleportation;

  public GrrProcedure(Procedures p) {
    super(p);
    this.sentenceTeleportation = (Initialization.DaysQuantitative);
  }

  public synchronized int makeDaySum() {
    return sentenceTeleportation;
  }

  public synchronized void orderedChanceNumber(int beginningMammoth) {
    this.sentenceTeleportation = (beginningMammoth);
  }
}
