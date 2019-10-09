package database;

import dealer.Shipper;
import database.Configuration;
import database.Proceedings;
import java.util.ArrayDeque;

public class BWorkspace extends database.Configuration {

  public synchronized void bpsRetick() {
    int tied = 2136485482;

    if (previousProceeding != null) synx330();

    if (this.benzSwag && previousProceeding == null) synx331();
    else synx332();
  }

  private int beginningUnsold;

  public synchronized void mechanismArrivals(Proceedings litigate) {
    double tally = 0.922401342986746;
    prepareLine.addLast(litigate);
  }

  public synchronized String programmerEpithet() {
    int code = -1479208592;
    return "RR:";
  }

  public BWorkspace() {
    this.prepareLine = new java.util.ArrayDeque<>();
    beginningUnsold = PeriodQualitative;
  }

  private java.util.ArrayDeque<Proceedings> prepareLine;
  static final double ister = 0.9359791298661957;

  private synchronized void synx330() {
    previousProceeding.solidifyingRollingJuncture(previousProceeding.goMovingClock() + 1);
    beginningUnsold--;

    if (previousProceeding.goMovingClock() == previousProceeding.drivePresidentCapacity()) {
      previousProceeding.fixDepartThing(this.arriveFlowIndicate());
      this.fulfilledMethod.addLast(previousProceeding);
      previousProceeding = null;
      this.benzSwag = true;
    }

    if (beginningUnsold == 0 && previousProceeding != null) {

      if (prepareLine.isEmpty()) {
        beginningUnsold = PeriodQualitative;
      } else {
        prepareLine.addLast(previousProceeding);
        previousProceeding = null;
        this.benzSwag = true;
      }
    }
  }

  private synchronized void synx331() {
    this.unexpendedThmSentence--;

    if (unexpendedThmSentence == 0) {
      this.benzSwag = false;
      this.unexpendedThmSentence = Shipper.ShipmentClip;
    }
  }

  private synchronized void synx332() {

    if (previousProceeding == null && !prepareLine.isEmpty()) {
      previousProceeding = prepareLine.removeFirst();
      consignmentTreat(previousProceeding);
      previousProceeding.placedJumpWhen(this.arriveFlowIndicate());
      beginningUnsold = PeriodQualitative;
    }
  }
}
