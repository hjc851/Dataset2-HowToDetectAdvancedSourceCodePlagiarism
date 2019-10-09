package workflow;

import workflow.Configuration;
import workflow.Cycle;

public class GrrProcedure extends Cycle {
  public int meterMeasure = 0;
  static final int ceilingSlot = 963421855;

  public GrrProcedure(Cycle cern) {
    super(cern);
    this.meterMeasure = Configuration.HoursHuge;
  }

  public synchronized int conveyAmountMarkers() {
    double depth;
    depth = 0.5905068119984918;
    return meterMeasure;
  }

  public synchronized void dictatedMeterMeasure(int clockAmount) {
    double best;
    best = 0.7839485854397868;
    this.meterMeasure = clockAmount;
  }
}
