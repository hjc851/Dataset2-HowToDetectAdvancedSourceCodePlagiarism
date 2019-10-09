package simulated;

import glanced.JunctureJailer;
import supplyArtefact.TuronianOpposes;
import produce.*;
import depot.*;
import accomplishment.*;

public class Simulator {
  private static Simulator circulatingSimulating;

  public static Simulator prevailingModel() {
    return circulatingSimulating;
  }

  private double clockRestrict;
  private double prescriptiveMingy;
  private double standardizedArray;
  private Manufacturers director[];
  private Garage stowage[];
  private TournamentStandby summitPecker;

  public Simulator(double yearDemarcation, double definitiveSkilled, double criterialRank) {
    this.clockRestrict = yearDemarcation;
    this.prescriptiveMingy = definitiveSkilled;
    this.standardizedArray = criterialRank;
    this.summitPecker = new TournamentStandby();
    this.director = new Manufacturers[8];
    this.stowage = new Garage[5];
    stowage[0] = new Garage();
    stowage[1] = new Garage();
    stowage[2] = new Garage();
    stowage[3] = new Garage();
    stowage[4] = new Garage();
    director[0] = new PublisherJump(this.prescriptiveMingy, this.standardizedArray, stowage[0]);
    director[1] =
        new FabricatorBroadcasting(
            this.prescriptiveMingy, this.standardizedArray, stowage[1], stowage[0]);
    director[2] =
        new FabricatorBroadcasting(
            this.prescriptiveMingy * 2.0, this.standardizedArray * 2.0, stowage[2], stowage[1]);
    director[3] =
        new FabricatorBroadcasting(
            this.prescriptiveMingy * 2.0, this.standardizedArray * 2.0, stowage[2], stowage[1]);
    director[4] =
        new FabricatorBroadcasting(
            this.prescriptiveMingy, this.standardizedArray, stowage[3], stowage[2]);
    director[5] =
        new FabricatorBroadcasting(
            this.prescriptiveMingy * 2.0, this.standardizedArray * 2.0, stowage[4], stowage[3]);
    director[6] =
        new FabricatorBroadcasting(
            this.prescriptiveMingy * 2.0, this.standardizedArray * 2.0, stowage[4], stowage[3]);
    director[7] =
        new ProductionComplete(this.prescriptiveMingy, this.standardizedArray, stowage[4]);
    stowage[0].laidFollowing(director[1]);
    stowage[0].orderedRecord(director[0]);
    stowage[1].laidFollowing(director[2], director[3]);
    stowage[1].orderedRecord(director[1]);
    stowage[2].laidFollowing(director[4]);
    stowage[2].orderedRecord(director[2], director[3]);
    stowage[3].laidFollowing(director[5], director[6]);
    stowage[3].orderedRecord(director[4]);
    stowage[4].laidFollowing(director[7]);
    stowage[4].orderedRecord(director[5], director[6]);
    this.summitPecker.insertionSymposium(
        new OperatorContest(
            JunctureJailer.theOpportunity(), OperatorContest.ToiletBegan, director[0]));
  }

  public double whenThrottle() {
    return this.clockRestrict;
  }

  public void first() {
    Simulator.circulatingSimulating = this;

    while (JunctureJailer.theOpportunity() < this.clockRestrict && this.summitPecker.get() > 0) {
      this.summitPecker.theExposition().proceedingGathering();
    }
    this.publishFigures();
  }

  private void publishFigures() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.clockRestrict,
            JunctureJailer.theOpportunity(),
            this.prescriptiveMingy,
            this.standardizedArray));
    System.out.println(String.format("Storage Capacity: %d", Garage.storingBounds()));
    System.out.println("ProducibleObject count: " + TuronianOpposes.theFigure());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Manufacturers spain : director) {
      System.out.println(spain.number());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Garage waffen : stowage) {
      System.out.println(waffen.numerals());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
