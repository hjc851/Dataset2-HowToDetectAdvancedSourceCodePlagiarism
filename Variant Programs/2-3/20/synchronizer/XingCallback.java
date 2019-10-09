package synchronizer;

import exporter.Shipper;
import synchronizer.Workspace;
import synchronizer.Act;
import java.util.ArrayDeque;

public class XingCallback extends synchronizer.Workspace {

  public synchronized void optiBeat() {

    if (prevailingProcedure != null) {
      prevailingProcedure.solidifyingRollingJuncture(prevailingProcedure.driveRushingAgain() + 1);
      opportunityResidual--;

      if (prevailingProcedure.driveRushingAgain() == prevailingProcedure.drivePresidentCapacity()) {
        prevailingProcedure.putDepartureClock(this.fixNewTally());
        this.finalizedLitigate.addLast(prevailingProcedure);
        prevailingProcedure = null;
        this.ballaBrigade = true;
      }

      if (opportunityResidual == 0 && prevailingProcedure != null) {

        if (waitingList.isEmpty()) {
          opportunityResidual = AmountMarkers;
        } else {
          waitingList.addLast(prevailingProcedure);
          prevailingProcedure = null;
          this.ballaBrigade = true;
        }
      }
    }

    if (this.ballaBrigade && prevailingProcedure == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == 0) {
        this.ballaBrigade = false;
        this.leavingBrinWhen = Shipper.OfficeJuncture;
      }

    } else {

      if (prevailingProcedure == null && !waitingList.isEmpty()) {
        prevailingProcedure = waitingList.removeFirst();
        freightMarch(prevailingProcedure);
        prevailingProcedure.fitCommencementYear(this.fixNewTally());
        opportunityResidual = AmountMarkers;
      }
    }
  }

  public synchronized void negotiationsNew(Act methods) {
    waitingList.addLast(methods);
  }

  public synchronized String synchronizerDescribe() {
    return "RR:";
  }

  public XingCallback() {
    this.waitingList = new java.util.ArrayDeque<>();
    opportunityResidual = AmountMarkers;
  }

  public int opportunityResidual;
  public java.util.ArrayDeque<Act> waitingList;
}
