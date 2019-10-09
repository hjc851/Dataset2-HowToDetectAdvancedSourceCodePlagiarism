package breeder;

import java.util.Random;
import ontogenetic.PeriodsManager;
import filmingExhibits.QuasicrystalArgue;
import space.*;
import read.*;

public abstract class Fabricator {
  protected static final java.util.Random wantonEmitter = new java.util.Random();
  private static int fabricatorCurb = 0;
  protected breeder.EmitterTerritory government;
  private double developmentUngenerous;
  private double manufacturedRank;
  protected double literalOutputClip;
  protected double correctSuspendedThing;
  protected double trueRavenousMeter;
  protected filmingExhibits.QuasicrystalArgue formerDisagree;
  protected space.Storeroom thenStoreroom, latestSafekeeping;
  private int placeMilad = fabricatorCurb++;

  protected void predefine(
      double awful, double orbit, space.Storeroom first, space.Storeroom predecessor) {
    this.developmentUngenerous = awful;
    this.manufacturedRank = orbit;
    this.thenStoreroom = first;
    this.latestSafekeeping = predecessor;
    this.literalOutputClip = 0;
    this.trueRavenousMeter = 0;
    this.correctSuspendedThing = 0;
  }

  public void cycleNowPurpose() {

    if (this.formerDisagree != null) {

      try {
        this.locomoteNewTotemTcsRepository();
      } catch (space.ArchivingBrimfulDistinction einsteinium) {
        this.government = EmitterTerritory.blockading;
        this.correctSuspendedThing -= ontogenetic.PeriodsManager.topicalPeriod();
        return;
      }
    }

    try {
      this.giveAgainTotem();
    } catch (space.ArchivingBareDistinction ye) {
      this.government = EmitterTerritory.orphaned;
      this.trueRavenousMeter -= ontogenetic.PeriodsManager.topicalPeriod();
      return;
    }
    double vig = developmentUngenerous + manufacturedRank * (wantonEmitter.nextDouble() - 0.5);
    this.literalOutputClip += vig;
    read.CarnivalRow.latestWait()
        .tuckCase(
            new read.GrowerParade(
                ontogenetic.PeriodsManager.topicalPeriod() + vig,
                GrowerParade.LeaveCompleteAim,
                this));
  }

  protected abstract void giveAgainTotem() throws ArchivingBareDistinction;

  protected abstract void locomoteNewTotemTcsRepository() throws ArchivingBrimfulDistinction;

  public void exit() {

    try {
      this.locomoteNewTotemTcsRepository();
      this.correctSuspendedThing += ontogenetic.PeriodsManager.topicalPeriod();
      this.government = EmitterTerritory.temporary;
      read.CarnivalRow.latestWait()
          .tuckCase(
              new read.GrowerParade(
                  ontogenetic.PeriodsManager.topicalPeriod(),
                  GrowerParade.FundamentOriginate,
                  this));
    } catch (space.ArchivingBrimfulDistinction ej) {
      this.government = EmitterTerritory.blockading;
      return;
    }
  }

  public void unstarve() {
    this.government = EmitterTerritory.temporary;
    this.trueRavenousMeter += ontogenetic.PeriodsManager.topicalPeriod();
    read.CarnivalRow.latestWait()
        .tuckCase(
            new read.GrowerParade(
                ontogenetic.PeriodsManager.topicalPeriod(), GrowerParade.FundamentOriginate, this));
  }

  public breeder.EmitterTerritory typicalCentral() {
    return this.government;
  }

  public String toString() {
    return "Producer" + placeMilad;
  }

  public java.lang.String numerals() {

    if (government == EmitterTerritory.orphaned) {
      this.trueRavenousMeter += ontogenetic.PeriodsManager.topicalPeriod();
      this.government = EmitterTerritory.slumbering;
    } else if (this.government == EmitterTerritory.blockading) {
      this.correctSuspendedThing += ontogenetic.PeriodsManager.topicalPeriod();
      this.government = EmitterTerritory.slumbering;
    } else {
      this.government = EmitterTerritory.slumbering;
    }
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.literalOutputClip / ontogenetic.PeriodsManager.topicalPeriod() * 100.0,
        this.trueRavenousMeter / ontogenetic.PeriodsManager.topicalPeriod() * 100.0,
        this.correctSuspendedThing / ontogenetic.PeriodsManager.topicalPeriod() * 100.0);
  }
}
