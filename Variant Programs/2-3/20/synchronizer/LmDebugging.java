package synchronizer;

import exporter.Shipper;
import synchronizer.Workspace;
import synchronizer.Act;
import java.util.ArrayDeque;

public class LmDebugging extends synchronizer.Workspace {

  public synchronized String synchronizerDescribe() {
    return "FB:";
  }

  public int liveParamount;
  public int yearsAnother;

  public synchronized void negotiationsNew(Act summons) {
    preppedDelays[0].addLast(summons);
  }

  public synchronized boolean primedIsVacant() {

    for (int i = 0; i < preppedDelays.length; i++) {

      if (!preppedDelays[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public LmDebugging() {
    this.preppedDelays = new java.util.ArrayDeque[6];

    for (int i = 0; i < preppedDelays.length; i++) {
      preppedDelays[i] = new java.util.ArrayDeque<>();
    }
    yearsAnother = AmountMarkers;
    liveParamount = 0;
  }

  public synchronized void optiBeat() {

    if (prevailingProcedure != null) {
      prevailingProcedure.solidifyingRollingJuncture(prevailingProcedure.driveRushingAgain() + 1);
      yearsAnother--;

      if (prevailingProcedure.driveRushingAgain() == prevailingProcedure.drivePresidentCapacity()) {
        prevailingProcedure.putDepartureClock(this.fixNewTally());
        this.finalizedLitigate.addLast(prevailingProcedure);
        prevailingProcedure = null;
        this.ballaBrigade = true;
      }

      if (yearsAnother == 0 && prevailingProcedure != null) {

        if (primedIsVacant()) {
          yearsAnother = AmountMarkers;
        } else {
          preppedDelays[liveParamount + 1].addLast(prevailingProcedure);
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

      if (prevailingProcedure == null && !primedIsVacant()) {
        prevailingProcedure = developNewProceeding();
        freightMarch(prevailingProcedure);
        prevailingProcedure.fitCommencementYear(this.fixNewTally());
        yearsAnother = AmountMarkers;
      }
    }
  }

  public ArrayDeque<Act>[] preppedDelays;

  public synchronized synchronizer.Act developNewProceeding() {

    for (int i = 0; i < preppedDelays.length; i++) {

      if (!preppedDelays[i].isEmpty()) {
        liveParamount = i;
        return preppedDelays[i].poll();
      }
    }
    return null;
  }
}
