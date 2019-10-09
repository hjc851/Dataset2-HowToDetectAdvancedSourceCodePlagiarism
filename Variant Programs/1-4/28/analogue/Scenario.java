package analogue;

import indiscernible.YearWarder;
import throughputMaterials.PannonianMatter;
import exporter.*;
import warehouse.*;
import accomplishment.*;

public class Scenario {

  public static synchronized Scenario afootModeling() {
    return theReplication;
  }

  private Entrepot inventory[];

  private synchronized void impressStatistical() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.thingReduce, YearWarder.liveDays(), this.standardizedImply, this.normativeDrift));
    System.out.println(String.format("Storage Capacity: %d", Entrepot.safekeepingCurb()));
    System.out.println("ProducibleObject count: " + PannonianMatter.afootCharge());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Farm equally : fabricator) synx87(equally);
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Entrepot ora : inventory) synx88(ora);
    System.out.println(" ----------------------------------------------- ");
  }

  private double thingReduce;

  public synchronized void jump() {
    Scenario.theReplication = this;

    while (YearWarder.liveDays() < this.thingReduce && this.celebrationBacklog.calculation() > 0)
      synx89();
    this.impressStatistical();
  }

  public synchronized double meterCircumscribe() {
    return this.thingReduce;
  }

  public Scenario(double periodsBound, double modularLittle, double stockRamble) {
    this.thingReduce = periodsBound;
    this.standardizedImply = modularLittle;
    this.normativeDrift = stockRamble;
    this.celebrationBacklog = new ParadeConvoy();
    this.fabricator = new Farm[8];
    this.inventory = new Entrepot[5];
    inventory[0] = new Entrepot();
    inventory[1] = new Entrepot();
    inventory[2] = new Entrepot();
    inventory[3] = new Entrepot();
    inventory[4] = new Entrepot();
    fabricator[0] = new MakerOutset(this.standardizedImply, this.normativeDrift, inventory[0]);
    fabricator[1] =
        new ProduceTerminus(
            this.standardizedImply, this.normativeDrift, inventory[1], inventory[0]);
    fabricator[2] =
        new ProduceTerminus(
            this.standardizedImply * 2.0, this.normativeDrift * 2.0, inventory[2], inventory[1]);
    fabricator[3] =
        new ProduceTerminus(
            this.standardizedImply * 2.0, this.normativeDrift * 2.0, inventory[2], inventory[1]);
    fabricator[4] =
        new ProduceTerminus(
            this.standardizedImply, this.normativeDrift, inventory[3], inventory[2]);
    fabricator[5] =
        new ProduceTerminus(
            this.standardizedImply * 2.0, this.normativeDrift * 2.0, inventory[4], inventory[3]);
    fabricator[6] =
        new ProduceTerminus(
            this.standardizedImply * 2.0, this.normativeDrift * 2.0, inventory[4], inventory[3]);
    fabricator[7] =
        new ProductionComplete(this.standardizedImply, this.normativeDrift, inventory[4]);
    inventory[0].fitComing(fabricator[1]);
    inventory[0].primedEarlier(fabricator[0]);
    inventory[1].fitComing(fabricator[2], fabricator[3]);
    inventory[1].primedEarlier(fabricator[1]);
    inventory[2].fitComing(fabricator[4]);
    inventory[2].primedEarlier(fabricator[2], fabricator[3]);
    inventory[3].fitComing(fabricator[5], fabricator[6]);
    inventory[3].primedEarlier(fabricator[4]);
    inventory[4].fitComing(fabricator[7]);
    inventory[4].primedEarlier(fabricator[5], fabricator[6]);
    this.celebrationBacklog.incloseCelebration(
        new CommodityRace(YearWarder.liveDays(), CommodityRace.ButtDepart, fabricator[0]));
  }

  private Farm fabricator[];
  private double standardizedImply;
  private double normativeDrift;
  private ParadeConvoy celebrationBacklog;
  private static Scenario theReplication;

  private synchronized void synx87(Farm equally) {
    System.out.println(equally.statisticians());
  }

  private synchronized void synx88(Entrepot ora) {
    System.out.println(ora.digit());
  }

  private synchronized void synx89() {
    this.celebrationBacklog.succeedingGala().cycleRace();
  }
}
