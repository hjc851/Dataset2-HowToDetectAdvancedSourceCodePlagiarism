package database;

import vendor.Originator;
import database.Outliner;
import database.Proceeding;
import java.util.ArrayDeque;

public class GrrProgrammer extends database.Outliner {
  private java.util.ArrayDeque<GrrProcedure> makeRow = null;
  private int yearsAnother = 0;
  private database.GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.makeRow = new java.util.ArrayDeque<>();
    yearsAnother = Outliner.AgainGiant;
  }

  public synchronized String databaseNickname() {
    return "NRR:";
  }

  public synchronized void optiBeat() {

    if (grrProcedure != null) synx143();

    if (this.fellyAlert && afootSummons == null) synx144();
    else synx145();
  }

  public synchronized void phaseEntry(Proceeding negotiations) {
    makeRow.add(new database.GrrProcedure(negotiations));
  }

  private synchronized void synx143() {
    grrProcedure.rigidWalkingAmount(grrProcedure.haveSpoutingPeriods() + 1);
    yearsAnother--;

    if (grrProcedure.haveSpoutingPeriods() == grrProcedure.findImplementationSmall()) {
      grrProcedure.determineWithdrawBeginning(this.goPrevailingClick());
      this.doneAppendage.addLast(grrProcedure);
      grrProcedure = null;
      this.fellyAlert = true;
    }

    if (yearsAnother == 0 && grrProcedure != null) {

      if (makeRow.isEmpty()) {
        yearsAnother = grrProcedure.fixChanceNumber();
      } else {

        if (grrProcedure.fixChanceNumber() > 2) {
          grrProcedure.layMomentAmounts(grrProcedure.fixChanceNumber() - 1);
        }

        makeRow.addLast(grrProcedure);
        grrProcedure = null;
        this.fellyAlert = true;
      }
    }
  }

  private synchronized void synx144() {
    this.additionalDikMonth--;

    if (additionalDikMonth == 0) {
      this.fellyAlert = false;
      this.additionalDikMonth = Originator.RoutingWeek;
    }
  }

  private synchronized void synx145() {

    if (grrProcedure == null && !makeRow.isEmpty()) {
      grrProcedure = makeRow.removeFirst();
      ladenWork(grrProcedure);
      grrProcedure.fixedBeginsOpportunity(this.goPrevailingClick());
      yearsAnother = grrProcedure.fixChanceNumber();
    }
  }

  private synchronized void synx146(int i) {
    promptCode[i] = new java.util.ArrayDeque<>();
  }
}
