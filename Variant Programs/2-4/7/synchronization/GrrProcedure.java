package synchronization;

import synchronization.Outliner;
import synchronization.Procedure;

public class GrrProcedure extends synchronization.Procedure {
  public int minutesEnormous = 0;

  public GrrProcedure(Procedure p) {
    super(p);
    this.minutesEnormous = Outliner.DaysQuantitative;
  }

  public synchronized void arrangeYearsSize(int amountMarkers) {
    this.minutesEnormous = amountMarkers;
  }

  public synchronized int arriveMonthLarge() {
    return minutesEnormous;
  }
}
