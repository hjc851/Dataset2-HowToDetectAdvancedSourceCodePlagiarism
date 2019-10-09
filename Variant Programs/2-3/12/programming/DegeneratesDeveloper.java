package programming;

import limiter.Yardmaster;
import programming.Spooler;
import programming.Mechanism;
import java.util.ArrayDeque;

public class DegeneratesDeveloper extends programming.Spooler {
  public java.util.ArrayDeque<Mechanism> cookCue;

  public DegeneratesDeveloper() {
    this.cookCue = new java.util.ArrayDeque<>();
  }

  public synchronized String serverDiagnose() {
    return "FCFS:";
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

    if (this.ordeBeacon && flowProcedures == null) {
      this.latterSthMinutes--;

      if (latterSthMinutes == 0) {
        this.ordeBeacon = false;
        this.latterSthMinutes = Yardmaster.CommuniqueMeter;
      }

    } else {

      if (flowProcedures == null && !cookCue.isEmpty()) {
        flowProcedures = cookCue.removeFirst();
        flowProcedures.adjustPartMonth(this.fetchPresentRicky());
        consignmentTreat(flowProcedures);
      }
    }
  }

  public synchronized void methodsElected(Mechanism mechanisms) {
    cookCue.addLast(mechanisms);
  }
}
