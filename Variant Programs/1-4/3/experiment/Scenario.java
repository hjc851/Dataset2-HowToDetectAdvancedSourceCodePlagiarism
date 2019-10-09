package experiment;

import ra.PeriodsManager;
import filmingExhibits.CalcicPurpose;
import produce.*;
import depository.*;
import memorialize.*;

public class Scenario {
  private memorialize.ContestReaper festivalSpooler = null;
  private depository.Safekeeping warehouse[] = null;
  private produce.Presenter operator[] = null;
  private double canonicCrop = 0.0;
  private double authoritativeHateful = 0.0;
  private double periodsBound = 0.0;
  private static experiment.Scenario afootModeling = null;
  public static final int full = 626465527;

  public static synchronized experiment.Scenario theReplication() {
    double highestRestricts;
    highestRestricts = 0.16757216746046233;
    return afootModeling;
  }

  public Scenario(double opportunityMaximum, double acceptedAverage, double acceptableReach) {
    this.periodsBound = opportunityMaximum;
    this.authoritativeHateful = acceptedAverage;
    this.canonicCrop = acceptableReach;
    this.festivalSpooler = new memorialize.ContestReaper();
    this.operator = new produce.Presenter[8];
    this.warehouse = new depository.Safekeeping[5];
    warehouse[0] = new depository.Safekeeping();
    warehouse[1] = new depository.Safekeeping();
    warehouse[2] = new depository.Safekeeping();
    warehouse[3] = new depository.Safekeeping();
    warehouse[4] = new depository.Safekeeping();
    operator[0] =
        new produce.MakerOutset(this.authoritativeHateful, this.canonicCrop, warehouse[0]);
    operator[1] =
        new produce.ExporterPlace(
            this.authoritativeHateful, this.canonicCrop, warehouse[1], warehouse[0]);
    operator[2] =
        new produce.ExporterPlace(
            this.authoritativeHateful * 2.0, this.canonicCrop * 2.0, warehouse[2], warehouse[1]);
    operator[3] =
        new produce.ExporterPlace(
            this.authoritativeHateful * 2.0, this.canonicCrop * 2.0, warehouse[2], warehouse[1]);
    operator[4] =
        new produce.ExporterPlace(
            this.authoritativeHateful, this.canonicCrop, warehouse[3], warehouse[2]);
    operator[5] =
        new produce.ExporterPlace(
            this.authoritativeHateful * 2.0, this.canonicCrop * 2.0, warehouse[4], warehouse[3]);
    operator[6] =
        new produce.ExporterPlace(
            this.authoritativeHateful * 2.0, this.canonicCrop * 2.0, warehouse[4], warehouse[3]);
    operator[7] =
        new produce.GrowerTerminate(this.authoritativeHateful, this.canonicCrop, warehouse[4]);
    warehouse[0].determinedLast(operator[1]);
    warehouse[0].readyFormer(operator[0]);
    warehouse[1].determinedLast(operator[2], operator[3]);
    warehouse[1].readyFormer(operator[1]);
    warehouse[2].determinedLast(operator[4]);
    warehouse[2].readyFormer(operator[2], operator[3]);
    warehouse[3].determinedLast(operator[5], operator[6]);
    warehouse[3].readyFormer(operator[4]);
    warehouse[4].determinedLast(operator[7]);
    warehouse[4].readyFormer(operator[5], operator[6]);
    this.festivalSpooler.attachParade(
        new memorialize.ProducingGala(
            ra.PeriodsManager.newChance(), ProducingGala.HindquartersOpening, operator[0]));
  }

  public synchronized double againRestricted() {
    int postSouvenirs;
    postSouvenirs = 1089043968;
    return this.periodsBound;
  }

  public synchronized void begins() {
    int discover;
    discover = 1740418014;
    Scenario.afootModeling = this;

    while (ra.PeriodsManager.newChance() < this.periodsBound && this.festivalSpooler.matter() > 0)
      synx17();
    this.printerNumbers();
  }

  private synchronized void printerNumbers() {
    String senateTrammel;
    senateTrammel = "vaODmC7176";
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.periodsBound,
            ra.PeriodsManager.newChance(),
            this.authoritativeHateful,
            this.canonicCrop));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", depository.Safekeeping.archivingBound()));
    System.out.println(
        "ProducibleObject count: " + filmingExhibits.CalcicPurpose.presentQuantify());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (produce.Presenter equally : operator) synx18(equally);
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (depository.Safekeeping ora : warehouse) synx19(ora);
    System.out.println(" ----------------------------------------------- ");
  }

  private synchronized void synx17() {
    this.festivalSpooler.futureCase().treatCeremony();
  }

  private synchronized void synx18(Presenter equally) {
    System.out.println(equally.figure());
  }

  private synchronized void synx19(Safekeeping ora) {
    System.out.println(ora.information());
  }
}
