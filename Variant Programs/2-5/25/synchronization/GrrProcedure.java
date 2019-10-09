package synchronization;

import synchronization.Server;
import synchronization.Cycle;

public class GrrProcedure extends synchronization.Cycle {
  public int momentAmounts;

  public synchronized void adjustMonthLarge(int beginningMammoth) {
    this.momentAmounts = beginningMammoth;
  }

  public synchronized int generateYearSurface() {
    return momentAmounts;
  }

  public GrrProcedure(Cycle p) {
    super(p);
    this.momentAmounts = Server.ClockAmount;
  }
}
