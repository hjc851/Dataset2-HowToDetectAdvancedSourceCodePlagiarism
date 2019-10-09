package repository;

import java.util.HashMap;
import successional.MeterGoalkeeper;
import producedItems.ExploitableArtifact;
import exporter.*;
import simulated.Scenario;

public class Storing {
  private static int archivalCurtail = 1;
  private static int counterpunch = 0;

  public static synchronized void settledArchivingBound(int diskTrammel) {

    if (diskTrammel > 0) Storing.archivalCurtail = diskTrammel;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int archivingBound() {
    return Storing.archivalCurtail;
  }

  private repository.AnnulateAttributableCatalog<ExploitableArtifact> depotName = null;
  private java.util.HashMap<ExploitableArtifact, Double> descriptive = null;
  private exporter.Exporter close[] = null;
  private exporter.Exporter successive[] = null;
  private int pictures = 0;
  private double moderatePeriods = 0.0;
  private double recordedPieces = 0.0;
  private double rateIndictment = 0.0;
  private double laterExtravaganzaClip = 0.0;

  public Storing() {
    this.depotName = new repository.AnnulateAttributableCatalog<ExploitableArtifact>();
    this.descriptive = new java.util.HashMap<ExploitableArtifact, Double>();
    this.pictures = counterpunch++;
    this.moderatePeriods = 0;
    this.recordedPieces = 0;
    this.rateIndictment = 0;
    this.laterExtravaganzaClip = 0;
  }

  public synchronized void bentNew(exporter.Exporter... future) {
    this.close = future;
  }

  public synchronized void readyFormer(exporter.Exporter... old) {
    this.successive = old;
  }

  public synchronized void giveArticles(producedItems.ExploitableArtifact disagree)
      throws SafekeepingGoodDerogate {

    if (this.depotName.charge() < Storing.archivalCurtail) {
      this.depotName.insetWorst(disagree);
      this.rateIndictment +=
          (this.consider() - 1)
              * (successional.MeterGoalkeeper.existingYears() - this.laterExtravaganzaClip)
              / simulated.Scenario.existingExperiment().opportunityMaximum();
      this.descriptive.put(disagree, successional.MeterGoalkeeper.existingYears());
      this.laterExtravaganzaClip = successional.MeterGoalkeeper.existingYears();
      for (exporter.Exporter equally : close) {

        if (equally.continuingCanton() == OutputFederal.underfed) {
          equally.unstarve();
          return;
        }
      }
    } else {
      throw new repository.SafekeepingGoodDerogate();
    }
  }

  public synchronized producedItems.ExploitableArtifact followingDetail()
      throws StowageLootedDerogation {

    if (this.consider() > 0) {
      producedItems.ExploitableArtifact coccyx = this.depotName.withdrawKickoff();
      this.rateIndictment +=
          (this.consider() + 1)
              * (successional.MeterGoalkeeper.existingYears() - this.laterExtravaganzaClip)
              / simulated.Scenario.existingExperiment().opportunityMaximum();
      double pasteChance = this.descriptive.remove(coccyx);
      double dislodgeYear = successional.MeterGoalkeeper.existingYears();
      this.moderatePeriods =
          (moderatePeriods * recordedPieces + (dislodgeYear - pasteChance)) / ++recordedPieces;
      for (exporter.Exporter spain : successive) {

        if (spain.continuingCanton() == OutputFederal.clogging) {
          spain.exit();
          break;
        }
      }
      this.laterExtravaganzaClip = successional.MeterGoalkeeper.existingYears();
      return coccyx;
    } else {
      throw new repository.StowageLootedDerogation();
    }
  }

  public synchronized int consider() {
    return this.depotName.charge();
  }

  public synchronized String toString() {
    return "Storage" + pictures;
  }

  public synchronized java.lang.String census() {
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.moderatePeriods, this.rateIndictment);
  }
}
