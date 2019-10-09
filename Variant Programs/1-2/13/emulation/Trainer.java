package emulation;

import ra.WhenGuard;
import producerArtefacts.EvaporiteDemur;
import manufacturers.*;
import closet.*;
import memorialize.*;

public class Trainer {
  private static emulation.Trainer rifeSimulate;

  public static emulation.Trainer circulatingSimulating() {
    return rifeSimulate;
  }

  private double periodsBound;
  private double receivedMiserly;
  private double measureRate;
  private manufacturers.Presenter exporter[];
  private closet.Storeroom cache[];
  private memorialize.SummitPecker spectacleSuspense;

  public Trainer(double nowRestrictions, double authoritativeHateful, double classicalGrade) {
    this.periodsBound = nowRestrictions;
    this.receivedMiserly = authoritativeHateful;
    this.measureRate = classicalGrade;
    this.spectacleSuspense = new memorialize.SummitPecker();
    this.exporter = new manufacturers.Presenter[8];
    this.cache = new closet.Storeroom[5];
    cache[0] = new closet.Storeroom();
    cache[1] = new closet.Storeroom();
    cache[2] = new closet.Storeroom();
    cache[3] = new closet.Storeroom();
    cache[4] = new closet.Storeroom();
    exporter[0] =
        new manufacturers.EmitterOpening(this.receivedMiserly, this.measureRate, cache[0]);
    exporter[1] =
        new manufacturers.GrowersFacility(
            this.receivedMiserly, this.measureRate, cache[1], cache[0]);
    exporter[2] =
        new manufacturers.GrowersFacility(
            this.receivedMiserly * 2.0, this.measureRate * 2.0, cache[2], cache[1]);
    exporter[3] =
        new manufacturers.GrowersFacility(
            this.receivedMiserly * 2.0, this.measureRate * 2.0, cache[2], cache[1]);
    exporter[4] =
        new manufacturers.GrowersFacility(
            this.receivedMiserly, this.measureRate, cache[3], cache[2]);
    exporter[5] =
        new manufacturers.GrowersFacility(
            this.receivedMiserly * 2.0, this.measureRate * 2.0, cache[4], cache[3]);
    exporter[6] =
        new manufacturers.GrowersFacility(
            this.receivedMiserly * 2.0, this.measureRate * 2.0, cache[4], cache[3]);
    exporter[7] =
        new manufacturers.OperatorConclude(this.receivedMiserly, this.measureRate, cache[4]);
    cache[0].settledFirst(exporter[1]);
    cache[0].fixPre(exporter[0]);
    cache[1].settledFirst(exporter[2], exporter[3]);
    cache[1].fixPre(exporter[1]);
    cache[2].settledFirst(exporter[4]);
    cache[2].fixPre(exporter[2], exporter[3]);
    cache[3].settledFirst(exporter[5], exporter[6]);
    cache[3].fixPre(exporter[4]);
    cache[4].settledFirst(exporter[7]);
    cache[4].fixPre(exporter[5], exporter[6]);
    this.spectacleSuspense.infixTournament(
        new memorialize.PromoterForum(
            ra.WhenGuard.liveDays(), PromoterForum.FannyBegun, exporter[0]));
  }

  public double meterCircumscribe() {
    return this.periodsBound;
  }

  public void begun() {
    Trainer.rifeSimulate = this;

    while (ra.WhenGuard.liveDays() < this.periodsBound && this.spectacleSuspense.figures() > 0) {
      this.spectacleSuspense.laterSymposium().appendageSymposium();
    }
    this.inkCensus();
  }

  private void inkCensus() {
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.periodsBound, ra.WhenGuard.liveDays(), this.receivedMiserly, this.measureRate));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", closet.Storeroom.entrepotRestrain()));
    System.out.println("ProducibleObject count: " + producerArtefacts.EvaporiteDemur.liveMatter());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (manufacturers.Presenter leong : exporter) {
      System.out.println(leong.indicators());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (closet.Storeroom waffen : cache) {
      System.out.println(waffen.numerals());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
