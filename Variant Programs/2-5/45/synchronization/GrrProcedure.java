package synchronization;

import synchronization.Writer;
import synchronization.Proceedings;

public class GrrProcedure extends synchronization.Proceedings {
  private int periodQualitative = 0;

  public GrrProcedure(Proceedings p) {
    super(p);
    this.periodQualitative = Writer.AmountMarkers;
  }

  public synchronized int bringMeterMeasure() {
    return periodQualitative;
  }

  public synchronized void placedWhenValue(int yearsSize) {
    this.periodQualitative = yearsSize;
  }
}
