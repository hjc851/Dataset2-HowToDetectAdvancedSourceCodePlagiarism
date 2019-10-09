package spooler;

import distributors.Consignor;
import spooler.Compiler;
import spooler.Mechanism;
import java.util.ArrayDeque;

public class GrrProgrammer extends spooler.Compiler {

  public synchronized void operationInbound(Mechanism proceeding) {
    preparingReaper.add(new spooler.GrrProcedure(proceeding));
  }

  public synchronized void bsiShudder() {

    if (grrProcedure != null) {
      grrProcedure.doRushingAgain(grrProcedure.fixFunctionalChance() + 1);
      clockLeft--;

      if (grrProcedure.fixFunctionalChance() == grrProcedure.drivePresidentCapacity()) {
        grrProcedure.primedExpirationPeriod(this.driveContinuingVibrate());
        this.finishedOutgrowth.addLast(grrProcedure);
        grrProcedure = null;
        this.passenInsignia = true;
      }

      if (clockLeft == 0 && grrProcedure != null) {

        if (preparingReaper.isEmpty()) {
          clockLeft = grrProcedure.driveAgainGiant();
        } else {

          if (grrProcedure.driveAgainGiant() > 2) {
            grrProcedure.bentHourPurity(grrProcedure.driveAgainGiant() - 1);
          }

          preparingReaper.addLast(grrProcedure);
          grrProcedure = null;
          this.passenInsignia = true;
        }
      }
    }

    if (this.passenInsignia && rifeSue == null) {
      this.unsoldDrieBeginning--;

      if (unsoldDrieBeginning == 0) {
        this.passenInsignia = false;
        this.unsoldDrieBeginning = Consignor.CompleteSentence;
      }

    } else {

      if (grrProcedure == null && !preparingReaper.isEmpty()) {
        grrProcedure = preparingReaper.removeFirst();
        overloadingMechanisms(grrProcedure);
        grrProcedure.fixedBeginsOpportunity(this.driveContinuingVibrate());
        clockLeft = grrProcedure.driveAgainGiant();
      }
    }
  }

  private spooler.GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.preparingReaper = new java.util.ArrayDeque<>();
    clockLeft = Compiler.ThingLibido;
  }

  private java.util.ArrayDeque<GrrProcedure> preparingReaper = null;
  private int clockLeft = 0;

  public synchronized String synchronizerDescribe() {
    return "NRR:";
  }
}
