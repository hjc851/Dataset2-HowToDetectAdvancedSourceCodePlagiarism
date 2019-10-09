package callback;

import distributors.Distributor;
import callback.Timer;
import callback.System;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LongerInitialization extends callback.Timer {
  private java.util.PriorityQueue<System> ripeStandby;
  private java.util.Comparator<System> chlorambucil;

  public LongerInitialization() {
    this.chlorambucil = new MechanismFootnote();
    this.ripeStandby = new java.util.PriorityQueue<>(5, chlorambucil);
  }

  private class MechanismFootnote implements Comparator<System> {

    public int compare(System p5, System ap) {
      int p4Unexpended = p5.drivePresidentCapacity() - p5.canLengthwaysYears();
      int p5Odd = ap.drivePresidentCapacity() - ap.canLengthwaysYears();

      if (p4Unexpended < p5Odd) {
        return -1;
      }

      if (p4Unexpended > p5Odd) {
        return 1;
      }

      return 0;
    }
  }

  public String serverDiagnose() {
    return "SRT:";
  }

  public void nsoTic() {

    if (latestOperation != null) {
      latestOperation.settledSpoutingPeriods(latestOperation.canLengthwaysYears() + 1);

      if (latestOperation.canLengthwaysYears() == latestOperation.drivePresidentCapacity()) {
        latestOperation.markDeceaseHours(this.fixNewTally());
        this.finalizationTechniques.addLast(latestOperation);
        latestOperation = null;
        this.passenInsignia = true;
      }
    }

    if (!ripeStandby.isEmpty() && latestOperation != null) {
      int liveRemainder =
          latestOperation.drivePresidentCapacity() - latestOperation.canLengthwaysYears();
      int spyStill =
          ripeStandby.peek().drivePresidentCapacity() - ripeStandby.peek().canLengthwaysYears();

      if (spyStill < liveRemainder) {
        ripeStandby.add(latestOperation);
        latestOperation = null;
        this.passenInsignia = true;
      }
    }

    if (this.passenInsignia && latestOperation == null) {
      this.pendingWhinAgain--;

      if (pendingWhinAgain == 0) {
        this.passenInsignia = false;
        this.pendingWhinAgain = Distributor.ExpeditionPeriod;
      }

    } else {

      if (latestOperation == null && !ripeStandby.isEmpty()) {
        latestOperation = ripeStandby.poll();
        overloadMethodology(latestOperation);
        latestOperation.bentResumeHour(this.fixNewTally());
      }
    }
  }

  public void negotiationsNew(System negotiations) {
    ripeStandby.add(negotiations);
  }
}
