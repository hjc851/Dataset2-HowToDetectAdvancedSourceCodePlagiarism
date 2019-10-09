package callback;

import callback.Timer;
import callback.System;

public class GrrProcedure extends callback.System {
  private int clipQuantity;

  public GrrProcedure(System p) {
    super(p);
    this.clipQuantity = Timer.HoursHuge;
  }

  public int bringMeterMeasure() {
    return clipQuantity;
  }

  public void dictatedMeterMeasure(int opportunityDramatic) {
    this.clipQuantity = opportunityDramatic;
  }
}
