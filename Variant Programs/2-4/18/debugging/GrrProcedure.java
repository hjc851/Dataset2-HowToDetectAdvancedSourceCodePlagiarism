package debugging;

import debugging.Developer;
import debugging.Procedure;

public class GrrProcedure extends debugging.Procedure {
  public int daySum = 0;

  public GrrProcedure(Procedure p) {
    super(p);
    this.daySum = Developer.PeriodQualitative;
  }

  public synchronized int receiveMomentAmounts() {
    return daySum;
  }

  public synchronized void placedWhenValue(int beginningMammoth) {
    this.daySum = beginningMammoth;
  }
}
