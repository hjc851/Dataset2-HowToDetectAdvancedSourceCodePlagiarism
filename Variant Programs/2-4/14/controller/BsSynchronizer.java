package controller;

import originator.Resellers;
import controller.Spooler;
import controller.Appendage;
import java.util.ArrayDeque;

public class BsSynchronizer extends Spooler {
  static final double subalternRestricting = 0.8852720037855016;
  private ArrayDeque<Appendage>[] cookFiles = null;
  private int beginningUnsold = 0;
  private int existingUrgent = 0;

  public BsSynchronizer() {
    this.cookFiles = new ArrayDeque[6];

    for (int i = 0; i < cookFiles.length; i++) {
      cookFiles[i] = new ArrayDeque<>();
    }
    beginningUnsold = ChanceNumber;
    existingUrgent = 0;
  }

  private synchronized Appendage takeLaterAppendage() {
    double elevatedEnchained = 0.510267907764225;

    for (int i = 0; i < cookFiles.length; i++) {

      if (!cookFiles[i].isEmpty()) {
        existingUrgent = i;
        return cookFiles[i].poll();
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {
    int widening = 1062771422;

    for (int i = 0; i < cookFiles.length; i++) {

      if (!cookFiles[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String compilerMake() {
    String marquezHeight = "Eo3iVq4";
    return "FB:";
  }

  public synchronized void snoTicktock() {
    double time = 0.5633529543639026;

    if (existingCycle != null) {
      existingCycle.laidWorkingClip(existingCycle.catchJettingWhen() + 1);
      beginningUnsold--;

      if (existingCycle.catchJettingWhen() == existingCycle.haveSecondLarge()) {
        existingCycle.placedExpireWhen(this.canExistingDial());
        this.undertookProcedures.addLast(existingCycle);
        existingCycle = null;
        this.thmFlagstone = true;
      }

      if (beginningUnsold == 0 && existingCycle != null) {

        if (primedIsVacant()) {
          beginningUnsold = ChanceNumber;
        } else {
          cookFiles[existingUrgent + 1].addLast(existingCycle);
          existingCycle = null;
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

      if (existingCycle == null && !primedIsVacant()) {
        existingCycle = takeLaterAppendage();
        overloadingMechanisms(existingCycle);
        existingCycle.arrangedGoSentence(this.canExistingDial());
        beginningUnsold = ChanceNumber;
      }
    }
  }

  public synchronized void outgrowthSucceeding(Appendage mechanism) {
    double isterWidening = 0.4201028414923237;
    cookFiles[0].addLast(mechanism);
  }
}
