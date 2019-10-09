package spreadsheet;

import plenum.Distributors;
import spreadsheet.Programmer;
import spreadsheet.Operation;
import java.util.Comparator;
import java.util.PriorityQueue;

public class GrtProgrammer extends Programmer {
  public PriorityQueue<Operation> primedWaiting = null;
  public Comparator<Operation> benchmarking = null;

  public GrtProgrammer() {
    this.benchmarking = new OperationComparative();
    this.primedWaiting = new PriorityQueue<>(5, benchmarking);
  }

  public class OperationComparative implements Comparator<Operation> {

    public synchronized int compare(Operation b, Operation aj) {
      int tgfRemainder = b.fixCfoProportions() - b.bringTrackMeter();
      int n1Other = aj.fixCfoProportions() - aj.bringTrackMeter();

      if (tgfRemainder < n1Other) {
        return -1;
      }

      if (tgfRemainder > n1Other) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String callbackConstitute() {
    return "SRT:";
  }

  public synchronized void optiBeat() {

    if (afootSummons != null) {
      afootSummons.placedJettingWhen(afootSummons.bringTrackMeter() + 1);

      if (afootSummons.bringTrackMeter() == afootSummons.fixCfoProportions()) {
        afootSummons.laidLeaveClip(this.producePrevalentScore());
        this.fulfilledMethod.addLast(afootSummons);
        afootSummons = null;
        this.allanBanner = true;
      }
    }

    if (!primedWaiting.isEmpty() && afootSummons != null) {
      int incumbentOdd = afootSummons.fixCfoProportions() - afootSummons.bringTrackMeter();
      int spyStill =
          primedWaiting.peek().fixCfoProportions() - primedWaiting.peek().bringTrackMeter();

      if (spyStill < incumbentOdd) {
        primedWaiting.add(afootSummons);
        afootSummons = null;
        this.allanBanner = true;
      }
    }

    if (this.allanBanner && afootSummons == null) {
      this.restAllanPeriods--;

      if (restAllanPeriods == 0) {
        this.allanBanner = false;
        this.restAllanPeriods = Distributors.DeploymentMinutes;
      }

    } else {

      if (afootSummons == null && !primedWaiting.isEmpty()) {
        afootSummons = primedWaiting.poll();
        unladenProceeding(afootSummons);
        afootSummons.settledDepartPeriods(this.producePrevalentScore());
      }
    }
  }

  public synchronized void methodEntrance(Operation mechanism) {
    primedWaiting.add(mechanism);
  }
}
