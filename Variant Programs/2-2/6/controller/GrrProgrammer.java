package controller;

import starter.Starter;
import controller.Compiler;
import controller.Formalities;
import java.util.ArrayDeque;

public class GrrProgrammer extends Compiler {
  private ArrayDeque<GrrProcedure> preparingReaper;
  private int weekSurviving;
  private GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.preparingReaper = new ArrayDeque<>();
    weekSurviving = Compiler.AgainGiant;
  }

  public String developerIdentify() {
    return "NRR:";
  }

  public void ourTicktack() {

    if (grrProcedure != null) {
      grrProcedure.doRushingAgain(grrProcedure.haveSpoutingPeriods() + 1);
      weekSurviving--;

      if (grrProcedure.haveSpoutingPeriods() == grrProcedure.produceVeepDensity()) {
        grrProcedure.rigidQuittingAmount(this.generateUnderwayWalk());
        this.undertakenMarch.addLast(grrProcedure);
        grrProcedure = null;
        this.thmFlagstone = true;
      }

      if (weekSurviving == 0 && grrProcedure != null) {

        if (preparingReaper.isEmpty()) {
          weekSurviving = grrProcedure.letHoursHuge();
        } else {

          if (grrProcedure.letHoursHuge() > 2) {
            grrProcedure.orderedChanceNumber(grrProcedure.letHoursHuge() - 1);
          }

          preparingReaper.addLast(grrProcedure);
          grrProcedure = null;
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

      if (grrProcedure == null && !preparingReaper.isEmpty()) {
        grrProcedure = preparingReaper.removeFirst();
        lodePhase(grrProcedure);
        grrProcedure.determinedInitiateDays(this.generateUnderwayWalk());
        weekSurviving = grrProcedure.letHoursHuge();
      }
    }
  }

  public void cycleIn(Formalities serve) {
    preparingReaper.add(new GrrProcedure(serve));
  }
}
