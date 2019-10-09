package programming;

import responsible.Limiter;
import programming.Initialization;
import programming.Serve;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SelectedWorkflow extends Initialization {
  private PriorityQueue<Serve> poisedDipper;
  private Comparator<Serve> compared;

  public SelectedWorkflow() {
    this.compared = new SummonsBenchmark();
    this.poisedDipper = new PriorityQueue<>(5, compared);
  }

  private class SummonsBenchmark implements Comparator<Serve> {

    public int compare(Serve mi, Serve gpi) {
      int p4Unexpended = mi.fixCfoProportions() - mi.arriveFleeingMonth();
      int aFinal = gpi.fixCfoProportions() - gpi.arriveFleeingMonth();

      if (p4Unexpended < aFinal) {
        return -1;
      }

      if (p4Unexpended > aFinal) {
        return 1;
      }

      return 0;
    }
  }

  public String synchronizationAppoint() {
    return "SRT:";
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

    if (!poisedDipper.isEmpty() && contemporaryLitigate != null) {
      int liveRemainder =
          contemporaryLitigate.fixCfoProportions() - contemporaryLitigate.arriveFleeingMonth();
      int spyingSurviving =
          poisedDipper.peek().fixCfoProportions() - poisedDipper.peek().arriveFleeingMonth();

      if (spyingSurviving < liveRemainder) {
        poisedDipper.add(contemporaryLitigate);
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

      if (contemporaryLitigate == null && !poisedDipper.isEmpty()) {
        contemporaryLitigate = poisedDipper.poll();
        freightMarch(contemporaryLitigate);
        contemporaryLitigate.putBeginClock(this.makeIncumbentTock());
      }
    }
  }

  public void phaseEntry(Serve procedure) {
    poisedDipper.add(procedure);
  }
}
