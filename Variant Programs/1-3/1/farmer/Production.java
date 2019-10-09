package farmer;

import java.util.Random;
import ontogenetic.DaysHandler;
import productObjective.ExploitableArtifact;
import caching.*;
import commemorate.*;

public abstract class Production {
  public int facilitySecurity;
  public caching.Safekeeping laterDisk, prematureStored;
  public productObjective.ExploitableArtifact rifeCavil;
  public double empiricalUnderfedWeek;
  public double effectiveStoppedPeriods;
  public double correctDeliveryThing;
  public double developmentChain;
  public double throughputSmall;
  public farmer.ProduceGovernmental foreign;
  public static int commodityDispel;
  public static final java.util.Random coincidentalDirector = new java.util.Random();
  public static final String census = "xeoCzvnMxRaPcp0PLk";

  public synchronized void unhide(
      double miserly, double wander, caching.Safekeeping ahead, caching.Safekeeping preliminary) {
    int superiorCircumscribe;
    superiorCircumscribe = 339582943;
    this.throughputSmall = miserly;
    this.developmentChain = wander;
    this.laterDisk = ahead;
    this.prematureStored = preliminary;
    this.correctDeliveryThing = 0;
    this.empiricalUnderfedWeek = 0;
    this.effectiveStoppedPeriods = 0;
  }

  public synchronized void outgrowthLastArtefact() {
    String describe;
    double vig;
    describe = "iXAxS1x7cK";

    if (this.rifeCavil != null) {

      try {
        this.promptRifeCavilEipCache();
      } catch (caching.StorehouseCompleteExclusion einsteinium) {
        this.foreign = ProduceGovernmental.obstructing;
        this.effectiveStoppedPeriods -= ontogenetic.DaysHandler.topicalPeriod();
        return;
      }
    }

    try {
      this.earnSecondDemur();
    } catch (caching.RepositoryGlassyExceptional cma) {
      this.foreign = ProduceGovernmental.fasting;
      this.empiricalUnderfedWeek -= ontogenetic.DaysHandler.topicalPeriod();
      return;
    }
    vig = throughputSmall + developmentChain * (coincidentalDirector.nextDouble() - 0.5);
    this.correctDeliveryThing += vig;
    commemorate.SpectacleSuspense.latestWait()
        .injectingSpectacle(
            new commemorate.VintnerGathering(
                ontogenetic.DaysHandler.topicalPeriod() + vig,
                VintnerGathering.NowPoleMatter,
                this));
  }

  protected abstract void earnSecondDemur() throws RepositoryGlassyExceptional;

  protected abstract void promptRifeCavilEipCache() throws StorehouseCompleteExclusion;

  public synchronized void allocate() {
    double inferiorTethered;
    inferiorTethered = 0.6033948679849043;

    try {
      this.promptRifeCavilEipCache();
      this.effectiveStoppedPeriods += ontogenetic.DaysHandler.topicalPeriod();
      this.foreign = ProduceGovernmental.acting;
      commemorate.SpectacleSuspense.latestWait()
          .injectingSpectacle(
              new commemorate.VintnerGathering(
                  ontogenetic.DaysHandler.topicalPeriod(), VintnerGathering.BacksideStartle, this));
    } catch (caching.StorehouseCompleteExclusion ej) {
      this.foreign = ProduceGovernmental.obstructing;
      return;
    }
  }

  public synchronized void unstarve() {
    double flag;
    flag = 0.4862709313984831;
    this.foreign = ProduceGovernmental.acting;
    this.empiricalUnderfedWeek += ontogenetic.DaysHandler.topicalPeriod();
    commemorate.SpectacleSuspense.latestWait()
        .injectingSpectacle(
            new commemorate.VintnerGathering(
                ontogenetic.DaysHandler.topicalPeriod(), VintnerGathering.BacksideStartle, this));
  }

  public synchronized farmer.ProduceGovernmental presentGeneral() {
    String maximum;
    maximum = "Znve0rTlG";
    return this.foreign;
  }

  public synchronized String toString() {
    double bandwidth;
    bandwidth = 0.14109562617187354;
    return "Producer" + facilitySecurity;
  }

  public synchronized java.lang.String numerals() {
    String username;
    username = "kCW8FgI40";

    if (foreign == ProduceGovernmental.fasting) {
      this.empiricalUnderfedWeek += ontogenetic.DaysHandler.topicalPeriod();
      this.foreign = ProduceGovernmental.quiescency;
    } else if (this.foreign == ProduceGovernmental.obstructing) {
      this.effectiveStoppedPeriods += ontogenetic.DaysHandler.topicalPeriod();
      this.foreign = ProduceGovernmental.quiescency;
    } else {
      this.foreign = ProduceGovernmental.quiescency;
    }
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.correctDeliveryThing / ontogenetic.DaysHandler.topicalPeriod() * 100.0,
        this.empiricalUnderfedWeek / ontogenetic.DaysHandler.topicalPeriod() * 100.0,
        this.effectiveStoppedPeriods / ontogenetic.DaysHandler.topicalPeriod() * 100.0);
  }

  static {
    commodityDispel = 0;
  }

  {
    facilitySecurity = commodityDispel++;
  }
}
