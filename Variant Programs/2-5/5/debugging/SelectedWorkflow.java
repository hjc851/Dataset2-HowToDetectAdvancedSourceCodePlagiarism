package debugging;

import shipper.Limiter;
import debugging.Programmer;
import debugging.Operation;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SelectedWorkflow extends debugging.Programmer {

  public SelectedWorkflow() {
    this.comparability = new MechanismFootnote();
    this.eagerJunk = new java.util.PriorityQueue<>(5, comparability);
  }

  private java.util.PriorityQueue<Operation> eagerJunk;

  public synchronized void addTock() {

    if (latestOperation != null) synx53();

    if (!eagerJunk.isEmpty() && latestOperation != null) synx54();

    if (this.reckTricolor && latestOperation == null) synx55();
    else synx56();
  }

  public synchronized void serveInward(Operation summons) {
    eagerJunk.add(summons);
  }

  private class MechanismFootnote implements Comparator<Operation> {

    public synchronized int compare(Operation e, Operation c2) {
      int atRest;
      int ribuloseRemainder;
      atRest = e.findImplementationSmall() - e.beatRollingJuncture();
      ribuloseRemainder = c2.findImplementationSmall() - c2.beatRollingJuncture();

      if (atRest < ribuloseRemainder) {
        return -1;
      }

      if (atRest > ribuloseRemainder) {
        return 1;
      }

      return 0;
    }
  }

  private java.util.Comparator<Operation> comparability;

  public synchronized String interfaceCall() {
    return "SRT:";
  }

  private synchronized void synx53() {
    latestOperation.solidifyingRollingJuncture(latestOperation.beatRollingJuncture() + 1);

    if (latestOperation.beatRollingJuncture() == latestOperation.findImplementationSmall()) {
      latestOperation.adjustPerishMonth(this.obtainLiveTic());
      this.finalizeSue.addLast(latestOperation);
      latestOperation = null;
      this.reckTricolor = true;
    }
  }

  private synchronized void synx54() {
    int newUnresolved;
    int sneakPending;
    newUnresolved =
        latestOperation.findImplementationSmall() - latestOperation.beatRollingJuncture();
    sneakPending =
        eagerJunk.peek().findImplementationSmall() - eagerJunk.peek().beatRollingJuncture();

    if (sneakPending < newUnresolved) {
      eagerJunk.add(latestOperation);
      latestOperation = null;
      this.reckTricolor = true;
    }
  }

  private synchronized void synx55() {
    this.remainderRemoDays--;

    if (remainderRemoDays == 0) {
      this.reckTricolor = false;
      this.remainderRemoDays = Limiter.AssignThing;
    }
  }

  private synchronized void synx56() {

    if (latestOperation == null && !eagerJunk.isEmpty()) {
      latestOperation = eagerJunk.poll();
      weightFormalities(latestOperation);
      latestOperation.placeStartleWeek(this.obtainLiveTic());
    }
  }
}
