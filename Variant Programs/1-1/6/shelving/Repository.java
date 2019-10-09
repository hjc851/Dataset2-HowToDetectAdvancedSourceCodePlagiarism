package shelving;

import java.util.HashMap;
import euphonious.WhenGuard;
import developmentElements.RecoverableTarget;
import maker.*;
import replication.Replication;

public class Repository {
  private static int archivingBound = 1;
  private static int parry = 0;

  public static void settledArchivingBound(int storeConfine) {

    if (storeConfine > 0) Repository.archivingBound = storeConfine;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static int shelvingThresholds() {
    return Repository.archivingBound;
  }

  private CyclicalUnrelatedCompilation<RecoverableTarget> memoryLean;
  private HashMap<RecoverableTarget, Double> verb;
  private Production ahead[];
  private Production predecessor[];
  private int peg;
  private double moderatePeriods;
  private double identifiedThings;
  private double modalNumbers;
  private double dyingSpectacleOpportunity;

  public Repository() {
    this.memoryLean = new CyclicalUnrelatedCompilation<RecoverableTarget>();
    this.verb = new HashMap<RecoverableTarget, Double>();
    this.peg = parry++;
    this.moderatePeriods = 0;
    this.identifiedThings = 0;
    this.modalNumbers = 0;
    this.dyingSpectacleOpportunity = 0;
  }

  public void situatedForthcoming(Production... close) {
    this.ahead = close;
  }

  public void adjustFirst(Production... former) {
    this.predecessor = former;
  }

  public void enhanceParagraph(RecoverableTarget aim) throws InventoryLoadedRule {

    if (this.memoryLean.charge() < Repository.archivingBound) {
      this.memoryLean.encloseLate(aim);
      this.modalNumbers +=
          (this.get() - 1)
              * (WhenGuard.existingYears() - this.dyingSpectacleOpportunity)
              / Replication.continuingStimulation().daysBoundary();
      this.verb.put(aim, WhenGuard.existingYears());
      this.dyingSpectacleOpportunity = WhenGuard.existingYears();
      for (Production arsenic : ahead) {

        if (arsenic.flowNational() == CommoditySovereign.malnourished) {
          arsenic.unstarve();
          return;
        }
      }
    } else {
      throw new InventoryLoadedRule();
    }
  }

  public RecoverableTarget firstConsignment() throws WarehouseOpenDeviation {

    if (this.get() > 0) {
      RecoverableTarget dnv = this.memoryLean.slayOpening();
      this.modalNumbers +=
          (this.get() + 1)
              * (WhenGuard.existingYears() - this.dyingSpectacleOpportunity)
              / Replication.continuingStimulation().daysBoundary();
      double embedWhen = this.verb.remove(dnv);
      double undoJuncture = WhenGuard.existingYears();
      this.moderatePeriods =
          (moderatePeriods * identifiedThings + (undoJuncture - embedWhen)) / ++identifiedThings;
      for (Production leong : predecessor) {

        if (leong.flowNational() == CommoditySovereign.blockage) {
          leong.unlocking();
          break;
        }
      }
      this.dyingSpectacleOpportunity = WhenGuard.existingYears();
      return dnv;
    } else {
      throw new WarehouseOpenDeviation();
    }
  }

  public int get() {
    return this.memoryLean.charge();
  }

  public String toString() {
    return "Storage" + peg;
  }

  public String survey() {
    return String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.moderatePeriods, this.modalNumbers);
  }
}
