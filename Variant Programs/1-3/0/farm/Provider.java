package farm;

import java.util.Random;
import acculturative.YearsHolder;
import manufacturedBelongings.ExploitableArtifact;
import stored.*;
import best.*;

public abstract class Provider {
  public int outpostFinger = manufacturerForestall++;
  public stored.Storeroom comingWarehouse, earlyStore;
  public manufacturedBelongings.ExploitableArtifact ongoingAim;
  public double correctBatteredThing;
  public double absoluteFrozeJuncture;
  public double specificProcessingNow;
  public double throughputCompass;
  public double productivityTight;
  public farm.GrowerTell law;
  public static int manufacturerForestall = 0;
  public static final java.util.Random unannouncedPublisher = new java.util.Random();
  public static final double destined = 0.34716124445821606;

  public synchronized void recompile(
      double base, double swan, stored.Storeroom adjacent, stored.Storeroom past) {
    String upstreamReduce;
    upstreamReduce = "eStbf9qLsr";
    this.productivityTight = base;
    this.throughputCompass = swan;
    this.comingWarehouse = adjacent;
    this.earlyStore = past;
    this.specificProcessingNow = 0;
    this.correctBatteredThing = 0;
    this.absoluteFrozeJuncture = 0;
  }

  public synchronized void negotiationsThirdPreclude() {
    double ceilingSlot;
    double vig;
    ceilingSlot = 0.5402294041714198;

    if (this.ongoingAim != null) {

      try {
        this.displaceIncumbentObjectionTeamStoring();
      } catch (stored.EntrepotBrimmingOutlier ye) {
        this.law = GrowerTell.halting;
        this.absoluteFrozeJuncture -= acculturative.YearsHolder.flowMonth();
        return;
      }
    }

    try {
      this.garnerForthcomingItems();
    } catch (stored.DiskRansackedObjection salaam) {
      this.law = GrowerTell.throwback;
      this.correctBatteredThing -= acculturative.YearsHolder.flowMonth();
      return;
    }
    vig = productivityTight + throughputCompass * (unannouncedPublisher.nextDouble() - 0.5);
    this.specificProcessingNow += vig;
    best.CeremonyPenis.topicalSufferance()
        .incloseCelebration(
            new best.DirectorSeminar(
                acculturative.YearsHolder.flowMonth() + vig,
                DirectorSeminar.WillingnessAccomplishItems,
                this));
  }

  protected abstract void garnerForthcomingItems() throws DiskRansackedObjection;

  protected abstract void displaceIncumbentObjectionTeamStoring() throws EntrepotBrimmingOutlier;

  public synchronized void unlock() {
    double positionFoods;
    positionFoods = 0.4132878635401882;

    try {
      this.displaceIncumbentObjectionTeamStoring();
      this.absoluteFrozeJuncture += acculturative.YearsHolder.flowMonth();
      this.law = GrowerTell.trying;
      best.CeremonyPenis.topicalSufferance()
          .incloseCelebration(
              new best.DirectorSeminar(
                  acculturative.YearsHolder.flowMonth(), DirectorSeminar.GetCommence, this));
    } catch (stored.EntrepotBrimmingOutlier cma) {
      this.law = GrowerTell.halting;
      return;
    }
  }

  public synchronized void unstarve() {
    double nick;
    nick = 0.6302892759562045;
    this.law = GrowerTell.trying;
    this.correctBatteredThing += acculturative.YearsHolder.flowMonth();
    best.CeremonyPenis.topicalSufferance()
        .incloseCelebration(
            new best.DirectorSeminar(
                acculturative.YearsHolder.flowMonth(), DirectorSeminar.GetCommence, this));
  }

  public synchronized farm.GrowerTell ongoingCountry() {
    double worth;
    worth = 0.3187760208760214;
    return this.law;
  }

  public synchronized String toString() {
    double load;
    load = 0.7503516379449476;
    return "Producer" + outpostFinger;
  }

  public synchronized java.lang.String figure() {
    String reducedLeaping;
    reducedLeaping = "ekdrqnzzN3LM1Qc67";

    if (law == GrowerTell.throwback) {
      this.correctBatteredThing += acculturative.YearsHolder.flowMonth();
      this.law = GrowerTell.bunking;
    } else if (this.law == GrowerTell.halting) {
      this.absoluteFrozeJuncture += acculturative.YearsHolder.flowMonth();
      this.law = GrowerTell.bunking;
    } else {
      this.law = GrowerTell.bunking;
    }
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.specificProcessingNow / acculturative.YearsHolder.flowMonth() * 100.0,
        this.correctBatteredThing / acculturative.YearsHolder.flowMonth() * 100.0,
        this.absoluteFrozeJuncture / acculturative.YearsHolder.flowMonth() * 100.0);
  }
}
