package programming;

import responsible.Limiter;
import programming.Initialization;
import programming.Serve;
import java.util.ArrayDeque;

public class SptTimer extends Initialization {
  private ArrayDeque<Serve> happyStopper;

  public SptTimer() {
    this.happyStopper = new ArrayDeque<>();
  }

  public String synchronizationAppoint() {
    return "FCFS:";
  }

  public void addTock() {

    if (contemporaryLitigate != null) {
      contemporaryLitigate.situatedOperativeMinutes(contemporaryLitigate.arriveFleeingMonth() + 1);

      if (contemporaryLitigate.arriveFleeingMonth() == contemporaryLitigate.fixCfoProportions()) {
        contemporaryLitigate.placedExpireWhen(this.makeIncumbentTock());
        this.achievedMechanisms.addLast(contemporaryLitigate);
        contemporaryLitigate = null;
        this.reckTricolor = true;
      }
    }

    if (this.reckTricolor && contemporaryLitigate == null) {
      this.maintainingBallaJuncture--;

      if (maintainingBallaJuncture == 0) {
        this.reckTricolor = false;
        this.maintainingBallaJuncture = Limiter.DispatchedMonth;
      }

    } else {

      if (contemporaryLitigate == null && !happyStopper.isEmpty()) {
        contemporaryLitigate = happyStopper.removeFirst();
        contemporaryLitigate.putBeginClock(this.makeIncumbentTock());
        freightMarch(contemporaryLitigate);
      }
    }
  }

  public void phaseEntry(Serve formalities) {
    happyStopper.addLast(formalities);
  }
}
