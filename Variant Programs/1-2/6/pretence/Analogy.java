package pretence;

import checked.DaysHandler;
import deliveryThings.ExhaustibleBody;
import growers.*;
import depository.*;
import commemorate.*;

public class Analogy {
  private static pretence.Analogy streamMock;

  public static pretence.Analogy topicalSimulated() {
    return streamMock;
  }

  private double monthRestricting;
  private double prescriptiveMingy;
  private double classicGrasp;
  private growers.Breeder maker[];
  private depository.Space archival[];
  private commemorate.VenueList demonstrationStopper;

  public Analogy(double thingReduce, double stockStingy, double receivedWander) {
    this.monthRestricting = thingReduce;
    this.prescriptiveMingy = stockStingy;
    this.classicGrasp = receivedWander;
    this.demonstrationStopper = new commemorate.VenueList();
    this.maker = new growers.Breeder[8];
    this.archival = new depository.Space[5];
    archival[0] = new depository.Space();
    archival[1] = new depository.Space();
    archival[2] = new depository.Space();
    archival[3] = new depository.Space();
    archival[4] = new depository.Space();
    maker[0] =
        new growers.ProductionCommence(this.prescriptiveMingy, this.classicGrasp, archival[0]);
    maker[1] =
        new growers.ExporterPlace(
            this.prescriptiveMingy, this.classicGrasp, archival[1], archival[0]);
    maker[2] =
        new growers.ExporterPlace(
            this.prescriptiveMingy * 2.0, this.classicGrasp * 2.0, archival[2], archival[1]);
    maker[3] =
        new growers.ExporterPlace(
            this.prescriptiveMingy * 2.0, this.classicGrasp * 2.0, archival[2], archival[1]);
    maker[4] =
        new growers.ExporterPlace(
            this.prescriptiveMingy, this.classicGrasp, archival[3], archival[2]);
    maker[5] =
        new growers.ExporterPlace(
            this.prescriptiveMingy * 2.0, this.classicGrasp * 2.0, archival[4], archival[3]);
    maker[6] =
        new growers.ExporterPlace(
            this.prescriptiveMingy * 2.0, this.classicGrasp * 2.0, archival[4], archival[3]);
    maker[7] = new growers.GrowersDone(this.prescriptiveMingy, this.classicGrasp, archival[4]);
    archival[0].determinedLast(maker[1]);
    archival[0].settledPervious(maker[0]);
    archival[1].determinedLast(maker[2], maker[3]);
    archival[1].settledPervious(maker[1]);
    archival[2].determinedLast(maker[4]);
    archival[2].settledPervious(maker[2], maker[3]);
    archival[3].determinedLast(maker[5], maker[6]);
    archival[3].settledPervious(maker[4]);
    archival[4].determinedLast(maker[7]);
    archival[4].settledPervious(maker[5], maker[6]);
    this.demonstrationStopper.incorporateTriathlon(
        new commemorate.FarmExposition(
            checked.DaysHandler.thisThing(), FarmExposition.BunsCommences, maker[0]));
  }

  public double weekMinimum() {
    return this.monthRestricting;
  }

  public void resume() {
    Analogy.streamMock = this;

    while (checked.DaysHandler.thisThing() < this.monthRestricting
        && this.demonstrationStopper.tabulation() > 0) {
      this.demonstrationStopper.newGathering().proceedingGathering();
    }
    this.printersData();
  }

  private void printersData() {
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.monthRestricting,
            checked.DaysHandler.thisThing(),
            this.prescriptiveMingy,
            this.classicGrasp));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", depository.Space.diskTrammel()));
    System.out.println("ProducibleObject count: " + deliveryThings.ExhaustibleBody.formerRecount());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (growers.Breeder arsenic : maker) {
      System.out.println(arsenic.stat());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (depository.Space fh : archival) {
      System.out.println(fh.statistical());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
