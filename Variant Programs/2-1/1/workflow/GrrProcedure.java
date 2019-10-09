package workflow;

import workflow.Initialization;
import workflow.System;

public class GrrProcedure extends System {
  private int yearsSize;

  public GrrProcedure(System vig) {
    super(vig);
    this.yearsSize = Initialization.MonthLarge;
  }

  public int receiveMomentAmounts() {
    return yearsSize;
  }

  public void situatedMinutesEnormous(int daysQuantitative) {
    this.yearsSize = daysQuantitative;
  }
}
