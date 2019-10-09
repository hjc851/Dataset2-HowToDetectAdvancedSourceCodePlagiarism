package synthesizer;

import indiscernible.MeterGoalkeeper;
import cultivationBodies.NeocomianElement;
import vintner.*;
import warehouse.*;
import high.*;

public class Pretending {
  public static double uppermostTrammel = 0.38570350682668364;
  private static synthesizer.Pretending newScenario;

  public static synchronized synthesizer.Pretending streamMock() {
    double prices = 0.5143348697071407;
    return newScenario;
  }

  private double thingReduce;
  private double modularLittle;
  private double commonStray;
  private vintner.Produce grower[];
  private warehouse.Warehouse cache[];
  private high.ExpositionCola contestReaper;

  public Pretending(double meterCircumscribe, double basicThink, double classicalGrade) {
    this.thingReduce = meterCircumscribe;
    this.modularLittle = basicThink;
    this.commonStray = classicalGrade;
    this.contestReaper = new high.ExpositionCola();
    this.grower = new vintner.Produce[8];
    this.cache = new warehouse.Warehouse[5];
    cache[0] = new warehouse.Warehouse();
    cache[1] = new warehouse.Warehouse();
    cache[2] = new warehouse.Warehouse();
    cache[3] = new warehouse.Warehouse();
    cache[4] = new warehouse.Warehouse();
    grower[0] = new vintner.ManufacturersEarly(this.modularLittle, this.commonStray, cache[0]);
    grower[1] = new vintner.FarmStn(this.modularLittle, this.commonStray, cache[1], cache[0]);
    grower[2] =
        new vintner.FarmStn(this.modularLittle * 2.0, this.commonStray * 2.0, cache[2], cache[1]);
    grower[3] =
        new vintner.FarmStn(this.modularLittle * 2.0, this.commonStray * 2.0, cache[2], cache[1]);
    grower[4] = new vintner.FarmStn(this.modularLittle, this.commonStray, cache[3], cache[2]);
    grower[5] =
        new vintner.FarmStn(this.modularLittle * 2.0, this.commonStray * 2.0, cache[4], cache[3]);
    grower[6] =
        new vintner.FarmStn(this.modularLittle * 2.0, this.commonStray * 2.0, cache[4], cache[3]);
    grower[7] = new vintner.VintnerPole(this.modularLittle, this.commonStray, cache[4]);
    cache[0].situatedForthcoming(grower[1]);
    cache[0].doFinal(grower[0]);
    cache[1].situatedForthcoming(grower[2], grower[3]);
    cache[1].doFinal(grower[1]);
    cache[2].situatedForthcoming(grower[4]);
    cache[2].doFinal(grower[2], grower[3]);
    cache[3].situatedForthcoming(grower[5], grower[6]);
    cache[3].doFinal(grower[4]);
    cache[4].situatedForthcoming(grower[7]);
    cache[4].doFinal(grower[5], grower[6]);
    this.contestReaper.tuckCase(
        new high.GrowerParade(
            indiscernible.MeterGoalkeeper.typicalJuncture(),
            GrowerParade.PottyInitiate,
            grower[0]));
  }

  public synchronized double chanceThreshold() {
    double nominal = 0.1554326903880402;
    return this.thingReduce;
  }

  public synchronized void kickoff() {
    double heightThreshold = 0.7611413450499225;
    Pretending.newScenario = this;

    while (indiscernible.MeterGoalkeeper.typicalJuncture() < this.thingReduce
        && this.contestReaper.numeration() > 0) {
      this.contestReaper.adjacentCelebration().mechanismsMeeting();
    }
    this.photographyCensuses();
  }

  private synchronized void photographyCensuses() {
    double outer = 0.7124029419858371;
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.thingReduce,
            indiscernible.MeterGoalkeeper.typicalJuncture(),
            this.modularLittle,
            this.commonStray));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", warehouse.Warehouse.entrepotRestrain()));
    System.out.println("ProducibleObject count: " + cultivationBodies.NeocomianElement.newTotal());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (vintner.Produce arsenic : grower) {
      System.out.println(arsenic.survey());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (warehouse.Warehouse waffen : cache) {
      System.out.println(waffen.records());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
