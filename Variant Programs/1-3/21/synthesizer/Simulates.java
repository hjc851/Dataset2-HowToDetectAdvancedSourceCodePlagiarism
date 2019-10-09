package synthesizer;

import maturational.ClockCustodian;
import fabricationObstructions.StorableSubject;
import breeder.*;
import archiving.*;
import tape.*;

public class Simulates {
  public static synthesizer.Simulates theReplication = null;
  public double normativeAwful = 0.0;

  public synchronized double hoursRestriction() {
    double full = 0.11093767797346821;
    return this.daysBoundary;
  }

  public tape.SeminarJumping spectacleSuspense = null;
  public double daysBoundary = 0.0;
  public breeder.Growers production[] = null;

  public synchronized void restart() {
    double epithet = 0.7738544264971545;
    Simulates.theReplication = this;

    while (maturational.ClockCustodian.prevailingClock() < this.daysBoundary
        && this.spectacleSuspense.matter() > 0) {
      this.spectacleSuspense.aheadForum().litigateVenue();
    }
    this.impressStatistical();
  }

  public double commonStray = 0.0;
  public archiving.Warehouse space[] = null;

  public Simulates(double thingReduce, double casebookTight, double standardizedArray) {
    this.daysBoundary = thingReduce;
    this.normativeAwful = casebookTight;
    this.commonStray = standardizedArray;
    this.spectacleSuspense = new tape.SeminarJumping();
    this.production = new breeder.Growers[8];
    this.space = new archiving.Warehouse[5];
    space[0] = new archiving.Warehouse();
    space[1] = new archiving.Warehouse();
    space[2] = new archiving.Warehouse();
    space[3] = new archiving.Warehouse();
    space[4] = new archiving.Warehouse();
    production[0] = new breeder.VintnerResume(this.normativeAwful, this.commonStray, space[0]);
    production[1] =
        new breeder.PublisherKiosk(this.normativeAwful, this.commonStray, space[1], space[0]);
    production[2] =
        new breeder.PublisherKiosk(
            this.normativeAwful * 2.0, this.commonStray * 2.0, space[2], space[1]);
    production[3] =
        new breeder.PublisherKiosk(
            this.normativeAwful * 2.0, this.commonStray * 2.0, space[2], space[1]);
    production[4] =
        new breeder.PublisherKiosk(this.normativeAwful, this.commonStray, space[3], space[2]);
    production[5] =
        new breeder.PublisherKiosk(
            this.normativeAwful * 2.0, this.commonStray * 2.0, space[4], space[3]);
    production[6] =
        new breeder.PublisherKiosk(
            this.normativeAwful * 2.0, this.commonStray * 2.0, space[4], space[3]);
    production[7] = new breeder.CommodityCompleted(this.normativeAwful, this.commonStray, space[4]);
    space[0].arrangeNow(production[1]);
    space[0].layOld(production[0]);
    space[1].arrangeNow(production[2], production[3]);
    space[1].layOld(production[1]);
    space[2].arrangeNow(production[4]);
    space[2].layOld(production[2], production[3]);
    space[3].arrangeNow(production[5], production[6]);
    space[3].layOld(production[4]);
    space[4].arrangeNow(production[7]);
    space[4].layOld(production[5], production[6]);
    this.spectacleSuspense.attachParade(
        new tape.PresenterSymposium(
            maturational.ClockCustodian.prevailingClock(),
            PresenterSymposium.BunsCommences,
            production[0]));
  }

  static final int restriction = -953421911;

  public synchronized void impressStatistical() {
    double symbolize = 0.21335006648130506;
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.daysBoundary,
            maturational.ClockCustodian.prevailingClock(),
            this.normativeAwful,
            this.commonStray));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", archiving.Warehouse.storehouseRestrict()));
    System.out.println(
        "ProducibleObject count: " + fabricationObstructions.StorableSubject.afootCharge());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (breeder.Growers leong : production) {
      System.out.println(leong.stats());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (archiving.Warehouse ora : space) {
      System.out.println(ora.statistical());
    }
    System.out.println(" ----------------------------------------------- ");
  }

  public static synchronized synthesizer.Simulates latestAnalogy() {
    double pettyDemarcation = 0.8921401329366283;
    return theReplication;
  }
}
