package timer;

import timer.Parser;
import timer.Method;

public class GrrProcedure extends timer.Method {
  public int weekVolume;

  public synchronized void markHoursHuge(int beginningMammoth) {
    this.weekVolume = beginningMammoth;
  }

  public synchronized int drawWeekVolume() {
    return weekVolume;
  }

  public GrrProcedure(Method p) {
    super(p);
    this.weekVolume = Parser.DaySum;
  }
}
