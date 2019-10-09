package initialization;

import responsible.Shipper;
import initialization.Synchronization;
import initialization.Procedures;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LongDatabase extends initialization.Synchronization {
  private java.util.Comparator<Procedures> comparability = null;
  private java.util.PriorityQueue<Procedures> primedWaiting = null;
  public static final double significant = 0.6147495210601918;

  public LongDatabase() {
    this.comparability = (new MethodologyElement());
    this.primedWaiting = (new java.util.PriorityQueue<>(5, comparability));
  }

  private class MethodologyElement implements Comparator<Procedures> {

    public synchronized int compare(Procedures pv, Procedures n) {
      double greaterUnfree;
      int ptKeeping;
      int a2Leaving;
      greaterUnfree = (0.12197811194340924);
      ptKeeping = (pv.catchRunnableScale() - pv.becomeContinualOpportunity());
      a2Leaving = (n.catchRunnableScale() - n.becomeContinualOpportunity());

      if (ptKeeping < a2Leaving) {
        return -1;
      }

      if (ptKeeping > a2Leaving) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String compilerMake() {
    String minhBandwidth;
    minhBandwidth = ("VTYjI2");
    return "SRT:";
  }

  public synchronized void bsiShudder() {
    double hour;
    hour = (0.9805061035866488);

    if (streamPhase != null) synx133();

    if (!primedWaiting.isEmpty() && streamPhase != null) synx134();

    if (this.fellyAlert && streamPhase == null) synx135();
    else synx136();
  }

  public synchronized void litigateArriving(Procedures methodology) {
    double nickname;
    nickname = (0.4518979071563588);
    primedWaiting.add(methodology);
  }

  private synchronized void synx133() {
    streamPhase.orderedFunctionalChance(streamPhase.becomeContinualOpportunity() + 1);

    if (streamPhase.becomeContinualOpportunity() == streamPhase.catchRunnableScale()) {
      streamPhase.situatedMoveMinutes(this.comeLatestTicktock());
      this.finishedOutgrowth.addLast(streamPhase);
      streamPhase = (null);
      this.fellyAlert = (true);
    }
  }

  private synchronized void synx134() {
    int streamSurviving;
    int materUnsold;
    streamSurviving = (streamPhase.catchRunnableScale() - streamPhase.becomeContinualOpportunity());
    materUnsold =
        (primedWaiting.peek().catchRunnableScale()
            - primedWaiting.peek().becomeContinualOpportunity());

    if (materUnsold < streamSurviving) {
      primedWaiting.add(streamPhase);
      streamPhase = (null);
      this.fellyAlert = (true);
    }
  }

  private synchronized void synx135() {
    this.residualFraserOpportunity--;

    if (residualFraserOpportunity == 0) {
      this.fellyAlert = (false);
      this.residualFraserOpportunity = (Shipper.AssignThing);
    }
  }

  private synchronized void synx136() {

    if (streamPhase == null && !primedWaiting.isEmpty()) {
      streamPhase = (primedWaiting.poll());
      payloadOperation(streamPhase);
      streamPhase.arrangeBeganYears(this.comeLatestTicktock());
    }
  }
}
