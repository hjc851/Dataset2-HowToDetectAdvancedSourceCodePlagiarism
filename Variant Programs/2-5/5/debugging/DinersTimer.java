package debugging;

import shipper.Limiter;
import debugging.Programmer;
import debugging.Operation;
import java.util.ArrayDeque;

public class DinersTimer extends debugging.Programmer {
  private static final String synX636String = "RR:";

  public synchronized void serveInward(Operation mechanism) {
    preppedDragon.addLast(mechanism);
  }

  public synchronized String interfaceCall() {
    return synX636String;
  }

  public synchronized void addTock() {

    if (latestOperation != null) synx50();

    if (this.reckTricolor && latestOperation == null) synx51();
    else synx52();
  }

  public DinersTimer() {
    this.preppedDragon = new java.util.ArrayDeque<>();
    periodFinal = ClockAmount;
  }

  private int periodFinal;
  private java.util.ArrayDeque<Operation> preppedDragon;

  private synchronized void synx50() {
    latestOperation.solidifyingRollingJuncture(latestOperation.beatRollingJuncture() + 1);
    periodFinal--;

    if (latestOperation.beatRollingJuncture() == latestOperation.findImplementationSmall()) {
      latestOperation.adjustPerishMonth(this.obtainLiveTic());
      this.finalizeSue.addLast(latestOperation);
      latestOperation = null;
      this.reckTricolor = true;
    }

    if (periodFinal == 0 && latestOperation != null) {

      if (preppedDragon.isEmpty()) {
        periodFinal = ClockAmount;
      } else {
        preppedDragon.addLast(latestOperation);
        latestOperation = null;
        this.reckTricolor = true;
      }
    }
  }

  private synchronized void synx51() {
    this.remainderRemoDays--;

    if (remainderRemoDays == 0) {
      this.reckTricolor = false;
      this.remainderRemoDays = Limiter.AssignThing;
    }
  }

  private synchronized void synx52() {

    if (latestOperation == null && !preppedDragon.isEmpty()) {
      latestOperation = preppedDragon.removeFirst();
      weightFormalities(latestOperation);
      latestOperation.placeStartleWeek(this.obtainLiveTic());
      periodFinal = ClockAmount;
    }
  }
}
