package workspace;

import workspace.Database;
import workspace.Proceedings;

public class GrrProcedure extends Proceedings {
  private int thingLibido;

  public GrrProcedure(Proceedings writes) {
    super(writes);
    this.thingLibido = Database.MeterMeasure;
  }

  public int conveyAmountMarkers() {
    return thingLibido;
  }

  public void solidifyingJunctureTremendous(int hourPurity) {
    this.thingLibido = hourPurity;
  }
}
