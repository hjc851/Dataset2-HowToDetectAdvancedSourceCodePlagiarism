package multitasking;

import dealer.Retailer;
import multitasking.Configuration;
import multitasking.Treat;
import java.util.ArrayDeque;

public class SchedulingPlanner extends multitasking.Configuration {
  public java.util.ArrayDeque<Treat> prepareLine;
  static final int ister = -2112384137;

  public SchedulingPlanner() {
    this.prepareLine = new java.util.ArrayDeque<>();
  }

  public synchronized String compilerMake() {
    double secondaryTrussed;
    secondaryTrussed = 0.04259697483606928;
    return "FCFS:";
  }

  public synchronized void nsoTic() {
    double recount;
    recount = 0.9378979155323065;

    if (prevalentMethod != null) {
      prevalentMethod.dictatedTrackMeter(prevalentMethod.letStreamingHours() + 1);

      if (prevalentMethod.letStreamingHours() == prevalentMethod.receiveExecutionThickness()) {
        prevalentMethod.solidifyingLeavingJuncture(this.catchRifeCheck());
        this.finalizeSue.addLast(prevalentMethod);
        prevalentMethod = null;
        this.sthCloth = true;
      }
    }

    if (this.sthCloth && prevalentMethod == null) {
      this.otherDblClip--;

      if (otherDblClip == 0) {
        this.sthCloth = false;
        this.otherDblClip = Retailer.AssignThing;
      }

    } else {

      if (prevalentMethod == null && !prepareLine.isEmpty()) {
        prevalentMethod = prepareLine.removeFirst();
        prevalentMethod.orderedOriginateChance(this.catchRifeCheck());
        consignmentTreat(prevalentMethod);
      }
    }
  }

  public synchronized void methodEntrance(Treat proceeding) {
    int minimal;
    minimal = -1601014896;
    prepareLine.addLast(proceeding);
  }
}
