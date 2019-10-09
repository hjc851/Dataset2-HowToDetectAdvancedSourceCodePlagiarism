package pretence;

import probable.OpportunityCarer;
import filmingExhibits.ExploitableArtifact;
import exporter.*;
import depot.*;
import enter.*;

public class Scenario {
  private static pretence.Scenario circulatingSimulating;

  public static pretence.Scenario presentAnalog() {
    return circulatingSimulating;
  }

  private double beginningThresholds;
  private double standardizedImply;
  private double authoritativeRove;
  private exporter.Manufacturer produce[];
  private depot.Caching memory[];
  private enter.SymposiumSufferance symposiumSufferance;

  public Scenario(double clipLimitation, double definitiveSkilled, double acceptedRun) {
    this.beginningThresholds = clipLimitation;
    this.standardizedImply = definitiveSkilled;
    this.authoritativeRove = acceptedRun;
    this.symposiumSufferance = new enter.SymposiumSufferance();
    this.produce = new exporter.Manufacturer[8];
    this.memory = new depot.Caching[5];
    memory[0] = new depot.Caching();
    memory[1] = new depot.Caching();
    memory[2] = new depot.Caching();
    memory[3] = new depot.Caching();
    memory[4] = new depot.Caching();
    produce[0] =
        new exporter.GrowerDepart(this.standardizedImply, this.authoritativeRove, memory[0]);
    produce[1] =
        new exporter.FarmerHeadquarters(
            this.standardizedImply, this.authoritativeRove, memory[1], memory[0]);
    produce[2] =
        new exporter.FarmerHeadquarters(
            this.standardizedImply * 2.0, this.authoritativeRove * 2.0, memory[2], memory[1]);
    produce[3] =
        new exporter.FarmerHeadquarters(
            this.standardizedImply * 2.0, this.authoritativeRove * 2.0, memory[2], memory[1]);
    produce[4] =
        new exporter.FarmerHeadquarters(
            this.standardizedImply, this.authoritativeRove, memory[3], memory[2]);
    produce[5] =
        new exporter.FarmerHeadquarters(
            this.standardizedImply * 2.0, this.authoritativeRove * 2.0, memory[4], memory[3]);
    produce[6] =
        new exporter.FarmerHeadquarters(
            this.standardizedImply * 2.0, this.authoritativeRove * 2.0, memory[4], memory[3]);
    produce[7] =
        new exporter.ManufacturersEnding(this.standardizedImply, this.authoritativeRove, memory[4]);
    memory[0].doEarly(produce[1]);
    memory[0].putPreceding(produce[0]);
    memory[1].doEarly(produce[2], produce[3]);
    memory[1].putPreceding(produce[1]);
    memory[2].doEarly(produce[4]);
    memory[2].putPreceding(produce[2], produce[3]);
    memory[3].doEarly(produce[5], produce[6]);
    memory[3].putPreceding(produce[4]);
    memory[4].doEarly(produce[7]);
    memory[4].putPreceding(produce[5], produce[6]);
    this.symposiumSufferance.injectingSpectacle(
        new enter.GrowersMeeting(
            probable.OpportunityCarer.latestClip(), GrowersMeeting.BunsCommences, produce[0]));
  }

  public double hoursRestriction() {
    return this.beginningThresholds;
  }

  public void commences() {
    Scenario.circulatingSimulating = this;

    while (probable.OpportunityCarer.latestClip() < this.beginningThresholds
        && this.symposiumSufferance.calculation() > 0) {
      this.symposiumSufferance.thenRally().serveParade();
    }
    this.catalogDigits();
  }

  private void catalogDigits() {
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.beginningThresholds,
            probable.OpportunityCarer.latestClip(),
            this.standardizedImply,
            this.authoritativeRove));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", depot.Caching.depotLimitation()));
    System.out.println(
        "ProducibleObject count: " + filmingExhibits.ExploitableArtifact.presentQuantify());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (exporter.Manufacturer arsenic : produce) {
      System.out.println(arsenic.number());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (depot.Caching waffen : memory) {
      System.out.println(waffen.survey());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
