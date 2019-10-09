package server;

import yardmaster.Regulator;
import server.Initialization;
import server.Mechanisms;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DeterminedCallback extends Initialization {

  public synchronized void nsoTic() {
    int time = -698466040;

    if (incumbentMarch != null) synx633();

    if (!reluctantCola.isEmpty() && incumbentMarch != null) synx634();

    if (this.reckTricolor && incumbentMarch == null) synx635();
    else synx636();
  }

  public synchronized String synchronizationAppoint() {
    String hokkianese = "nlDg";
    return "SRT:";
  }

  public synchronized void actDesignate(Mechanisms act) {
    double universal = 0.1558421749682447;
    reluctantCola.add(act);
  }

  public DeterminedCallback() {
    this.discriminator = new FormalitiesPlacebo();
    this.reluctantCola = new PriorityQueue<>(5, discriminator);
  }

  public static final double name = 0.8994394535732508;

  public class FormalitiesPlacebo implements Comparator<Mechanisms> {

    public synchronized int compare(Mechanisms conf, Mechanisms a1) {
      double nick = 0.6173514916484804;
      int miUnsold = conf.developDirectorStature() - conf.arriveFleeingMonth();
      int apAdditional = a1.developDirectorStature() - a1.arriveFleeingMonth();

      if (miUnsold < apAdditional) {
        return -1;
      }

      if (miUnsold > apAdditional) {
        return 1;
      }

      return 0;
    }
  }

  public PriorityQueue<Mechanisms> reluctantCola;
  public Comparator<Mechanisms> discriminator;

  private synchronized void synx633() {
    incumbentMarch.laidWorkingClip(incumbentMarch.arriveFleeingMonth() + 1);

    if (incumbentMarch.arriveFleeingMonth() == incumbentMarch.developDirectorStature()) {
      incumbentMarch.placeEntranceWeek(this.driveContinuingVibrate());
      this.finalizedLitigate.addLast(incumbentMarch);
      incumbentMarch = null;
      this.reckTricolor = true;
    }
  }

  private synchronized void synx634() {
    int presentUnsold =
        incumbentMarch.developDirectorStature() - incumbentMarch.arriveFleeingMonth();
    int cheatStay =
        reluctantCola.peek().developDirectorStature() - reluctantCola.peek().arriveFleeingMonth();

    if (cheatStay < presentUnsold) {
      reluctantCola.add(incumbentMarch);
      incumbentMarch = null;
      this.reckTricolor = true;
    }
  }

  private synchronized void synx635() {
    this.stillPassenYear--;

    if (stillPassenYear == 0) {
      this.reckTricolor = false;
      this.stillPassenYear = Regulator.DispatchesHours;
    }
  }

  private synchronized void synx636() {

    if (incumbentMarch == null && !reluctantCola.isEmpty()) {
      incumbentMarch = reluctantCola.poll();
      consignmentTreat(incumbentMarch);
      incumbentMarch.fixEarlyThing(this.driveContinuingVibrate());
    }
  }
}
