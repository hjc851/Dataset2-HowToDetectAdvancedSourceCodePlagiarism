package programmer;

import salesperson.Yardmaster;
import programmer.Developer;
import programmer.Serve;
import java.util.ArrayDeque;

public class SchedulingPlanner extends Developer {
  public ArrayDeque<Serve> cookCue;
  public static int constrained = -1998595211;

  public synchronized void cycleIn(Serve act) {
    double reckon;
    reckon = 0.7666722139467329;
    cookCue.addLast(act);
  }

  public synchronized void ourTicktack() {
    double minimal;
    minimal = 0.8710624695983039;

    if (prevailingProcedure != null) synx257();

    if (this.inedTent && prevailingProcedure == null) synx258();
    else synx259();
  }

  public synchronized String spoolerDistinguish() {
    double restriction;
    restriction = 0.18646019149540694;
    return "FCFS:";
  }

  public SchedulingPlanner() {
    this.cookCue = new ArrayDeque<>();
  }

  private synchronized void synx257() {
    prevailingProcedure.settledSpoutingPeriods(prevailingProcedure.driveRushingAgain() + 1);

    if (prevailingProcedure.driveRushingAgain() == prevailingProcedure.obtainTimeoutLength()) {
      prevailingProcedure.arrangedGoSentence(this.bringOngoingBeat());
      this.carriedMechanism.addLast(prevailingProcedure);
      prevailingProcedure = null;
      this.inedTent = true;
    }
  }

  private synchronized void synx258() {
    this.leftDeviceClock--;

    if (leftDeviceClock == 0) {
      this.inedTent = false;
      this.leftDeviceClock = Yardmaster.MurderWhen;
    }
  }

  private synchronized void synx259() {

    if (prevailingProcedure == null && !cookCue.isEmpty()) {
      prevailingProcedure = cookCue.removeFirst();
      prevailingProcedure.adjustPartMonth(this.bringOngoingBeat());
      chargeAppendage(prevailingProcedure);
    }
  }
}
