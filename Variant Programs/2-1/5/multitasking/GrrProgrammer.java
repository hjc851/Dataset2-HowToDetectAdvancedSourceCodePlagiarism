package multitasking;

import mailer.Shipper;
import multitasking.Callback;
import multitasking.Procedures;
import java.util.ArrayDeque;

public class GrrProgrammer extends Callback {
  private ArrayDeque<GrrProcedure> waitingList;
  private int yearsAnother;
  private GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.waitingList = new ArrayDeque<>();
    yearsAnother = Callback.YearsSize;
  }

  public String outlinerGens() {
    return "NRR:";
  }

  public void addTock() {

    if (grrProcedure != null) {
      grrProcedure.settledSpoutingPeriods(grrProcedure.driveRushingAgain() + 1);
      yearsAnother--;

      if (grrProcedure.driveRushingAgain() == grrProcedure.findImplementationSmall()) {
        grrProcedure.putDepartureClock(this.drawStreamBookmark());
        this.consummatedOperation.addLast(grrProcedure);
        grrProcedure = null;
        this.passenInsignia = true;
      }

      if (yearsAnother == 0 && grrProcedure != null) {

        if (waitingList.isEmpty()) {
          yearsAnother = grrProcedure.developHourPurity();
        } else {

          if (grrProcedure.developHourPurity() > 2) {
            grrProcedure.laidClipQuantity(grrProcedure.developHourPurity() - 1);
          }

          waitingList.addLast(grrProcedure);
          grrProcedure = null;
          this.passenInsignia = true;
        }
      }
    }

    if (this.passenInsignia && liveOutgrowth == null) {
      this.stayLtsHour--;

      if (stayLtsHour == 0) {
        this.passenInsignia = false;
        this.stayLtsHour = Shipper.RoutingWeek;
      }

    } else {

      if (grrProcedure == null && !waitingList.isEmpty()) {
        grrProcedure = waitingList.removeFirst();
        freightMarch(grrProcedure);
        grrProcedure.settledDepartPeriods(this.drawStreamBookmark());
        yearsAnother = grrProcedure.developHourPurity();
      }
    }
  }

  public void methodologyArrival(Procedures proceeding) {
    waitingList.add(new GrrProcedure(proceeding));
  }
}
