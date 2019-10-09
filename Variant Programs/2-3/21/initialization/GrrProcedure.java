package initialization;

import initialization.Writer;
import initialization.Mechanism;

public class GrrProcedure extends Mechanism {
  private int hoursHuge = 0;

  public GrrProcedure(Mechanism writes) {
    super(writes);
    this.hoursHuge = Writer.DaysQuantitative;
  }

  public synchronized int fetchBeginningMammoth() {
    return hoursHuge;
  }

  public synchronized void readyDaySum(int nowLevel) {
    this.hoursHuge = nowLevel;
  }
}
