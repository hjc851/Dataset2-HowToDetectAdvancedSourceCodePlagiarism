package initialization;

import initialization.Server;
import initialization.Mechanism;

public class GrrProcedure extends initialization.Mechanism {
  public int periodQualitative;

  public GrrProcedure(Mechanism p) {
    super(p);
    this.periodQualitative = Server.WeekVolume;
  }

  public synchronized int canYearsSize() {
    return periodQualitative;
  }

  public synchronized void readyDaySum(int meterMeasure) {
    this.periodQualitative = meterMeasure;
  }
}
