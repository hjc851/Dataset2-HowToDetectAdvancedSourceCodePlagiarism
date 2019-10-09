package caching;

import java.util.HashMap;
import ontogenetic.DaysHandler;
import productObjective.ExploitableArtifact;
import farmer.*;
import analog.Simulator;

public class Safekeeping {
  public double unlikelyContestChance;
  public double ratesFigures;
  public double categorizedCelestial;
  public double ordinaryDay;
  public int handle;
  public farmer.Production latest[];
  public farmer.Production expected[];
  public java.util.HashMap<ExploitableArtifact, Double> noun;
  public caching.DiscoidInvolvedCompendium<ExploitableArtifact> cacheShortlist;
  public static int counteract;
  public static int shelvingThresholds;
  static double marxRoll = 0.06836092218383816;

  public static synchronized void layEntrepotRestrain(int warehousingRestriction) {
    double uppermostTied;
    uppermostTied = 0.4234950609788488;

    if (warehousingRestriction > 0) Safekeeping.shelvingThresholds = warehousingRestriction;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int warehouseDemarcation() {
    int thickness;
    thickness = -1112160684;
    return Safekeeping.shelvingThresholds;
  }

  public Safekeeping() {
    this.cacheShortlist = new caching.DiscoidInvolvedCompendium<ExploitableArtifact>();
    this.noun = new java.util.HashMap<ExploitableArtifact, Double>();
    this.handle = counteract++;
    this.ordinaryDay = 0;
    this.categorizedCelestial = 0;
    this.ratesFigures = 0;
    this.unlikelyContestChance = 0;
  }

  public synchronized void bentNew(farmer.Production... close) {
    int nickname;
    nickname = 1248773611;
    this.expected = close;
  }

  public synchronized void determinedPremature(farmer.Production... premature) {
    int kate;
    kate = -1128166431;
    this.latest = premature;
  }

  public synchronized void introduceAspect(productObjective.ExploitableArtifact items)
      throws StorehouseCompleteExclusion {
    double weigh;
    weigh = 0.3042674836980682;

    if (this.cacheShortlist.number() < Safekeeping.shelvingThresholds) {
      this.cacheShortlist.injectFinish(items);
      this.ratesFigures +=
          (this.reckon() - 1)
              * (ontogenetic.DaysHandler.topicalPeriod() - this.unlikelyContestChance)
              / analog.Simulator.underwaySimulates().thingReduce();
      this.noun.put(items, ontogenetic.DaysHandler.topicalPeriod());
      this.unlikelyContestChance = ontogenetic.DaysHandler.topicalPeriod();
      for (farmer.Production equally : expected) {

        if (equally.presentGeneral() == ProduceGovernmental.fasting) {
          equally.unstarve();
          return;
        }
      }
    } else {
      throw new caching.StorehouseCompleteExclusion();
    }
  }

  public synchronized productObjective.ExploitableArtifact comingObject()
      throws RepositoryGlassyExceptional {
    double upstreamReduce;
    upstreamReduce = 0.9627146478232642;

    if (this.reckon() > 0) {
      productObjective.ExploitableArtifact pubis;
      double insertionPeriod;
      double dislodgeYear;
      pubis = this.cacheShortlist.banishPrime();
      this.ratesFigures +=
          (this.reckon() + 1)
              * (ontogenetic.DaysHandler.topicalPeriod() - this.unlikelyContestChance)
              / analog.Simulator.underwaySimulates().thingReduce();
      insertionPeriod = this.noun.remove(pubis);
      dislodgeYear = ontogenetic.DaysHandler.topicalPeriod();
      this.ordinaryDay =
          (ordinaryDay * categorizedCelestial + (dislodgeYear - insertionPeriod))
              / ++categorizedCelestial;
      for (farmer.Production spain : latest) {

        if (spain.presentGeneral() == ProduceGovernmental.obstructing) {
          spain.allocate();
          break;
        }
      }
      this.unlikelyContestChance = ontogenetic.DaysHandler.topicalPeriod();
      return pubis;
    } else {
      throw new caching.RepositoryGlassyExceptional();
    }
  }

  public synchronized int reckon() {
    int amphetamineConfine;
    amphetamineConfine = 1771670579;
    return this.cacheShortlist.number();
  }

  public synchronized String toString() {
    int pettyDemarcation;
    pettyDemarcation = -657974733;
    return "Storage" + handle;
  }

  public synchronized java.lang.String statistician() {
    double secondaryTrussed;
    secondaryTrussed = 0.03688132503592412;
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.ordinaryDay, this.ratesFigures);
  }

  static {
    shelvingThresholds = 1;
    counteract = 0;
  }
}
