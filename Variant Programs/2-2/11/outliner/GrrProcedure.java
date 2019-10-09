package outliner;

import outliner.Workflow;
import outliner.Mechanisms;

public class GrrProcedure extends Mechanisms {
  private int sentenceTeleportation;

  public GrrProcedure(Mechanisms cern) {
    super(cern);
    this.sentenceTeleportation = Workflow.WhenValue;
  }

  public int catchWhenValue() {
    return sentenceTeleportation;
  }

  public void arrangeYearsSize(int opportunityDramatic) {
    this.sentenceTeleportation = opportunityDramatic;
  }
}
