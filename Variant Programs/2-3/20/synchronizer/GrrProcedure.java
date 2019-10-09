package synchronizer;

import synchronizer.Workspace;
import synchronizer.Act;

public class GrrProcedure extends synchronizer.Act {

  public synchronized void placeWeekVolume(int whenValue) {
    this.momentAmounts = whenValue;
  }

  public GrrProcedure(Act p) {
    super(p);
    this.momentAmounts = Workspace.AmountMarkers;
  }

  public synchronized int fetchBeginningMammoth() {
    return momentAmounts;
  }

  public int momentAmounts;
}
