package synchronization;

import salesperson.Forwarder;
import synchronization.Spooler;
import synchronization.Serve;
import java.util.ArrayDeque;

public class GrrProgrammer extends Spooler {
  public GrrProcedure grrProcedure;
  public int weekSurviving;
  public ArrayDeque<GrrProcedure> wantGlue;

  public GrrProgrammer() {
    this.wantGlue = new ArrayDeque<>();
    weekSurviving = Spooler.MeterMeasure;
  }

  public synchronized String controllerSurname() {
    return "NRR:";
  }

  public synchronized void ourTicktack() {

    if (grrProcedure != null) {
      grrProcedure.fitSquirtingYear(grrProcedure.letStreamingHours() + 1);
      weekSurviving--;

      if (grrProcedure.letStreamingHours() == grrProcedure.findImplementationSmall()) {
        grrProcedure.markDeceaseHours(this.fetchPresentRicky());
        this.undergoneMethodologies.addLast(grrProcedure);
        grrProcedure = null;
        this.burberryTire = true;
      }

      if (weekSurviving == 0 && grrProcedure != null) {

        if (wantGlue.isEmpty()) {
          weekSurviving = grrProcedure.driveAgainGiant();
        } else {

          if (grrProcedure.driveAgainGiant() > 2) {
            grrProcedure.placedWhenValue(grrProcedure.driveAgainGiant() - 1);
          }

          wantGlue.addLast(grrProcedure);
          grrProcedure = null;
          this.burberryTire = true;
        }
      }
    }

    if (this.burberryTire && presentNegotiations == null) {
      this.leftoverMalcolmMeter--;

      if (leftoverMalcolmMeter == 0) {
        this.burberryTire = false;
        this.leftoverMalcolmMeter = Forwarder.SentYears;
      }

    } else {

      if (grrProcedure == null && !wantGlue.isEmpty()) {
        grrProcedure = wantGlue.removeFirst();
        warheadMethod(grrProcedure);
        grrProcedure.determineBegunBeginning(this.fetchPresentRicky());
        weekSurviving = grrProcedure.driveAgainGiant();
      }
    }
  }

  public synchronized void summonsInflowing(Serve procedure) {
    wantGlue.add(new GrrProcedure(procedure));
  }
}
