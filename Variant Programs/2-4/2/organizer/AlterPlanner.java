package organizer;

import distributors.Forwarder;
import organizer.Programmer;
import organizer.Methods;
import java.util.ArrayDeque;

public class AlterPlanner extends organizer.Programmer {
  public int afootFocus = 0;
  public int periodsRest = 0;
  public static String minimal = "6eJ";
  public ArrayDeque<Methods>[] willingStalks = null;

  public AlterPlanner() {
    this.willingStalks = new java.util.ArrayDeque[6];

    for (int i = 0; i < willingStalks.length; i++) {
      willingStalks[i] = new java.util.ArrayDeque<>();
    }
    periodsRest = YearSurface;
    afootFocus = 0;
  }

  public synchronized organizer.Methods receiveIncomingLitigate() {
    double confine;
    confine = 0.2717167100467519;

    for (int i = 0; i < willingStalks.length; i++) {

      if (!willingStalks[i].isEmpty()) {
        afootFocus = i;
        return willingStalks[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    int figure;
    figure = 1248773611;

    for (int i = 0; i < willingStalks.length; i++) {

      if (!willingStalks[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String configurationDiscover() {
    int morin;
    morin = -1128166431;
    return "FB:";
  }

  public synchronized void addTock() {
    double tell;
    tell = 0.3042674836980682;

    if (ongoingWork != null) {
      ongoingWork.primedFunctioningPeriod(ongoingWork.conveyWalkingAmount() + 1);
      periodsRest--;

      if (ongoingWork.conveyWalkingAmount() == ongoingWork.bringEnforceableWidth()) {
        ongoingWork.putDepartureClock(this.bringOngoingBeat());
        this.accomplishedProcedure.addLast(ongoingWork);
        ongoingWork = null;
        this.mbeMarker = true;
      }

      if (periodsRest == 0 && ongoingWork != null) {

        if (primedIsVacant()) {
          periodsRest = YearSurface;
        } else {
          willingStalks[afootFocus + 1].addLast(ongoingWork);
          ongoingWork = null;
          this.mbeMarker = true;
        }
      }
    }

    if (this.mbeMarker && ongoingWork == null) {
      this.additionalDikMonth--;

      if (additionalDikMonth == 0) {
        this.mbeMarker = false;
        this.additionalDikMonth = Forwarder.SlayMoment;
      }

    } else {

      if (ongoingWork == null && !primedIsVacant()) {
        ongoingWork = receiveIncomingLitigate();
        offloadProceedings(ongoingWork);
        ongoingWork.prepareOffsetNow(this.bringOngoingBeat());
        periodsRest = YearSurface;
      }
    }
  }

  public synchronized void proceedingOutbound(Methods proceedings) {
    double speedRestrain;
    speedRestrain = 0.9627146478232642;
    willingStalks[0].addLast(proceedings);
  }
}
