package timer;

import timer.Controller;
import timer.Proceeding;

public class GrrProcedure extends timer.Proceeding {
  private int daySum;

  public GrrProcedure(Proceeding p) {
    super(p);
    this.daySum = Controller.AgainGiant;
  }

  public int goClockAmount() {
    return daySum;
  }

  public void fixedOpportunityDramatic(int clockAmount) {
    this.daySum = clockAmount;
  }
}
