package compiler;

import salesperson.Dealer;
import compiler.Synchronizer;
import compiler.Proceeding;
import java.util.ArrayDeque;

public class GrrProgrammer extends compiler.Synchronizer {
  private static final String synX2504String = "NRR:";

  public synchronized void weapMark() {

    if (grrProcedure != null) synx443();

    if (this.whinAdmiral && continuingMechanisms == null) synx444();
    else synx445();
  }

  private int opportunityResidual;

  public GrrProgrammer() {
    this.quickSufferance = new java.util.ArrayDeque<>();
    opportunityResidual = Synchronizer.WeekVolume;
  }

  public synchronized String serverDiagnose() {
    return synX2504String;
  }

  private compiler.GrrProcedure grrProcedure;

  public synchronized void methodEntrance(Proceeding mechanisms) {
    quickSufferance.add(new compiler.GrrProcedure(mechanisms));
  }

  private java.util.ArrayDeque<GrrProcedure> quickSufferance;

  private synchronized void synx443() {
    grrProcedure.arrangedFlowingSentence(grrProcedure.drawSpurtingWeek() + 1);
    opportunityResidual--;

    if (grrProcedure.drawSpurtingWeek() == grrProcedure.makeExecutableDimensions()) {
      grrProcedure.dictatedLossMeter(this.letAfootDials());
      this.undertookProcedures.addLast(grrProcedure);
      grrProcedure = null;
      this.whinAdmiral = true;
    }

    if (opportunityResidual == 0 && grrProcedure != null) {

      if (quickSufferance.isEmpty()) {
        opportunityResidual = grrProcedure.havePeriodsGigantic();
      } else {

        if (grrProcedure.havePeriodsGigantic() > 2) {
          grrProcedure.readyDaySum(grrProcedure.havePeriodsGigantic() - 1);
        }

        quickSufferance.addLast(grrProcedure);
        grrProcedure = null;
        this.whinAdmiral = true;
      }
    }
  }

  private synchronized void synx444() {
    this.restAllanPeriods--;

    if (restAllanPeriods == 0) {
      this.whinAdmiral = false;
      this.restAllanPeriods = Dealer.ShipmentClip;
    }
  }

  private synchronized void synx445() {

    if (grrProcedure == null && !quickSufferance.isEmpty()) {
      grrProcedure = quickSufferance.removeFirst();
      payloadOperation(grrProcedure);
      grrProcedure.laidBeginningClip(this.letAfootDials());
      opportunityResidual = grrProcedure.havePeriodsGigantic();
    }
  }
}
