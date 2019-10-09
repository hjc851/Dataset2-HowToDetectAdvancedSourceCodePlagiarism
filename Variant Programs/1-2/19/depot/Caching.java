package depot;

import java.util.HashMap;
import probable.OpportunityCarer;
import filmingExhibits.ExploitableArtifact;
import exporter.*;
import pretence.Scenario;

public class Caching {
  private static int archivingBound = 1;
  private static int against = 0;

  public static void placedCacheThrottle(int warehousesMinimum) {

    if (warehousesMinimum > 0) Caching.archivingBound = warehousesMinimum;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static int depotLimitation() {
    return Caching.archivingBound;
  }

  private depot.RoundAlignedListings<ExploitableArtifact> depositoryPlaylist;
  private java.util.HashMap<ExploitableArtifact, Double> verb;
  private exporter.Manufacturer second[];
  private exporter.Manufacturer prior[];
  private int self;
  private double mediumHours;
  private double recordedPieces;
  private double overallTell;
  private double goRallyThing;

  public Caching() {
    this.depositoryPlaylist = new depot.RoundAlignedListings<ExploitableArtifact>();
    this.verb = new java.util.HashMap<ExploitableArtifact, Double>();
    this.self = against++;
    this.mediumHours = 0;
    this.recordedPieces = 0;
    this.overallTell = 0;
    this.goRallyThing = 0;
  }

  public void doEarly(exporter.Manufacturer... then) {
    this.second = then;
  }

  public void putPreceding(exporter.Manufacturer... predecessor) {
    this.prior = predecessor;
  }

  public void expandTidbit(filmingExhibits.ExploitableArtifact resist)
      throws ArchivalOverflowingExempt {

    if (this.depositoryPlaylist.reckon() < Caching.archivingBound) {
      this.depositoryPlaylist.injectingDying(resist);
      this.overallTell +=
          (this.numeration() - 1)
              * (probable.OpportunityCarer.latestClip() - this.goRallyThing)
              / pretence.Scenario.presentAnalog().hoursRestriction();
      this.verb.put(resist, probable.OpportunityCarer.latestClip());
      this.goRallyThing = probable.OpportunityCarer.latestClip();
      for (exporter.Manufacturer leong : second) {

        if (leong.theLaw() == FabricatorSate.emaciated) {
          leong.unstarve();
          return;
        }
      }
    } else {
      throw new depot.ArchivalOverflowingExempt();
    }
  }

  public filmingExhibits.ExploitableArtifact aheadIngredient() throws StowageLootedDerogation {

    if (this.numeration() > 0) {
      filmingExhibits.ExploitableArtifact coccyx = this.depositoryPlaylist.deletePremiere();
      this.overallTell +=
          (this.numeration() + 1)
              * (probable.OpportunityCarer.latestClip() - this.goRallyThing)
              / pretence.Scenario.presentAnalog().hoursRestriction();
      double installBeginning = this.verb.remove(coccyx);
      double dismantleNow = probable.OpportunityCarer.latestClip();
      this.mediumHours =
          (mediumHours * recordedPieces + (dismantleNow - installBeginning)) / ++recordedPieces;
      for (exporter.Manufacturer electricity : prior) {

        if (electricity.theLaw() == FabricatorSate.clog) {
          electricity.unpick();
          break;
        }
      }
      this.goRallyThing = probable.OpportunityCarer.latestClip();
      return coccyx;
    } else {
      throw new depot.StowageLootedDerogation();
    }
  }

  public int numeration() {
    return this.depositoryPlaylist.reckon();
  }

  public String toString() {
    return "Storage" + self;
  }

  public java.lang.String survey() {
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.mediumHours, this.overallTell);
  }
}
