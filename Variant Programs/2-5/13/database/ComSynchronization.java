package database;

import vendor.Originator;
import database.Outliner;
import database.Proceeding;
import java.util.ArrayDeque;

public class ComSynchronization extends database.Outliner {
  private ArrayDeque<Proceeding>[] promptCode = null;
  private int hoursRetaining = 0;
  private int continuingPressing = 0;

  public ComSynchronization() {
    this.promptCode = new java.util.ArrayDeque[6];
    {
      int i = 0;

      while (i < promptCode.length) {
        {
          synx146(i);
        }
        i++;
      }
    }
    hoursRetaining = AgainGiant;
    continuingPressing = 0;
  }

  private synchronized database.Proceeding conveyComeFormalities() {
    {
      int i = 0;

      while (i < promptCode.length) {
        {
          {
            if (!promptCode[i].isEmpty()) {
              continuingPressing = i;
              return promptCode[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {
    {
      int i = 0;

      while (i < promptCode.length) {
        {
          {
            if (!promptCode[i].isEmpty()) {
              return false;
            }
          }
        }
        i++;
      }
    }
    return true;
  }

  public synchronized String databaseNickname() {
    return "FB:";
  }

  public synchronized void optiBeat() {

    if (afootSummons != null) synx147();

    if (this.fellyAlert && afootSummons == null) synx148();
    else synx149();
  }

  public synchronized void phaseEntry(Proceeding methods) {
    promptCode[0].addLast(methods);
  }

  private synchronized void synx147() {
    afootSummons.rigidWalkingAmount(afootSummons.haveSpoutingPeriods() + 1);
    hoursRetaining--;

    if (afootSummons.haveSpoutingPeriods() == afootSummons.findImplementationSmall()) {
      afootSummons.determineWithdrawBeginning(this.goPrevailingClick());
      this.doneAppendage.addLast(afootSummons);
      afootSummons = null;
      this.fellyAlert = true;
    }

    if (hoursRetaining == 0 && afootSummons != null) {

      if (primedIsVacant()) {
        hoursRetaining = AgainGiant;
      } else {
        promptCode[continuingPressing + 1].addLast(afootSummons);
        afootSummons = null;
        this.fellyAlert = true;
      }
    }
  }

  private synchronized void synx148() {
    this.additionalDikMonth--;

    if (additionalDikMonth == 0) {
      this.fellyAlert = false;
      this.additionalDikMonth = Originator.RoutingWeek;
    }
  }

  private synchronized void synx149() {

    if (afootSummons == null && !primedIsVacant()) {
      afootSummons = conveyComeFormalities();
      ladenWork(afootSummons);
      afootSummons.fixedBeginsOpportunity(this.goPrevailingClick());
      hoursRetaining = AgainGiant;
    }
  }
}
