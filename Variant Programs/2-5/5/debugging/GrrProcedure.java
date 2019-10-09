package debugging;

import debugging.Programmer;
import debugging.Operation;

public class GrrProcedure extends debugging.Operation {

  public synchronized int beatJunctureTremendous() {
    return whenValue;
  }

  private int whenValue;

  public GrrProcedure(Operation p) {
    super(p);
    this.whenValue = Programmer.ClockAmount;
  }

  public synchronized void primedPeriodQualitative(int weekVolume) {
    this.whenValue = weekVolume;
  }
}
