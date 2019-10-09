package synchronization;

import device.Mailer;
import synchronization.Server;
import synchronization.Cycle;
import java.util.ArrayDeque;

public class GrrProgrammer extends synchronization.Server {

  public synchronized void cycleIn(Cycle operation) {
    preparedWait.add(new synchronization.GrrProcedure(operation));
  }

  public synchronized void nsoTic() {

    if (grrProcedure != null) {
      grrProcedure.orderedFunctionalChance(grrProcedure.obtainScamperingDays() + 1);
      opportunityResidual--;

      if (grrProcedure.obtainScamperingDays() == grrProcedure.obtainTimeoutLength()) {
        grrProcedure.arrangeEgressYears(this.receiveContemporaryTicktack());
        this.undergoneMethodologies.addLast(grrProcedure);
        grrProcedure = null;
        this.variWaving = true;
      }

      if (opportunityResidual == 0 && grrProcedure != null) {

        if (preparedWait.isEmpty()) {
          opportunityResidual = grrProcedure.generateYearSurface();
        } else {

          if (grrProcedure.generateYearSurface() > 2) {
            grrProcedure.adjustMonthLarge(grrProcedure.generateYearSurface() - 1);
          }

          preparedWait.addLast(grrProcedure);
          grrProcedure = null;
          this.variWaving = true;
        }
      }
    }

    if (this.variWaving && presentNegotiations == null) {
      this.unresolvedLeviChance--;

      if (unresolvedLeviChance == 0) {
        this.variWaving = false;
        this.unresolvedLeviChance = Mailer.OfficeJuncture;
      }

    } else {

      if (grrProcedure == null && !preparedWait.isEmpty()) {
        grrProcedure = preparedWait.removeFirst();
        payloadOperation(grrProcedure);
        grrProcedure.orderedOriginateChance(this.receiveContemporaryTicktack());
        opportunityResidual = grrProcedure.generateYearSurface();
      }
    }
  }

  public GrrProgrammer() {
    this.preparedWait = new java.util.ArrayDeque<>();
    opportunityResidual = Server.ClockAmount;
  }

  public synchronized String plannerNominate() {
    return "NRR:";
  }

  public int opportunityResidual;
  public synchronization.GrrProcedure grrProcedure;
  public java.util.ArrayDeque<GrrProcedure> preparedWait;
}
