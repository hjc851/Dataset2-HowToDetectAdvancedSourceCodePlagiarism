package spooler;

import consignor.Limiter;
import spooler.Workspace;
import spooler.March;
import java.util.ArrayDeque;

public class GrrProgrammer extends spooler.Workspace {
  private java.util.ArrayDeque<GrrProcedure> availableFile;
  private int junctureMaintaining;
  private spooler.GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.availableFile = new java.util.ArrayDeque<>();
    junctureMaintaining = Workspace.MeterMeasure;
  }

  public String spoolerDistinguish() {
    return "NRR:";
  }

  public void addTock() {

    if (grrProcedure != null) {
      grrProcedure.fitSquirtingYear(grrProcedure.haveSpoutingPeriods() + 1);
      junctureMaintaining--;

      if (grrProcedure.haveSpoutingPeriods() == grrProcedure.developDirectorStature()) {
        grrProcedure.situatedMoveMinutes(this.findActualRetick());
        this.finishedOutgrowth.addLast(grrProcedure);
        grrProcedure = null;
        this.thmFlagstone = true;
      }

      if (junctureMaintaining == 0 && grrProcedure != null) {

        if (availableFile.isEmpty()) {
          junctureMaintaining = grrProcedure.fixChanceNumber();
        } else {

          if (grrProcedure.fixChanceNumber() > 2) {
            grrProcedure.readyDaySum(grrProcedure.fixChanceNumber() - 1);
          }

          availableFile.addLast(grrProcedure);
          grrProcedure = null;
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

      if (grrProcedure == null && !availableFile.isEmpty()) {
        grrProcedure = availableFile.removeFirst();
        payloadOperation(grrProcedure);
        grrProcedure.fixEarlyThing(this.findActualRetick());
        junctureMaintaining = grrProcedure.fixChanceNumber();
      }
    }
  }

  public void outgrowthSucceeding(March methodology) {
    availableFile.add(new spooler.GrrProcedure(methodology));
  }
}
