package developer;

import starter.Trainmaster;
import developer.Controller;
import developer.Act;
import java.util.ArrayDeque;

public class ApDatabase extends developer.Controller {
  public java.util.ArrayDeque<Act> happyStopper;
  public int againPending;

  public ApDatabase() {
    this.happyStopper = new java.util.ArrayDeque<>();
    againPending = MinutesEnormous;
  }

  public synchronized String plannerNominate() {
    return "RR:";
  }

  public synchronized void optiBeat() {

    if (rifeSue != null) synx650();

    if (this.remoSag && rifeSue == null) synx651();
    else synx652();
  }

  public synchronized void methodologyArrival(Act sue) {
    happyStopper.addLast(sue);
  }

  private synchronized void synx650() {
    rifeSue.solidifyingRollingJuncture(rifeSue.haveSpoutingPeriods() + 1);
    againPending--;

    if (rifeSue.haveSpoutingPeriods() == rifeSue.drawBossScope()) {
      rifeSue.determinedGoingDays(this.fetchPresentRicky());
      this.carriedMechanism.addLast(rifeSue);
      rifeSue = null;
      this.remoSag = true;
    }

    if (againPending == 0 && rifeSue != null) {

      if (happyStopper.isEmpty()) {
        againPending = MinutesEnormous;
      } else {
        happyStopper.addLast(rifeSue);
        rifeSue = null;
        this.remoSag = true;
      }
    }
  }

  private synchronized void synx651() {
    this.retainingFellyHours--;

    if (retainingFellyHours == 0) {
      this.remoSag = false;
      this.retainingFellyHours = Trainmaster.CommuniqueMeter;
    }
  }

  private synchronized void synx652() {

    if (rifeSue == null && !happyStopper.isEmpty()) {
      rifeSue = happyStopper.removeFirst();
      onusServe(rifeSue);
      rifeSue.putBeginClock(this.fetchPresentRicky());
      againPending = MinutesEnormous;
    }
  }
}
