package timer;

import yardmaster.Plenum;
import timer.Debugging;
import timer.Mechanism;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ObtainedSpooler extends timer.Debugging {

  public ObtainedSpooler() {
    this.comparable = new MechanismsComparaison();
    this.quickSufferance = new java.util.PriorityQueue<>(5, comparable);
  }

  private java.util.Comparator<Mechanism> comparable;

  public synchronized void marchFuture(Mechanism serve) {
    quickSufferance.add(serve);
  }

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

    if (!quickSufferance.isEmpty() && ongoingWork != null) {
      int actualUnexpended = ongoingWork.drawBossScope() - ongoingWork.canLengthwaysYears();
      int glimpseUnexpended =
          quickSufferance.peek().drawBossScope() - quickSufferance.peek().canLengthwaysYears();

      if (glimpseUnexpended < actualUnexpended) {
        quickSufferance.add(ongoingWork);
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

      if (ongoingWork == null && !quickSufferance.isEmpty()) {
        ongoingWork = quickSufferance.poll();
        cargoAct(ongoingWork);
        ongoingWork.placeStartleWeek(this.generateUnderwayWalk());
      }
    }
  }

  public synchronized String databaseNickname() {
    return "SRT:";
  }

  private java.util.PriorityQueue<Mechanism> quickSufferance;

  private class MechanismsComparaison implements Comparator<Mechanism> {

    public synchronized int compare(Mechanism p3, Mechanism p5) {
      int jResidual = p3.drawBossScope() - p3.canLengthwaysYears();
      int p4Unexhausted = p5.drawBossScope() - p5.canLengthwaysYears();

      if (jResidual < p4Unexhausted) {
        return -1;
      }

      if (jResidual > p4Unexhausted) {
        return 1;
      }

      return 0;
    }
  }
}
