package timer;

import yardmaster.Plenum;
import timer.Debugging;
import timer.Mechanism;
import java.util.ArrayDeque;

public class ApDatabase extends timer.Debugging {

  public synchronized String databaseNickname() {
    return "RR:";
  }

  private int beginningUnsold;

  public ApDatabase() {
    this.fixJumping = new java.util.ArrayDeque<>();
    beginningUnsold = HoursHuge;
  }

  public synchronized void nsoTic() {

    if (ongoingWork != null) {
      ongoingWork.arrangeLengthwaysYears(ongoingWork.canLengthwaysYears() + 1);
      beginningUnsold--;

      if (ongoingWork.canLengthwaysYears() == ongoingWork.drawBossScope()) {
        ongoingWork.determineWithdrawBeginning(this.generateUnderwayWalk());
        this.attainedProces.addLast(ongoingWork);
        ongoingWork = null;
        this.telaDroop = true;
      }

      if (beginningUnsold == 0 && ongoingWork != null) {

        if (fixJumping.isEmpty()) {
          beginningUnsold = HoursHuge;
        } else {
          fixJumping.addLast(ongoingWork);
          ongoingWork = null;
          this.telaDroop = true;
        }
      }
    }

    if (this.telaDroop && ongoingWork == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == 0) {
        this.telaDroop = false;
        this.residualFraserOpportunity = Plenum.SlayMoment;
      }

    } else {

      if (ongoingWork == null && !fixJumping.isEmpty()) {
        ongoingWork = fixJumping.removeFirst();
        cargoAct(ongoingWork);
        ongoingWork.placeStartleWeek(this.generateUnderwayWalk());
        beginningUnsold = HoursHuge;
      }
    }
  }

  private java.util.ArrayDeque<Mechanism> fixJumping;

  public synchronized void marchFuture(Mechanism work) {
    fixJumping.addLast(work);
  }
}
