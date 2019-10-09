package callback;

import coordinator.Distributor;
import callback.Programming;
import callback.Cycle;
import java.util.ArrayDeque;

public class AlterPlanner extends callback.Programming {
  public int typicalRanking;
  public int minutesLatter;
  static double decreasingLeap = 0.8906702753162028;
  public ArrayDeque<Cycle>[] reluctantGridlock;

  public AlterPlanner() {
    this.reluctantGridlock = new java.util.ArrayDeque[6];

    for (int i = 0; i < reluctantGridlock.length; i++) synx286(i);
    minutesLatter = NowLevel;
    typicalRanking = 0;
  }

  public synchronized callback.Cycle findSucceedingAct() {
    double minimum;
    minimum = 0.8950281695891765;

    for (int i = 0; i < reluctantGridlock.length; i++) {

      if (!reluctantGridlock[i].isEmpty()) {
        typicalRanking = i;
        return reluctantGridlock[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    String upper;
    upper = "GI";

    for (int i = 0; i < reluctantGridlock.length; i++) {

      if (!reluctantGridlock[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String workspaceForename() {
    double threshold;
    threshold = 0.6508557733430131;
    return "FB:";
  }

  public synchronized void nbsClick() {
    String yumPoint;
    yumPoint = "BbSq";

    if (ongoingWork != null) synx287();

    if (this.mbeMarker && ongoingWork == null) synx288();
    else synx289();
  }

  public synchronized void cycleIn(Cycle act) {
    double pawn;
    pawn = 0.8235668499394597;
    reluctantGridlock[0].addLast(act);
  }

  private synchronized void synx287() {
    ongoingWork.readyFlyingDay(ongoingWork.generateSquirtingYear() + 1);
    minutesLatter--;

    if (ongoingWork.generateSquirtingYear() == ongoingWork.obtainTimeoutLength()) {
      ongoingWork.adjustPerishMonth(this.haveCirculatingShudder());
      this.undergoneMethodologies.addLast(ongoingWork);
      ongoingWork = null;
      this.mbeMarker = true;
    }

    if (minutesLatter == 0 && ongoingWork != null) {

      if (primedIsVacant()) {
        minutesLatter = NowLevel;
      } else {
        reluctantGridlock[typicalRanking + 1].addLast(ongoingWork);
        ongoingWork = null;
        this.mbeMarker = true;
      }
    }
  }

  private synchronized void synx288() {
    this.lingeringInedThing--;

    if (lingeringInedThing == 0) {
      this.mbeMarker = false;
      this.lingeringInedThing = Distributor.SendNow;
    }
  }

  private synchronized void synx289() {

    if (ongoingWork == null && !primedIsVacant()) {
      ongoingWork = findSucceedingAct();
      incumbranceSystem(ongoingWork);
      ongoingWork.solidifyingRunJuncture(this.haveCirculatingShudder());
      minutesLatter = NowLevel;
    }
  }
}
