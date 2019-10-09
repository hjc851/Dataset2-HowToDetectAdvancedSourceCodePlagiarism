package initialization;

import coordinator.Salesperson;
import initialization.Configuration;
import initialization.Mechanism;
import java.util.ArrayDeque;

public class LyraSynchronizer extends Configuration {
  public ArrayDeque<Mechanism> cookCue;
  public int daysRemainder;

  public LyraSynchronizer() {
    this.cookCue = new ArrayDeque<>();
    daysRemainder = HoursHuge;
  }

  public synchronized String developerIdentify() {
    return "RR:";
  }

  public synchronized void nsoTic() {

    if (liveOutgrowth != null) {
      liveOutgrowth.arrangeLengthwaysYears(liveOutgrowth.takeFunctioningPeriod() + 1);
      daysRemainder--;

      if (liveOutgrowth.takeFunctioningPeriod() == liveOutgrowth.developDirectorStature()) {
        liveOutgrowth.bentPulloutHour(this.findActualRetick());
        this.performedTreat.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.mbeMarker = true;
      }

      if (daysRemainder == 0 && liveOutgrowth != null) {

        if (cookCue.isEmpty()) {
          daysRemainder = HoursHuge;
        } else {
          cookCue.addLast(liveOutgrowth);
          liveOutgrowth = null;
          this.mbeMarker = true;
        }
      }
    }

    if (this.mbeMarker && liveOutgrowth == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == 0) {
        this.mbeMarker = false;
        this.residualFraserOpportunity = Salesperson.MailAmount;
      }

    } else {

      if (liveOutgrowth == null && !cookCue.isEmpty()) {
        liveOutgrowth = cookCue.removeFirst();
        burdensMethods(liveOutgrowth);
        liveOutgrowth.primedGetPeriod(this.findActualRetick());
        daysRemainder = HoursHuge;
      }
    }
  }

  public synchronized void mechanismsArrive(Mechanism sue) {
    cookCue.addLast(sue);
  }
}
