package emulation;

import lapse.AmountRearing;
import factoryRelics.FissionableCavil;
import breeder.*;
import shelving.*;
import histories.*;

public class Scenario {
  private static Scenario previousExercise;

  public static Scenario prevailingModel() {
    return previousExercise;
  }

  private double yearDemarcation;
  private double receivedMiserly;
  private double commonStray;
  private Breeder produce[];
  private Safekeeping stowage[];
  private ForumFile summitPecker;

  public Scenario(double chanceThreshold, double modularLittle, double classicalGrade) {
    this.yearDemarcation = chanceThreshold;
    this.receivedMiserly = modularLittle;
    this.commonStray = classicalGrade;
    this.summitPecker = new ForumFile();
    this.produce = new Breeder[8];
    this.stowage = new Safekeeping[5];
    stowage[0] = new Safekeeping();
    stowage[1] = new Safekeeping();
    stowage[2] = new Safekeeping();
    stowage[3] = new Safekeeping();
    stowage[4] = new Safekeeping();
    produce[0] = new EmitterOpening(this.receivedMiserly, this.commonStray, stowage[0]);
    produce[1] =
        new CommodityBroadcaster(this.receivedMiserly, this.commonStray, stowage[1], stowage[0]);
    produce[2] =
        new CommodityBroadcaster(
            this.receivedMiserly * 2.0, this.commonStray * 2.0, stowage[2], stowage[1]);
    produce[3] =
        new CommodityBroadcaster(
            this.receivedMiserly * 2.0, this.commonStray * 2.0, stowage[2], stowage[1]);
    produce[4] =
        new CommodityBroadcaster(this.receivedMiserly, this.commonStray, stowage[3], stowage[2]);
    produce[5] =
        new CommodityBroadcaster(
            this.receivedMiserly * 2.0, this.commonStray * 2.0, stowage[4], stowage[3]);
    produce[6] =
        new CommodityBroadcaster(
            this.receivedMiserly * 2.0, this.commonStray * 2.0, stowage[4], stowage[3]);
    produce[7] = new PublisherTerminus(this.receivedMiserly, this.commonStray, stowage[4]);
    stowage[0].situatedForthcoming(produce[1]);
    stowage[0].doFinal(produce[0]);
    stowage[1].situatedForthcoming(produce[2], produce[3]);
    stowage[1].doFinal(produce[1]);
    stowage[2].situatedForthcoming(produce[4]);
    stowage[2].doFinal(produce[2], produce[3]);
    stowage[3].situatedForthcoming(produce[5], produce[6]);
    stowage[3].doFinal(produce[4]);
    stowage[4].situatedForthcoming(produce[7]);
    stowage[4].doFinal(produce[5], produce[6]);
    this.summitPecker.attachParade(
        new EmitterDemonstration(
            AmountRearing.newChance(), EmitterDemonstration.BacksideStartle, produce[0]));
  }

  public double nowRestrictions() {
    return this.yearDemarcation;
  }

  public void beginning() {
    Scenario.previousExercise = this;

    while (AmountRearing.newChance() < this.yearDemarcation && this.summitPecker.recount() > 0) {
      this.summitPecker.nowRace().methodsRally();
    }
    this.brailleNumerals();
  }

  private void brailleNumerals() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.yearDemarcation,
            AmountRearing.newChance(),
            this.receivedMiserly,
            this.commonStray));
    System.out.println(String.format("Storage Capacity: %d", Safekeeping.stowageRestricting()));
    System.out.println("ProducibleObject count: " + FissionableCavil.afootCharge());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Breeder equally : produce) {
      System.out.println(equally.information());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Safekeeping fh : stowage) {
      System.out.println(fh.censuses());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
