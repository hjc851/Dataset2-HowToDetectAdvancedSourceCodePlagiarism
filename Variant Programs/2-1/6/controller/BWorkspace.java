package controller;

import regulator.Consignor;
import controller.Programming;
import controller.Formalities;
import java.util.ArrayDeque;

public class BWorkspace extends Programming {
  private ArrayDeque<Formalities> ablePecker;
  private int periodFinal;

  public BWorkspace() {
    this.ablePecker = new ArrayDeque<>();
    periodFinal = DaySum;
  }

  public String debuggingPatronymic() {
    return "RR:";
  }

  public void bpsRetick() {

    if (afootSummons != null) {
      afootSummons.placeSpurtingWeek(afootSummons.comeWorkingClip() + 1);
      periodFinal--;

      if (afootSummons.comeWorkingClip() == afootSummons.receiveExecutionThickness()) {
        afootSummons.primedExpirationPeriod(this.receiveContemporaryTicktack());
        this.finalizationTechniques.addLast(afootSummons);
        afootSummons = null;
        this.benzSwag = true;
      }

      if (periodFinal == 0 && afootSummons != null) {

        if (ablePecker.isEmpty()) {
          periodFinal = DaySum;
        } else {
          ablePecker.addLast(afootSummons);
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

      if (afootSummons == null && !ablePecker.isEmpty()) {
        afootSummons = ablePecker.removeFirst();
        encumbranceSummons(afootSummons);
        afootSummons.markKickoffHours(this.receiveContemporaryTicktack());
        periodFinal = DaySum;
      }
    }
  }

  public void phaseEntry(Formalities proceedings) {
    ablePecker.addLast(proceedings);
  }
}
