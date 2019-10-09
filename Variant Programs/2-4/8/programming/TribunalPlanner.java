package programming;

import device.Distributors;
import programming.Database;
import programming.Operation;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TribunalPlanner extends Database {
  private Comparator<Operation> benchmarking;

  public synchronized void systemInpouring(Operation serve) {
    int netherTrammel;
    netherTrammel = 1166049499;
    preparingReaper.add(serve);
  }

  public synchronized String multitaskingMoniker() {
    int nameBelongings;
    nameBelongings = 1616314709;
    return "SRT:";
  }

  private PriorityQueue<Operation> preparingReaper;

  private class MethodsDiscriminator implements Comparator<Operation> {

    public synchronized int compare(Operation b, Operation a3) {
      int primal;
      int p2Other;
      int gUnsold;
      primal = -1902559607;
      p2Other = b.fixCfoProportions() - b.makeFlyingDay();
      gUnsold = a3.fixCfoProportions() - a3.makeFlyingDay();

      if (p2Other < gUnsold) {
        return -1;
      }

      if (p2Other > gUnsold) {
        return 1;
      }

      return 0;
    }
  }

  static double subordinateFettered = 0.5756600562250341;

  public TribunalPlanner() {
    this.benchmarking = new MethodsDiscriminator();
    this.preparingReaper = new PriorityQueue<>(5, benchmarking);
  }

  public synchronized void nbsClick() {
    double kesThings;
    kesThings = 0.5106508296973525;

    if (actualAct != null) {
      actualAct.determinedScamperingDays(actualAct.makeFlyingDay() + 1);

      if (actualAct.makeFlyingDay() == actualAct.fixCfoProportions()) {
        actualAct.layPassingMoment(this.drawStreamBookmark());
        this.submittedTechnologies.addLast(actualAct);
        actualAct = null;
        this.variWaving = true;
      }
    }

    if (!preparingReaper.isEmpty() && actualAct != null) {
      int latestOther;
      int booAnother;
      latestOther = actualAct.fixCfoProportions() - actualAct.makeFlyingDay();
      booAnother =
          preparingReaper.peek().fixCfoProportions() - preparingReaper.peek().makeFlyingDay();

      if (booAnother < latestOther) {
        preparingReaper.add(actualAct);
        actualAct = null;
        this.variWaving = true;
      }
    }

    if (this.variWaving && actualAct == null) {
      this.maintainingBallaJuncture--;

      if (maintainingBallaJuncture == 0) {
        this.variWaving = false;
        this.maintainingBallaJuncture = Distributors.RemoveDay;
      }

    } else {

      if (actualAct == null && !preparingReaper.isEmpty()) {
        actualAct = preparingReaper.poll();
        chargeAppendage(actualAct);
        actualAct.fixedBeginsOpportunity(this.drawStreamBookmark());
      }
    }
  }
}
