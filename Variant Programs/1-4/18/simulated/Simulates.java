package simulated;

import jazzy.BeginningHousekeeper;
import outputTarget.PhyllosilicatePreclude;
import output.*;
import memory.*;
import enter.*;

public class Simulates {
  public static simulated.Simulates previousExercise;

  public static synchronized simulated.Simulates existingExperiment() {
    return previousExercise;
  }

  public double whenThrottle;
  public double measureBeggarly;
  public double measureRate;
  public output.Production manufacturers[];
  public memory.Warehousing store[];
  public enter.SeminarJumping festivalSpooler;

  public Simulates(double periodTrammel, double criterionalEquate, double criterialRank) {
    this.whenThrottle = periodTrammel;
    this.measureBeggarly = criterionalEquate;
    this.measureRate = criterialRank;
    this.festivalSpooler = new enter.SeminarJumping();
    this.manufacturers = new output.Production[8];
    this.store = new memory.Warehousing[5];
    store[0] = new memory.Warehousing();
    store[1] = new memory.Warehousing();
    store[2] = new memory.Warehousing();
    store[3] = new memory.Warehousing();
    store[4] = new memory.Warehousing();
    manufacturers[0] = new output.MakerOutset(this.measureBeggarly, this.measureRate, store[0]);
    manufacturers[1] =
        new output.VintnerObservatory(this.measureBeggarly, this.measureRate, store[1], store[0]);
    manufacturers[2] =
        new output.VintnerObservatory(
            this.measureBeggarly * 2.0, this.measureRate * 2.0, store[2], store[1]);
    manufacturers[3] =
        new output.VintnerObservatory(
            this.measureBeggarly * 2.0, this.measureRate * 2.0, store[2], store[1]);
    manufacturers[4] =
        new output.VintnerObservatory(this.measureBeggarly, this.measureRate, store[3], store[2]);
    manufacturers[5] =
        new output.VintnerObservatory(
            this.measureBeggarly * 2.0, this.measureRate * 2.0, store[4], store[3]);
    manufacturers[6] =
        new output.VintnerObservatory(
            this.measureBeggarly * 2.0, this.measureRate * 2.0, store[4], store[3]);
    manufacturers[7] = new output.ExporterEnd(this.measureBeggarly, this.measureRate, store[4]);
    store[0].placeSoon(manufacturers[1]);
    store[0].prepareCurrent(manufacturers[0]);
    store[1].placeSoon(manufacturers[2], manufacturers[3]);
    store[1].prepareCurrent(manufacturers[1]);
    store[2].placeSoon(manufacturers[4]);
    store[2].prepareCurrent(manufacturers[2], manufacturers[3]);
    store[3].placeSoon(manufacturers[5], manufacturers[6]);
    store[3].prepareCurrent(manufacturers[4]);
    store[4].placeSoon(manufacturers[7]);
    store[4].prepareCurrent(manufacturers[5], manufacturers[6]);
    this.festivalSpooler.injectingSpectacle(
        new enter.ManufacturerCase(
            jazzy.BeginningHousekeeper.typicalJuncture(),
            ManufacturerCase.StoolCommencement,
            manufacturers[0]));
  }

  public synchronized double nowRestrictions() {
    return this.whenThrottle;
  }

  public synchronized void began() {
    Simulates.previousExercise = this;

    while (jazzy.BeginningHousekeeper.typicalJuncture() < this.whenThrottle
        && this.festivalSpooler.census() > 0) synx59();
    this.lithographNumber();
  }

  public synchronized void lithographNumber() {
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.whenThrottle,
            jazzy.BeginningHousekeeper.typicalJuncture(),
            this.measureBeggarly,
            this.measureRate));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", memory.Warehousing.garageRestricted()));
    System.out.println(
        "ProducibleObject count: " + outputTarget.PhyllosilicatePreclude.topicalConsider());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (output.Production arsenic : manufacturers) synx60(arsenic);
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (memory.Warehousing fh : store) synx61(fh);
    System.out.println(" ----------------------------------------------- ");
  }

  private synchronized void synx59() {
    this.festivalSpooler.afterSpectacle().appendageSymposium();
  }

  private synchronized void synx60(Production arsenic) {
    System.out.println(arsenic.statistician());
  }

  private synchronized void synx61(Warehousing fh) {
    System.out.println(fh.numbers());
  }
}
