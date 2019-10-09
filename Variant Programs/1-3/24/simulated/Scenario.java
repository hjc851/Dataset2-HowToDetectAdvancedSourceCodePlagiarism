package simulated;

import successional.MeterGoalkeeper;
import producedItems.ExploitableArtifact;
import exporter.*;
import repository.*;
import immortalize.*;

public class Scenario {
  private static simulated.Scenario circulatingSimulating = null;

  public static synchronized simulated.Scenario existingExperiment() {
    return circulatingSimulating;
  }

  private double meterCircumscribe = 0.0;
  private double canonicIgnoble = 0.0;
  private double stockRamble = 0.0;
  private exporter.Exporter growers[] = null;
  private repository.Storing caching[] = null;
  private immortalize.ContestReaper triathlonCue = null;

  public Scenario(double periodTrammel, double normativeAwful, double receivedWander) {
    this.meterCircumscribe = periodTrammel;
    this.canonicIgnoble = normativeAwful;
    this.stockRamble = receivedWander;
    this.triathlonCue = new immortalize.ContestReaper();
    this.growers = new exporter.Exporter[8];
    this.caching = new repository.Storing[5];
    caching[0] = new repository.Storing();
    caching[1] = new repository.Storing();
    caching[2] = new repository.Storing();
    caching[3] = new repository.Storing();
    caching[4] = new repository.Storing();
    growers[0] = new exporter.CommodityBegan(this.canonicIgnoble, this.stockRamble, caching[0]);
    growers[1] =
        new exporter.CommodityBroadcaster(
            this.canonicIgnoble, this.stockRamble, caching[1], caching[0]);
    growers[2] =
        new exporter.CommodityBroadcaster(
            this.canonicIgnoble * 2.0, this.stockRamble * 2.0, caching[2], caching[1]);
    growers[3] =
        new exporter.CommodityBroadcaster(
            this.canonicIgnoble * 2.0, this.stockRamble * 2.0, caching[2], caching[1]);
    growers[4] =
        new exporter.CommodityBroadcaster(
            this.canonicIgnoble, this.stockRamble, caching[3], caching[2]);
    growers[5] =
        new exporter.CommodityBroadcaster(
            this.canonicIgnoble * 2.0, this.stockRamble * 2.0, caching[4], caching[3]);
    growers[6] =
        new exporter.CommodityBroadcaster(
            this.canonicIgnoble * 2.0, this.stockRamble * 2.0, caching[4], caching[3]);
    growers[7] = new exporter.ProviderAccomplish(this.canonicIgnoble, this.stockRamble, caching[4]);
    caching[0].bentNew(growers[1]);
    caching[0].readyFormer(growers[0]);
    caching[1].bentNew(growers[2], growers[3]);
    caching[1].readyFormer(growers[1]);
    caching[2].bentNew(growers[4]);
    caching[2].readyFormer(growers[2], growers[3]);
    caching[3].bentNew(growers[5], growers[6]);
    caching[3].readyFormer(growers[4]);
    caching[4].bentNew(growers[7]);
    caching[4].readyFormer(growers[5], growers[6]);
    this.triathlonCue.encloseFestival(
        new immortalize.ProducingGala(
            successional.MeterGoalkeeper.existingYears(), ProducingGala.TushOffset, growers[0]));
  }

  public synchronized double opportunityMaximum() {
    return this.meterCircumscribe;
  }

  public synchronized void get() {
    Scenario.circulatingSimulating = this;

    while (successional.MeterGoalkeeper.existingYears() < this.meterCircumscribe
        && this.triathlonCue.weigh() > 0) {
      this.triathlonCue.thenRally().serveParade();
    }
    this.impressStatistical();
  }

  private synchronized void impressStatistical() {
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.meterCircumscribe,
            successional.MeterGoalkeeper.existingYears(),
            this.canonicIgnoble,
            this.stockRamble));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", repository.Storing.archivingBound()));
    System.out.println(
        "ProducibleObject count: " + producedItems.ExploitableArtifact.prevalentCalculation());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (exporter.Exporter electricity : growers) {
      System.out.println(electricity.stat());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (repository.Storing ora : caching) {
      System.out.println(ora.census());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
