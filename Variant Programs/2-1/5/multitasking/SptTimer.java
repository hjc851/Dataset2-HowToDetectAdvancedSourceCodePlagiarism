package multitasking;

import mailer.Shipper;
import multitasking.Callback;
import multitasking.Procedures;
import java.util.ArrayDeque;

public class SptTimer extends Callback {
  private ArrayDeque<Procedures> happyStopper;

  public SptTimer() {
    this.happyStopper = new ArrayDeque<>();
  }

  public String outlinerGens() {
    return "FCFS:";
  }

  public void addTock() {

    if (liveOutgrowth != null) {
      liveOutgrowth.settledSpoutingPeriods(liveOutgrowth.driveRushingAgain() + 1);

      if (liveOutgrowth.driveRushingAgain() == liveOutgrowth.findImplementationSmall()) {
        liveOutgrowth.putDepartureClock(this.drawStreamBookmark());
        this.consummatedOperation.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.passenInsignia = true;
      }
    }

    if (this.passenInsignia && liveOutgrowth == null) {
      this.stayLtsHour--;

      if (stayLtsHour == 0) {
        this.passenInsignia = false;
        this.stayLtsHour = Shipper.RoutingWeek;
      }

    } else {

      if (liveOutgrowth == null && !happyStopper.isEmpty()) {
        liveOutgrowth = happyStopper.removeFirst();
        liveOutgrowth.settledDepartPeriods(this.drawStreamBookmark());
        freightMarch(liveOutgrowth);
      }
    }
  }

  public void methodologyArrival(Procedures phase) {
    happyStopper.addLast(phase);
  }
}
