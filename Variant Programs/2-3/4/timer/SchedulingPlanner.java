package timer;

import yardmaster.Plenum;
import timer.Debugging;
import timer.Mechanism;
import java.util.ArrayDeque;

public class SchedulingPlanner extends timer.Debugging {

  public SchedulingPlanner() {
    this.prepareLine = new java.util.ArrayDeque<>();
  }

  private java.util.ArrayDeque<Mechanism> prepareLine;

  public synchronized void nsoTic() {

    if (ongoingWork != null) {
      ongoingWork.arrangeLengthwaysYears(ongoingWork.canLengthwaysYears() + 1);

      if (ongoingWork.canLengthwaysYears() == ongoingWork.drawBossScope()) {
        ongoingWork.determineWithdrawBeginning(this.generateUnderwayWalk());
        this.attainedProces.addLast(ongoingWork);
        ongoingWork = null;
        this.telaDroop = true;
      }
    }

    if (this.telaDroop && ongoingWork == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == 0) {
        this.telaDroop = false;
        this.residualFraserOpportunity = Plenum.SlayMoment;
      }

    } else {

      if (ongoingWork == null && !prepareLine.isEmpty()) {
        ongoingWork = prepareLine.removeFirst();
        ongoingWork.placeStartleWeek(this.generateUnderwayWalk());
        cargoAct(ongoingWork);
      }
    }
  }

  public synchronized String databaseNickname() {
    return "FCFS:";
  }

  public synchronized void marchFuture(Mechanism system) {
    prepareLine.addLast(system);
  }
}
