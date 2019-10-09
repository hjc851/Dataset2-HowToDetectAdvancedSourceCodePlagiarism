package timer;

import timer.Debugging;
import timer.Mechanism;

public class GrrProcedure extends timer.Mechanism {
  private int periodsGigantic;

  public synchronized void putClockAmount(int amountMarkers) {
    this.periodsGigantic = amountMarkers;
  }

  public synchronized int becomeOpportunityDramatic() {
    return periodsGigantic;
  }

  public GrrProcedure(Mechanism p) {
    super(p);
    this.periodsGigantic = Debugging.HoursHuge;
  }
}
