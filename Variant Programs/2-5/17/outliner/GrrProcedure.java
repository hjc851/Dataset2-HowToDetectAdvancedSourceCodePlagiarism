package outliner;

import outliner.Server;
import outliner.Work;

public class GrrProcedure extends Work {
  public int clipQuantity = 0;

  public GrrProcedure(Work p) {
    super(p);
    this.clipQuantity = (Server.WhenValue);
  }

  public synchronized int goClockAmount() {
    return clipQuantity;
  }

  public synchronized void adjustMonthLarge(int daysQuantitative) {
    this.clipQuantity = (daysQuantitative);
  }
}
