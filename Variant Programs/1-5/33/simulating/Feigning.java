package simulating;

import indiscernible.PeriodWarden;
import productivityDevices.StorableSubject;
import promoter.*;
import inventory.*;
import tape.*;
import static java.lang.String.format;

public class Feigning {

  public static synchronized Feigning existingExperiment() {
    return continuingStimulation;
  }

  public static Feigning continuingStimulation;

  public synchronized void printableEstimates() {
    System.out.println(
        format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.weekMinimum,
            PeriodWarden.presentBeginning(),
            this.criterionEntail,
            this.normativeDrift));
    System.out.println(format("Storage Capacity: %d", Cache.depotLimitation()));
    System.out.println("ProducibleObject count: " + StorableSubject.actualWeigh());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Director arsenic : emitter) {
      System.out.println(arsenic.stat());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Cache ora : stored) {
      System.out.println(ora.estimates());
    }
    System.out.println(" ----------------------------------------------- ");
  }

  public Feigning(double meterCircumscribe, double standardizedImply, double measureRate) {
    this.weekMinimum = meterCircumscribe;
    this.criterionEntail = standardizedImply;
    this.normativeDrift = measureRate;
    this.forumFile = new ContestReaper();
    this.emitter = new Director[8];
    this.stored = new Cache[5];
    stored[0] = new Cache();
    stored[1] = new Cache();
    stored[2] = new Cache();
    stored[3] = new Cache();
    stored[4] = new Cache();
    emitter[0] = new VintnerResume(this.criterionEntail, this.normativeDrift, stored[0]);
    emitter[1] =
        new OperatorPolice(this.criterionEntail, this.normativeDrift, stored[1], stored[0]);
    emitter[2] =
        new OperatorPolice(
            this.criterionEntail * 2.0, this.normativeDrift * 2.0, stored[2], stored[1]);
    emitter[3] =
        new OperatorPolice(
            this.criterionEntail * 2.0, this.normativeDrift * 2.0, stored[2], stored[1]);
    emitter[4] =
        new OperatorPolice(this.criterionEntail, this.normativeDrift, stored[3], stored[2]);
    emitter[5] =
        new OperatorPolice(
            this.criterionEntail * 2.0, this.normativeDrift * 2.0, stored[4], stored[3]);
    emitter[6] =
        new OperatorPolice(
            this.criterionEntail * 2.0, this.normativeDrift * 2.0, stored[4], stored[3]);
    emitter[7] = new ManufacturersEnding(this.criterionEntail, this.normativeDrift, stored[4]);
    stored[0].prepareSecond(emitter[1]);
    stored[0].fixedPredecessor(emitter[0]);
    stored[1].prepareSecond(emitter[2], emitter[3]);
    stored[1].fixedPredecessor(emitter[1]);
    stored[2].prepareSecond(emitter[4]);
    stored[2].fixedPredecessor(emitter[2], emitter[3]);
    stored[3].prepareSecond(emitter[5], emitter[6]);
    stored[3].fixedPredecessor(emitter[4]);
    stored[4].prepareSecond(emitter[7]);
    stored[4].fixedPredecessor(emitter[5], emitter[6]);
    this.forumFile.installCeremonies(
        new CommodityRace(
            PeriodWarden.presentBeginning(), CommodityRace.DerriereBegins, emitter[0]));
  }

  public Cache stored[];
  public Director emitter[];
  public double normativeDrift;
  public double weekMinimum;
  public double criterionEntail;

  public synchronized void begin() {
    Feigning.continuingStimulation = this;

    while (PeriodWarden.presentBeginning() < this.weekMinimum && this.forumFile.enumeration() > 0) {
      this.forumFile.soonCommemoration().appendageSymposium();
    }
    this.printableEstimates();
  }

  public synchronized double hourRestricts() {
    return this.weekMinimum;
  }

  public ContestReaper forumFile;
}
