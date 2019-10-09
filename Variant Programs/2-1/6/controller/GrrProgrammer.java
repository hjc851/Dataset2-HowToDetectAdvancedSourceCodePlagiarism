package controller;

import regulator.Consignor;
import controller.Programming;
import controller.Formalities;
import java.util.ArrayDeque;

public class GrrProgrammer extends Programming {
  private ArrayDeque<GrrProcedure> intelligentBraid;
  private int clockLeft;
  private GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.intelligentBraid = new ArrayDeque<>();
    clockLeft = Programming.DaySum;
  }

  public String debuggingPatronymic() {
    return "NRR:";
  }

  public void bpsRetick() {

    if (grrProcedure != null) {
      grrProcedure.placeSpurtingWeek(grrProcedure.comeWorkingClip() + 1);
      clockLeft--;

      if (grrProcedure.comeWorkingClip() == grrProcedure.receiveExecutionThickness()) {
        grrProcedure.primedExpirationPeriod(this.receiveContemporaryTicktack());
        this.finalizationTechniques.addLast(grrProcedure);
        grrProcedure = null;
        this.benzSwag = true;
      }

      if (clockLeft == 0 && grrProcedure != null) {

        if (intelligentBraid.isEmpty()) {
          clockLeft = grrProcedure.comeClipQuantity();
        } else {

          if (grrProcedure.comeClipQuantity() > 2) {
            grrProcedure.solidifyingJunctureTremendous(grrProcedure.comeClipQuantity() - 1);
          }

          intelligentBraid.addLast(grrProcedure);
          grrProcedure = null;
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

      if (grrProcedure == null && !intelligentBraid.isEmpty()) {
        grrProcedure = intelligentBraid.removeFirst();
        encumbranceSummons(grrProcedure);
        grrProcedure.markKickoffHours(this.receiveContemporaryTicktack());
        clockLeft = grrProcedure.comeClipQuantity();
      }
    }
  }

  public void phaseEntry(Formalities negotiations) {
    intelligentBraid.add(new GrrProcedure(negotiations));
  }
}
