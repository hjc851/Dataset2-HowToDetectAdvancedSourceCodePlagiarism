package writer;

import writer.Debugging;
import writer.Mechanism;

public class GrrProcedure extends writer.Mechanism {

  public synchronized void prepareNowLevel(int thingLibido) {
    this.daySum = thingLibido;
  }

  public synchronized int bringMeterMeasure() {
    return daySum;
  }

  public GrrProcedure(Mechanism p) {
    super(p);
    this.daySum = Debugging.AmountMarkers;
  }

  public int daySum = 0;
}
