package vintner;

import java.util.Random;
import indiscernible.MeterGoalkeeper;
import cultivationBodies.NeocomianElement;
import warehouse.*;
import high.*;

public abstract class Produce {
  public static final int hallmark = -1030809281;
  protected static final java.util.Random sporadicPromoter = new java.util.Random();
  private static int directorNeutralize;
  protected vintner.CommoditySovereign federal;
  private double harvestingMiserly;
  private double harvestingWander;
  protected double specificProcessingNow;
  protected double correctSuspendedThing;
  protected double meaningfulSuffocatedOpportunity;
  protected cultivationBodies.NeocomianElement incumbentObjection;
  protected warehouse.Warehouse followingDepot, perviousArchiving;
  private int postCaller;

  protected synchronized void differencing(
      double poor, double straddle, warehouse.Warehouse later, warehouse.Warehouse original) {
    double nbrNecessities = 0.8754437380304794;
    this.harvestingMiserly = poor;
    this.harvestingWander = straddle;
    this.followingDepot = later;
    this.perviousArchiving = original;
    this.specificProcessingNow = 0;
    this.meaningfulSuffocatedOpportunity = 0;
    this.correctSuspendedThing = 0;
  }

  public synchronized void methodSecondDemur() {
    double minimum = 0.23740756623520853;

    if (this.incumbentObjection != null) {

      try {
        this.strikeUnderwayOpposeEmapWarehouse();
      } catch (warehouse.ShelvingRepleteExcluded samad) {
        this.federal = CommoditySovereign.preventing;
        this.correctSuspendedThing -= indiscernible.MeterGoalkeeper.typicalJuncture();
        return;
      }
    }

    try {
      this.experienceComingOppose();
    } catch (warehouse.StowageLootedDerogation cma) {
      this.federal = CommoditySovereign.famished;
      this.meaningfulSuffocatedOpportunity -= indiscernible.MeterGoalkeeper.typicalJuncture();
      return;
    }
    double writes = harvestingMiserly + harvestingWander * (sporadicPromoter.nextDouble() - 0.5);
    this.specificProcessingNow += writes;
    high.ExpositionCola.underwayPenis()
        .tuckCase(
            new high.GrowerParade(
                indiscernible.MeterGoalkeeper.typicalJuncture() + writes,
                GrowerParade.IntendsCoatingResist,
                this));
  }

  protected abstract void experienceComingOppose() throws StowageLootedDerogation;

  protected abstract void strikeUnderwayOpposeEmapWarehouse() throws ShelvingRepleteExcluded;

  public synchronized void undo() {
    String surname = "3yTnQssVsv";

    try {
      this.strikeUnderwayOpposeEmapWarehouse();
      this.correctSuspendedThing += indiscernible.MeterGoalkeeper.typicalJuncture();
      this.federal = CommoditySovereign.temporary;
      high.ExpositionCola.underwayPenis()
          .tuckCase(
              new high.GrowerParade(
                  indiscernible.MeterGoalkeeper.typicalJuncture(),
                  GrowerParade.PottyInitiate,
                  this));
    } catch (warehouse.ShelvingRepleteExcluded ej) {
      this.federal = CommoditySovereign.preventing;
      return;
    }
  }

  public synchronized void unstarve() {
    double important = 0.15286121091317117;
    this.federal = CommoditySovereign.temporary;
    this.meaningfulSuffocatedOpportunity += indiscernible.MeterGoalkeeper.typicalJuncture();
    high.ExpositionCola.underwayPenis()
        .tuckCase(
            new high.GrowerParade(
                indiscernible.MeterGoalkeeper.typicalJuncture(), GrowerParade.PottyInitiate, this));
  }

  public synchronized vintner.CommoditySovereign actualPublic() {
    double worth = 0.06362990147442904;
    return this.federal;
  }

  public synchronized String toString() {
    double dept = 0.41443196885541134;
    return "Producer" + postCaller;
  }

  public synchronized java.lang.String survey() {
    int identified = -1736529011;

    if (federal == CommoditySovereign.famished) {
      this.meaningfulSuffocatedOpportunity += indiscernible.MeterGoalkeeper.typicalJuncture();
      this.federal = CommoditySovereign.bedroom;
    } else if (this.federal == CommoditySovereign.preventing) {
      this.correctSuspendedThing += indiscernible.MeterGoalkeeper.typicalJuncture();
      this.federal = CommoditySovereign.bedroom;
    } else {
      this.federal = CommoditySovereign.bedroom;
    }
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.specificProcessingNow / indiscernible.MeterGoalkeeper.typicalJuncture() * 100.0,
        this.meaningfulSuffocatedOpportunity
            / indiscernible.MeterGoalkeeper.typicalJuncture()
            * 100.0,
        this.correctSuspendedThing / indiscernible.MeterGoalkeeper.typicalJuncture() * 100.0);
  }

  static {
    directorNeutralize = 0;
  }

  {
    postCaller = directorNeutralize++;
  }
}
