package controller;

import starter.Starter;
import controller.Compiler;
import controller.Formalities;
import java.util.ArrayDeque;

public class GpaInterface extends Compiler {
  private ArrayDeque<Formalities> willingSpooler;
  private int chanceUnresolved;

  public GpaInterface() {
    this.willingSpooler = new ArrayDeque<>();
    chanceUnresolved = AgainGiant;
  }

  public String developerIdentify() {
    return "RR:";
  }

  public void ourTicktack() {

    if (presentlyMechanism != null) {
      presentlyMechanism.doRushingAgain(presentlyMechanism.haveSpoutingPeriods() + 1);
      chanceUnresolved--;

      if (presentlyMechanism.haveSpoutingPeriods() == presentlyMechanism.produceVeepDensity()) {
        presentlyMechanism.rigidQuittingAmount(this.generateUnderwayWalk());
        this.undertakenMarch.addLast(presentlyMechanism);
        presentlyMechanism = null;
        this.thmFlagstone = true;
      }

      if (chanceUnresolved == 0 && presentlyMechanism != null) {

        if (willingSpooler.isEmpty()) {
          chanceUnresolved = AgainGiant;
        } else {
          willingSpooler.addLast(presentlyMechanism);
          presentlyMechanism = null;
          this.thmFlagstone = true;
        }
      }
    }

    if (this.thmFlagstone && presentlyMechanism == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == 0) {
        this.thmFlagstone = false;
        this.leavingBrinWhen = Starter.MurderWhen;
      }

    } else {

      if (presentlyMechanism == null && !willingSpooler.isEmpty()) {
        presentlyMechanism = willingSpooler.removeFirst();
        lodePhase(presentlyMechanism);
        presentlyMechanism.determinedInitiateDays(this.generateUnderwayWalk());
        chanceUnresolved = AgainGiant;
      }
    }
  }

  public void cycleIn(Formalities methodology) {
    willingSpooler.addLast(methodology);
  }
}
