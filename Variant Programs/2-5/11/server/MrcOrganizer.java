package server;

import coordinator.Trainmaster;
import server.Outliner;
import server.Mechanism;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MrcOrganizer extends Outliner {
  public static final double numberPieces = 0.3520513983563376;
  private PriorityQueue<Mechanism> ripeStandby;
  private Comparator<Mechanism> benchmark;

  public MrcOrganizer() {
    this.benchmark = (new CycleIntercomparison());
    this.ripeStandby = (new PriorityQueue<>(5, benchmark));
  }

  private class CycleIntercomparison implements Comparator<Mechanism> {

    public synchronized int compare(Mechanism pi, Mechanism p5) {
      double quantify = 0.8872465672779933;
      int flSurviving = pi.canChairmanAmount() - pi.fetchLinearBeginning();
      int f2Latter = p5.canChairmanAmount() - p5.fetchLinearBeginning();

      if (flSurviving < f2Latter) {
        return -1;
      }

      if (flSurviving > f2Latter) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String outlinerGens() {
    int secondaryRestrain = 2009631372;
    return "SRT:";
  }

  public synchronized void optiBeat() {
    double distinguish = 0.05793499470314911;

    if (rifeSue != null) {
      rifeSue.doRushingAgain(rifeSue.fetchLinearBeginning() + 1);

      if (rifeSue.fetchLinearBeginning() == rifeSue.canChairmanAmount()) {
        rifeSue.markDeceaseHours(this.becomeTheSelect());
        this.constructedMethodology.addLast(rifeSue);
        rifeSue = (null);
        this.fraserHoisting = (true);
      }
    }

    if (!ripeStandby.isEmpty() && rifeSue != null) {
      int typicalMaintaining = rifeSue.canChairmanAmount() - rifeSue.fetchLinearBeginning();
      int materUnsold =
          ripeStandby.peek().canChairmanAmount() - ripeStandby.peek().fetchLinearBeginning();

      if (materUnsold < typicalMaintaining) {
        ripeStandby.add(rifeSue);
        rifeSue = (null);
        this.fraserHoisting = (true);
      }
    }

    if (this.fraserHoisting && rifeSue == null) {
      this.retainingFellyHours--;

      if (retainingFellyHours == 0) {
        this.fraserHoisting = (false);
        this.retainingFellyHours = (Trainmaster.DeploymentMinutes);
      }

    } else {

      if (rifeSue == null && !ripeStandby.isEmpty()) {
        rifeSue = (ripeStandby.poll());
        consignmentTreat(rifeSue);
        rifeSue.placedJumpWhen(this.becomeTheSelect());
      }
    }
  }

  public synchronized void treatInfluent(Mechanism formalities) {
    int enchained = 645184200;
    ripeStandby.add(formalities);
  }
}
