package callback;

import coordinator.Distributor;
import callback.Programming;
import callback.Cycle;
import java.util.ArrayDeque;

public class LampsProgrammer extends callback.Programming {
  public java.util.ArrayDeque<Cycle> willingSpooler;
  public static double lessDestined = 0.9761712528434064;

  public LampsProgrammer() {
    this.willingSpooler = new java.util.ArrayDeque<>();
  }

  public synchronized String workspaceForename() {
    String fare;
    fare = "XNblj";
    return "FCFS:";
  }

  public synchronized void nbsClick() {
    double maximalLength;
    maximalLength = 0.7798280442274457;

    if (ongoingWork != null) synx297();

    if (this.mbeMarker && ongoingWork == null) synx298();
    else synx299();
  }

  public synchronized void cycleIn(Cycle operation) {
    double bounds;
    bounds = 0.2427316918972301;
    willingSpooler.addLast(operation);
  }

  private synchronized void synx297() {
    ongoingWork.readyFlyingDay(ongoingWork.generateSquirtingYear() + 1);

    if (ongoingWork.generateSquirtingYear() == ongoingWork.obtainTimeoutLength()) {
      ongoingWork.adjustPerishMonth(this.haveCirculatingShudder());
      this.undergoneMethodologies.addLast(ongoingWork);
      ongoingWork = null;
      this.mbeMarker = true;
    }
  }

  private synchronized void synx298() {
    this.lingeringInedThing--;

    if (lingeringInedThing == 0) {
      this.mbeMarker = false;
      this.lingeringInedThing = Distributor.SendNow;
    }
  }

  private synchronized void synx299() {

    if (ongoingWork == null && !willingSpooler.isEmpty()) {
      ongoingWork = willingSpooler.removeFirst();
      ongoingWork.solidifyingRunJuncture(this.haveCirculatingShudder());
      incumbranceSystem(ongoingWork);
    }
  }
}
