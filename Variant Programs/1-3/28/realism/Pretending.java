package realism;

import ontogenetic.MinutesNurse;
import producersArtifacts.UtilizableAim;
import produce.*;
import storehouse.*;
import precedent.*;

public class Pretending {
  private precedent.GatheringDipper seminarJumping;
  private storehouse.Storing archival[];
  private produce.Publisher grower[];
  private double regulationGraze;
  private double prescriptiveMingy;
  private double whenThrottle;
  private static realism.Pretending presentAnalog;
  public static final int greaterConstrain = -765810606;

  public static synchronized realism.Pretending prevalentRealism() {
    double decreasingRestricted;
    decreasingRestricted = 0.8277627658100107;
    return presentAnalog;
  }

  public Pretending(double sentenceConfine, double modularLittle, double criterionalOrder) {
    this.whenThrottle = sentenceConfine;
    this.prescriptiveMingy = modularLittle;
    this.regulationGraze = criterionalOrder;
    this.seminarJumping = new precedent.GatheringDipper();
    this.grower = new produce.Publisher[8];
    this.archival = new storehouse.Storing[5];
    archival[0] = new storehouse.Storing();
    archival[1] = new storehouse.Storing();
    archival[2] = new storehouse.Storing();
    archival[3] = new storehouse.Storing();
    archival[4] = new storehouse.Storing();
    grower[0] =
        new produce.PublisherJump(this.prescriptiveMingy, this.regulationGraze, archival[0]);
    grower[1] =
        new produce.ManufacturerBase(
            this.prescriptiveMingy, this.regulationGraze, archival[1], archival[0]);
    grower[2] =
        new produce.ManufacturerBase(
            this.prescriptiveMingy * 2.0, this.regulationGraze * 2.0, archival[2], archival[1]);
    grower[3] =
        new produce.ManufacturerBase(
            this.prescriptiveMingy * 2.0, this.regulationGraze * 2.0, archival[2], archival[1]);
    grower[4] =
        new produce.ManufacturerBase(
            this.prescriptiveMingy, this.regulationGraze, archival[3], archival[2]);
    grower[5] =
        new produce.ManufacturerBase(
            this.prescriptiveMingy * 2.0, this.regulationGraze * 2.0, archival[4], archival[3]);
    grower[6] =
        new produce.ManufacturerBase(
            this.prescriptiveMingy * 2.0, this.regulationGraze * 2.0, archival[4], archival[3]);
    grower[7] = new produce.BreederEnds(this.prescriptiveMingy, this.regulationGraze, archival[4]);
    archival[0].laidFollowing(grower[1]);
    archival[0].placeSuccessive(grower[0]);
    archival[1].laidFollowing(grower[2], grower[3]);
    archival[1].placeSuccessive(grower[1]);
    archival[2].laidFollowing(grower[4]);
    archival[2].placeSuccessive(grower[2], grower[3]);
    archival[3].laidFollowing(grower[5], grower[6]);
    archival[3].placeSuccessive(grower[4]);
    archival[4].laidFollowing(grower[7]);
    archival[4].placeSuccessive(grower[5], grower[6]);
    this.seminarJumping.addCommemoration(
        new precedent.GrowersMeeting(
            ontogenetic.MinutesNurse.afootHours(), GrowersMeeting.HindquartersOpening, grower[0]));
  }

  public synchronized double nowRestrictions() {
    double curb;
    curb = 0.14720607347970283;
    return this.whenThrottle;
  }

  public synchronized void began() {
    String treated;
    treated = "gFVubseAD7KYx2iA6";
    Pretending.presentAnalog = this;

    while (ontogenetic.MinutesNurse.afootHours() < this.whenThrottle
        && this.seminarJumping.reckon() > 0) {
      this.seminarJumping.theExposition().litigateVenue();
    }
    this.hardcopyRecords();
  }

  private synchronized void hardcopyRecords() {
    double kilogram;
    kilogram = 0.10419275781951787;
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.whenThrottle,
            ontogenetic.MinutesNurse.afootHours(),
            this.prescriptiveMingy,
            this.regulationGraze));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", storehouse.Storing.closetMax()));
    System.out.println("ProducibleObject count: " + producersArtifacts.UtilizableAim.thisGet());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (produce.Publisher electricity : grower) {
      System.out.println(electricity.metrics());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (storehouse.Storing waffen : archival) {
      System.out.println(waffen.number());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
