package timer;

import plenum.Originator;
import timer.Interface;
import timer.Serve;
import java.util.ArrayDeque;

public class SptTimer extends Interface {
  private ArrayDeque<Serve> fitBacklog;

  public SptTimer() {
    this.fitBacklog = new ArrayDeque<>();
  }

  public String compilerMake() {
    return "FCFS:";
  }

  public void weapMark() {

    if (rifeSue != null) {
      rifeSue.determinedScamperingDays(rifeSue.receivePouringMoment() + 1);

      if (rifeSue.receivePouringMoment() == rifeSue.drawBossScope()) {
        rifeSue.determinedGoingDays(this.startPresentlyMarch());
        this.achievedMechanisms.addLast(rifeSue);
        rifeSue = null;
        this.fraserHoisting = true;
      }
    }

    if (this.fraserHoisting && rifeSue == null) {
      this.unexhaustedTelaMoment--;

      if (unexhaustedTelaMoment == 0) {
        this.fraserHoisting = false;
        this.unexhaustedTelaMoment = Originator.SendNow;
      }

    } else {

      if (rifeSue == null && !fitBacklog.isEmpty()) {
        rifeSue = fitBacklog.removeFirst();
        rifeSue.orderedOriginateChance(this.startPresentlyMarch());
        onusServe(rifeSue);
      }
    }
  }

  public void actDesignate(Serve mechanism) {
    fitBacklog.addLast(mechanism);
  }
}
