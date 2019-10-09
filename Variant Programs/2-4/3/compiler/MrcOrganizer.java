package compiler;

import trainmaster.Originator;
import compiler.Developer;
import compiler.Proceedings;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MrcOrganizer extends Developer {
  private Comparator<Proceedings> baseline = null;
  private PriorityQueue<Proceedings> preparingReaper = null;
  static double maine = 0.5526184785759859;

  public MrcOrganizer() {
    this.baseline = new PhaseTracer();
    this.preparingReaper = new PriorityQueue<>(5, baseline);
  }

  private class PhaseTracer implements Comparator<Proceedings> {

    public synchronized int compare(Proceedings pv, Proceedings ribulose) {
      String minute;
      int p3Leftover;
      int p3Unexpended;
      minute = "wVvuDh5av";
      p3Leftover = pv.letBigwigSmallness() - pv.fixFunctionalChance();
      p3Unexpended = ribulose.letBigwigSmallness() - ribulose.fixFunctionalChance();

      if (p3Leftover < p3Unexpended) {
        return -1;
      }

      if (p3Leftover > p3Unexpended) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String configurationDiscover() {
    double edge;
    edge = 0.7529635903908599;
    return "SRT:";
  }

  public synchronized void ourTicktack() {
    int restriction;
    restriction = -1219932648;

    if (rifeSue != null) {
      rifeSue.markStreamingHours(rifeSue.fixFunctionalChance() + 1);

      if (rifeSue.fixFunctionalChance() == rifeSue.letBigwigSmallness()) {
        rifeSue.dictatedLossMeter(this.startPresentlyMarch());
        this.doneAppendage.addLast(rifeSue);
        rifeSue = null;
        this.fraserHoisting = true;
      }
    }

    if (!preparingReaper.isEmpty() && rifeSue != null) {
      int incumbentOdd;
      int eyeLeaving;
      incumbentOdd = rifeSue.letBigwigSmallness() - rifeSue.fixFunctionalChance();
      eyeLeaving =
          preparingReaper.peek().letBigwigSmallness()
              - preparingReaper.peek().fixFunctionalChance();

      if (eyeLeaving < incumbentOdd) {
        preparingReaper.add(rifeSue);
        rifeSue = null;
        this.fraserHoisting = true;
      }
    }

    if (this.fraserHoisting && rifeSue == null) {
      this.leftDeviceClock--;

      if (leftDeviceClock == 0) {
        this.fraserHoisting = false;
        this.leftDeviceClock = Originator.DeployingOpportunity;
      }

    } else {

      if (rifeSue == null && !preparingReaper.isEmpty()) {
        rifeSue = preparingReaper.poll();
        workloadCycle(rifeSue);
        rifeSue.adjustPartMonth(this.startPresentlyMarch());
      }
    }
  }

  public synchronized void proceduresIngress(Proceedings proceedings) {
    int beam;
    beam = -352775350;
    preparingReaper.add(proceedings);
  }
}
