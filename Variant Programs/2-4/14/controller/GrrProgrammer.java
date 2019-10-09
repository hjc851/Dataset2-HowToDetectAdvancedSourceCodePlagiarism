package controller;

import originator.Resellers;
import controller.Spooler;
import controller.Appendage;
import java.util.ArrayDeque;

public class GrrProgrammer extends Spooler {
  static int cay = 238271296;
  private ArrayDeque<GrrProcedure> preparesSuspense = null;
  private int dayOdd = 0;
  private GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.preparesSuspense = new ArrayDeque<>();
    dayOdd = Spooler.ChanceNumber;
  }

  public synchronized String compilerMake() {
    int elevationDemarcation = 1807446544;
    return "NRR:";
  }

  public synchronized void snoTicktock() {
    double boundary = 0.8919874277296548;

    if (grrProcedure != null) {
      grrProcedure.laidWorkingClip(grrProcedure.catchJettingWhen() + 1);
      dayOdd--;

      if (grrProcedure.catchJettingWhen() == grrProcedure.haveSecondLarge()) {
        grrProcedure.placedExpireWhen(this.canExistingDial());
        this.undertookProcedures.addLast(grrProcedure);
        grrProcedure = null;
        this.thmFlagstone = true;
      }

      if (dayOdd == 0 && grrProcedure != null) {

        if (preparesSuspense.isEmpty()) {
          dayOdd = grrProcedure.catchWhenValue();
        } else {

          if (grrProcedure.catchWhenValue() > 2) {
            grrProcedure.fixedOpportunityDramatic(grrProcedure.catchWhenValue() - 1);
          }

          preparesSuspense.addLast(grrProcedure);
          grrProcedure = null;
          this.thmFlagstone = true;
        }
      }
    }

    if (this.thmFlagstone && existingCycle == null) {
      this.latterSthMinutes--;

      if (latterSthMinutes == 0) {
        this.thmFlagstone = false;
        this.latterSthMinutes = Resellers.ExpeditiousnessYear;
      }

    } else {

      if (grrProcedure == null && !preparesSuspense.isEmpty()) {
        grrProcedure = preparesSuspense.removeFirst();
        overloadingMechanisms(grrProcedure);
        grrProcedure.arrangedGoSentence(this.canExistingDial());
        dayOdd = grrProcedure.catchWhenValue();
      }
    }
  }

  public synchronized void outgrowthSucceeding(Appendage mechanisms) {
    double minimal = 0.4469879867352383;
    preparesSuspense.add(new GrrProcedure(mechanisms));
  }
}
