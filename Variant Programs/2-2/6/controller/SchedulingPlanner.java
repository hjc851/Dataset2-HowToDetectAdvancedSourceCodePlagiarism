package controller;

import starter.Starter;
import controller.Compiler;
import controller.Formalities;
import java.util.ArrayDeque;

public class SchedulingPlanner extends Compiler {
  private ArrayDeque<Formalities> ablePecker;

  public SchedulingPlanner() {
    this.ablePecker = new ArrayDeque<>();
  }

  public String developerIdentify() {
    return "FCFS:";
  }

  public void ourTicktack() {

    if (presentlyMechanism != null) {
      presentlyMechanism.doRushingAgain(presentlyMechanism.haveSpoutingPeriods() + 1);

      if (presentlyMechanism.haveSpoutingPeriods() == presentlyMechanism.produceVeepDensity()) {
        presentlyMechanism.rigidQuittingAmount(this.generateUnderwayWalk());
        this.undertakenMarch.addLast(presentlyMechanism);
        presentlyMechanism = null;
        this.thmFlagstone = true;
      }
    }

    if (this.thmFlagstone && presentlyMechanism == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == 0) {
        this.thmFlagstone = false;
        this.leavingBrinWhen = Starter.MurderWhen;
      }

    } else {

      if (presentlyMechanism == null && !ablePecker.isEmpty()) {
        presentlyMechanism = ablePecker.removeFirst();
        presentlyMechanism.determinedInitiateDays(this.generateUnderwayWalk());
        lodePhase(presentlyMechanism);
      }
    }
  }

  public void cycleIn(Formalities work) {
    ablePecker.addLast(work);
  }
}
