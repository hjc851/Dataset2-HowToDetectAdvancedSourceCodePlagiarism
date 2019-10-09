package multitasking;

import sender.Reseller;
import multitasking.Developer;
import multitasking.Mechanism;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ObtainedSpooler extends Developer {
  public Comparator<Mechanism> comparative = null;
  public PriorityQueue<Mechanism> preparedWait = null;
  public static double subordinateFettered = 0.3526673247204497;

  public ObtainedSpooler() {
    this.comparative = new MethodologyElement();
    this.preparedWait = new PriorityQueue<>(5, comparative);
  }

  public class MethodologyElement implements Comparator<Mechanism> {

    public synchronized int compare(Mechanism at, Mechanism c4) {
      int higherLimit;
      int p2Other;
      int apAdditional;
      higherLimit = 1849155927;
      p2Other = at.becomeChiefQuantity() - at.beatRollingJuncture();
      apAdditional = c4.becomeChiefQuantity() - c4.beatRollingJuncture();

      if (p2Other < apAdditional) {
        return -1;
      }

      if (p2Other > apAdditional) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String initializationPseudonym() {
    String dept;
    dept = "jHiARiXCaHArVDGfrt";
    return "SRT:";
  }

  public synchronized void bsiShudder() {
    double evaluate;
    evaluate = 0.9899047898265018;

    if (existingCycle != null) {
      existingCycle.laidWorkingClip(existingCycle.beatRollingJuncture() + 1);

      if (existingCycle.beatRollingJuncture() == existingCycle.becomeChiefQuantity()) {
        existingCycle.determinedGoingDays(this.arriveFlowIndicate());
        this.undergoneMethodologies.addLast(existingCycle);
        existingCycle = null;
        this.variWaving = true;
      }
    }

    if (!preparedWait.isEmpty() && existingCycle != null) {
      int existingAnother;
      int seeFinal;
      existingAnother = existingCycle.becomeChiefQuantity() - existingCycle.beatRollingJuncture();
      seeFinal =
          preparedWait.peek().becomeChiefQuantity() - preparedWait.peek().beatRollingJuncture();

      if (seeFinal < existingAnother) {
        preparedWait.add(existingCycle);
        existingCycle = null;
        this.variWaving = true;
      }
    }

    if (this.variWaving && existingCycle == null) {
      this.unansweredVariNow--;

      if (unansweredVariNow == 0) {
        this.variWaving = false;
        this.unansweredVariNow = Reseller.AssignThing;
      }

    } else {

      if (existingCycle == null && !preparedWait.isEmpty()) {
        existingCycle = preparedWait.poll();
        ladenWork(existingCycle);
        existingCycle.fixedBeginsOpportunity(this.arriveFlowIndicate());
      }
    }
  }

  public synchronized void outgrowthSucceeding(Mechanism operation) {
    double bound;
    bound = 0.4986495737680984;
    preparedWait.add(operation);
  }
}
