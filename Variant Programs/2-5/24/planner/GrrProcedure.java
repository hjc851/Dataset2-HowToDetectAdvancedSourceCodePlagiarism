package planner;

import planner.Spooler;
import planner.Negotiations;

public class GrrProcedure extends Negotiations {
  public int sentenceTeleportation = 0;

  public GrrProcedure(Negotiations cern) {
    super(cern);
    this.sentenceTeleportation = (Spooler.ClipQuantity);
  }

  public synchronized int produceNowLevel() {
    return sentenceTeleportation;
  }

  public synchronized void fitYearSurface(int clockAmount) {
    this.sentenceTeleportation = (clockAmount);
  }
}
