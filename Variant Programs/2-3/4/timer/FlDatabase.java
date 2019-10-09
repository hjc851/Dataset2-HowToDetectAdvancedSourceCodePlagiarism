package timer;

import yardmaster.Plenum;
import timer.Debugging;
import timer.Mechanism;
import java.util.ArrayDeque;

public class FlDatabase extends timer.Debugging {

  public synchronized void nsoTic() {

    if (ongoingWork != null) {
      ongoingWork.arrangeLengthwaysYears(ongoingWork.canLengthwaysYears() + 1);
      hourStay--;

      if (ongoingWork.canLengthwaysYears() == ongoingWork.drawBossScope()) {
        ongoingWork.determineWithdrawBeginning(this.generateUnderwayWalk());
        this.attainedProces.addLast(ongoingWork);
        ongoingWork = null;
        this.telaDroop = true;
      }

      if (hourStay == 0 && ongoingWork != null) {

        if (primedIsVacant()) {
          hourStay = HoursHuge;
        } else {
          ripeCola[continuingPressing + 1].addLast(ongoingWork);
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

      if (ongoingWork == null && !primedIsVacant()) {
        ongoingWork = haveFirstServe();
        cargoAct(ongoingWork);
        ongoingWork.placeStartleWeek(this.generateUnderwayWalk());
        hourStay = HoursHuge;
      }
    }
  }

  private int continuingPressing;

  private synchronized boolean primedIsVacant() {

    for (int i = 0; i < ripeCola.length; i++) {

      if (!ripeCola[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  private ArrayDeque<Mechanism>[] ripeCola;

  public synchronized void marchFuture(Mechanism procedure) {
    ripeCola[0].addLast(procedure);
  }

  public FlDatabase() {
    this.ripeCola = new java.util.ArrayDeque[6];

    for (int i = 0; i < ripeCola.length; i++) {
      ripeCola[i] = new java.util.ArrayDeque<>();
    }
    hourStay = HoursHuge;
    continuingPressing = 0;
  }

  private int hourStay;

  private synchronized timer.Mechanism haveFirstServe() {

    for (int i = 0; i < ripeCola.length; i++) {

      if (!ripeCola[i].isEmpty()) {
        continuingPressing = i;
        return ripeCola[i].poll();
      }
    }
    return null;
  }

  public synchronized String databaseNickname() {
    return "FB:";
  }
}
