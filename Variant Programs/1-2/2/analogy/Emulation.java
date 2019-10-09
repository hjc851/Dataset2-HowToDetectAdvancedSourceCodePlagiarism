package analogy;

import acculturative.DaysHandler;
import factoryRelics.FissionableCavil;
import farmer.*;
import safekeeping.*;
import enter.*;

public class Emulation {
  private static analogy.Emulation underwaySimulates;

  public static analogy.Emulation flowEmulation() {
    return underwaySimulates;
  }

  private double periodsBound;
  private double standardizedImply;
  private double commonStray;
  private farmer.Vintner commodity[];
  private safekeeping.Store cache[];
  private enter.CeremoniesDragon paradeConvoy;

  public Emulation(double junctureConstrain, double normativeAwful, double acceptedRun) {
    this.periodsBound = junctureConstrain;
    this.standardizedImply = normativeAwful;
    this.commonStray = acceptedRun;
    this.paradeConvoy = new enter.CeremoniesDragon();
    this.commodity = new farmer.Vintner[8];
    this.cache = new safekeeping.Store[5];
    cache[0] = new safekeeping.Store();
    cache[1] = new safekeeping.Store();
    cache[2] = new safekeeping.Store();
    cache[3] = new safekeeping.Store();
    cache[4] = new safekeeping.Store();
    commodity[0] = new farmer.FilmmakerInitiate(this.standardizedImply, this.commonStray, cache[0]);
    commodity[1] =
        new farmer.PromoterTrain(this.standardizedImply, this.commonStray, cache[1], cache[0]);
    commodity[2] =
        new farmer.PromoterTrain(
            this.standardizedImply * 2.0, this.commonStray * 2.0, cache[2], cache[1]);
    commodity[3] =
        new farmer.PromoterTrain(
            this.standardizedImply * 2.0, this.commonStray * 2.0, cache[2], cache[1]);
    commodity[4] =
        new farmer.PromoterTrain(this.standardizedImply, this.commonStray, cache[3], cache[2]);
    commodity[5] =
        new farmer.PromoterTrain(
            this.standardizedImply * 2.0, this.commonStray * 2.0, cache[4], cache[3]);
    commodity[6] =
        new farmer.PromoterTrain(
            this.standardizedImply * 2.0, this.commonStray * 2.0, cache[4], cache[3]);
    commodity[7] = new farmer.EmitterCompletes(this.standardizedImply, this.commonStray, cache[4]);
    cache[0].settledFirst(commodity[1]);
    cache[0].arrangedEarly(commodity[0]);
    cache[1].settledFirst(commodity[2], commodity[3]);
    cache[1].arrangedEarly(commodity[1]);
    cache[2].settledFirst(commodity[4]);
    cache[2].arrangedEarly(commodity[2], commodity[3]);
    cache[3].settledFirst(commodity[5], commodity[6]);
    cache[3].arrangedEarly(commodity[4]);
    cache[4].settledFirst(commodity[7]);
    cache[4].arrangedEarly(commodity[5], commodity[6]);
    this.paradeConvoy.incorporatedRally(
        new enter.FarmExposition(
            acculturative.DaysHandler.flowMonth(),
            FarmExposition.FundamentOriginate,
            commodity[0]));
  }

  public double thingReduce() {
    return this.periodsBound;
  }

  public void commencement() {
    Emulation.underwaySimulates = this;

    while (acculturative.DaysHandler.flowMonth() < this.periodsBound
        && this.paradeConvoy.tell() > 0) {
      this.paradeConvoy.afterSpectacle().negotiationsCeremonies();
    }
    this.typescriptDigit();
  }

  private void typescriptDigit() {
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.periodsBound,
            acculturative.DaysHandler.flowMonth(),
            this.standardizedImply,
            this.commonStray));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", safekeeping.Store.repositoryThreshold()));
    System.out.println(
        "ProducibleObject count: " + factoryRelics.FissionableCavil.contemporaryReckoning());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (farmer.Vintner arsenic : commodity) {
      System.out.println(arsenic.statisticians());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (safekeeping.Store waffen : cache) {
      System.out.println(waffen.stat());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
