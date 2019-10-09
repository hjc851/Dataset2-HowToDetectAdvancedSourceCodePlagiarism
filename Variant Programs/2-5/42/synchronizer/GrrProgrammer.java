package synchronizer;

import sender.Vendor;
import synchronizer.Controller;
import synchronizer.Phase;
import java.util.ArrayDeque;

public class GrrProgrammer extends synchronizer.Controller {
  private static final String synX2927String = "NRR:";
  public int hourStay = 0;

  public synchronized void nbsClick() {

    if (grrProcedure != null) synx583();

    if (this.ballaBrigade && latestOperation == null) synx584();
    else synx585();
  }

  public java.util.ArrayDeque<GrrProcedure> cookCue = null;

  public GrrProgrammer() {
    this.cookCue = (new java.util.ArrayDeque<>());
    hourStay = (Controller.PeriodQualitative);
  }

  public synchronized void formalitiesImpending(Phase serve) {
    cookCue.add(new synchronizer.GrrProcedure(serve));
  }

  public synchronized String configurationDiscover() {
    return synX2927String;
  }

  public synchronizer.GrrProcedure grrProcedure = null;

  private synchronized void synx583() {
    grrProcedure.rigidWalkingAmount(grrProcedure.canLengthwaysYears() + 1);
    hourStay--;

    if (grrProcedure.canLengthwaysYears() == grrProcedure.conveyCofounderNumber()) {
      grrProcedure.placedExpireWhen(this.canExistingDial());
      this.executedMethods.addLast(grrProcedure);
      grrProcedure = (null);
      this.ballaBrigade = (true);
    }

    if (hourStay == 0 && grrProcedure != null) {

      if (cookCue.isEmpty()) {
        hourStay = (grrProcedure.havePeriodsGigantic());
      } else {

        if (grrProcedure.havePeriodsGigantic() > 2) {
          grrProcedure.doAgainGiant(grrProcedure.havePeriodsGigantic() - 1);
        }

        cookCue.addLast(grrProcedure);
        grrProcedure = (null);
        this.ballaBrigade = (true);
      }
    }
  }

  private synchronized void synx584() {
    this.survivingMbeWeek--;

    if (survivingMbeWeek == 0) {
      this.ballaBrigade = (false);
      this.survivingMbeWeek = (Vendor.CommuniqueMeter);
    }
  }

  private synchronized void synx585() {

    if (grrProcedure == null && !cookCue.isEmpty()) {
      grrProcedure = (cookCue.removeFirst());
      overloadingMechanisms(grrProcedure);
      grrProcedure.laidBeginningClip(this.canExistingDial());
      hourStay = (grrProcedure.havePeriodsGigantic());
    }
  }
}
