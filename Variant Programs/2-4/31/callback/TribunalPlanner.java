package callback;

import coordinator.Distributor;
import callback.Programming;
import callback.Cycle;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TribunalPlanner extends callback.Programming {
  public java.util.Comparator<Cycle> element;
  public java.util.PriorityQueue<Cycle> setConvoy;
  static String marxRoll = "FQIZnkLgQqzXZ9KUtj6";

  public TribunalPlanner() {
    this.element = new WorkBenchmarking();
    this.setConvoy = new java.util.PriorityQueue<>(5, element);
  }

  public class WorkBenchmarking implements Comparator<Cycle> {

    public synchronized int compare(Cycle mi, Cycle p5) {
      double ident;
      int mLatter;
      int a1Rest;
      ident = 0.4720119675453912;
      mLatter = mi.obtainTimeoutLength() - mi.generateSquirtingYear();
      a1Rest = p5.obtainTimeoutLength() - p5.generateSquirtingYear();

      if (mLatter < a1Rest) {
        return -1;
      }

      if (mLatter > a1Rest) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String workspaceForename() {
    double constrain;
    constrain = 0.6908277244943501;
    return "SRT:";
  }

  public synchronized void nbsClick() {
    double johannes;
    johannes = 0.2659139343686646;

    if (ongoingWork != null) synx293();

    if (!setConvoy.isEmpty() && ongoingWork != null) synx294();

    if (this.mbeMarker && ongoingWork == null) synx295();
    else synx296();
  }

  public synchronized void cycleIn(Cycle work) {
    double restricting;
    restricting = 0.5087079448458011;
    setConvoy.add(work);
  }

  private synchronized void synx293() {
    ongoingWork.readyFlyingDay(ongoingWork.generateSquirtingYear() + 1);

    if (ongoingWork.generateSquirtingYear() == ongoingWork.obtainTimeoutLength()) {
      ongoingWork.adjustPerishMonth(this.haveCirculatingShudder());
      this.undergoneMethodologies.addLast(ongoingWork);
      ongoingWork = null;
      this.mbeMarker = true;
    }
  }

  private synchronized void synx294() {
    int contemporaryUnexhausted;
    int cheatingResidual;
    contemporaryUnexhausted =
        ongoingWork.obtainTimeoutLength() - ongoingWork.generateSquirtingYear();
    cheatingResidual =
        setConvoy.peek().obtainTimeoutLength() - setConvoy.peek().generateSquirtingYear();

    if (cheatingResidual < contemporaryUnexhausted) {
      setConvoy.add(ongoingWork);
      ongoingWork = null;
      this.mbeMarker = true;
    }
  }

  private synchronized void synx295() {
    this.lingeringInedThing--;

    if (lingeringInedThing == 0) {
      this.mbeMarker = false;
      this.lingeringInedThing = Distributor.SendNow;
    }
  }

  private synchronized void synx296() {

    if (ongoingWork == null && !setConvoy.isEmpty()) {
      ongoingWork = setConvoy.poll();
      incumbranceSystem(ongoingWork);
      ongoingWork.solidifyingRunJuncture(this.haveCirculatingShudder());
    }
  }
}
