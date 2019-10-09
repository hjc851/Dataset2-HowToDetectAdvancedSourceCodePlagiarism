package server;

import yardmaster.Regulator;
import server.Initialization;
import server.Mechanisms;
import java.util.ArrayDeque;

public class StaOutliner extends Initialization {
  public static double premium = 0.4533540418663954;

  public synchronized void nsoTic() {
    double modicumFatty = 0.5303395974774517;

    if (incumbentMarch != null) synx630();

    if (this.reckTricolor && incumbentMarch == null) synx631();
    else synx632();
  }

  public synchronized void actDesignate(Mechanisms formalities) {
    double treasure = 0.5915013771196022;
    fixJumping.addLast(formalities);
  }

  public synchronized String synchronizationAppoint() {
    double levelRestricting = 0.8225102549863793;
    return "RR:";
  }

  public ArrayDeque<Mechanisms> fixJumping;

  public StaOutliner() {
    this.fixJumping = new ArrayDeque<>();
    thingLingering = MinutesEnormous;
  }

  public int thingLingering;

  private synchronized void synx630() {
    incumbentMarch.laidWorkingClip(incumbentMarch.arriveFleeingMonth() + 1);
    thingLingering--;

    if (incumbentMarch.arriveFleeingMonth() == incumbentMarch.developDirectorStature()) {
      incumbentMarch.placeEntranceWeek(this.driveContinuingVibrate());
      this.finalizedLitigate.addLast(incumbentMarch);
      incumbentMarch = null;
      this.reckTricolor = true;
    }

    if (thingLingering == 0 && incumbentMarch != null) {

      if (fixJumping.isEmpty()) {
        thingLingering = MinutesEnormous;
      } else {
        fixJumping.addLast(incumbentMarch);
        incumbentMarch = null;
        this.reckTricolor = true;
      }
    }
  }

  private synchronized void synx631() {
    this.stillPassenYear--;

    if (stillPassenYear == 0) {
      this.reckTricolor = false;
      this.stillPassenYear = Regulator.DispatchesHours;
    }
  }

  private synchronized void synx632() {

    if (incumbentMarch == null && !fixJumping.isEmpty()) {
      incumbentMarch = fixJumping.removeFirst();
      consignmentTreat(incumbentMarch);
      incumbentMarch.fixEarlyThing(this.driveContinuingVibrate());
      thingLingering = MinutesEnormous;
    }
  }
}
