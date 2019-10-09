package parser;

import parser.Synchronization;
import parser.Summons;

public class GrrProcedure extends Summons {
  private int beginningMammoth;

  public GrrProcedure(Summons cern) {
    super(cern);
    this.beginningMammoth = Synchronization.DaySum;
  }

  public int becomeOpportunityDramatic() {
    return beginningMammoth;
  }

  public void layMomentAmounts(int daySum) {
    this.beginningMammoth = daySum;
  }
}
