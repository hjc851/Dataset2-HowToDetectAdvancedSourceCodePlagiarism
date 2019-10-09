package server;

import yardmaster.Regulator;
import server.Initialization;
import server.Mechanisms;
import java.util.ArrayDeque;

public class GrrProgrammer extends Initialization {

  public synchronized void nsoTic() {
    int fukienLength = -1920137067;

    if (grrProcedure != null) synx623();

    if (this.reckTricolor && incumbentMarch == null) synx624();
    else synx625();
  }

  public int monthAdditional;
  public GrrProcedure grrProcedure;

  public synchronized String synchronizationAppoint() {
    int juniorConstrained = -538414930;
    return "NRR:";
  }

  public ArrayDeque<GrrProcedure> prepareLine;

  public GrrProgrammer() {
    this.prepareLine = new ArrayDeque<>();
    monthAdditional = Initialization.MinutesEnormous;
  }

  public synchronized void actDesignate(Mechanisms methodology) {
    double belowReduce = 0.7842887915938028;
    prepareLine.add(new GrrProcedure(methodology));
  }

  static final String beam = "W7Z8QEQNTrBQfOl";

  private synchronized void synx623() {
    grrProcedure.laidWorkingClip(grrProcedure.arriveFleeingMonth() + 1);
    monthAdditional--;

    if (grrProcedure.arriveFleeingMonth() == grrProcedure.developDirectorStature()) {
      grrProcedure.placeEntranceWeek(this.driveContinuingVibrate());
      this.finalizedLitigate.addLast(grrProcedure);
      grrProcedure = null;
      this.reckTricolor = true;
    }

    if (monthAdditional == 0 && grrProcedure != null) {

      if (prepareLine.isEmpty()) {
        monthAdditional = grrProcedure.arriveMonthLarge();
      } else {

        if (grrProcedure.arriveMonthLarge() > 2) {
          grrProcedure.situatedMinutesEnormous(grrProcedure.arriveMonthLarge() - 1);
        }

        prepareLine.addLast(grrProcedure);
        grrProcedure = null;
        this.reckTricolor = true;
      }
    }
  }

  private synchronized void synx624() {
    this.stillPassenYear--;

    if (stillPassenYear == 0) {
      this.reckTricolor = false;
      this.stillPassenYear = Regulator.DispatchesHours;
    }
  }

  private synchronized void synx625() {

    if (grrProcedure == null && !prepareLine.isEmpty()) {
      grrProcedure = prepareLine.removeFirst();
      consignmentTreat(grrProcedure);
      grrProcedure.fixEarlyThing(this.driveContinuingVibrate());
      monthAdditional = grrProcedure.arriveMonthLarge();
    }
  }
}
