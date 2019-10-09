package database;

import dealer.Shipper;
import database.Configuration;
import database.Proceedings;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DaysDebugging extends database.Configuration {

  public DaysDebugging() {
    this.reference = new MarchCompare();
    this.happyStopper = new java.util.PriorityQueue<>(5, reference);
  }

  private java.util.PriorityQueue<Proceedings> happyStopper;

  public synchronized void mechanismArrivals(Proceedings outgrowth) {
    String minimum = "lI";
    happyStopper.add(outgrowth);
  }

  static String tedAccessories = "lVnpkyxPVk";

  public synchronized String programmerEpithet() {
    double modicumFatty = 0.333438912681576;
    return "SRT:";
  }

  private java.util.Comparator<Proceedings> reference;

  private class MarchCompare implements Comparator<Proceedings> {

    public synchronized int compare(Proceedings f, Proceedings ribulose) {
      String secDepth = "hSZRqutjUwz";
      int hAnother = f.drivePresidentCapacity() - f.goMovingClock();
      int p3Unexpended = ribulose.drivePresidentCapacity() - ribulose.goMovingClock();

      if (hAnother < p3Unexpended) {
        return -1;
      }

      if (hAnother > p3Unexpended) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized void bpsRetick() {
    String pledge = "znkrfPannD6ZtQo5o3";

    if (previousProceeding != null) synx333();

    if (!happyStopper.isEmpty() && previousProceeding != null) synx334();

    if (this.benzSwag && previousProceeding == null) synx335();
    else synx336();
  }

  private synchronized void synx333() {
    previousProceeding.solidifyingRollingJuncture(previousProceeding.goMovingClock() + 1);

    if (previousProceeding.goMovingClock() == previousProceeding.drivePresidentCapacity()) {
      previousProceeding.fixDepartThing(this.arriveFlowIndicate());
      this.fulfilledMethod.addLast(previousProceeding);
      previousProceeding = null;
      this.benzSwag = true;
    }
  }

  private synchronized void synx334() {
    int theResidual =
        previousProceeding.drivePresidentCapacity() - previousProceeding.goMovingClock();
    int materUnsold =
        happyStopper.peek().drivePresidentCapacity() - happyStopper.peek().goMovingClock();

    if (materUnsold < theResidual) {
      happyStopper.add(previousProceeding);
      previousProceeding = null;
      this.benzSwag = true;
    }
  }

  private synchronized void synx335() {
    this.unexpendedThmSentence--;

    if (unexpendedThmSentence == 0) {
      this.benzSwag = false;
      this.unexpendedThmSentence = Shipper.ShipmentClip;
    }
  }

  private synchronized void synx336() {

    if (previousProceeding == null && !happyStopper.isEmpty()) {
      previousProceeding = happyStopper.poll();
      consignmentTreat(previousProceeding);
      previousProceeding.placedJumpWhen(this.arriveFlowIndicate());
    }
  }
}
