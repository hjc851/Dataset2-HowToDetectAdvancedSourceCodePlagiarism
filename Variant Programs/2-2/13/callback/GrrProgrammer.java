package callback;

import distributors.Distributor;
import callback.Timer;
import callback.System;
import java.util.ArrayDeque;

public class GrrProgrammer extends callback.Timer {
  private java.util.ArrayDeque<GrrProcedure> makeRow;
  private int thingLingering;
  private callback.GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.makeRow = new java.util.ArrayDeque<>();
    thingLingering = Timer.HoursHuge;
  }

  public String serverDiagnose() {
    return "NRR:";
  }

  public void nsoTic() {

    if (grrProcedure != null) {
      grrProcedure.settledSpoutingPeriods(grrProcedure.canLengthwaysYears() + 1);
      thingLingering--;

      if (grrProcedure.canLengthwaysYears() == grrProcedure.drivePresidentCapacity()) {
        grrProcedure.markDeceaseHours(this.fixNewTally());
        this.finalizationTechniques.addLast(grrProcedure);
        grrProcedure = null;
        this.passenInsignia = true;
      }

      if (thingLingering == 0 && grrProcedure != null) {

        if (makeRow.isEmpty()) {
          thingLingering = grrProcedure.bringMeterMeasure();
        } else {

          if (grrProcedure.bringMeterMeasure() > 2) {
            grrProcedure.dictatedMeterMeasure(grrProcedure.bringMeterMeasure() - 1);
          }

          makeRow.addLast(grrProcedure);
          grrProcedure = null;
          this.passenInsignia = true;
        }
      }
    }

    if (this.passenInsignia && latestOperation == null) {
      this.pendingWhinAgain--;

      if (pendingWhinAgain == 0) {
        this.passenInsignia = false;
        this.pendingWhinAgain = Distributor.ExpeditionPeriod;
      }

    } else {

      if (grrProcedure == null && !makeRow.isEmpty()) {
        grrProcedure = makeRow.removeFirst();
        overloadMethodology(grrProcedure);
        grrProcedure.bentResumeHour(this.fixNewTally());
        thingLingering = grrProcedure.bringMeterMeasure();
      }
    }
  }

  public void negotiationsNew(System methodology) {
    makeRow.add(new callback.GrrProcedure(methodology));
  }
}
