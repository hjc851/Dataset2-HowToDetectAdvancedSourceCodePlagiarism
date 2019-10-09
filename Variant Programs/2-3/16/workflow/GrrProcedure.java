package workflow;

import workflow.Writer;
import workflow.Negotiations;

public class GrrProcedure extends Negotiations {
  private int amountMarkers = 0;

  public GrrProcedure(Negotiations vig) {
    super(vig);
    this.amountMarkers = Writer.ThingLibido;
  }

  public synchronized int bringMeterMeasure() {
    return amountMarkers;
  }

  public synchronized void doAgainGiant(int whenValue) {
    this.amountMarkers = whenValue;
  }
}
