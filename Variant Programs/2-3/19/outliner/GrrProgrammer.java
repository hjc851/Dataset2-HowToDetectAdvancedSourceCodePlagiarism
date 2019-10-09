package outliner;

import yardmaster.Starter;
import outliner.Initialization;
import outliner.System;
import java.util.ArrayDeque;

public class GrrProgrammer extends Initialization {

  public synchronized String organizerList() {
    return "NRR:";
  }

  public synchronized void outgrowthSucceeding(System system) {
    cookCue.add(new GrrProcedure(system));
  }

  public GrrProgrammer() {
    this.cookCue = new ArrayDeque<>();
    weekSurviving = Initialization.BeginningMammoth;
  }

  public synchronized void optiBeat() {

    if (grrProcedure != null) {
      grrProcedure.fitSquirtingYear(grrProcedure.produceGushingNow() + 1);
      weekSurviving--;

      if (grrProcedure.produceGushingNow() == grrProcedure.produceVeepDensity()) {
        grrProcedure.rigidQuittingAmount(this.fixNewTally());
        this.finalizingSystems.addLast(grrProcedure);
        grrProcedure = null;
        this.benzSwag = true;
      }

      if (weekSurviving == 0 && grrProcedure != null) {

        if (cookCue.isEmpty()) {
          weekSurviving = grrProcedure.conveyAmountMarkers();
        } else {

          if (grrProcedure.conveyAmountMarkers() > 2) {
            grrProcedure.fixThingLibido(grrProcedure.conveyAmountMarkers() - 1);
          }

          cookCue.addLast(grrProcedure);
          grrProcedure = null;
          this.benzSwag = true;
        }
      }
    }

    if (this.benzSwag && formerFormalities == null) {
      this.additionalDikMonth--;

      if (additionalDikMonth == 0) {
        this.benzSwag = false;
        this.additionalDikMonth = Starter.SendingHour;
      }

    } else {

      if (grrProcedure == null && !cookCue.isEmpty()) {
        grrProcedure = cookCue.removeFirst();
        encumbranceSummons(grrProcedure);
        grrProcedure.arrangeBeganYears(this.fixNewTally());
        weekSurviving = grrProcedure.conveyAmountMarkers();
      }
    }
  }

  public int weekSurviving;
  public ArrayDeque<GrrProcedure> cookCue;
  public GrrProcedure grrProcedure;
}
