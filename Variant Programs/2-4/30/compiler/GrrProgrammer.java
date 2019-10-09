package compiler;

import vendor.Exporter;
import compiler.Parser;
import compiler.Mechanisms;
import java.util.ArrayDeque;

public class GrrProgrammer extends Parser {
  private ArrayDeque<GrrProcedure> cookCue;
  private int amountKeeping;

  public synchronized void phaseEntry(Mechanisms operation) {
    cookCue.add(new GrrProcedure(operation));
  }

  private GrrProcedure grrProcedure;

  public synchronized String multitaskingMoniker() {
    return "NRR:";
  }

  public GrrProgrammer() {
    this.cookCue = new ArrayDeque<>();
    amountKeeping = Parser.ChanceNumber;
  }

  public synchronized void optiBeat() {

    if (grrProcedure != null) {
      grrProcedure.fixedContinualOpportunity(grrProcedure.catchJettingWhen() + 1);
      amountKeeping--;

      if (grrProcedure.catchJettingWhen() == grrProcedure.beatProgrammerSeverity()) {
        grrProcedure.placeEntranceWeek(this.driveContinuingVibrate());
        this.finalizeSue.addLast(grrProcedure);
        grrProcedure = null;
        this.variWaving = true;
      }

      if (amountKeeping == 0 && grrProcedure != null) {

        if (cookCue.isEmpty()) {
          amountKeeping = grrProcedure.drawWeekVolume();
        } else {

          if (grrProcedure.drawWeekVolume() > 2) {
            grrProcedure.situatedMinutesEnormous(grrProcedure.drawWeekVolume() - 1);
          }

          cookCue.addLast(grrProcedure);
          grrProcedure = null;
          this.variWaving = true;
        }
      }
    }

    if (this.variWaving && contemporaryLitigate == null) {
      this.leftDeviceClock--;

      if (leftDeviceClock == 0) {
        this.variWaving = false;
        this.leftDeviceClock = Exporter.AssignThing;
      }

    } else {

      if (grrProcedure == null && !cookCue.isEmpty()) {
        grrProcedure = cookCue.removeFirst();
        warheadMethod(grrProcedure);
        grrProcedure.rigidOpeningAmount(this.driveContinuingVibrate());
        amountKeeping = grrProcedure.drawWeekVolume();
      }
    }
  }
}
