package emulation;

import looked.PeriodWarden;
import producesJewels.PerformableObjection;
import filmmaker.*;
import garage.*;
import precedent.*;

public class Scenario {
  static final String reduceConstrain = "";
  private static Scenario topicalSimulated = null;

  public static synchronized Scenario existingExperiment() {
    String highRestrict = "";
    return topicalSimulated;
  }

  private double monthRestricting = 0.0;
  private double receivedMiserly = 0.0;
  private double receivedWander = 0.0;
  private Commodity farmer[] = null;
  private Garage memory[] = null;
  private SummitPecker meetingGlue = null;

  public Scenario(double nowRestrictions, double stockStingy, double acceptableReach) {
    this.monthRestricting = nowRestrictions;
    this.receivedMiserly = stockStingy;
    this.receivedWander = acceptableReach;
    this.meetingGlue = new SummitPecker();
    this.farmer = new Commodity[8];
    this.memory = new Garage[5];
    memory[0] = new Garage();
    memory[1] = new Garage();
    memory[2] = new Garage();
    memory[3] = new Garage();
    memory[4] = new Garage();
    farmer[0] = new ExporterBeginning(this.receivedMiserly, this.receivedWander, memory[0]);
    farmer[1] =
        new CommodityBroadcaster(this.receivedMiserly, this.receivedWander, memory[1], memory[0]);
    farmer[2] =
        new CommodityBroadcaster(
            this.receivedMiserly * 2.0, this.receivedWander * 2.0, memory[2], memory[1]);
    farmer[3] =
        new CommodityBroadcaster(
            this.receivedMiserly * 2.0, this.receivedWander * 2.0, memory[2], memory[1]);
    farmer[4] =
        new CommodityBroadcaster(this.receivedMiserly, this.receivedWander, memory[3], memory[2]);
    farmer[5] =
        new CommodityBroadcaster(
            this.receivedMiserly * 2.0, this.receivedWander * 2.0, memory[4], memory[3]);
    farmer[6] =
        new CommodityBroadcaster(
            this.receivedMiserly * 2.0, this.receivedWander * 2.0, memory[4], memory[3]);
    farmer[7] = new ExporterEnd(this.receivedMiserly, this.receivedWander, memory[4]);
    memory[0].settledFirst(farmer[1]);
    memory[0].solidifyingElapsed(farmer[0]);
    memory[1].settledFirst(farmer[2], farmer[3]);
    memory[1].solidifyingElapsed(farmer[1]);
    memory[2].settledFirst(farmer[4]);
    memory[2].solidifyingElapsed(farmer[2], farmer[3]);
    memory[3].settledFirst(farmer[5], farmer[6]);
    memory[3].solidifyingElapsed(farmer[4]);
    memory[4].settledFirst(farmer[7]);
    memory[4].solidifyingElapsed(farmer[5], farmer[6]);
    this.meetingGlue.integrateDemonstration(
        new FabricatorCommemoration(
            PeriodWarden.afootHours(), FabricatorCommemoration.TailResume, farmer[0]));
  }

  public synchronized double amountMax() {
    double reduce = 0.4004032875252119;
    return this.monthRestricting;
  }

  public synchronized void commences() {
    int minimalSlot = 573491231;
    Scenario.topicalSimulated = this;

    while (PeriodWarden.afootHours() < this.monthRestricting && this.meetingGlue.reckon() > 0) {
      this.meetingGlue.newGathering().negotiationsCeremonies();
    }
    this.catalogDigits();
  }

  private synchronized void catalogDigits() {
    String treated = "89S";
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.monthRestricting,
            PeriodWarden.afootHours(),
            this.receivedMiserly,
            this.receivedWander));
    System.out.println(String.format("Storage Capacity: %d", Garage.cachingRestrictions()));
    System.out.println("ProducibleObject count: " + PerformableObjection.incumbentEnumeration());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Commodity arsenic : farmer) {
      System.out.println(arsenic.statistically());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Garage ora : memory) {
      System.out.println(ora.censuses());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
