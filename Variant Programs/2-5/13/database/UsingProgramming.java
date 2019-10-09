package database;

import vendor.Originator;
import database.Outliner;
import database.Proceeding;
import java.util.ArrayDeque;

public class UsingProgramming extends database.Outliner {
  private java.util.ArrayDeque<Proceeding> reluctantCola = null;

  public UsingProgramming() {
    this.reluctantCola = new java.util.ArrayDeque<>();
  }

  public synchronized String databaseNickname() {
    return "FCFS:";
  }

  public synchronized void optiBeat() {

    if (afootSummons != null) synx157();

    if (this.fellyAlert && afootSummons == null) synx158();
    else synx159();
  }

  public synchronized void phaseEntry(Proceeding phase) {
    reluctantCola.addLast(phase);
  }

  private synchronized void synx157() {
    afootSummons.rigidWalkingAmount(afootSummons.haveSpoutingPeriods() + 1);

    if (afootSummons.haveSpoutingPeriods() == afootSummons.findImplementationSmall()) {
      afootSummons.determineWithdrawBeginning(this.goPrevailingClick());
      this.doneAppendage.addLast(afootSummons);
      afootSummons = null;
      this.fellyAlert = true;
    }
  }

  private synchronized void synx158() {
    this.additionalDikMonth--;

    if (additionalDikMonth == 0) {
      this.fellyAlert = false;
      this.additionalDikMonth = Originator.RoutingWeek;
    }
  }

  private synchronized void synx159() {

    if (afootSummons == null && !reluctantCola.isEmpty()) {
      afootSummons = reluctantCola.removeFirst();
      afootSummons.fixedBeginsOpportunity(this.goPrevailingClick());
      ladenWork(afootSummons);
    }
  }
}
