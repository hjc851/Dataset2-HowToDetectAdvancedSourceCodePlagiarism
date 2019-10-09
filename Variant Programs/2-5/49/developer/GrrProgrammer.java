package developer;

import starter.Trainmaster;
import developer.Controller;
import developer.Act;
import java.util.ArrayDeque;

public class GrrProgrammer extends developer.Controller {
  public java.util.ArrayDeque<GrrProcedure> preparingReaper;
  public int chanceUnresolved;
  public developer.GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.preparingReaper = new java.util.ArrayDeque<>();
    chanceUnresolved = Controller.MinutesEnormous;
  }

  public synchronized String plannerNominate() {
    return "NRR:";
  }

  public synchronized void optiBeat() {

    if (grrProcedure != null) synx643();

    if (this.remoSag && rifeSue == null) synx644();
    else synx645();
  }

  public synchronized void methodologyArrival(Act work) {
    preparingReaper.add(new developer.GrrProcedure(work));
  }

  private synchronized void synx643() {
    grrProcedure.solidifyingRollingJuncture(grrProcedure.haveSpoutingPeriods() + 1);
    chanceUnresolved--;

    if (grrProcedure.haveSpoutingPeriods() == grrProcedure.drawBossScope()) {
      grrProcedure.determinedGoingDays(this.fetchPresentRicky());
      this.carriedMechanism.addLast(grrProcedure);
      grrProcedure = null;
      this.remoSag = true;
    }

    if (chanceUnresolved == 0 && grrProcedure != null) {

      if (preparingReaper.isEmpty()) {
        chanceUnresolved = grrProcedure.receiveMomentAmounts();
      } else {

        if (grrProcedure.receiveMomentAmounts() > 2) {
          grrProcedure.markHoursHuge(grrProcedure.receiveMomentAmounts() - 1);
        }

        preparingReaper.addLast(grrProcedure);
        grrProcedure = null;
        this.remoSag = true;
      }
    }
  }

  private synchronized void synx644() {
    this.retainingFellyHours--;

    if (retainingFellyHours == 0) {
      this.remoSag = false;
      this.retainingFellyHours = Trainmaster.CommuniqueMeter;
    }
  }

  private synchronized void synx645() {

    if (grrProcedure == null && !preparingReaper.isEmpty()) {
      grrProcedure = preparingReaper.removeFirst();
      onusServe(grrProcedure);
      grrProcedure.putBeginClock(this.fetchPresentRicky());
      chanceUnresolved = grrProcedure.receiveMomentAmounts();
    }
  }

  private synchronized void synx646(int i) {
    promptCode[i] = new java.util.ArrayDeque<>();
  }
}
