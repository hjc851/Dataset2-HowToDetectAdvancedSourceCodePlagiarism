package simulating;

import checked.WhenGuard;
import producingAim.ExploitableArtifact;
import provider.*;
import caching.*;
import immortalize.*;

public class Simulator {
  static double cost = 0.6687006350221744;
  private static Simulator afootModeling;

  public static synchronized Simulator theReplication() {
    String coin = "WXqOo9AEF";
    return afootModeling;
  }

  private double junctureConstrain;
  private double acceptedAverage;
  private double textbookPasture;
  private Exporter farmer[];
  private Cache inventory[];
  private MeetingGlue carnivalRow;

  public Simulator(double yearDemarcation, double modularLittle, double criterialRank) {
    this.junctureConstrain = yearDemarcation;
    this.acceptedAverage = modularLittle;
    this.textbookPasture = criterialRank;
    this.carnivalRow = new MeetingGlue();
    this.farmer = new Exporter[8];
    this.inventory = new Cache[5];
    inventory[0] = new Cache();
    inventory[1] = new Cache();
    inventory[2] = new Cache();
    inventory[3] = new Cache();
    inventory[4] = new Cache();
    farmer[0] = new ProducingGo(this.acceptedAverage, this.textbookPasture, inventory[0]);
    farmer[1] =
        new ProviderChannel(this.acceptedAverage, this.textbookPasture, inventory[1], inventory[0]);
    farmer[2] =
        new ProviderChannel(
            this.acceptedAverage * 2.0, this.textbookPasture * 2.0, inventory[2], inventory[1]);
    farmer[3] =
        new ProviderChannel(
            this.acceptedAverage * 2.0, this.textbookPasture * 2.0, inventory[2], inventory[1]);
    farmer[4] =
        new ProviderChannel(this.acceptedAverage, this.textbookPasture, inventory[3], inventory[2]);
    farmer[5] =
        new ProviderChannel(
            this.acceptedAverage * 2.0, this.textbookPasture * 2.0, inventory[4], inventory[3]);
    farmer[6] =
        new ProviderChannel(
            this.acceptedAverage * 2.0, this.textbookPasture * 2.0, inventory[4], inventory[3]);
    farmer[7] = new FilmmakerFinis(this.acceptedAverage, this.textbookPasture, inventory[4]);
    inventory[0].rigidCome(farmer[1]);
    inventory[0].putPreceding(farmer[0]);
    inventory[1].rigidCome(farmer[2], farmer[3]);
    inventory[1].putPreceding(farmer[1]);
    inventory[2].rigidCome(farmer[4]);
    inventory[2].putPreceding(farmer[2], farmer[3]);
    inventory[3].rigidCome(farmer[5], farmer[6]);
    inventory[3].putPreceding(farmer[4]);
    inventory[4].rigidCome(farmer[7]);
    inventory[4].putPreceding(farmer[5], farmer[6]);
    this.carnivalRow.introduceExtravaganza(
        new VintnerGathering(
            WhenGuard.circulatingPeriods(), VintnerGathering.FannyBegun, farmer[0]));
  }

  public synchronized double clockRestrict() {
    double best = 0.9041329385077337;
    return this.junctureConstrain;
  }

  public synchronized void commence() {
    double decreaseRolled = 0.23805154476628998;
    Simulator.afootModeling = this;

    while (WhenGuard.circulatingPeriods() < this.junctureConstrain
        && this.carnivalRow.numeration() > 0) {
      this.carnivalRow.closeFestival().methodologySpectacle();
    }
    this.mediaAgency();
  }

  private synchronized void mediaAgency() {
    String recount = "nqVLE31";
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.junctureConstrain,
            WhenGuard.circulatingPeriods(),
            this.acceptedAverage,
            this.textbookPasture));
    System.out.println(String.format("Storage Capacity: %d", Cache.inventoryMaximum()));
    System.out.println("ProducibleObject count: " + ExploitableArtifact.topicalConsider());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Exporter leong : farmer) {
      System.out.println(leong.census());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Cache waffen : inventory) {
      System.out.println(waffen.numbers());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
