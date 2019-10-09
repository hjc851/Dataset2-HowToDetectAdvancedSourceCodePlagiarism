package emulation;

import ra.BeginningHousekeeper;
import manufacturingPieces.PhyllosilicatePreclude;
import provider.*;
import cache.*;
import performance.*;

public class Mock {
  private performance.GalaLine galaLine = null;
  private cache.Storeroom inventory[] = null;
  private provider.Promoter manufacturers[] = null;
  private double definitiveOrbit = 0.0;
  private double measureBeggarly = 0.0;
  private double momentRestrain = 0.0;
  private static emulation.Mock existingExperiment = null;

  public static synchronized emulation.Mock theReplication() {
    return existingExperiment;
  }

  public Mock(double monthRestricting, double modularLittle, double basicAmbit) {
    this.momentRestrain = monthRestricting;
    this.measureBeggarly = modularLittle;
    this.definitiveOrbit = basicAmbit;
    this.galaLine = new performance.GalaLine();
    this.manufacturers = new provider.Promoter[8];
    this.inventory = new cache.Storeroom[5];
    inventory[0] = new cache.Storeroom();
    inventory[1] = new cache.Storeroom();
    inventory[2] = new cache.Storeroom();
    inventory[3] = new cache.Storeroom();
    inventory[4] = new cache.Storeroom();
    manufacturers[0] =
        new provider.DirectorPart(this.measureBeggarly, this.definitiveOrbit, inventory[0]);
    manufacturers[1] =
        new provider.VintnerObservatory(
            this.measureBeggarly, this.definitiveOrbit, inventory[1], inventory[0]);
    manufacturers[2] =
        new provider.VintnerObservatory(
            this.measureBeggarly * 2.0, this.definitiveOrbit * 2.0, inventory[2], inventory[1]);
    manufacturers[3] =
        new provider.VintnerObservatory(
            this.measureBeggarly * 2.0, this.definitiveOrbit * 2.0, inventory[2], inventory[1]);
    manufacturers[4] =
        new provider.VintnerObservatory(
            this.measureBeggarly, this.definitiveOrbit, inventory[3], inventory[2]);
    manufacturers[5] =
        new provider.VintnerObservatory(
            this.measureBeggarly * 2.0, this.definitiveOrbit * 2.0, inventory[4], inventory[3]);
    manufacturers[6] =
        new provider.VintnerObservatory(
            this.measureBeggarly * 2.0, this.definitiveOrbit * 2.0, inventory[4], inventory[3]);
    manufacturers[7] =
        new provider.FabricatorGet(this.measureBeggarly, this.definitiveOrbit, inventory[4]);
    inventory[0].solidifyingThe(manufacturers[1]);
    inventory[0].determineInitial(manufacturers[0]);
    inventory[1].solidifyingThe(manufacturers[2], manufacturers[3]);
    inventory[1].determineInitial(manufacturers[1]);
    inventory[2].solidifyingThe(manufacturers[4]);
    inventory[2].determineInitial(manufacturers[2], manufacturers[3]);
    inventory[3].solidifyingThe(manufacturers[5], manufacturers[6]);
    inventory[3].determineInitial(manufacturers[4]);
    inventory[4].solidifyingThe(manufacturers[7]);
    inventory[4].determineInitial(manufacturers[5], manufacturers[6]);
    this.galaLine.integrateDemonstration(
        new performance.GrowerParade(
            ra.BeginningHousekeeper.topicalPeriod(), GrowerParade.SeatRun, manufacturers[0]));
  }

  public synchronized double hourRestricts() {
    return this.momentRestrain;
  }

  public synchronized void initiate() {
    Mock.existingExperiment = this;

    while (ra.BeginningHousekeeper.topicalPeriod() < this.momentRestrain
        && this.galaLine.enumerate() > 0) {
      this.galaLine.earlyMeeting().proceduresSeminar();
    }
    this.publicationMetrics();
  }

  private synchronized void publicationMetrics() {
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.momentRestrain,
            ra.BeginningHousekeeper.topicalPeriod(),
            this.measureBeggarly,
            this.definitiveOrbit));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", cache.Storeroom.storeConfine()));
    System.out.println(
        "ProducibleObject count: "
            + manufacturingPieces.PhyllosilicatePreclude.prevalentCalculation());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (provider.Promoter electricity : manufacturers) {
      System.out.println(electricity.records());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (cache.Storeroom ora : inventory) {
      System.out.println(ora.censuses());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
