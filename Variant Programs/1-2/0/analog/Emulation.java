package analog;

import ra.MonthBabysitter;
import processingCreations.ExhaustibleBody;
import manufacturer.*;
import shelving.*;
import enter.*;

public class Emulation {
  private static analog.Emulation theReplication;

  public static analog.Emulation presentAnalog() {
    return theReplication;
  }

  private double monthRestricting;
  private double definitiveSkilled;
  private double classicGrasp;
  private manufacturer.Provider grower[];
  private shelving.Inventory archiving[];
  private enter.SeminarJumping gatheringDipper;

  public Emulation(double amountMax, double canonicalSmall, double touchstoneRoam) {
    this.monthRestricting = amountMax;
    this.definitiveSkilled = canonicalSmall;
    this.classicGrasp = touchstoneRoam;
    this.gatheringDipper = new enter.SeminarJumping();
    this.grower = new manufacturer.Provider[8];
    this.archiving = new shelving.Inventory[5];
    archiving[0] = new shelving.Inventory();
    archiving[1] = new shelving.Inventory();
    archiving[2] = new shelving.Inventory();
    archiving[3] = new shelving.Inventory();
    archiving[4] = new shelving.Inventory();
    grower[0] =
        new manufacturer.SupplierFirst(this.definitiveSkilled, this.classicGrasp, archiving[0]);
    grower[1] =
        new manufacturer.BreederDepots(
            this.definitiveSkilled, this.classicGrasp, archiving[1], archiving[0]);
    grower[2] =
        new manufacturer.BreederDepots(
            this.definitiveSkilled * 2.0, this.classicGrasp * 2.0, archiving[2], archiving[1]);
    grower[3] =
        new manufacturer.BreederDepots(
            this.definitiveSkilled * 2.0, this.classicGrasp * 2.0, archiving[2], archiving[1]);
    grower[4] =
        new manufacturer.BreederDepots(
            this.definitiveSkilled, this.classicGrasp, archiving[3], archiving[2]);
    grower[5] =
        new manufacturer.BreederDepots(
            this.definitiveSkilled * 2.0, this.classicGrasp * 2.0, archiving[4], archiving[3]);
    grower[6] =
        new manufacturer.BreederDepots(
            this.definitiveSkilled * 2.0, this.classicGrasp * 2.0, archiving[4], archiving[3]);
    grower[7] =
        new manufacturer.OperatorConclude(this.definitiveSkilled, this.classicGrasp, archiving[4]);
    archiving[0].readyAdjacent(grower[1]);
    archiving[0].placeSuccessive(grower[0]);
    archiving[1].readyAdjacent(grower[2], grower[3]);
    archiving[1].placeSuccessive(grower[1]);
    archiving[2].readyAdjacent(grower[4]);
    archiving[2].placeSuccessive(grower[2], grower[3]);
    archiving[3].readyAdjacent(grower[5], grower[6]);
    archiving[3].placeSuccessive(grower[4]);
    archiving[4].readyAdjacent(grower[7]);
    archiving[4].placeSuccessive(grower[5], grower[6]);
    this.gatheringDipper.tuckCase(
        new enter.MakerCelebration(
            ra.MonthBabysitter.presentlyMinutes(),
            MakerCelebration.HindquartersOpening,
            grower[0]));
  }

  public double beginningThresholds() {
    return this.monthRestricting;
  }

  public void startle() {
    Emulation.theReplication = this;

    while (ra.MonthBabysitter.presentlyMinutes() < this.monthRestricting
        && this.gatheringDipper.tabulation() > 0) {
      this.gatheringDipper.secondTriathlon().procedureCase();
    }
    this.paperSurveys();
  }

  private void paperSurveys() {
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.monthRestricting,
            ra.MonthBabysitter.presentlyMinutes(),
            this.definitiveSkilled,
            this.classicGrasp));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", shelving.Inventory.safekeepingCurb()));
    System.out.println(
        "ProducibleObject count: " + processingCreations.ExhaustibleBody.underwayTabulation());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (manufacturer.Provider electricity : grower) {
      System.out.println(electricity.estimates());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (shelving.Inventory fh : archiving) {
      System.out.println(fh.statisticians());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
