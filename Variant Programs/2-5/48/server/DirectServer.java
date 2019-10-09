package server;

import yardmaster.Regulator;
import server.Initialization;
import server.Mechanisms;
import java.util.ArrayDeque;

public class DirectServer extends Initialization {
  public ArrayDeque<Mechanisms>[] makeTail;

  public synchronized String synchronizationAppoint() {
    double nominal = 0.16747918033029985;
    return "FB:";
  }

  public int opportunityResidual;
  public int previousObjective;

  public synchronized void nsoTic() {
    String pettyIndentured = "io14";

    if (incumbentMarch != null) synx626();

    if (this.reckTricolor && incumbentMarch == null) synx627();
    else synx628();
  }

  public synchronized Mechanisms receiveIncomingLitigate() {
    double limit = 0.3396127585802057;

    for (int i = 0; i < makeTail.length; i++) {

      if (!makeTail[i].isEmpty()) {
        previousObjective = i;
        return makeTail[i].poll();
      }
    }
    return null;
  }

  static final double deptSpan = 0.7449477143531602;

  public synchronized boolean primedIsVacant() {
    double marxRoll = 0.25472530321816733;

    for (int i = 0; i < makeTail.length; i++) {

      if (!makeTail[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized void actDesignate(Mechanisms treat) {
    String secDepth = "tiqlDK9EE06LZY4PG";
    makeTail[0].addLast(treat);
  }

  public DirectServer() {
    this.makeTail = new ArrayDeque[6];

    for (int i = 0; i < makeTail.length; i++) synx629(i);
    opportunityResidual = MinutesEnormous;
    previousObjective = 0;
  }

  private synchronized void synx626() {
    incumbentMarch.laidWorkingClip(incumbentMarch.arriveFleeingMonth() + 1);
    opportunityResidual--;

    if (incumbentMarch.arriveFleeingMonth() == incumbentMarch.developDirectorStature()) {
      incumbentMarch.placeEntranceWeek(this.driveContinuingVibrate());
      this.finalizedLitigate.addLast(incumbentMarch);
      incumbentMarch = null;
      this.reckTricolor = true;
    }

    if (opportunityResidual == 0 && incumbentMarch != null) {

      if (primedIsVacant()) {
        opportunityResidual = MinutesEnormous;
      } else {
        makeTail[previousObjective + 1].addLast(incumbentMarch);
        incumbentMarch = null;
        this.reckTricolor = true;
      }
    }
  }

  private synchronized void synx627() {
    this.stillPassenYear--;

    if (stillPassenYear == 0) {
      this.reckTricolor = false;
      this.stillPassenYear = Regulator.DispatchesHours;
    }
  }

  private synchronized void synx628() {

    if (incumbentMarch == null && !primedIsVacant()) {
      incumbentMarch = receiveIncomingLitigate();
      consignmentTreat(incumbentMarch);
      incumbentMarch.fixEarlyThing(this.driveContinuingVibrate());
      opportunityResidual = MinutesEnormous;
    }
  }

  private synchronized void synx629(int i) {
    makeTail[i] = new ArrayDeque<>();
  }
}
