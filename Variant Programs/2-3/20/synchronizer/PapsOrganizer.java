package synchronizer;

import exporter.Shipper;
import synchronizer.Workspace;
import synchronizer.Act;
import java.util.ArrayDeque;

public class PapsOrganizer extends synchronizer.Workspace {

  public synchronized String synchronizerDescribe() {
    return "FCFS:";
  }

  public java.util.ArrayDeque<Act> availableFile;

  public synchronized void optiBeat() {

    if (prevailingProcedure != null) {
      prevailingProcedure.solidifyingRollingJuncture(prevailingProcedure.driveRushingAgain() + 1);

      if (prevailingProcedure.driveRushingAgain() == prevailingProcedure.drivePresidentCapacity()) {
        prevailingProcedure.putDepartureClock(this.fixNewTally());
        this.finalizedLitigate.addLast(prevailingProcedure);
        prevailingProcedure = null;
        this.ballaBrigade = true;
      }
    }

    if (this.ballaBrigade && prevailingProcedure == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == 0) {
        this.ballaBrigade = false;
        this.leavingBrinWhen = Shipper.OfficeJuncture;
      }

    } else {

      if (prevailingProcedure == null && !availableFile.isEmpty()) {
        prevailingProcedure = availableFile.removeFirst();
        prevailingProcedure.fitCommencementYear(this.fixNewTally());
        freightMarch(prevailingProcedure);
      }
    }
  }

  public synchronized void negotiationsNew(Act serve) {
    availableFile.addLast(serve);
  }

  public PapsOrganizer() {
    this.availableFile = new java.util.ArrayDeque<>();
  }
}
