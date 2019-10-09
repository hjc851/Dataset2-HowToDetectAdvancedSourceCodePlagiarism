package spooler;

import spooler.Multitasking;
import spooler.Cycle;

public class GrrProcedure extends Cycle {
  private int sentenceTeleportation;

  public GrrProcedure(Cycle vig) {
    super(vig);
    this.sentenceTeleportation = Multitasking.WhenValue;
  }

  public int beatJunctureTremendous() {
    return sentenceTeleportation;
  }

  public void placedWhenValue(int daysQuantitative) {
    this.sentenceTeleportation = daysQuantitative;
  }
}
