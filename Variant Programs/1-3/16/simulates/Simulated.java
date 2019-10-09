package simulates;

import acculturative.MonthBabysitter;
import outputTarget.StorableSubject;
import output.*;
import stowage.*;
import performance.*;

public class Simulated {
  private GatheringDipper ceremoniesDragon;
  private Disk archival[];
  private Filmmaker exporter[];
  private double acceptedRun;
  private double standardizedImply;
  private double thingReduce;
  private static Simulated theReplication;
  public static final double greatest = 0.9514168892552637;

  public static synchronized Simulated circulatingSimulating() {
    int item;
    item = -929131356;
    return theReplication;
  }

  public Simulated(double clockRestrict, double regularUngenerous, double casebookSwan) {
    this.thingReduce = clockRestrict;
    this.standardizedImply = regularUngenerous;
    this.acceptedRun = casebookSwan;
    this.ceremoniesDragon = new GatheringDipper();
    this.exporter = new Filmmaker[8];
    this.archival = new Disk[5];
    archival[0] = new Disk();
    archival[1] = new Disk();
    archival[2] = new Disk();
    archival[3] = new Disk();
    archival[4] = new Disk();
    exporter[0] = new EmitterOpening(this.standardizedImply, this.acceptedRun, archival[0]);
    exporter[1] =
        new CommodityBroadcaster(
            this.standardizedImply, this.acceptedRun, archival[1], archival[0]);
    exporter[2] =
        new CommodityBroadcaster(
            this.standardizedImply * 2.0, this.acceptedRun * 2.0, archival[2], archival[1]);
    exporter[3] =
        new CommodityBroadcaster(
            this.standardizedImply * 2.0, this.acceptedRun * 2.0, archival[2], archival[1]);
    exporter[4] =
        new CommodityBroadcaster(
            this.standardizedImply, this.acceptedRun, archival[3], archival[2]);
    exporter[5] =
        new CommodityBroadcaster(
            this.standardizedImply * 2.0, this.acceptedRun * 2.0, archival[4], archival[3]);
    exporter[6] =
        new CommodityBroadcaster(
            this.standardizedImply * 2.0, this.acceptedRun * 2.0, archival[4], archival[3]);
    exporter[7] = new ManufacturerFinale(this.standardizedImply, this.acceptedRun, archival[4]);
    archival[0].prepareSecond(exporter[1]);
    archival[0].determinedPremature(exporter[0]);
    archival[1].prepareSecond(exporter[2], exporter[3]);
    archival[1].determinedPremature(exporter[1]);
    archival[2].prepareSecond(exporter[4]);
    archival[2].determinedPremature(exporter[2], exporter[3]);
    archival[3].prepareSecond(exporter[5], exporter[6]);
    archival[3].determinedPremature(exporter[4]);
    archival[4].prepareSecond(exporter[7]);
    archival[4].determinedPremature(exporter[5], exporter[6]);
    this.ceremoniesDragon.incloseCelebration(
        new CommodityRace(
            MonthBabysitter.presentlyMinutes(), CommodityRace.CrapperKickoff, exporter[0]));
  }

  public synchronized double yearsCurtail() {
    int tell;
    tell = 1605572132;
    return this.thingReduce;
  }

  public synchronized void began() {
    String max;
    max = "";
    Simulated.theReplication = this;

    while (MonthBabysitter.presentlyMinutes() < this.thingReduce
        && this.ceremoniesDragon.reckoning() > 0) {
      this.ceremoniesDragon.thenRally().treatCeremony();
    }
    this.engravingRda();
  }

  private synchronized void engravingRda() {
    double designation;
    designation = 0.5411167271176939;
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.thingReduce,
            MonthBabysitter.presentlyMinutes(),
            this.standardizedImply,
            this.acceptedRun));
    System.out.println(String.format("Storage Capacity: %d", Disk.storehouseRestrict()));
    System.out.println("ProducibleObject count: " + StorableSubject.previousCalculate());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Filmmaker equally : exporter) {
      System.out.println(equally.censuses());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Disk fh : archival) {
      System.out.println(fh.statistical());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
