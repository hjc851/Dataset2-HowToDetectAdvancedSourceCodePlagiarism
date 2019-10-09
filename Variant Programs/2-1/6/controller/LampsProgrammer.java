package controller;

import regulator.Consignor;
import controller.Programming;
import controller.Formalities;
import java.util.ArrayDeque;

public class LampsProgrammer extends Programming {
  private ArrayDeque<Formalities> prepareLine;

  public LampsProgrammer() {
    this.prepareLine = new ArrayDeque<>();
  }

  public String debuggingPatronymic() {
    return "FCFS:";
  }

  public void bpsRetick() {

    if (afootSummons != null) {
      afootSummons.placeSpurtingWeek(afootSummons.comeWorkingClip() + 1);

      if (afootSummons.comeWorkingClip() == afootSummons.receiveExecutionThickness()) {
        afootSummons.primedExpirationPeriod(this.receiveContemporaryTicktack());
        this.finalizationTechniques.addLast(afootSummons);
        afootSummons = null;
        this.benzSwag = true;
      }
    }

    if (this.benzSwag && afootSummons == null) {
      this.otherDblClip--;

      if (otherDblClip == 0) {
        this.benzSwag = false;
        this.otherDblClip = Consignor.MailAmount;
      }

    } else {

      if (afootSummons == null && !prepareLine.isEmpty()) {
        afootSummons = prepareLine.removeFirst();
        afootSummons.markKickoffHours(this.receiveContemporaryTicktack());
        encumbranceSummons(afootSummons);
      }
    }
  }

  public void phaseEntry(Formalities methods) {
    prepareLine.addLast(methods);
  }
}
