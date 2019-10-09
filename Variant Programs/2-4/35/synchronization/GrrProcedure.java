package synchronization;

import synchronization.Spooler;
import synchronization.Serve;

public class GrrProcedure extends Serve {
  public int monthLarge;

  public GrrProcedure(Serve vig) {
    super(vig);
    this.monthLarge = Spooler.MeterMeasure;
  }

  public synchronized int driveAgainGiant() {
    return monthLarge;
  }

  public synchronized void placedWhenValue(int hoursHuge) {
    this.monthLarge = hoursHuge;
  }
}
