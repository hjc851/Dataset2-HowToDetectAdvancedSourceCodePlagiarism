package programming;

import limiter.Yardmaster;
import programming.Spooler;
import programming.Mechanism;
import java.util.ArrayDeque;

public class IccParser extends programming.Spooler {
  public int clockLeft;
  public java.util.ArrayDeque<Mechanism> intelligentBraid;

  public IccParser() {
    this.intelligentBraid = new java.util.ArrayDeque<>();
    clockLeft = AgainGiant;
  }

  public synchronized String serverDiagnose() {
    return "RR:";
  }

  public synchronized void ourTicktack() {

    if (flowProcedures != null) {
      flowProcedures.prepareGushingNow(flowProcedures.conveyWalkingAmount() + 1);
      clockLeft--;

      if (flowProcedures.conveyWalkingAmount() == flowProcedures.makeExecutableDimensions()) {
        flowProcedures.adjustPerishMonth(this.fetchPresentRicky());
        this.doneAppendage.addLast(flowProcedures);
        flowProcedures = null;
        this.ordeBeacon = true;
      }

      if (clockLeft == 0 && flowProcedures != null) {

        if (intelligentBraid.isEmpty()) {
          clockLeft = AgainGiant;
        } else {
          intelligentBraid.addLast(flowProcedures);
          flowProcedures = null;
          this.ordeBeacon = true;
        }
      }
    }

    if (this.ordeBeacon && flowProcedures == null) {
      this.latterSthMinutes--;

      if (latterSthMinutes == 0) {
        this.ordeBeacon = false;
        this.latterSthMinutes = Yardmaster.CommuniqueMeter;
      }

    } else {

      if (flowProcedures == null && !intelligentBraid.isEmpty()) {
        flowProcedures = intelligentBraid.removeFirst();
        consignmentTreat(flowProcedures);
        flowProcedures.adjustPartMonth(this.fetchPresentRicky());
        clockLeft = AgainGiant;
      }
    }
  }

  public synchronized void methodsElected(Mechanism summons) {
    intelligentBraid.addLast(summons);
  }
}
