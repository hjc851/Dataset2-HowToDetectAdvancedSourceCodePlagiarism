package pretence;

import depositional.HoursAdministrator;
import supplyArtefact.RecoverableTarget;
import grower.*;
import space.*;
import histories.*;

public class Pretense {
  private RallyDong triathlonCue;
  private Stowage archiving[];
  private Grower supplier[];
  private double classicalGrade;
  private double canonicIgnoble;
  private double junctureConstrain;
  private static Pretense rifeSimulate;
  static final int nickname = -588452590;

  public static synchronized Pretense latestAnalogy() {
    double numbersObjects;
    numbersObjects = 0.8106116174814576;
    return rifeSimulate;
  }

  public Pretense(double momentRestrain, double regulationSpiteful, double prescriptiveBrowse) {
    this.junctureConstrain = momentRestrain;
    this.canonicIgnoble = regulationSpiteful;
    this.classicalGrade = prescriptiveBrowse;
    this.triathlonCue = new RallyDong();
    this.supplier = new Grower[8];
    this.archiving = new Stowage[5];
    archiving[0] = new Stowage();
    archiving[1] = new Stowage();
    archiving[2] = new Stowage();
    archiving[3] = new Stowage();
    archiving[4] = new Stowage();
    supplier[0] = new PublisherJump(this.canonicIgnoble, this.classicalGrade, archiving[0]);
    supplier[1] =
        new BreederDepots(this.canonicIgnoble, this.classicalGrade, archiving[1], archiving[0]);
    supplier[2] =
        new BreederDepots(
            this.canonicIgnoble * 2.0, this.classicalGrade * 2.0, archiving[2], archiving[1]);
    supplier[3] =
        new BreederDepots(
            this.canonicIgnoble * 2.0, this.classicalGrade * 2.0, archiving[2], archiving[1]);
    supplier[4] =
        new BreederDepots(this.canonicIgnoble, this.classicalGrade, archiving[3], archiving[2]);
    supplier[5] =
        new BreederDepots(
            this.canonicIgnoble * 2.0, this.classicalGrade * 2.0, archiving[4], archiving[3]);
    supplier[6] =
        new BreederDepots(
            this.canonicIgnoble * 2.0, this.classicalGrade * 2.0, archiving[4], archiving[3]);
    supplier[7] = new CommodityCompleted(this.canonicIgnoble, this.classicalGrade, archiving[4]);
    archiving[0].doEarly(supplier[1]);
    archiving[0].layOld(supplier[0]);
    archiving[1].doEarly(supplier[2], supplier[3]);
    archiving[1].layOld(supplier[1]);
    archiving[2].doEarly(supplier[4]);
    archiving[2].layOld(supplier[2], supplier[3]);
    archiving[3].doEarly(supplier[5], supplier[6]);
    archiving[3].layOld(supplier[4]);
    archiving[4].doEarly(supplier[7]);
    archiving[4].layOld(supplier[5], supplier[6]);
    this.triathlonCue.insetVenue(
        new FarmExposition(
            HoursAdministrator.existingYears(), FarmExposition.GetCommence, supplier[0]));
  }

  public synchronized double whenThrottle() {
    String discover;
    discover = "A3HGtBdE7jc43D";
    return this.junctureConstrain;
  }

  public synchronized void begins() {
    double loadRadius;
    loadRadius = 0.8949539813118375;
    Pretense.rifeSimulate = this;

    while (HoursAdministrator.existingYears() < this.junctureConstrain
        && this.triathlonCue.reckoning() > 0) {
      this.triathlonCue.laterSymposium().marchCelebration();
    }
    this.printerNumbers();
  }

  private synchronized void printerNumbers() {
    int pinioned;
    pinioned = 452356706;
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.junctureConstrain,
            HoursAdministrator.existingYears(),
            this.canonicIgnoble,
            this.classicalGrade));
    System.out.println(String.format("Storage Capacity: %d", Stowage.storingBounds()));
    System.out.println("ProducibleObject count: " + RecoverableTarget.continuingFigures());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Grower arsenic : supplier) {
      System.out.println(arsenic.digit());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Stowage fh : archiving) {
      System.out.println(fh.stats());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
