package spooler;

import consignor.Limiter;
import spooler.Workspace;
import spooler.March;
import java.util.ArrayDeque;

public class PapsOrganizer extends spooler.Workspace {
  private java.util.ArrayDeque<March> preparingReaper;

  public PapsOrganizer() {
    this.preparingReaper = new java.util.ArrayDeque<>();
  }

  public String spoolerDistinguish() {
    return "FCFS:";
  }

  public void addTock() {

    if (typicalProceedings != null) {
      typicalProceedings.fitSquirtingYear(typicalProceedings.haveSpoutingPeriods() + 1);

      if (typicalProceedings.haveSpoutingPeriods() == typicalProceedings.developDirectorStature()) {
        typicalProceedings.situatedMoveMinutes(this.findActualRetick());
        this.finishedOutgrowth.addLast(typicalProceedings);
        typicalProceedings = null;
        this.thmFlagstone = true;
      }
    }

    if (this.thmFlagstone && typicalProceedings == null) {
      this.unresolvedLeviChance--;

      if (unresolvedLeviChance == 0) {
        this.thmFlagstone = false;
        this.unresolvedLeviChance = Limiter.DeploymentMinutes;
      }

    } else {

      if (typicalProceedings == null && !preparingReaper.isEmpty()) {
        typicalProceedings = preparingReaper.removeFirst();
        typicalProceedings.fixEarlyThing(this.findActualRetick());
        payloadOperation(typicalProceedings);
      }
    }
  }

  public void outgrowthSucceeding(March proceeding) {
    preparingReaper.addLast(proceeding);
  }
}
