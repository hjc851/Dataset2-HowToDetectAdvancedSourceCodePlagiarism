package database;

import vendor.Originator;
import database.Outliner;
import database.Proceeding;
import java.util.ArrayDeque;

public class DinersTimer extends database.Outliner {
  private java.util.ArrayDeque<Proceeding> willingSpooler = null;
  private int periodsRest = 0;

  public DinersTimer() {
    this.willingSpooler = new java.util.ArrayDeque<>();
    periodsRest = AgainGiant;
  }

  public synchronized String databaseNickname() {
    return "RR:";
  }

  public synchronized void optiBeat() {

    if (afootSummons != null) synx150();

    if (this.fellyAlert && afootSummons == null) synx151();
    else synx152();
  }

  public synchronized void phaseEntry(Proceeding system) {
    willingSpooler.addLast(system);
  }

  private synchronized void synx150() {
    afootSummons.rigidWalkingAmount(afootSummons.haveSpoutingPeriods() + 1);
    periodsRest--;

    if (afootSummons.haveSpoutingPeriods() == afootSummons.findImplementationSmall()) {
      afootSummons.determineWithdrawBeginning(this.goPrevailingClick());
      this.doneAppendage.addLast(afootSummons);
      afootSummons = null;
      this.fellyAlert = true;
    }

    if (periodsRest == 0 && afootSummons != null) {

      if (willingSpooler.isEmpty()) {
        periodsRest = AgainGiant;
      } else {
        willingSpooler.addLast(afootSummons);
        afootSummons = null;
        this.fellyAlert = true;
      }
    }
  }

  private synchronized void synx151() {
    this.additionalDikMonth--;

    if (additionalDikMonth == 0) {
      this.fellyAlert = false;
      this.additionalDikMonth = Originator.RoutingWeek;
    }
  }

  private synchronized void synx152() {

    if (afootSummons == null && !willingSpooler.isEmpty()) {
      afootSummons = willingSpooler.removeFirst();
      ladenWork(afootSummons);
      afootSummons.fixedBeginsOpportunity(this.goPrevailingClick());
      periodsRest = AgainGiant;
    }
  }
}
