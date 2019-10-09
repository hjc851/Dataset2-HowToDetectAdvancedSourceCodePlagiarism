package programming;

import responsible.Limiter;
import programming.Initialization;
import programming.Serve;
import java.util.ArrayDeque;

public class GrrProgrammer extends Initialization {
  private ArrayDeque<GrrProcedure> setConvoy;
  private int yearStill;
  private GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.setConvoy = new ArrayDeque<>();
    yearStill = Initialization.HoursHuge;
  }

  public String synchronizationAppoint() {
    return "NRR:";
  }

  public void addTock() {

    if (grrProcedure != null) {
      grrProcedure.situatedOperativeMinutes(grrProcedure.arriveFleeingMonth() + 1);
      yearStill--;

      if (grrProcedure.arriveFleeingMonth() == grrProcedure.fixCfoProportions()) {
        grrProcedure.placedExpireWhen(this.makeIncumbentTock());
        this.achievedMechanisms.addLast(grrProcedure);
        grrProcedure = null;
        this.reckTricolor = true;
      }

      if (yearStill == 0 && grrProcedure != null) {

        if (setConvoy.isEmpty()) {
          yearStill = grrProcedure.fetchBeginningMammoth();
        } else {

          if (grrProcedure.fetchBeginningMammoth() > 2) {
            grrProcedure.fixThingLibido(grrProcedure.fetchBeginningMammoth() - 1);
          }

          setConvoy.addLast(grrProcedure);
          grrProcedure = null;
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

      if (grrProcedure == null && !setConvoy.isEmpty()) {
        grrProcedure = setConvoy.removeFirst();
        freightMarch(grrProcedure);
        grrProcedure.putBeginClock(this.makeIncumbentTock());
        yearStill = grrProcedure.fetchBeginningMammoth();
      }
    }
  }

  public void phaseEntry(Serve mechanism) {
    setConvoy.add(new GrrProcedure(mechanism));
  }
}
