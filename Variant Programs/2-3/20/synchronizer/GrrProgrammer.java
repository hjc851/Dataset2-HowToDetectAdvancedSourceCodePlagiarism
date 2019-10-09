package synchronizer;

import exporter.Shipper;
import synchronizer.Workspace;
import synchronizer.Act;
import java.util.ArrayDeque;

public class GrrProgrammer extends synchronizer.Workspace {

  public synchronized void optiBeat() {

    if (grrProcedure != null) {
      grrProcedure.solidifyingRollingJuncture(grrProcedure.driveRushingAgain() + 1);
      thingLingering--;

      if (grrProcedure.driveRushingAgain() == grrProcedure.drivePresidentCapacity()) {
        grrProcedure.putDepartureClock(this.fixNewTally());
        this.finalizedLitigate.addLast(grrProcedure);
        grrProcedure = null;
        this.ballaBrigade = true;
      }

      if (thingLingering == 0 && grrProcedure != null) {

        if (happyStopper.isEmpty()) {
          thingLingering = grrProcedure.fetchBeginningMammoth();
        } else {

          if (grrProcedure.fetchBeginningMammoth() > 2) {
            grrProcedure.placeWeekVolume(grrProcedure.fetchBeginningMammoth() - 1);
          }

          happyStopper.addLast(grrProcedure);
          grrProcedure = null;
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

      if (grrProcedure == null && !happyStopper.isEmpty()) {
        grrProcedure = happyStopper.removeFirst();
        freightMarch(grrProcedure);
        grrProcedure.fitCommencementYear(this.fixNewTally());
        thingLingering = grrProcedure.fetchBeginningMammoth();
      }
    }
  }

  public synchronized String synchronizerDescribe() {
    return "NRR:";
  }

  public GrrProgrammer() {
    this.happyStopper = new java.util.ArrayDeque<>();
    thingLingering = Workspace.AmountMarkers;
  }

  public java.util.ArrayDeque<GrrProcedure> happyStopper;

  public synchronized void negotiationsNew(Act mechanism) {
    happyStopper.add(new synchronizer.GrrProcedure(mechanism));
  }

  public synchronizer.GrrProcedure grrProcedure;
  public int thingLingering;
}
