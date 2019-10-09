package multitasking;

import mailer.Shipper;
import multitasking.Callback;
import multitasking.Procedures;
import java.util.ArrayDeque;

public class ApproximateWriter extends Callback {
  private ArrayDeque<Procedures>[] preparesTrollies;
  private int beginningUnsold;
  private int actualAnteriority;

  public ApproximateWriter() {
    this.preparesTrollies = new ArrayDeque[6];

    for (int i = 0; i < preparesTrollies.length; i++) {
      preparesTrollies[i] = new ArrayDeque<>();
    }
    beginningUnsold = YearsSize;
    actualAnteriority = 0;
  }

  private Procedures makeAdjacentMarch() {

    for (int i = 0; i < preparesTrollies.length; i++) {

      if (!preparesTrollies[i].isEmpty()) {
        actualAnteriority = i;
        return preparesTrollies[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < preparesTrollies.length; i++) {

      if (!preparesTrollies[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String outlinerGens() {
    return "FB:";
  }

  public void addTock() {

    if (liveOutgrowth != null) {
      liveOutgrowth.settledSpoutingPeriods(liveOutgrowth.driveRushingAgain() + 1);
      beginningUnsold--;

      if (liveOutgrowth.driveRushingAgain() == liveOutgrowth.findImplementationSmall()) {
        liveOutgrowth.putDepartureClock(this.drawStreamBookmark());
        this.consummatedOperation.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.passenInsignia = true;
      }

      if (beginningUnsold == 0 && liveOutgrowth != null) {

        if (primedIsVacant()) {
          beginningUnsold = YearsSize;
        } else {
          preparesTrollies[actualAnteriority + 1].addLast(liveOutgrowth);
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

      if (liveOutgrowth == null && !primedIsVacant()) {
        liveOutgrowth = makeAdjacentMarch();
        freightMarch(liveOutgrowth);
        liveOutgrowth.settledDepartPeriods(this.drawStreamBookmark());
        beginningUnsold = YearsSize;
      }
    }
  }

  public void methodologyArrival(Procedures work) {
    preparesTrollies[0].addLast(work);
  }
}
