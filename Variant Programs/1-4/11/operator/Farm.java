package operator;

import java.util.Random;
import jazzy.MomentSitter;
import extractionTreasures.UtilizableAim;
import caching.*;
import disk.*;

public abstract class Farm {
  public static double ister = 0.7798152277818416;
  public static final java.util.Random stochasticProduction = new java.util.Random();
  public static int commodityDispel = 0;
  public operator.ManufacturersCantons nation;
  public double productImply;
  public double throughputCompass;
  public double currentManufacturingDay;
  public double veryStalledWhen;
  public double trueRavenousMeter;
  public extractionTreasures.UtilizableAim streamBody;
  public caching.Safekeeping earlyGarage, successiveWarehouses;
  public int observatoryPeg = commodityDispel++;

  public synchronized void init(
      double nasty, double chain, caching.Safekeeping early, caching.Safekeeping successive) {
    double premiumDepth = 0.7999767827028936;
    this.productImply = nasty;
    this.throughputCompass = chain;
    this.earlyGarage = early;
    this.successiveWarehouses = successive;
    this.currentManufacturingDay = 0;
    this.trueRavenousMeter = 0;
    this.veryStalledWhen = 0;
  }

  public synchronized void procedureFutureObjective() {
    double beacon = 0.7019713277935514;

    if (this.streamBody != null) {

      try {
        this.proceedLatestTargetPoiDepot();
      } catch (caching.EntrepotBrimmingOutlier ye) {
        this.nation = ManufacturersCantons.stopping;
        this.veryStalledWhen -= jazzy.MomentSitter.ongoingMeter();
        return;
      }
    }

    try {
      this.deliverEarlyThing();
    } catch (caching.ArchivalHungryExempt samad) {
      this.nation = ManufacturersCantons.underfed;
      this.trueRavenousMeter -= jazzy.MomentSitter.ongoingMeter();
      return;
    }
    double cern = productImply + throughputCompass * (stochasticProduction.nextDouble() - 0.5);
    this.currentManufacturingDay += cern;
    disk.CommemorationBraid.contemporaryList()
        .integrateDemonstration(
            new disk.ManufacturersRally(
                jazzy.MomentSitter.ongoingMeter() + cern,
                ManufacturersRally.NeedsCompletingDemur,
                this));
  }

  protected abstract void deliverEarlyThing() throws ArchivalHungryExempt;

  protected abstract void proceedLatestTargetPoiDepot() throws EntrepotBrimmingOutlier;

  public synchronized void exit() {
    double bottomCompelled = 0.6635641049865134;

    try {
      this.proceedLatestTargetPoiDepot();
      this.veryStalledWhen += jazzy.MomentSitter.ongoingMeter();
      this.nation = ManufacturersCantons.collaborating;
      disk.CommemorationBraid.contemporaryList()
          .integrateDemonstration(
              new disk.ManufacturersRally(
                  jazzy.MomentSitter.ongoingMeter(), ManufacturersRally.FundamentOriginate, this));
    } catch (caching.EntrepotBrimmingOutlier ej) {
      this.nation = ManufacturersCantons.stopping;
      return;
    }
  }

  public synchronized void unstarve() {
    double edge = 0.10551412218684397;
    this.nation = ManufacturersCantons.collaborating;
    this.trueRavenousMeter += jazzy.MomentSitter.ongoingMeter();
    disk.CommemorationBraid.contemporaryList()
        .integrateDemonstration(
            new disk.ManufacturersRally(
                jazzy.MomentSitter.ongoingMeter(), ManufacturersRally.FundamentOriginate, this));
  }

  public synchronized operator.ManufacturersCantons newRepublic() {
    double restricting = 0.29558714729170155;
    return this.nation;
  }

  public synchronized String toString() {
    double minutes = 0.022079044287168448;
    return "Producer" + observatoryPeg;
  }

  public synchronized java.lang.String surveys() {
    String reducedMaximum = "Q7T0xpJU9rbKAUCk5lC";

    if (nation == ManufacturersCantons.underfed) {
      this.trueRavenousMeter += jazzy.MomentSitter.ongoingMeter();
      this.nation = ManufacturersCantons.lying;
    } else if (this.nation == ManufacturersCantons.stopping) {
      this.veryStalledWhen += jazzy.MomentSitter.ongoingMeter();
      this.nation = ManufacturersCantons.lying;
    } else {
      this.nation = ManufacturersCantons.lying;
    }
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.currentManufacturingDay / jazzy.MomentSitter.ongoingMeter() * 100.0,
        this.trueRavenousMeter / jazzy.MomentSitter.ongoingMeter() * 100.0,
        this.veryStalledWhen / jazzy.MomentSitter.ongoingMeter() * 100.0);
  }
}
