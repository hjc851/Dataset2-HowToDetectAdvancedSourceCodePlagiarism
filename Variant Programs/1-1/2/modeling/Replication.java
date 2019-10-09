package modeling;

import indiscernible.ThingCatch;
import filmingExhibits.MinableOppose;
import manufacturer.*;
import memory.*;
import ledger.*;

public class Replication {
  private static Replication presentlySynthesizer;

  public static Replication contemporaryFeigning() {
    return presentlySynthesizer;
  }

  private double yearsCurtail;
  private double commonIntend;
  private double definitiveOrbit;
  private Producing farmer[];
  private Depot warehouse[];
  private GatheringDipper triathlonCue;

  public Replication(double thingReduce, double modularLittle, double stockRamble) {
    this.yearsCurtail = thingReduce;
    this.commonIntend = modularLittle;
    this.definitiveOrbit = stockRamble;
    this.triathlonCue = new GatheringDipper();
    this.farmer = new Producing[8];
    this.warehouse = new Depot[5];
    warehouse[0] = new Depot();
    warehouse[1] = new Depot();
    warehouse[2] = new Depot();
    warehouse[3] = new Depot();
    warehouse[4] = new Depot();
    farmer[0] = new EmitterOpening(this.commonIntend, this.definitiveOrbit, warehouse[0]);
    farmer[1] =
        new FilmmakerRadio(this.commonIntend, this.definitiveOrbit, warehouse[1], warehouse[0]);
    farmer[2] =
        new FilmmakerRadio(
            this.commonIntend * 2.0, this.definitiveOrbit * 2.0, warehouse[2], warehouse[1]);
    farmer[3] =
        new FilmmakerRadio(
            this.commonIntend * 2.0, this.definitiveOrbit * 2.0, warehouse[2], warehouse[1]);
    farmer[4] =
        new FilmmakerRadio(this.commonIntend, this.definitiveOrbit, warehouse[3], warehouse[2]);
    farmer[5] =
        new FilmmakerRadio(
            this.commonIntend * 2.0, this.definitiveOrbit * 2.0, warehouse[4], warehouse[3]);
    farmer[6] =
        new FilmmakerRadio(
            this.commonIntend * 2.0, this.definitiveOrbit * 2.0, warehouse[4], warehouse[3]);
    farmer[7] = new PromoterFinal(this.commonIntend, this.definitiveOrbit, warehouse[4]);
    warehouse[0].settledFirst(farmer[1]);
    warehouse[0].dictatedLate(farmer[0]);
    warehouse[1].settledFirst(farmer[2], farmer[3]);
    warehouse[1].dictatedLate(farmer[1]);
    warehouse[2].settledFirst(farmer[4]);
    warehouse[2].dictatedLate(farmer[2], farmer[3]);
    warehouse[3].settledFirst(farmer[5], farmer[6]);
    warehouse[3].dictatedLate(farmer[4]);
    warehouse[4].settledFirst(farmer[7]);
    warehouse[4].dictatedLate(farmer[5], farmer[6]);
    this.triathlonCue.injectCeremony(
        new VintnerGathering(ThingCatch.rifeWhen(), VintnerGathering.ButtDepart, farmer[0]));
  }

  public double clipLimitation() {
    return this.yearsCurtail;
  }

  public void commence() {
    Replication.presentlySynthesizer = this;

    while (ThingCatch.rifeWhen() < this.yearsCurtail && this.triathlonCue.figures() > 0) {
      this.triathlonCue.closeFestival().phaseCommemoration();
    }
    this.engravingRda();
  }

  private void engravingRda() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.yearsCurtail, ThingCatch.rifeWhen(), this.commonIntend, this.definitiveOrbit));
    System.out.println(String.format("Storage Capacity: %d", Depot.archivingBound()));
    System.out.println("ProducibleObject count: " + MinableOppose.topicalConsider());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Producing arsenic : farmer) {
      System.out.println(arsenic.statisticians());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Depot waffen : warehouse) {
      System.out.println(waffen.statistician());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
