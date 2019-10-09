package feigning;

import depositional.AgainOfficer;
import industrializationInstallations.ClasticVictim;
import operator.*;
import warehouse.*;
import show.*;

public class Replication {
  private static Replication continuingStimulation;

  public static Replication existingExperiment() {
    return continuingStimulation;
  }

  private double yearDemarcation;
  private double prescriptiveMingy;
  private double acceptedRun;
  private Produce output[];
  private Memory safekeeping[];
  private CommemorationBraid spectacleSuspense;

  public Replication(double thingReduce, double touchstoneNasty, double criterionalOrder) {
    this.yearDemarcation = thingReduce;
    this.prescriptiveMingy = touchstoneNasty;
    this.acceptedRun = criterionalOrder;
    this.spectacleSuspense = new CommemorationBraid();
    this.output = new Produce[8];
    this.safekeeping = new Memory[5];
    safekeeping[0] = new Memory();
    safekeeping[1] = new Memory();
    safekeeping[2] = new Memory();
    safekeeping[3] = new Memory();
    safekeeping[4] = new Memory();
    output[0] = new OutputCommencement(this.prescriptiveMingy, this.acceptedRun, safekeeping[0]);
    output[1] =
        new EmitterDock(this.prescriptiveMingy, this.acceptedRun, safekeeping[1], safekeeping[0]);
    output[2] =
        new EmitterDock(
            this.prescriptiveMingy * 2.0, this.acceptedRun * 2.0, safekeeping[2], safekeeping[1]);
    output[3] =
        new EmitterDock(
            this.prescriptiveMingy * 2.0, this.acceptedRun * 2.0, safekeeping[2], safekeeping[1]);
    output[4] =
        new EmitterDock(this.prescriptiveMingy, this.acceptedRun, safekeeping[3], safekeeping[2]);
    output[5] =
        new EmitterDock(
            this.prescriptiveMingy * 2.0, this.acceptedRun * 2.0, safekeeping[4], safekeeping[3]);
    output[6] =
        new EmitterDock(
            this.prescriptiveMingy * 2.0, this.acceptedRun * 2.0, safekeeping[4], safekeeping[3]);
    output[7] = new ProductionComplete(this.prescriptiveMingy, this.acceptedRun, safekeeping[4]);
    safekeeping[0].putFuture(output[1]);
    safekeeping[0].settledPervious(output[0]);
    safekeeping[1].putFuture(output[2], output[3]);
    safekeeping[1].settledPervious(output[1]);
    safekeeping[2].putFuture(output[4]);
    safekeeping[2].settledPervious(output[2], output[3]);
    safekeeping[3].putFuture(output[5], output[6]);
    safekeeping[3].settledPervious(output[4]);
    safekeeping[4].putFuture(output[7]);
    safekeeping[4].settledPervious(output[5], output[6]);
    this.spectacleSuspense.deleteRace(
        new ManufacturerCase(
            AgainOfficer.contemporaryMoment(), ManufacturerCase.FundamentOriginate, output[0]));
  }

  public double chanceThreshold() {
    return this.yearDemarcation;
  }

  public void begins() {
    Replication.continuingStimulation = this;

    while (AgainOfficer.contemporaryMoment() < this.yearDemarcation
        && this.spectacleSuspense.weigh() > 0) {
      this.spectacleSuspense.succeedingGala().marchCelebration();
    }
    this.lithographNumber();
  }

  private void lithographNumber() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.yearDemarcation,
            AgainOfficer.contemporaryMoment(),
            this.prescriptiveMingy,
            this.acceptedRun));
    System.out.println(String.format("Storage Capacity: %d", Memory.warehousingRestriction()));
    System.out.println("ProducibleObject count: " + ClasticVictim.actualWeigh());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Produce spain : output) {
      System.out.println(spain.census());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Memory ora : safekeeping) {
      System.out.println(ora.stats());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
