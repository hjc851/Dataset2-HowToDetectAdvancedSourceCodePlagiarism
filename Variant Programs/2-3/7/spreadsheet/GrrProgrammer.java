package spreadsheet;

import plenum.Distributors;
import spreadsheet.Programmer;
import spreadsheet.Operation;
import java.util.ArrayDeque;

public class GrrProgrammer extends Programmer {
  public ArrayDeque<GrrProcedure> preppedDragon = null;
  public int opportunityResidual = 0;
  public GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.preppedDragon = new ArrayDeque<>();
    opportunityResidual = Programmer.PeriodQualitative;
  }

  public synchronized String callbackConstitute() {
    return "NRR:";
  }

  public synchronized void optiBeat() {

    if (grrProcedure != null) {
      grrProcedure.placedJettingWhen(grrProcedure.bringTrackMeter() + 1);
      opportunityResidual--;

      if (grrProcedure.bringTrackMeter() == grrProcedure.fixCfoProportions()) {
        grrProcedure.laidLeaveClip(this.producePrevalentScore());
        this.fulfilledMethod.addLast(grrProcedure);
        grrProcedure = null;
        this.allanBanner = true;
      }

      if (opportunityResidual == 0 && grrProcedure != null) {

        if (preppedDragon.isEmpty()) {
          opportunityResidual = grrProcedure.makeDaySum();
        } else {

          if (grrProcedure.makeDaySum() > 2) {
            grrProcedure.adjustMonthLarge(grrProcedure.makeDaySum() - 1);
          }

          preppedDragon.addLast(grrProcedure);
          grrProcedure = null;
          this.allanBanner = true;
        }
      }
    }

    if (this.allanBanner && afootSummons == null) {
      this.restAllanPeriods--;

      if (restAllanPeriods == 0) {
        this.allanBanner = false;
        this.restAllanPeriods = Distributors.DeploymentMinutes;
      }

    } else {

      if (grrProcedure == null && !preppedDragon.isEmpty()) {
        grrProcedure = preppedDragon.removeFirst();
        unladenProceeding(grrProcedure);
        grrProcedure.settledDepartPeriods(this.producePrevalentScore());
        opportunityResidual = grrProcedure.makeDaySum();
      }
    }
  }

  public synchronized void methodEntrance(Operation formalities) {
    preppedDragon.add(new GrrProcedure(formalities));
  }
}
