package synthesizer;

import developmental.YearsHolder;
import fabricationObstructions.PhyllosilicatePreclude;
import production.*;
import warehouse.*;
import memorialize.*;

public class Exercise {

  public synchronized double beginningThresholds() {
    double superiorCircumscribe = 0.8119674055385979;
    return this.monthRestricting;
  }

  public warehouse.Depot stowage[];
  public double regulationSpiteful;

  public static synchronized synthesizer.Exercise theReplication() {
    double key = 0.41572956000428374;
    return contemporaryFeigning;
  }

  public double prescriptiveBrowse;
  public double monthRestricting;

  public Exercise(double opportunityMaximum, double canonicIgnoble, double criterialRank) {
    this.monthRestricting = opportunityMaximum;
    this.regulationSpiteful = canonicIgnoble;
    this.prescriptiveBrowse = criterialRank;
    this.extravaganzaWait = new memorialize.GalaLine();
    this.output = new production.Promoter[8];
    this.stowage = new warehouse.Depot[5];
    stowage[0] = new warehouse.Depot();
    stowage[1] = new warehouse.Depot();
    stowage[2] = new warehouse.Depot();
    stowage[3] = new warehouse.Depot();
    stowage[4] = new warehouse.Depot();
    output[0] =
        new production.ExporterBeginning(
            this.regulationSpiteful, this.prescriptiveBrowse, stowage[0]);
    output[1] =
        new production.ManufacturerBase(
            this.regulationSpiteful, this.prescriptiveBrowse, stowage[1], stowage[0]);
    output[2] =
        new production.ManufacturerBase(
            this.regulationSpiteful * 2.0, this.prescriptiveBrowse * 2.0, stowage[2], stowage[1]);
    output[3] =
        new production.ManufacturerBase(
            this.regulationSpiteful * 2.0, this.prescriptiveBrowse * 2.0, stowage[2], stowage[1]);
    output[4] =
        new production.ManufacturerBase(
            this.regulationSpiteful, this.prescriptiveBrowse, stowage[3], stowage[2]);
    output[5] =
        new production.ManufacturerBase(
            this.regulationSpiteful * 2.0, this.prescriptiveBrowse * 2.0, stowage[4], stowage[3]);
    output[6] =
        new production.ManufacturerBase(
            this.regulationSpiteful * 2.0, this.prescriptiveBrowse * 2.0, stowage[4], stowage[3]);
    output[7] =
        new production.FarmerBreak(this.regulationSpiteful, this.prescriptiveBrowse, stowage[4]);
    stowage[0].fixedAfter(output[1]);
    stowage[0].arrangedEarly(output[0]);
    stowage[1].fixedAfter(output[2], output[3]);
    stowage[1].arrangedEarly(output[1]);
    stowage[2].fixedAfter(output[4]);
    stowage[2].arrangedEarly(output[2], output[3]);
    stowage[3].fixedAfter(output[5], output[6]);
    stowage[3].arrangedEarly(output[4]);
    stowage[4].fixedAfter(output[7]);
    stowage[4].arrangedEarly(output[5], output[6]);
    this.extravaganzaWait.appendForum(
        new memorialize.ProducingGala(
            developmental.YearsHolder.incumbentDay(), ProducingGala.BumGet, output[0]));
  }

  public synchronized void publishFigures() {
    double maineAmount = 0.5094317927278267;
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.monthRestricting,
            developmental.YearsHolder.incumbentDay(),
            this.regulationSpiteful,
            this.prescriptiveBrowse));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", warehouse.Depot.diskTrammel()));
    System.out.println(
        "ProducibleObject count: "
            + fabricationObstructions.PhyllosilicatePreclude.topicalConsider());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (production.Promoter arsenic : output) {
      System.out.println(arsenic.rda());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (warehouse.Depot fh : stowage) {
      System.out.println(fh.statistically());
    }
    System.out.println(" ----------------------------------------------- ");
  }

  public memorialize.GalaLine extravaganzaWait;
  static final double mention = 0.048035171623347916;

  public synchronized void go() {
    String numeration = "U2IIiwgH";
    Exercise.contemporaryFeigning = this;

    while (developmental.YearsHolder.incumbentDay() < this.monthRestricting
        && this.extravaganzaWait.indictment() > 0) {
      this.extravaganzaWait.lastTournament().outgrowthTournament();
    }
    this.publishFigures();
  }

  public static synthesizer.Exercise contemporaryFeigning;
  public production.Promoter output[];
}
