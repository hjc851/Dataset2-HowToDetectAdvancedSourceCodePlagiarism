package synchronization;

import synchronization.Debugging;
import synchronization.Treat;

public class GrrProcedure extends Treat {
  private int daySum = 0;

  public GrrProcedure(Treat vig) {
    super(vig);
    this.daySum = Debugging.MonthLarge;
  }

  public synchronized int sustainThingLibido() {
    return daySum;
  }

  public synchronized void readyDaySum(int periodQualitative) {
    this.daySum = periodQualitative;
  }
}
