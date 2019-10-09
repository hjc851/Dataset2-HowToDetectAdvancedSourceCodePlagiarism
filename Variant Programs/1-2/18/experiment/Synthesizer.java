package experiment;

import ontogenetic.PeriodsManager;
import filmingExhibits.QuasicrystalArgue;
import breeder.*;
import space.*;
import read.*;

public class Synthesizer {
  private static experiment.Synthesizer topicalSimulated;

  public static experiment.Synthesizer streamMock() {
    return topicalSimulated;
  }

  private double hoursRestriction;
  private double regularUngenerous;
  private double acceptableReach;
  private breeder.Fabricator emitter[];
  private space.Storeroom disk[];
  private read.CarnivalRow rallyDong;

  public Synthesizer(double chanceThreshold, double normativeAwful, double criterialRank) {
    this.hoursRestriction = chanceThreshold;
    this.regularUngenerous = normativeAwful;
    this.acceptableReach = criterialRank;
    this.rallyDong = new read.CarnivalRow();
    this.emitter = new breeder.Fabricator[8];
    this.disk = new space.Storeroom[5];
    disk[0] = new space.Storeroom();
    disk[1] = new space.Storeroom();
    disk[2] = new space.Storeroom();
    disk[3] = new space.Storeroom();
    disk[4] = new space.Storeroom();
    emitter[0] =
        new breeder.FilmmakerInitiate(this.regularUngenerous, this.acceptableReach, disk[0]);
    emitter[1] =
        new breeder.OperatorPolice(this.regularUngenerous, this.acceptableReach, disk[1], disk[0]);
    emitter[2] =
        new breeder.OperatorPolice(
            this.regularUngenerous * 2.0, this.acceptableReach * 2.0, disk[2], disk[1]);
    emitter[3] =
        new breeder.OperatorPolice(
            this.regularUngenerous * 2.0, this.acceptableReach * 2.0, disk[2], disk[1]);
    emitter[4] =
        new breeder.OperatorPolice(this.regularUngenerous, this.acceptableReach, disk[3], disk[2]);
    emitter[5] =
        new breeder.OperatorPolice(
            this.regularUngenerous * 2.0, this.acceptableReach * 2.0, disk[4], disk[3]);
    emitter[6] =
        new breeder.OperatorPolice(
            this.regularUngenerous * 2.0, this.acceptableReach * 2.0, disk[4], disk[3]);
    emitter[7] = new breeder.GrowerTerminate(this.regularUngenerous, this.acceptableReach, disk[4]);
    disk[0].fixedAfter(emitter[1]);
    disk[0].putPreceding(emitter[0]);
    disk[1].fixedAfter(emitter[2], emitter[3]);
    disk[1].putPreceding(emitter[1]);
    disk[2].fixedAfter(emitter[4]);
    disk[2].putPreceding(emitter[2], emitter[3]);
    disk[3].fixedAfter(emitter[5], emitter[6]);
    disk[3].putPreceding(emitter[4]);
    disk[4].fixedAfter(emitter[7]);
    disk[4].putPreceding(emitter[5], emitter[6]);
    this.rallyDong.tuckCase(
        new read.GrowerParade(
            ontogenetic.PeriodsManager.topicalPeriod(),
            GrowerParade.FundamentOriginate,
            emitter[0]));
  }

  public double yearsCurtail() {
    return this.hoursRestriction;
  }

  public void commencement() {
    Synthesizer.topicalSimulated = this;

    while (ontogenetic.PeriodsManager.topicalPeriod() < this.hoursRestriction
        && this.rallyDong.indictment() > 0) {
      this.rallyDong.comeDemonstration().litigateVenue();
    }
    this.mediaAgency();
  }

  private void mediaAgency() {
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.hoursRestriction,
            ontogenetic.PeriodsManager.topicalPeriod(),
            this.regularUngenerous,
            this.acceptableReach));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", space.Storeroom.storingBounds()));
    System.out.println(
        "ProducibleObject count: " + filmingExhibits.QuasicrystalArgue.presentlyTell());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (breeder.Fabricator spain : emitter) {
      System.out.println(spain.numerals());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (space.Storeroom fh : disk) {
      System.out.println(fh.digit());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
