package workspace;

import workspace.Synchronizer;
import workspace.Act;

public class GrrProcedure extends Act {
  private int clockAmount;

  public GrrProcedure(Act cern) {
    super(cern);
    this.clockAmount = Synchronizer.ClipQuantity;
  }

  public int receiveMomentAmounts() {
    return clockAmount;
  }

  public void orderedChanceNumber(int clipQuantity) {
    this.clockAmount = clipQuantity;
  }
}
