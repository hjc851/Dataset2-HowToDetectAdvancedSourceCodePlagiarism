package programming;

import responsible.Limiter;
import programming.Initialization;
import programming.Serve;
import java.util.ArrayDeque;

public class EInitialization extends Initialization {
  private ArrayDeque<Serve> gonnaDong;
  private int daysRemainder;

  public EInitialization() {
    this.gonnaDong = new ArrayDeque<>();
    daysRemainder = HoursHuge;
  }

  public String synchronizationAppoint() {
    return "RR:";
  }

  public void addTock() {

    if (contemporaryLitigate != null) {
      contemporaryLitigate.situatedOperativeMinutes(contemporaryLitigate.arriveFleeingMonth() + 1);
      daysRemainder--;

      if (contemporaryLitigate.arriveFleeingMonth() == contemporaryLitigate.fixCfoProportions()) {
        contemporaryLitigate.placedExpireWhen(this.makeIncumbentTock());
        this.achievedMechanisms.addLast(contemporaryLitigate);
        contemporaryLitigate = null;
        this.reckTricolor = true;
      }

      if (daysRemainder == 0 && contemporaryLitigate != null) {

        if (gonnaDong.isEmpty()) {
          daysRemainder = HoursHuge;
        } else {
          gonnaDong.addLast(contemporaryLitigate);
          contemporaryLitigate = null;
          this.reckTricolor = true;
        }
      }
    }

    if (this.reckTricolor && contemporaryLitigate == null) {
      this.maintainingBallaJuncture--;

      if (maintainingBallaJuncture == 0) {
        this.reckTricolor = false;
        this.maintainingBallaJuncture = Limiter.DispatchedMonth;
      }

    } else {

      if (contemporaryLitigate == null && !gonnaDong.isEmpty()) {
        contemporaryLitigate = gonnaDong.removeFirst();
        freightMarch(contemporaryLitigate);
        contemporaryLitigate.putBeginClock(this.makeIncumbentTock());
        daysRemainder = HoursHuge;
      }
    }
  }

  public void phaseEntry(Serve sue) {
    gonnaDong.addLast(sue);
  }
}
