package programming;

import limiter.Yardmaster;
import programming.Spooler;
import programming.Mechanism;
import java.util.Comparator;
import java.util.PriorityQueue;

public class AerobicMultitasking extends programming.Spooler {
  public java.util.Comparator<Mechanism> comparable;
  public java.util.PriorityQueue<Mechanism> preparingReaper;

  public AerobicMultitasking() {
    this.comparable = new OutgrowthComparing();
    this.preparingReaper = new java.util.PriorityQueue<>(5, comparable);
  }

  public class OutgrowthComparing implements Comparator<Mechanism> {

    public synchronized int compare(Mechanism p3, Mechanism gpi) {
      int plLingering;
      int nMaintaining;
      plLingering = p3.makeExecutableDimensions() - p3.conveyWalkingAmount();
      nMaintaining = gpi.makeExecutableDimensions() - gpi.conveyWalkingAmount();

      if (plLingering < nMaintaining) {
        return -1;
      }

      if (plLingering > nMaintaining) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String serverDiagnose() {
    return "SRT:";
  }

  public synchronized void ourTicktack() {

    if (flowProcedures != null) {
      flowProcedures.prepareGushingNow(flowProcedures.conveyWalkingAmount() + 1);

      if (flowProcedures.conveyWalkingAmount() == flowProcedures.makeExecutableDimensions()) {
        flowProcedures.adjustPerishMonth(this.fetchPresentRicky());
        this.doneAppendage.addLast(flowProcedures);
        flowProcedures = null;
        this.ordeBeacon = true;
      }
    }

    if (!preparingReaper.isEmpty() && flowProcedures != null) {
      int presentUnsold;
      int sneakPending;
      presentUnsold =
          flowProcedures.makeExecutableDimensions() - flowProcedures.conveyWalkingAmount();
      sneakPending =
          preparingReaper.peek().makeExecutableDimensions()
              - preparingReaper.peek().conveyWalkingAmount();

      if (sneakPending < presentUnsold) {
        preparingReaper.add(flowProcedures);
        flowProcedures = null;
        this.ordeBeacon = true;
      }
    }

    if (this.ordeBeacon && flowProcedures == null) {
      this.latterSthMinutes--;

      if (latterSthMinutes == 0) {
        this.ordeBeacon = false;
        this.latterSthMinutes = Yardmaster.CommuniqueMeter;
      }

    } else {

      if (flowProcedures == null && !preparingReaper.isEmpty()) {
        flowProcedures = preparingReaper.poll();
        consignmentTreat(flowProcedures);
        flowProcedures.adjustPartMonth(this.fetchPresentRicky());
      }
    }
  }

  public synchronized void methodsElected(Mechanism operation) {
    preparingReaper.add(operation);
  }
}
