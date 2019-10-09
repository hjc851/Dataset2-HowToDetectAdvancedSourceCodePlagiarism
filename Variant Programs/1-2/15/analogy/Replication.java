package analogy;

import developmental.BeginningHousekeeper;
import producesJewels.HypabyssalTotem;
import publisher.*;
import memory.*;
import disc.*;

public class Replication {
  private static Replication existingExperiment;

  public static Replication prevailingModel() {
    return existingExperiment;
  }

  private double chanceThreshold;
  private double criterionEntail;
  private double criterionalOrder;
  private Grower filmmaker[];
  private Garage stored[];
  private CelebrationBacklog commemorationBraid;

  public Replication(double opportunityMaximum, double regularUngenerous, double acceptedRun) {
    this.chanceThreshold = opportunityMaximum;
    this.criterionEntail = regularUngenerous;
    this.criterionalOrder = acceptedRun;
    this.commemorationBraid = new CelebrationBacklog();
    this.filmmaker = new Grower[8];
    this.stored = new Garage[5];
    stored[0] = new Garage();
    stored[1] = new Garage();
    stored[2] = new Garage();
    stored[3] = new Garage();
    stored[4] = new Garage();
    filmmaker[0] = new PresenterGet(this.criterionEntail, this.criterionalOrder, stored[0]);
    filmmaker[1] =
        new PromoterTrain(this.criterionEntail, this.criterionalOrder, stored[1], stored[0]);
    filmmaker[2] =
        new PromoterTrain(
            this.criterionEntail * 2.0, this.criterionalOrder * 2.0, stored[2], stored[1]);
    filmmaker[3] =
        new PromoterTrain(
            this.criterionEntail * 2.0, this.criterionalOrder * 2.0, stored[2], stored[1]);
    filmmaker[4] =
        new PromoterTrain(this.criterionEntail, this.criterionalOrder, stored[3], stored[2]);
    filmmaker[5] =
        new PromoterTrain(
            this.criterionEntail * 2.0, this.criterionalOrder * 2.0, stored[4], stored[3]);
    filmmaker[6] =
        new PromoterTrain(
            this.criterionEntail * 2.0, this.criterionalOrder * 2.0, stored[4], stored[3]);
    filmmaker[7] = new FarmExit(this.criterionEntail, this.criterionalOrder, stored[4]);
    stored[0].determinedLast(filmmaker[1]);
    stored[0].determinedPremature(filmmaker[0]);
    stored[1].determinedLast(filmmaker[2], filmmaker[3]);
    stored[1].determinedPremature(filmmaker[1]);
    stored[2].determinedLast(filmmaker[4]);
    stored[2].determinedPremature(filmmaker[2], filmmaker[3]);
    stored[3].determinedLast(filmmaker[5], filmmaker[6]);
    stored[3].determinedPremature(filmmaker[4]);
    stored[4].determinedLast(filmmaker[7]);
    stored[4].determinedPremature(filmmaker[5], filmmaker[6]);
    this.commemorationBraid.insertionSymposium(
        new EmitterDemonstration(
            BeginningHousekeeper.prevailingClock(), EmitterDemonstration.AssGo, filmmaker[0]));
  }

  public double sentenceConfine() {
    return this.chanceThreshold;
  }

  public void began() {
    Replication.existingExperiment = this;

    while (BeginningHousekeeper.prevailingClock() < this.chanceThreshold
        && this.commemorationBraid.census() > 0) {
      this.commemorationBraid.laterSymposium().operationExtravaganza();
    }
    this.copyInformation();
  }

  private void copyInformation() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.chanceThreshold,
            BeginningHousekeeper.prevailingClock(),
            this.criterionEntail,
            this.criterionalOrder));
    System.out.println(String.format("Storage Capacity: %d", Garage.warehousesMinimum()));
    System.out.println("ProducibleObject count: " + HypabyssalTotem.circulatingReckon());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Grower electricity : filmmaker) {
      System.out.println(electricity.numbers());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Garage waffen : stored) {
      System.out.println(waffen.estimates());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
