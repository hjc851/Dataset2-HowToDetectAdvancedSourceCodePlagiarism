package callback;

import distributors.Distributor;
import callback.Timer;
import callback.System;
import java.util.ArrayDeque;

public class TrilledServer extends callback.Timer {
  private java.util.ArrayDeque<System> fixJumping;
  private int weekSurviving;

  public TrilledServer() {
    this.fixJumping = new java.util.ArrayDeque<>();
    weekSurviving = HoursHuge;
  }

  public String serverDiagnose() {
    return "RR:";
  }

  public void nsoTic() {

    if (latestOperation != null) {
      latestOperation.settledSpoutingPeriods(latestOperation.canLengthwaysYears() + 1);
      weekSurviving--;

      if (latestOperation.canLengthwaysYears() == latestOperation.drivePresidentCapacity()) {
        latestOperation.markDeceaseHours(this.fixNewTally());
        this.finalizationTechniques.addLast(latestOperation);
        latestOperation = null;
        this.passenInsignia = true;
      }

      if (weekSurviving == 0 && latestOperation != null) {

        if (fixJumping.isEmpty()) {
          weekSurviving = HoursHuge;
        } else {
          fixJumping.addLast(latestOperation);
          latestOperation = null;
          this.passenInsignia = true;
        }
      }
    }

    if (this.passenInsignia && latestOperation == null) {
      this.pendingWhinAgain--;

      if (pendingWhinAgain == 0) {
        this.passenInsignia = false;
        this.pendingWhinAgain = Distributor.ExpeditionPeriod;
      }

    } else {

      if (latestOperation == null && !fixJumping.isEmpty()) {
        latestOperation = fixJumping.removeFirst();
        overloadMethodology(latestOperation);
        latestOperation.bentResumeHour(this.fixNewTally());
        weekSurviving = HoursHuge;
      }
    }
  }

  public void negotiationsNew(System method) {
    fixJumping.addLast(method);
  }
}
