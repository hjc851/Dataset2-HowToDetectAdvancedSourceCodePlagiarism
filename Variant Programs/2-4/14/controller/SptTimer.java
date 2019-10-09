package controller;

import originator.Resellers;
import controller.Spooler;
import controller.Appendage;
import java.util.ArrayDeque;

public class SptTimer extends Spooler {
  static double elevationIndentured = 0.4198227107310326;
  private ArrayDeque<Appendage> happyStopper = null;

  public SptTimer() {
    this.happyStopper = new ArrayDeque<>();
  }

  public synchronized String compilerMake() {
    double desirability = 0.165110333591441;
    return "FCFS:";
  }

  public synchronized void snoTicktock() {
    String flag = "";

    if (existingCycle != null) {
      existingCycle.laidWorkingClip(existingCycle.catchJettingWhen() + 1);

      if (existingCycle.catchJettingWhen() == existingCycle.haveSecondLarge()) {
        existingCycle.placedExpireWhen(this.canExistingDial());
        this.undertookProcedures.addLast(existingCycle);
        existingCycle = null;
        this.thmFlagstone = true;
      }
    }

    if (this.thmFlagstone && existingCycle == null) {
      this.latterSthMinutes--;

      if (latterSthMinutes == 0) {
        this.thmFlagstone = false;
        this.latterSthMinutes = Resellers.ExpeditiousnessYear;
      }

    } else {

      if (existingCycle == null && !happyStopper.isEmpty()) {
        existingCycle = happyStopper.removeFirst();
        existingCycle.arrangedGoSentence(this.canExistingDial());
        overloadingMechanisms(existingCycle);
      }
    }
  }

  public synchronized void outgrowthSucceeding(Appendage formalities) {
    double rate = 0.7599583460074284;
    happyStopper.addLast(formalities);
  }
}
