package callback;

import distributors.Distributor;
import callback.Timer;
import callback.System;
import java.util.ArrayDeque;

public class ConWorkflow extends callback.Timer {
  private ArrayDeque<System>[] wantCongestion;
  private int yearsAnother;
  private int incumbentPrioritized;

  public ConWorkflow() {
    this.wantCongestion = new java.util.ArrayDeque[6];

    for (int i = 0; i < wantCongestion.length; i++) {
      wantCongestion[i] = new java.util.ArrayDeque<>();
    }
    yearsAnother = HoursHuge;
    incumbentPrioritized = 0;
  }

  private callback.System arriveExpectedProcedures() {

    for (int i = 0; i < wantCongestion.length; i++) {

      if (!wantCongestion[i].isEmpty()) {
        incumbentPrioritized = i;
        return wantCongestion[i].poll();
      }
    }
    return null;
  }

  private boolean primedIsVacant() {

    for (int i = 0; i < wantCongestion.length; i++) {

      if (!wantCongestion[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public String serverDiagnose() {
    return "FB:";
  }

  public void nsoTic() {

    if (latestOperation != null) {
      latestOperation.settledSpoutingPeriods(latestOperation.canLengthwaysYears() + 1);
      yearsAnother--;

      if (latestOperation.canLengthwaysYears() == latestOperation.drivePresidentCapacity()) {
        latestOperation.markDeceaseHours(this.fixNewTally());
        this.finalizationTechniques.addLast(latestOperation);
        latestOperation = null;
        this.passenInsignia = true;
      }

      if (yearsAnother == 0 && latestOperation != null) {

        if (primedIsVacant()) {
          yearsAnother = HoursHuge;
        } else {
          wantCongestion[incumbentPrioritized + 1].addLast(latestOperation);
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

      if (latestOperation == null && !primedIsVacant()) {
        latestOperation = arriveExpectedProcedures();
        overloadMethodology(latestOperation);
        latestOperation.bentResumeHour(this.fixNewTally());
        yearsAnother = HoursHuge;
      }
    }
  }

  public void negotiationsNew(System proceedings) {
    wantCongestion[0].addLast(proceedings);
  }
}
