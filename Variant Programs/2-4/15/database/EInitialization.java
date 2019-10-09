package database;

import forwarder.Yardmaster;
import database.Outliner;
import database.Phase;
import java.util.ArrayDeque;

public class EInitialization extends Outliner {
  public ArrayDeque<Phase> cookCue = null;
  public int daysRemainder = 0;

  public EInitialization() {
    this.cookCue = new ArrayDeque<>();
    daysRemainder = AmountMarkers;
  }

  public synchronized String plannerNominate() {
    return "RR:";
  }

  public synchronized void snoTicktock() {

    if (formerFormalities != null) synx110();

    if (this.fraserHoisting && formerFormalities == null) synx111();
    else synx112();
  }

  public synchronized void methodologyArrival(Phase appendage) {
    cookCue.addLast(appendage);
  }

  private synchronized void synx110() {
    formerFormalities.settledSpoutingPeriods(formerFormalities.generateSquirtingYear() + 1);
    daysRemainder--;

    if (formerFormalities.generateSquirtingYear() == formerFormalities.arrivePrezWingspan()) {
      formerFormalities.bentPulloutHour(this.findActualRetick());
      this.conductedServe.addLast(formerFormalities);
      formerFormalities = null;
      this.fraserHoisting = true;
    }

    if (daysRemainder == 0 && formerFormalities != null) {

      if (cookCue.isEmpty()) {
        daysRemainder = AmountMarkers;
      } else {
        cookCue.addLast(formerFormalities);
        formerFormalities = null;
        this.fraserHoisting = true;
      }
    }
  }

  private synchronized void synx111() {
    this.remainderRemoDays--;

    if (remainderRemoDays == 0) {
      this.fraserHoisting = false;
      this.remainderRemoDays = Yardmaster.OfficeJuncture;
    }
  }

  private synchronized void synx112() {

    if (formerFormalities == null && !cookCue.isEmpty()) {
      formerFormalities = cookCue.removeFirst();
      warheadMethod(formerFormalities);
      formerFormalities.putBeginClock(this.findActualRetick());
      daysRemainder = AmountMarkers;
    }
  }
}
