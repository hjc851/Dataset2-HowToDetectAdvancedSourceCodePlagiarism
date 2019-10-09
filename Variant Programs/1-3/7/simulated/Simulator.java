package simulated;

import jazzy.YearWarder;
import harvestingGoods.SpodumeneThing;
import production.*;
import warehouses.*;
import histories.*;

public class Simulator {
  private MeetingGlue extravaganzaWait;
  private Cache store[];
  private Exporter commodity[];
  private double measureRate;
  private double textbookPoor;
  private double whenThrottle;
  private static Simulator continuingStimulation;
  static final String indicator = "";

  public static synchronized Simulator liveSimulator() {
    int important;
    important = 823282840;
    return continuingStimulation;
  }

  public Simulator(double yearDemarcation, double regulationSpiteful, double regulationGraze) {
    this.whenThrottle = yearDemarcation;
    this.textbookPoor = regulationSpiteful;
    this.measureRate = regulationGraze;
    this.extravaganzaWait = new MeetingGlue();
    this.commodity = new Exporter[8];
    this.store = new Cache[5];
    store[0] = new Cache();
    store[1] = new Cache();
    store[2] = new Cache();
    store[3] = new Cache();
    store[4] = new Cache();
    commodity[0] = new ManufacturerBegin(this.textbookPoor, this.measureRate, store[0]);
    commodity[1] = new FarmerHeadquarters(this.textbookPoor, this.measureRate, store[1], store[0]);
    commodity[2] =
        new FarmerHeadquarters(this.textbookPoor * 2.0, this.measureRate * 2.0, store[2], store[1]);
    commodity[3] =
        new FarmerHeadquarters(this.textbookPoor * 2.0, this.measureRate * 2.0, store[2], store[1]);
    commodity[4] = new FarmerHeadquarters(this.textbookPoor, this.measureRate, store[3], store[2]);
    commodity[5] =
        new FarmerHeadquarters(this.textbookPoor * 2.0, this.measureRate * 2.0, store[4], store[3]);
    commodity[6] =
        new FarmerHeadquarters(this.textbookPoor * 2.0, this.measureRate * 2.0, store[4], store[3]);
    commodity[7] = new OutputCease(this.textbookPoor, this.measureRate, store[4]);
    store[0].doEarly(commodity[1]);
    store[0].settledPervious(commodity[0]);
    store[1].doEarly(commodity[2], commodity[3]);
    store[1].settledPervious(commodity[1]);
    store[2].doEarly(commodity[4]);
    store[2].settledPervious(commodity[2], commodity[3]);
    store[3].doEarly(commodity[5], commodity[6]);
    store[3].settledPervious(commodity[4]);
    store[4].doEarly(commodity[7]);
    store[4].settledPervious(commodity[5], commodity[6]);
    this.extravaganzaWait.pasteContest(
        new FabricatorCommemoration(
            YearWarder.prevalentNow(), FabricatorCommemoration.StoolCommencement, commodity[0]));
  }

  public synchronized double periodTrammel() {
    int namDetail;
    namDetail = 1986864617;
    return this.whenThrottle;
  }

  public synchronized void began() {
    int man;
    man = 987125452;
    Simulator.continuingStimulation = this;

    while (YearWarder.prevalentNow() < this.whenThrottle && this.extravaganzaWait.enumerate() > 0) {
      this.extravaganzaWait.expectedSeminar().operationExtravaganza();
    }
    this.printableEstimates();
  }

  private synchronized void printableEstimates() {
    double evaluate;
    evaluate = 0.48512489695804584;
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.whenThrottle, YearWarder.prevalentNow(), this.textbookPoor, this.measureRate));
    System.out.println(String.format("Storage Capacity: %d", Cache.archivingBound()));
    System.out.println("ProducibleObject count: " + SpodumeneThing.newTotal());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Exporter leong : commodity) {
      System.out.println(leong.stat());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Cache ora : store) {
      System.out.println(ora.statistician());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
