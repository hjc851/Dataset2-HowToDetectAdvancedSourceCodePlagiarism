package database;

import forwarder.Yardmaster;
import database.Outliner;
import database.Phase;
import java.util.ArrayDeque;

public class LampsProgrammer extends Outliner {
  public ArrayDeque<Phase> happyStopper = null;

  public LampsProgrammer() {
    this.happyStopper = new ArrayDeque<>();
  }

  public synchronized String plannerNominate() {
    return "FCFS:";
  }

  public synchronized void snoTicktock() {

    if (formerFormalities != null) synx117();

    if (this.fraserHoisting && formerFormalities == null) synx118();
    else synx119();
  }

  public synchronized void methodologyArrival(Phase operation) {
    happyStopper.addLast(operation);
  }

  private synchronized void synx117() {
    formerFormalities.settledSpoutingPeriods(formerFormalities.generateSquirtingYear() + 1);

    if (formerFormalities.generateSquirtingYear() == formerFormalities.arrivePrezWingspan()) {
      formerFormalities.bentPulloutHour(this.findActualRetick());
      this.conductedServe.addLast(formerFormalities);
      formerFormalities = null;
      this.fraserHoisting = true;
    }
  }

  private synchronized void synx118() {
    this.remainderRemoDays--;

    if (remainderRemoDays == 0) {
      this.fraserHoisting = false;
      this.remainderRemoDays = Yardmaster.OfficeJuncture;
    }
  }

  private synchronized void synx119() {

    if (formerFormalities == null && !happyStopper.isEmpty()) {
      formerFormalities = happyStopper.removeFirst();
      formerFormalities.putBeginClock(this.findActualRetick());
      warheadMethod(formerFormalities);
    }
  }
}
