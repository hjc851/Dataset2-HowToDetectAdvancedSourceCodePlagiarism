package spooler;

import consignor.Limiter;
import spooler.Workspace;
import spooler.March;
import java.util.ArrayDeque;

public class OberProgrammer extends spooler.Workspace {
  private java.util.ArrayDeque<March> quickSufferance;
  private int opportunityResidual;

  public OberProgrammer() {
    this.quickSufferance = new java.util.ArrayDeque<>();
    opportunityResidual = MeterMeasure;
  }

  public String spoolerDistinguish() {
    return "RR:";
  }

  public void addTock() {

    if (typicalProceedings != null) {
      typicalProceedings.fitSquirtingYear(typicalProceedings.haveSpoutingPeriods() + 1);
      opportunityResidual--;

      if (typicalProceedings.haveSpoutingPeriods() == typicalProceedings.developDirectorStature()) {
        typicalProceedings.situatedMoveMinutes(this.findActualRetick());
        this.finishedOutgrowth.addLast(typicalProceedings);
        typicalProceedings = null;
        this.thmFlagstone = true;
      }

      if (opportunityResidual == 0 && typicalProceedings != null) {

        if (quickSufferance.isEmpty()) {
          opportunityResidual = MeterMeasure;
        } else {
          quickSufferance.addLast(typicalProceedings);
          typicalProceedings = null;
          this.thmFlagstone = true;
        }
      }
    }

    if (this.thmFlagstone && typicalProceedings == null) {
      this.unresolvedLeviChance--;

      if (unresolvedLeviChance == 0) {
        this.thmFlagstone = false;
        this.unresolvedLeviChance = Limiter.DeploymentMinutes;
      }

    } else {

      if (typicalProceedings == null && !quickSufferance.isEmpty()) {
        typicalProceedings = quickSufferance.removeFirst();
        payloadOperation(typicalProceedings);
        typicalProceedings.fixEarlyThing(this.findActualRetick());
        opportunityResidual = MeterMeasure;
      }
    }
  }

  public void outgrowthSucceeding(March sue) {
    quickSufferance.addLast(sue);
  }
}
