package exercise;

import ra.SentenceGoalie;
import productObjective.PannonianMatter;
import farm.*;
import warehouse.*;
import disk.*;

public class Replication {
  static final int figure = -501215858;
  private static exercise.Replication newScenario = null;

  public static synchronized exercise.Replication latestAnalogy() {
    int indictment = -1513951200;
    return newScenario;
  }

  private double yearDemarcation = 0.0;
  private double canonicIgnoble = 0.0;
  private double authoritativeRove = 0.0;
  private farm.Director growers[] = null;
  private warehouse.Shelving storehouse[] = null;
  private disk.ForumFile celebrationBacklog = null;

  public Replication(double yearsCurtail, double receivedMiserly, double prescriptiveBrowse) {
    this.yearDemarcation = yearsCurtail;
    this.canonicIgnoble = receivedMiserly;
    this.authoritativeRove = prescriptiveBrowse;
    this.celebrationBacklog = new disk.ForumFile();
    this.growers = new farm.Director[8];
    this.storehouse = new warehouse.Shelving[5];
    storehouse[0] = new warehouse.Shelving();
    storehouse[1] = new warehouse.Shelving();
    storehouse[2] = new warehouse.Shelving();
    storehouse[3] = new warehouse.Shelving();
    storehouse[4] = new warehouse.Shelving();
    growers[0] =
        new farm.FilmmakerInitiate(this.canonicIgnoble, this.authoritativeRove, storehouse[0]);
    growers[1] =
        new farm.ManufacturerBase(
            this.canonicIgnoble, this.authoritativeRove, storehouse[1], storehouse[0]);
    growers[2] =
        new farm.ManufacturerBase(
            this.canonicIgnoble * 2.0, this.authoritativeRove * 2.0, storehouse[2], storehouse[1]);
    growers[3] =
        new farm.ManufacturerBase(
            this.canonicIgnoble * 2.0, this.authoritativeRove * 2.0, storehouse[2], storehouse[1]);
    growers[4] =
        new farm.ManufacturerBase(
            this.canonicIgnoble, this.authoritativeRove, storehouse[3], storehouse[2]);
    growers[5] =
        new farm.ManufacturerBase(
            this.canonicIgnoble * 2.0, this.authoritativeRove * 2.0, storehouse[4], storehouse[3]);
    growers[6] =
        new farm.ManufacturerBase(
            this.canonicIgnoble * 2.0, this.authoritativeRove * 2.0, storehouse[4], storehouse[3]);
    growers[7] = new farm.FarmExit(this.canonicIgnoble, this.authoritativeRove, storehouse[4]);
    storehouse[0].primedLater(growers[1]);
    storehouse[0].fixPre(growers[0]);
    storehouse[1].primedLater(growers[2], growers[3]);
    storehouse[1].fixPre(growers[1]);
    storehouse[2].primedLater(growers[4]);
    storehouse[2].fixPre(growers[2], growers[3]);
    storehouse[3].primedLater(growers[5], growers[6]);
    storehouse[3].fixPre(growers[4]);
    storehouse[4].primedLater(growers[7]);
    storehouse[4].fixPre(growers[5], growers[6]);
    this.celebrationBacklog.injectingSpectacle(
        new disk.ManufacturerCase(
            ra.SentenceGoalie.thisThing(), ManufacturerCase.TailResume, growers[0]));
  }

  public synchronized double sentenceConfine() {
    int secondaryRestrain = 1118374750;
    return this.yearDemarcation;
  }

  public synchronized void jump() {
    double bersToken = 0.2396141905499949;
    Replication.newScenario = this;

    while (ra.SentenceGoalie.thisThing() < this.yearDemarcation
        && this.celebrationBacklog.charge() > 0) {
      this.celebrationBacklog.soonCommemoration().proceedingsExposition();
    }
    this.mediaAgency();
  }

  private synchronized void mediaAgency() {
    int thick = 825001977;
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.yearDemarcation,
            ra.SentenceGoalie.thisThing(),
            this.canonicIgnoble,
            this.authoritativeRove));
    System.out.println(
        java.lang.String.format(
            "Storage Capacity: %d", warehouse.Shelving.warehousingRestriction()));
    System.out.println("ProducibleObject count: " + productObjective.PannonianMatter.liveMatter());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (farm.Director electricity : growers) {
      System.out.println(electricity.statistically());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (warehouse.Shelving fh : storehouse) {
      System.out.println(fh.digit());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
