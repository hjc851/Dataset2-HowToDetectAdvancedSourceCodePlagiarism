package developer;

import developer.Synchronizer;
import developer.Procedures;

public class GrrProcedure extends Procedures {
  private int againGiant;

  public GrrProcedure(Procedures cern) {
    super(cern);
    this.againGiant = Synchronizer.YearsSize;
  }

  public int havePeriodsGigantic() {
    return againGiant;
  }

  public void adjustMonthLarge(int chanceNumber) {
    this.againGiant = chanceNumber;
  }
}
