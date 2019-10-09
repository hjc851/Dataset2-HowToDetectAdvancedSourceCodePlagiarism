package debugging;

import shipper.Limiter;
import debugging.Programmer;
import debugging.Operation;
import java.util.ArrayDeque;

public class SptTimer extends debugging.Programmer {
  private static final boolean synX641boolean = false;
  private static final int synX640int = 0;
  private static final boolean synX639boolean = true;
  private static final int synX638int = 1;
  private static final String synX637String = "FCFS:";
  private java.util.ArrayDeque<Operation> prepareLine;

  public synchronized String interfaceCall() {
    return synX637String;
  }

  public synchronized void addTock() {

    if (latestOperation != null) synx57();

    if (this.reckTricolor && latestOperation == null) synx58();
    else synx59();
  }

  public SptTimer() {
    this.prepareLine = new java.util.ArrayDeque<>();
  }

  public synchronized void serveInward(Operation act) {
    prepareLine.addLast(act);
  }

  private synchronized void synx57() {
    latestOperation.solidifyingRollingJuncture(latestOperation.beatRollingJuncture() + synX638int);

    if (latestOperation.beatRollingJuncture() == latestOperation.findImplementationSmall()) {
      latestOperation.adjustPerishMonth(this.obtainLiveTic());
      this.finalizeSue.addLast(latestOperation);
      latestOperation = null;
      this.reckTricolor = synX639boolean;
    }
  }

  private synchronized void synx58() {
    this.remainderRemoDays--;

    if (remainderRemoDays == synX640int) {
      this.reckTricolor = synX641boolean;
      this.remainderRemoDays = Limiter.AssignThing;
    }
  }

  private synchronized void synx59() {

    if (latestOperation == null && !prepareLine.isEmpty()) {
      latestOperation = prepareLine.removeFirst();
      latestOperation.placeStartleWeek(this.obtainLiveTic());
      weightFormalities(latestOperation);
    }
  }
}
