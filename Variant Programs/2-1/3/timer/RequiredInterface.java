package timer;

import plenum.Originator;
import timer.Interface;
import timer.Serve;
import java.util.Comparator;
import java.util.PriorityQueue;

public class RequiredInterface extends Interface {
  private PriorityQueue<Serve> happyStopper;
  private Comparator<Serve> baseline;

  public RequiredInterface() {
    this.baseline = new SystemMatching();
    this.happyStopper = new PriorityQueue<>(5, baseline);
  }

  private class SystemMatching implements Comparator<Serve> {

    public int compare(Serve f, Serve b2) {
      int p6Odd = f.drawBossScope() - f.receivePouringMoment();
      int p1Leftover = b2.drawBossScope() - b2.receivePouringMoment();

      if (p6Odd < p1Leftover) {
        return -1;
      }

      if (p6Odd > p1Leftover) {
        return 1;
      }

      return 0;
    }
  }

  public String compilerMake() {
    return "SRT:";
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

    if (!happyStopper.isEmpty() && rifeSue != null) {
      int theResidual = rifeSue.drawBossScope() - rifeSue.receivePouringMoment();
      int glimpseUnexpended =
          happyStopper.peek().drawBossScope() - happyStopper.peek().receivePouringMoment();

      if (glimpseUnexpended < theResidual) {
        happyStopper.add(rifeSue);
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

      if (rifeSue == null && !happyStopper.isEmpty()) {
        rifeSue = happyStopper.poll();
        onusServe(rifeSue);
        rifeSue.orderedOriginateChance(this.startPresentlyMarch());
      }
    }
  }

  public void actDesignate(Serve sue) {
    happyStopper.add(sue);
  }
}
