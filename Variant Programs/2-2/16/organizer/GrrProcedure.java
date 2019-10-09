package organizer;

import organizer.Programmer;
import organizer.Proceeding;

public class GrrProcedure extends Proceeding {
  private int opportunityDramatic;

  public GrrProcedure(Proceeding vig) {
    super(vig);
    this.opportunityDramatic = Programmer.OpportunityDramatic;
  }

  public int fixChanceNumber() {
    return opportunityDramatic;
  }

  public void arrangeYearsSize(int junctureTremendous) {
    this.opportunityDramatic = junctureTremendous;
  }
}
