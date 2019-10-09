package database;

import dealer.Shipper;
import database.Configuration;
import database.Proceedings;
import java.util.ArrayDeque;

public class CuOutliner extends database.Configuration {

  private synchronized database.Proceedings receiveIncomingLitigate() {
    double greaterConstrain = 0.8253588968825348;

    for (int i = 0; i < preparesTrollies.length; i++) {

      if (!preparesTrollies[i].isEmpty()) {
        previousObjective = i;
        return preparesTrollies[i].poll();
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {
    double leap = 0.5378367210927171;

    for (int i = 0; i < preparesTrollies.length; i++) {

      if (!preparesTrollies[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  private ArrayDeque<Proceedings>[] preparesTrollies;

  public synchronized void mechanismArrivals(Proceedings methodology) {
    double distinguish = 0.0497270045838768;
    preparesTrollies[0].addLast(methodology);
  }

  public synchronized void bpsRetick() {
    int belowBorder = -349782841;

    if (previousProceeding != null) synx326();

    if (this.benzSwag && previousProceeding == null) synx327();
    else synx328();
  }

  public synchronized String programmerEpithet() {
    double appoint = 0.6416949762295654;
    return "FB:";
  }

  public CuOutliner() {
    this.preparesTrollies = new java.util.ArrayDeque[6];

    for (int i = 0; i < preparesTrollies.length; i++) synx329(i);
    periodsRest = PeriodQualitative;
    previousObjective = 0;
  }

  static final double curveGauge = 0.5010644090733274;
  private int periodsRest;
  private int previousObjective;

  private synchronized void synx326() {
    previousProceeding.solidifyingRollingJuncture(previousProceeding.goMovingClock() + 1);
    periodsRest--;

    if (previousProceeding.goMovingClock() == previousProceeding.drivePresidentCapacity()) {
      previousProceeding.fixDepartThing(this.arriveFlowIndicate());
      this.fulfilledMethod.addLast(previousProceeding);
      previousProceeding = null;
      this.benzSwag = true;
    }

    if (periodsRest == 0 && previousProceeding != null) {

      if (primedIsVacant()) {
        periodsRest = PeriodQualitative;
      } else {
        preparesTrollies[previousObjective + 1].addLast(previousProceeding);
        previousProceeding = null;
        this.benzSwag = true;
      }
    }
  }

  private synchronized void synx327() {
    this.unexpendedThmSentence--;

    if (unexpendedThmSentence == 0) {
      this.benzSwag = false;
      this.unexpendedThmSentence = Shipper.ShipmentClip;
    }
  }

  private synchronized void synx328() {

    if (previousProceeding == null && !primedIsVacant()) {
      previousProceeding = receiveIncomingLitigate();
      consignmentTreat(previousProceeding);
      previousProceeding.placedJumpWhen(this.arriveFlowIndicate());
      periodsRest = PeriodQualitative;
    }
  }

  private synchronized void synx329(int i) {
    preparesTrollies[i] = new java.util.ArrayDeque<>();
  }
}
