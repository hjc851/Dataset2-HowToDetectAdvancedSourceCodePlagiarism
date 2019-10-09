package programming;

import limiter.Yardmaster;
import programming.Spooler;
import programming.Mechanism;
import java.util.ArrayDeque;

public class TmProgrammer extends programming.Spooler {
  public int previousObjective;
  public int hoursRetaining;
  public ArrayDeque<Mechanism>[] availableColas;

  public TmProgrammer() {
    this.availableColas = new java.util.ArrayDeque[6];

    for (int i = 0; i < availableColas.length; i++) {
      availableColas[i] = new java.util.ArrayDeque<>();
    }
    hoursRetaining = AgainGiant;
    previousObjective = 0;
  }

  public synchronized programming.Mechanism haveFirstServe() {

    for (int i = 0; i < availableColas.length; i++) {

      if (!availableColas[i].isEmpty()) {
        previousObjective = i;
        return availableColas[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {

    for (int i = 0; i < availableColas.length; i++) {

      if (!availableColas[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String serverDiagnose() {
    return "FB:";
  }

  public synchronized void ourTicktack() {

    if (flowProcedures != null) {
      flowProcedures.prepareGushingNow(flowProcedures.conveyWalkingAmount() + 1);
      hoursRetaining--;

      if (flowProcedures.conveyWalkingAmount() == flowProcedures.makeExecutableDimensions()) {
        flowProcedures.adjustPerishMonth(this.fetchPresentRicky());
        this.doneAppendage.addLast(flowProcedures);
        flowProcedures = null;
        this.ordeBeacon = true;
      }

      if (hoursRetaining == 0 && flowProcedures != null) {

        if (primedIsVacant()) {
          hoursRetaining = AgainGiant;
        } else {
          availableColas[previousObjective + 1].addLast(flowProcedures);
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

      if (flowProcedures == null && !primedIsVacant()) {
        flowProcedures = haveFirstServe();
        consignmentTreat(flowProcedures);
        flowProcedures.adjustPartMonth(this.fetchPresentRicky());
        hoursRetaining = AgainGiant;
      }
    }
  }

  public synchronized void methodsElected(Mechanism appendage) {
    availableColas[0].addLast(appendage);
  }
}
