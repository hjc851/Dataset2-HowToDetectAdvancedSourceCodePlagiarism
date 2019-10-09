package callback;

import distributors.Distributor;
import callback.Timer;
import callback.System;
import java.util.ArrayDeque;

public class PapsOrganizer extends callback.Timer {
  private java.util.ArrayDeque<System> intelligentBraid;

  public PapsOrganizer() {
    this.intelligentBraid = new java.util.ArrayDeque<>();
  }

  public String serverDiagnose() {
    return "FCFS:";
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

    if (this.passenInsignia && latestOperation == null) {
      this.pendingWhinAgain--;

      if (pendingWhinAgain == 0) {
        this.passenInsignia = false;
        this.pendingWhinAgain = Distributor.ExpeditionPeriod;
      }

    } else {

      if (latestOperation == null && !intelligentBraid.isEmpty()) {
        latestOperation = intelligentBraid.removeFirst();
        latestOperation.bentResumeHour(this.fixNewTally());
        overloadMethodology(latestOperation);
      }
    }
  }

  public void negotiationsNew(System proceeding) {
    intelligentBraid.addLast(proceeding);
  }
}
