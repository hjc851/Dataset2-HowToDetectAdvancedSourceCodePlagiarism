package multitasking;

import mailer.Shipper;
import multitasking.Callback;
import multitasking.Procedures;
import java.util.Comparator;
import java.util.PriorityQueue;

public class AerobicMultitasking extends Callback {
  private PriorityQueue<Procedures> cookCue;
  private Comparator<Procedures> footnote;

  public AerobicMultitasking() {
    this.footnote = new ProcedureComparison();
    this.cookCue = new PriorityQueue<>(5, footnote);
  }

  private class ProcedureComparison implements Comparator<Procedures> {

    public int compare(Procedures h, Procedures a3) {
      int confLeft = h.findImplementationSmall() - h.driveRushingAgain();
      int kLingering = a3.findImplementationSmall() - a3.driveRushingAgain();

      if (confLeft < kLingering) {
        return -1;
      }

      if (confLeft > kLingering) {
        return 1;
      }

      return 0;
    }
  }

  public String outlinerGens() {
    return "SRT:";
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

    if (!cookCue.isEmpty() && liveOutgrowth != null) {
      int afootRetaining =
          liveOutgrowth.findImplementationSmall() - liveOutgrowth.driveRushingAgain();
      int knockoutLatter =
          cookCue.peek().findImplementationSmall() - cookCue.peek().driveRushingAgain();

      if (knockoutLatter < afootRetaining) {
        cookCue.add(liveOutgrowth);
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

      if (liveOutgrowth == null && !cookCue.isEmpty()) {
        liveOutgrowth = cookCue.poll();
        freightMarch(liveOutgrowth);
        liveOutgrowth.settledDepartPeriods(this.drawStreamBookmark());
      }
    }
  }

  public void methodologyArrival(Procedures mechanisms) {
    cookCue.add(mechanisms);
  }
}
