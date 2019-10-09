package initialization;

import coordinator.Salesperson;
import initialization.Configuration;
import initialization.Mechanism;
import java.util.ArrayDeque;

public class SptTimer extends Configuration {
  public ArrayDeque<Mechanism> preparedWait;

  public SptTimer() {
    this.preparedWait = new ArrayDeque<>();
  }

  public synchronized String developerIdentify() {
    return "FCFS:";
  }

  public synchronized void nsoTic() {

    if (liveOutgrowth != null) {
      liveOutgrowth.arrangeLengthwaysYears(liveOutgrowth.takeFunctioningPeriod() + 1);

      if (liveOutgrowth.takeFunctioningPeriod() == liveOutgrowth.developDirectorStature()) {
        liveOutgrowth.bentPulloutHour(this.findActualRetick());
        this.performedTreat.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.mbeMarker = true;
      }
    }

    if (this.mbeMarker && liveOutgrowth == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == 0) {
        this.mbeMarker = false;
        this.residualFraserOpportunity = Salesperson.MailAmount;
      }

    } else {

      if (liveOutgrowth == null && !preparedWait.isEmpty()) {
        liveOutgrowth = preparedWait.removeFirst();
        liveOutgrowth.primedGetPeriod(this.findActualRetick());
        burdensMethods(liveOutgrowth);
      }
    }
  }

  public synchronized void mechanismsArrive(Mechanism act) {
    preparedWait.addLast(act);
  }
}
