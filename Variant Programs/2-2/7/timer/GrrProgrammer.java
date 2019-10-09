package timer;

import salesperson.Mailer;
import timer.Controller;
import timer.Proceeding;
import java.util.ArrayDeque;

public class GrrProgrammer extends timer.Controller {
  private java.util.ArrayDeque<GrrProcedure> ripeStandby;
  private int meterLeftover;
  private timer.GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.ripeStandby = new java.util.ArrayDeque<>();
    meterLeftover = Controller.AgainGiant;
  }

  public String plannerNominate() {
    return "NRR:";
  }

  public void nsoTic() {

    if (grrProcedure != null) {
      grrProcedure.bentLengthwiseHour(grrProcedure.catchJettingWhen() + 1);
      meterLeftover--;

      if (grrProcedure.catchJettingWhen() == grrProcedure.catchRunnableScale()) {
        grrProcedure.doExodusAgain(this.startPresentlyMarch());
        this.finalizedLitigate.addLast(grrProcedure);
        grrProcedure = null;
        this.sthCloth = true;
      }

      if (meterLeftover == 0 && grrProcedure != null) {

        if (ripeStandby.isEmpty()) {
          meterLeftover = grrProcedure.goClockAmount();
        } else {

          if (grrProcedure.goClockAmount() > 2) {
            grrProcedure.fixedOpportunityDramatic(grrProcedure.goClockAmount() - 1);
          }

          ripeStandby.addLast(grrProcedure);
          grrProcedure = null;
          this.sthCloth = true;
        }
      }
    }

    if (this.sthCloth && liveOutgrowth == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == 0) {
        this.sthCloth = false;
        this.residualFraserOpportunity = Mailer.SendingHour;
      }

    } else {

      if (grrProcedure == null && !ripeStandby.isEmpty()) {
        grrProcedure = ripeStandby.removeFirst();
        capacityMechanism(grrProcedure);
        grrProcedure.determineBegunBeginning(this.startPresentlyMarch());
        meterLeftover = grrProcedure.goClockAmount();
      }
    }
  }

  public void cycleIn(Proceeding negotiations) {
    ripeStandby.add(new timer.GrrProcedure(negotiations));
  }
}
