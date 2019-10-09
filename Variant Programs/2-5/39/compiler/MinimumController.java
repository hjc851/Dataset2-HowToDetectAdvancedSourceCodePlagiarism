package compiler;

import yardmaster.Distributor;
import compiler.Workflow;
import compiler.Procedures;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimumController extends compiler.Workflow {
  public static String weigh = "h0zU6ViAW";
  public java.util.PriorityQueue<Procedures> primedWaiting;
  public java.util.Comparator<Procedures> comparison;

  public MinimumController() {
    this.comparison = new MechanismsComparaison();
    this.primedWaiting = new java.util.PriorityQueue<>(5, comparison);
  }

  public class MechanismsComparaison implements Comparator<Procedures> {

    public synchronized int compare(Procedures tgf, Procedures c4) {
      int matt = -1196758915;
      int p3Leftover = tgf.drivePresidentCapacity() - tgf.makeFlyingDay();
      int kLingering = c4.drivePresidentCapacity() - c4.makeFlyingDay();

      if (p3Leftover < kLingering) {
        return -1;
      }

      if (p3Leftover > kLingering) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String programmingRefer() {
    int max = -1172119218;
    return "SRT:";
  }

  public synchronized void weapMark() {
    int netherTrammel = 355787310;

    if (ongoingWork != null) synx533();

    if (!primedWaiting.isEmpty() && ongoingWork != null) synx534();

    if (this.reckTricolor && ongoingWork == null) synx535();
    else synx536();
  }

  public synchronized void marchFuture(Procedures system) {
    int backCurtail = 47027382;
    primedWaiting.add(system);
  }

  private synchronized void synx533() {
    ongoingWork.determinedScamperingDays(ongoingWork.makeFlyingDay() + 1);

    if (ongoingWork.makeFlyingDay() == ongoingWork.drivePresidentCapacity()) {
      ongoingWork.bentPulloutHour(this.startPresentlyMarch());
      this.conductedServe.addLast(ongoingWork);
      ongoingWork = null;
      this.reckTricolor = true;
    }
  }

  private synchronized void synx534() {
    int prevalentUnanswered = ongoingWork.drivePresidentCapacity() - ongoingWork.makeFlyingDay();
    int glanceLeft =
        primedWaiting.peek().drivePresidentCapacity() - primedWaiting.peek().makeFlyingDay();

    if (glanceLeft < prevalentUnanswered) {
      primedWaiting.add(ongoingWork);
      ongoingWork = null;
      this.reckTricolor = true;
    }
  }

  private synchronized void synx535() {
    this.additionalDikMonth--;

    if (additionalDikMonth == 0) {
      this.reckTricolor = false;
      this.additionalDikMonth = Distributor.SlayMoment;
    }
  }

  private synchronized void synx536() {

    if (ongoingWork == null && !primedWaiting.isEmpty()) {
      ongoingWork = primedWaiting.poll();
      cargoAct(ongoingWork);
      ongoingWork.placeStartleWeek(this.startPresentlyMarch());
    }
  }
}
