package scenario;

import maturational.ThingCatch;
import manufacturedBelongings.ExploitableArtifact;
import breeder.*;
import space.*;
import best.*;

public class Emulation {

  public synchronized void originate() {
    Emulation.existingExperiment = this;

    while (ThingCatch.formerAmount() < this.hourRestricts && this.galaLine.charge() > 0) {
      this.galaLine.newGathering().treatCeremony();
    }
    this.publishFigures();
  }

  public Producing maker[];
  public static Emulation existingExperiment;

  public Emulation(double periodTrammel, double canonicIgnoble, double acceptedRun) {
    this.hourRestricts = periodTrammel;
    this.classicNormal = canonicIgnoble;
    this.regulationGraze = acceptedRun;
    this.galaLine = new TriathlonCue();
    this.maker = new Producing[8];
    this.cache = new Storeroom[5];
    cache[0] = new Storeroom();
    cache[1] = new Storeroom();
    cache[2] = new Storeroom();
    cache[3] = new Storeroom();
    cache[4] = new Storeroom();
    maker[0] = new SupplierFirst(this.classicNormal, this.regulationGraze, cache[0]);
    maker[1] = new ExporterPlace(this.classicNormal, this.regulationGraze, cache[1], cache[0]);
    maker[2] =
        new ExporterPlace(this.classicNormal * 2.0, this.regulationGraze * 2.0, cache[2], cache[1]);
    maker[3] =
        new ExporterPlace(this.classicNormal * 2.0, this.regulationGraze * 2.0, cache[2], cache[1]);
    maker[4] = new ExporterPlace(this.classicNormal, this.regulationGraze, cache[3], cache[2]);
    maker[5] =
        new ExporterPlace(this.classicNormal * 2.0, this.regulationGraze * 2.0, cache[4], cache[3]);
    maker[6] =
        new ExporterPlace(this.classicNormal * 2.0, this.regulationGraze * 2.0, cache[4], cache[3]);
    maker[7] = new BreederEnds(this.classicNormal, this.regulationGraze, cache[4]);
    cache[0].determineThird(maker[1]);
    cache[0].solidifyingElapsed(maker[0]);
    cache[1].determineThird(maker[2], maker[3]);
    cache[1].solidifyingElapsed(maker[1]);
    cache[2].determineThird(maker[4]);
    cache[2].solidifyingElapsed(maker[2], maker[3]);
    cache[3].determineThird(maker[5], maker[6]);
    cache[3].solidifyingElapsed(maker[4]);
    cache[4].determineThird(maker[7]);
    cache[4].solidifyingElapsed(maker[5], maker[6]);
    this.galaLine.embeddedExposition(
        new PublisherCarnival(
            ThingCatch.formerAmount(), PublisherCarnival.BacksideStartle, maker[0]));
  }

  public double regulationGraze;
  public Storeroom cache[];
  public TriathlonCue galaLine;

  public static synchronized Emulation afootModeling() {
    return existingExperiment;
  }

  public synchronized double opportunityMaximum() {
    return this.hourRestricts;
  }

  public double classicNormal;
  public double hourRestricts;

  public synchronized void publishFigures() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.hourRestricts,
            ThingCatch.formerAmount(),
            this.classicNormal,
            this.regulationGraze));
    System.out.println(String.format("Storage Capacity: %d", Storeroom.warehouseDemarcation()));
    System.out.println("ProducibleObject count: " + ExploitableArtifact.continuingFigures());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Producing leong : maker) {
      System.out.println(leong.survey());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Storeroom fh : cache) {
      System.out.println(fh.number());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
