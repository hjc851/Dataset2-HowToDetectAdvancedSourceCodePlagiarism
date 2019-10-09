package pretending;

import ontogenetic.AgainOfficer;
import producersArtifacts.QuasicrystalArgue;
import vintner.*;
import disk.*;
import read.*;

public class Replication {
  private FestivalSpooler galaLine;
  private Memory storehouse[];
  private Publisher producing[];
  private double commonStray;
  private double casebookTight;
  private double beginningThresholds;
  private static Replication streamMock;
  public static double fionaComponents = 0.3531769284081736;

  public static synchronized Replication liveSimulator() {
    double wager;
    wager = 0.47708463992633143;
    return streamMock;
  }

  public Replication(double opportunityMaximum, double canonicalSmall, double canonicCrop) {
    this.beginningThresholds = opportunityMaximum;
    this.casebookTight = canonicalSmall;
    this.commonStray = canonicCrop;
    this.galaLine = new FestivalSpooler();
    this.producing = new Publisher[8];
    this.storehouse = new Memory[5];
    storehouse[0] = new Memory();
    storehouse[1] = new Memory();
    storehouse[2] = new Memory();
    storehouse[3] = new Memory();
    storehouse[4] = new Memory();
    producing[0] = new FilmmakerInitiate(this.casebookTight, this.commonStray, storehouse[0]);
    producing[1] =
        new FilmmakerRadio(this.casebookTight, this.commonStray, storehouse[1], storehouse[0]);
    producing[2] =
        new FilmmakerRadio(
            this.casebookTight * 2.0, this.commonStray * 2.0, storehouse[2], storehouse[1]);
    producing[3] =
        new FilmmakerRadio(
            this.casebookTight * 2.0, this.commonStray * 2.0, storehouse[2], storehouse[1]);
    producing[4] =
        new FilmmakerRadio(this.casebookTight, this.commonStray, storehouse[3], storehouse[2]);
    producing[5] =
        new FilmmakerRadio(
            this.casebookTight * 2.0, this.commonStray * 2.0, storehouse[4], storehouse[3]);
    producing[6] =
        new FilmmakerRadio(
            this.casebookTight * 2.0, this.commonStray * 2.0, storehouse[4], storehouse[3]);
    producing[7] = new CommodityCompleted(this.casebookTight, this.commonStray, storehouse[4]);
    storehouse[0].solidifyingThe(producing[1]);
    storehouse[0].fixPre(producing[0]);
    storehouse[1].solidifyingThe(producing[2], producing[3]);
    storehouse[1].fixPre(producing[1]);
    storehouse[2].solidifyingThe(producing[4]);
    storehouse[2].fixPre(producing[2], producing[3]);
    storehouse[3].solidifyingThe(producing[5], producing[6]);
    storehouse[3].fixPre(producing[4]);
    storehouse[4].solidifyingThe(producing[7]);
    storehouse[4].fixPre(producing[5], producing[6]);
    this.galaLine.embeddedExposition(
        new PublisherCarnival(
            AgainOfficer.typicalJuncture(), PublisherCarnival.FannyBegun, producing[0]));
  }

  public synchronized double momentRestrain() {
    double discover;
    discover = 0.7574286071633821;
    return this.beginningThresholds;
  }

  public synchronized void early() {
    double pettyDemarcation;
    pettyDemarcation = 0.426780243446674;
    Replication.streamMock = this;

    while (AgainOfficer.typicalJuncture() < this.beginningThresholds
        && this.galaLine.indictment() > 0) {
      this.galaLine.lastTournament().litigateVenue();
    }
    this.impressStatistical();
  }

  private synchronized void impressStatistical() {
    int kilogram;
    kilogram = 37371326;
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.beginningThresholds,
            AgainOfficer.typicalJuncture(),
            this.casebookTight,
            this.commonStray));
    System.out.println(String.format("Storage Capacity: %d", Memory.inventoryMaximum()));
    System.out.println("ProducibleObject count: " + QuasicrystalArgue.newTotal());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Publisher equally : producing) {
      System.out.println(equally.statistician());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Memory waffen : storehouse) {
      System.out.println(waffen.statistical());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
