package timer;

import timer.Interface;
import timer.Serve;

public class GrrProcedure extends Serve {
  private int daysQuantitative;

  public GrrProcedure(Serve vig) {
    super(vig);
    this.daysQuantitative = Interface.YearSurface;
  }

  public int fetchBeginningMammoth() {
    return daysQuantitative;
  }

  public void primedPeriodQualitative(int hoursHuge) {
    this.daysQuantitative = hoursHuge;
  }
}
