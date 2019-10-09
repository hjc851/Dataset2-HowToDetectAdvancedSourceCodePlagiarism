package workspace;

import workspace.Callback;
import workspace.Treat;

public class GrrProcedure extends Treat {

  public GrrProcedure(Treat vig) {
    super(vig);
    this.minutesEnormous = Callback.ChanceNumber;
  }

  public synchronized int makeDaySum() {
    return minutesEnormous;
  }

  public synchronized void settledPeriodsGigantic(int periodQualitative) {
    this.minutesEnormous = periodQualitative;
  }

  public int minutesEnormous;
}
