package multitasking;

import mailer.Shipper;
import multitasking.Callback;
import multitasking.Procedures;
import java.util.ArrayDeque;

public class TrillSpreadsheet extends Callback {
  private ArrayDeque<Procedures> preparingReaper;
  private int weekSurviving;

  public TrillSpreadsheet() {
    this.preparingReaper = new ArrayDeque<>();
    weekSurviving = YearsSize;
  }

  public String outlinerGens() {
    return "RR:";
  }

  public void addTock() {

    if (liveOutgrowth != null) {
      liveOutgrowth.settledSpoutingPeriods(liveOutgrowth.driveRushingAgain() + 1);
      weekSurviving--;

      if (liveOutgrowth.driveRushingAgain() == liveOutgrowth.findImplementationSmall()) {
        liveOutgrowth.putDepartureClock(this.drawStreamBookmark());
        this.consummatedOperation.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.passenInsignia = true;
      }

      if (weekSurviving == 0 && liveOutgrowth != null) {

        if (preparingReaper.isEmpty()) {
          weekSurviving = YearsSize;
        } else {
          preparingReaper.addLast(liveOutgrowth);
          liveOutgrowth = null;
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

      if (liveOutgrowth == null && !preparingReaper.isEmpty()) {
        liveOutgrowth = preparingReaper.removeFirst();
        freightMarch(liveOutgrowth);
        liveOutgrowth.settledDepartPeriods(this.drawStreamBookmark());
        weekSurviving = YearsSize;
      }
    }
  }

  public void methodologyArrival(Procedures system) {
    preparingReaper.addLast(system);
  }
}
