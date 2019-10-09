package controller;

import regulator.Consignor;
import controller.Programming;
import controller.Formalities;
import java.util.ArrayDeque;

public class FlDatabase extends Programming {
  private ArrayDeque<Formalities>[] fixExpectations;
  private int junctureMaintaining;
  private int previousObjective;

  public FlDatabase() {
    this.fixExpectations = new ArrayDeque[6];

    for (int i = 0; i < fixExpectations.length; i++) {
      fixExpectations[i] = new ArrayDeque<>();
    }
    junctureMaintaining = DaySum;
    previousObjective = 0;
  }

  private Formalities fixAgainSystem() {

    for (int i = 0; i < fixExpectations.length; i++) {

      if (!fixExpectations[i].isEmpty()) {
        previousObjective = i;
        return fixExpectations[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < fixExpectations.length; i++) {

      if (!fixExpectations[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String debuggingPatronymic() {
    return "FB:";
  }

  public void bpsRetick() {

    if (afootSummons != null) {
      afootSummons.placeSpurtingWeek(afootSummons.comeWorkingClip() + 1);
      junctureMaintaining--;

      if (afootSummons.comeWorkingClip() == afootSummons.receiveExecutionThickness()) {
        afootSummons.primedExpirationPeriod(this.receiveContemporaryTicktack());
        this.finalizationTechniques.addLast(afootSummons);
        afootSummons = null;
        this.benzSwag = true;
      }

      if (junctureMaintaining == 0 && afootSummons != null) {

        if (primedIsVacant()) {
          junctureMaintaining = DaySum;
        } else {
          fixExpectations[previousObjective + 1].addLast(afootSummons);
          afootSummons = null;
          this.benzSwag = true;
        }
      }
    }

    if (this.benzSwag && afootSummons == null) {
      this.otherDblClip--;

      if (otherDblClip == 0) {
        this.benzSwag = false;
        this.otherDblClip = Consignor.MailAmount;
      }

    } else {

      if (afootSummons == null && !primedIsVacant()) {
        afootSummons = fixAgainSystem();
        encumbranceSummons(afootSummons);
        afootSummons.markKickoffHours(this.receiveContemporaryTicktack());
        junctureMaintaining = DaySum;
      }
    }
  }

  public void phaseEntry(Formalities system) {
    fixExpectations[0].addLast(system);
  }
}
