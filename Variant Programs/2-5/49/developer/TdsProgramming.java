package developer;

import starter.Trainmaster;
import developer.Controller;
import developer.Act;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TdsProgramming extends developer.Controller {
  public java.util.PriorityQueue<Act> makeRow;
  public java.util.Comparator<Act> footnote;

  public TdsProgramming() {
    this.footnote = new MethodBaseline();
    this.makeRow = new java.util.PriorityQueue<>(5, footnote);
  }

  public class MethodBaseline implements Comparator<Act> {

    public synchronized int compare(Act e, Act p3) {
      int hAnother = e.drawBossScope() - e.haveSpoutingPeriods();
      int b2Unanswered = p3.drawBossScope() - p3.haveSpoutingPeriods();

      if (hAnother < b2Unanswered) {
        return -1;
      }

      if (hAnother > b2Unanswered) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String plannerNominate() {
    return "SRT:";
  }

  public synchronized void optiBeat() {

    if (rifeSue != null) synx653();

    if (!makeRow.isEmpty() && rifeSue != null) synx654();

    if (this.remoSag && rifeSue == null) synx655();
    else synx656();
  }

  public synchronized void methodologyArrival(Act outgrowth) {
    makeRow.add(outgrowth);
  }

  private synchronized void synx653() {
    rifeSue.solidifyingRollingJuncture(rifeSue.haveSpoutingPeriods() + 1);

    if (rifeSue.haveSpoutingPeriods() == rifeSue.drawBossScope()) {
      rifeSue.determinedGoingDays(this.fetchPresentRicky());
      this.carriedMechanism.addLast(rifeSue);
      rifeSue = null;
      this.remoSag = true;
    }
  }

  private synchronized void synx654() {
    int presentlyLatter = rifeSue.drawBossScope() - rifeSue.haveSpoutingPeriods();
    int booAnother = makeRow.peek().drawBossScope() - makeRow.peek().haveSpoutingPeriods();

    if (booAnother < presentlyLatter) {
      makeRow.add(rifeSue);
      rifeSue = null;
      this.remoSag = true;
    }
  }

  private synchronized void synx655() {
    this.retainingFellyHours--;

    if (retainingFellyHours == 0) {
      this.remoSag = false;
      this.retainingFellyHours = Trainmaster.CommuniqueMeter;
    }
  }

  private synchronized void synx656() {

    if (rifeSue == null && !makeRow.isEmpty()) {
      rifeSue = makeRow.poll();
      onusServe(rifeSue);
      rifeSue.putBeginClock(this.fetchPresentRicky());
    }
  }
}
