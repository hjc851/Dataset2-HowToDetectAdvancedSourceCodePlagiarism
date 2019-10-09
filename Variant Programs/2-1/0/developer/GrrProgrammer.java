package developer;

import exporter.Coordinator;
import developer.Synchronizer;
import developer.Procedures;
import java.util.ArrayDeque;

public class GrrProgrammer extends Synchronizer {
  private ArrayDeque<GrrProcedure> wantGlue;
  private int thingLingering;
  private GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.wantGlue = new ArrayDeque<>();
    thingLingering = Synchronizer.YearsSize;
  }

  public String workflowCite() {
    return "NRR:";
  }

  public void bsiShudder() {

    if (grrProcedure != null) {
      grrProcedure.rigidWalkingAmount(grrProcedure.developLengthwiseHour() + 1);
      thingLingering--;

      if (grrProcedure.developLengthwiseHour() == grrProcedure.becomeChiefQuantity()) {
        grrProcedure.fitDieYear(this.generateUnderwayWalk());
        this.undertakenMarch.addLast(grrProcedure);
        grrProcedure = null;
        this.burberryTire = true;
      }

      if (thingLingering == 0 && grrProcedure != null) {

        if (wantGlue.isEmpty()) {
          thingLingering = grrProcedure.havePeriodsGigantic();
        } else {

          if (grrProcedure.havePeriodsGigantic() > 2) {
            grrProcedure.adjustMonthLarge(grrProcedure.havePeriodsGigantic() - 1);
          }

          wantGlue.addLast(grrProcedure);
          grrProcedure = null;
          this.burberryTire = true;
        }
      }
    }

    if (this.burberryTire && thisMethods == null) {
      this.keepingOrdeAmount--;

      if (keepingOrdeAmount == 0) {
        this.burberryTire = false;
        this.keepingOrdeAmount = Coordinator.DeployingOpportunity;
      }

    } else {

      if (grrProcedure == null && !wantGlue.isEmpty()) {
        grrProcedure = wantGlue.removeFirst();
        warheadMethod(grrProcedure);
        grrProcedure.situatedCommencesMinutes(this.generateUnderwayWalk());
        thingLingering = grrProcedure.havePeriodsGigantic();
      }
    }
  }

  public void treatInfluent(Procedures methodology) {
    wantGlue.add(new GrrProcedure(methodology));
  }
}
