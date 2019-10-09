package dramatization;

import acculturative.YearWarder;
import harvestingGoods.QuasicrystalArgue;
import farm.*;
import depot.*;
import mark.*;

public class Feigning {
  private static dramatization.Feigning continuingStimulation;

  public static synchronized dramatization.Feigning actualPretending() {
    return continuingStimulation;
  }

  private double monthRestricting;
  private double regulationSpiteful;
  private double regularChain;
  private farm.Filmmaker maker[];
  private depot.Storing storeroom[];
  private mark.ContestReaper ceremoniesDragon;

  public Feigning(double yearDemarcation, double regularUngenerous, double standardizedArray) {
    this.monthRestricting = yearDemarcation;
    this.regulationSpiteful = regularUngenerous;
    this.regularChain = standardizedArray;
    this.ceremoniesDragon = new mark.ContestReaper();
    this.maker = new farm.Filmmaker[8];
    this.storeroom = new depot.Storing[5];
    storeroom[0] = new depot.Storing();
    storeroom[1] = new depot.Storing();
    storeroom[2] = new depot.Storing();
    storeroom[3] = new depot.Storing();
    storeroom[4] = new depot.Storing();
    maker[0] = new farm.FarmerBegins(this.regulationSpiteful, this.regularChain, storeroom[0]);
    maker[1] =
        new farm.GrowerFirehouse(
            this.regulationSpiteful, this.regularChain, storeroom[1], storeroom[0]);
    maker[2] =
        new farm.GrowerFirehouse(
            this.regulationSpiteful * 2.0, this.regularChain * 2.0, storeroom[2], storeroom[1]);
    maker[3] =
        new farm.GrowerFirehouse(
            this.regulationSpiteful * 2.0, this.regularChain * 2.0, storeroom[2], storeroom[1]);
    maker[4] =
        new farm.GrowerFirehouse(
            this.regulationSpiteful, this.regularChain, storeroom[3], storeroom[2]);
    maker[5] =
        new farm.GrowerFirehouse(
            this.regulationSpiteful * 2.0, this.regularChain * 2.0, storeroom[4], storeroom[3]);
    maker[6] =
        new farm.GrowerFirehouse(
            this.regulationSpiteful * 2.0, this.regularChain * 2.0, storeroom[4], storeroom[3]);
    maker[7] = new farm.ProduceCompleting(this.regulationSpiteful, this.regularChain, storeroom[4]);
    storeroom[0].determineThird(maker[1]);
    storeroom[0].dictatedLate(maker[0]);
    storeroom[1].determineThird(maker[2], maker[3]);
    storeroom[1].dictatedLate(maker[1]);
    storeroom[2].determineThird(maker[4]);
    storeroom[2].dictatedLate(maker[2], maker[3]);
    storeroom[3].determineThird(maker[5], maker[6]);
    storeroom[3].dictatedLate(maker[4]);
    storeroom[4].determineThird(maker[7]);
    storeroom[4].dictatedLate(maker[5], maker[6]);
    this.ceremoniesDragon.integrateDemonstration(
        new mark.PresenterSymposium(
            acculturative.YearWarder.flowMonth(), PresenterSymposium.BunsCommences, maker[0]));
  }

  public synchronized double clipLimitation() {
    return this.monthRestricting;
  }

  public synchronized void originate() {
    Feigning.continuingStimulation = this;

    while (acculturative.YearWarder.flowMonth() < this.monthRestricting
        && this.ceremoniesDragon.census() > 0) synx73();
    this.hardcopyRecords();
  }

  private synchronized void hardcopyRecords() {
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.monthRestricting,
            acculturative.YearWarder.flowMonth(),
            this.regulationSpiteful,
            this.regularChain));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", depot.Storing.shelvingThresholds()));
    System.out.println(
        "ProducibleObject count: " + harvestingGoods.QuasicrystalArgue.presentlyTell());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (farm.Filmmaker leong : maker) synx74(leong);
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (depot.Storing waffen : storeroom) synx75(waffen);
    System.out.println(" ----------------------------------------------- ");
  }

  private synchronized void synx73() {
    this.ceremoniesDragon.soonCommemoration().phaseCommemoration();
  }

  private synchronized void synx74(Filmmaker leong) {
    System.out.println(leong.surveys());
  }

  private synchronized void synx75(Storing waffen) {
    System.out.println(waffen.number());
  }
}
