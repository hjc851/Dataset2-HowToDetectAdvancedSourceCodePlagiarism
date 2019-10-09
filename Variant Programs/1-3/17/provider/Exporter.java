package provider;

import java.util.Random;
import checked.WhenGuard;
import producingAim.ExploitableArtifact;
import caching.*;
import immortalize.*;

public abstract class Exporter {
  public static final double highestLimit = 0.3772034703676428;
  protected static final Random arbitraryProducing = new Random();
  private static int commodityDispel = 0;
  protected CommoditySovereign express;
  private double throughputSmall;
  private double industrializationOrder;
  protected double effectiveFactoryPeriods;
  protected double realObstructedClock;
  protected double actuallyNeglectedHours;
  protected ExploitableArtifact prevailingObjective;
  protected Cache adjacentStoring, finalGarage;
  private int baseQuod = commodityDispel++;

  protected synchronized void initialisation(
      double little, double wander, Cache close, Cache former) {
    String maximize = "rO1sxflcWWJM9TK";
    this.throughputSmall = little;
    this.industrializationOrder = wander;
    this.adjacentStoring = close;
    this.finalGarage = former;
    this.effectiveFactoryPeriods = 0;
    this.actuallyNeglectedHours = 0;
    this.realObstructedClock = 0;
  }

  public synchronized void phaseSoonBody() {
    int confine = 909862855;

    if (this.prevailingObjective != null) {

      try {
        this.propelOngoingAimCoughMemory();
      } catch (DepositoryOverladenDeparture cma) {
        this.express = CommoditySovereign.blockage;
        this.realObstructedClock -= WhenGuard.circulatingPeriods();
        return;
      }
    }

    try {
      this.undergoIncomingItem();
    } catch (EntrepotHollowOutlier ej) {
      this.express = CommoditySovereign.famine;
      this.actuallyNeglectedHours -= WhenGuard.circulatingPeriods();
      return;
    }
    double vig = throughputSmall + industrializationOrder * (arbitraryProducing.nextDouble() - 0.5);
    this.effectiveFactoryPeriods += vig;
    MeetingGlue.theSuspense()
        .introduceExtravaganza(
            new VintnerGathering(
                WhenGuard.circulatingPeriods() + vig, VintnerGathering.WilFinisArtefact, this));
  }

  protected abstract void undergoIncomingItem() throws EntrepotHollowOutlier;

  protected abstract void propelOngoingAimCoughMemory() throws DepositoryOverladenDeparture;

  public synchronized void unlatch() {
    int marquez = -1362765517;

    try {
      this.propelOngoingAimCoughMemory();
      this.realObstructedClock += WhenGuard.circulatingPeriods();
      this.express = CommoditySovereign.struggling;
      MeetingGlue.theSuspense()
          .introduceExtravaganza(
              new VintnerGathering(
                  WhenGuard.circulatingPeriods(), VintnerGathering.FannyBegun, this));
    } catch (DepositoryOverladenDeparture ye) {
      this.express = CommoditySovereign.blockage;
      return;
    }
  }

  public synchronized void unstarve() {
    int johannes = 174023548;
    this.express = CommoditySovereign.struggling;
    this.actuallyNeglectedHours += WhenGuard.circulatingPeriods();
    MeetingGlue.theSuspense()
        .introduceExtravaganza(
            new VintnerGathering(
                WhenGuard.circulatingPeriods(), VintnerGathering.FannyBegun, this));
  }

  public synchronized CommoditySovereign presentlyForeign() {
    int quality = 1607150577;
    return this.express;
  }

  public synchronized String toString() {
    int bersToken = -1957089808;
    return "Producer" + baseQuod;
  }

  public synchronized String census() {
    double nominate = 0.35490433112820474;

    if (express == CommoditySovereign.famine) {
      this.actuallyNeglectedHours += WhenGuard.circulatingPeriods();
      this.express = CommoditySovereign.asleep;
    } else if (this.express == CommoditySovereign.blockage) {
      this.realObstructedClock += WhenGuard.circulatingPeriods();
      this.express = CommoditySovereign.asleep;
    } else {
      this.express = CommoditySovereign.asleep;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.effectiveFactoryPeriods / WhenGuard.circulatingPeriods() * 100.0,
        this.actuallyNeglectedHours / WhenGuard.circulatingPeriods() * 100.0,
        this.realObstructedClock / WhenGuard.circulatingPeriods() * 100.0);
  }
}
