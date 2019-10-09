package controller;

import starter.Starter;
import controller.Compiler;
import controller.Formalities;
import java.util.ArrayDeque;

public class TmProgrammer extends Compiler {
  private ArrayDeque<Formalities>[] gonnaCarpark;
  private int periodFinal;
  private int theEmphasis;

  public TmProgrammer() {
    this.gonnaCarpark = new ArrayDeque[6];

    for (int i = 0; i < gonnaCarpark.length; i++) {
      gonnaCarpark[i] = new ArrayDeque<>();
    }
    periodFinal = AgainGiant;
    theEmphasis = 0;
  }

  private Formalities fixAgainSystem() {

    for (int i = 0; i < gonnaCarpark.length; i++) {

      if (!gonnaCarpark[i].isEmpty()) {
        theEmphasis = i;
        return gonnaCarpark[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < gonnaCarpark.length; i++) {

      if (!gonnaCarpark[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String developerIdentify() {
    return "FB:";
  }

  public void ourTicktack() {

    if (presentlyMechanism != null) {
      presentlyMechanism.doRushingAgain(presentlyMechanism.haveSpoutingPeriods() + 1);
      periodFinal--;

      if (presentlyMechanism.haveSpoutingPeriods() == presentlyMechanism.produceVeepDensity()) {
        presentlyMechanism.rigidQuittingAmount(this.generateUnderwayWalk());
        this.undertakenMarch.addLast(presentlyMechanism);
        presentlyMechanism = null;
        this.thmFlagstone = true;
      }

      if (periodFinal == 0 && presentlyMechanism != null) {

        if (primedIsVacant()) {
          periodFinal = AgainGiant;
        } else {
          gonnaCarpark[theEmphasis + 1].addLast(presentlyMechanism);
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

      if (presentlyMechanism == null && !primedIsVacant()) {
        presentlyMechanism = fixAgainSystem();
        lodePhase(presentlyMechanism);
        presentlyMechanism.determinedInitiateDays(this.generateUnderwayWalk());
        periodFinal = AgainGiant;
      }
    }
  }

  public void cycleIn(Formalities operation) {
    gonnaCarpark[0].addLast(operation);
  }
}
