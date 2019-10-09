package synchronizer;

import synchronizer.Controller;
import synchronizer.Phase;

public class GrrProcedure extends synchronizer.Phase {
  public int daySum = 0;

  public synchronized int havePeriodsGigantic() {
    return daySum;
  }

  public synchronized void doAgainGiant(int hourPurity) {
    this.daySum = (hourPurity);
  }

  public GrrProcedure(Phase p) {
    super(p);
    this.daySum = (Controller.PeriodQualitative);
  }
}
