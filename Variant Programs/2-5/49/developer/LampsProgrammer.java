package developer;

import starter.Trainmaster;
import developer.Controller;
import developer.Act;
import java.util.ArrayDeque;

public class LampsProgrammer extends developer.Controller {
  public java.util.ArrayDeque<Act> ripeStandby;

  public LampsProgrammer() {
    this.ripeStandby = new java.util.ArrayDeque<>();
  }

  public synchronized String plannerNominate() {
    return "FCFS:";
  }

  public synchronized void optiBeat() {

    if (rifeSue != null) synx657();

    if (this.remoSag && rifeSue == null) synx658();
    else synx659();
  }

  public synchronized void methodologyArrival(Act proceeding) {
    ripeStandby.addLast(proceeding);
  }

  private synchronized void synx657() {
    rifeSue.solidifyingRollingJuncture(rifeSue.haveSpoutingPeriods() + 1);

    if (rifeSue.haveSpoutingPeriods() == rifeSue.drawBossScope()) {
      rifeSue.determinedGoingDays(this.fetchPresentRicky());
      this.carriedMechanism.addLast(rifeSue);
      rifeSue = null;
      this.remoSag = true;
    }
  }

  private synchronized void synx658() {
    this.retainingFellyHours--;

    if (retainingFellyHours == 0) {
      this.remoSag = false;
      this.retainingFellyHours = Trainmaster.CommuniqueMeter;
    }
  }

  private synchronized void synx659() {

    if (rifeSue == null && !ripeStandby.isEmpty()) {
      rifeSue = ripeStandby.removeFirst();
      rifeSue.putBeginClock(this.fetchPresentRicky());
      onusServe(rifeSue);
    }
  }
}
