package emulation;

import glanced.ClockCustodian;
import productivityDevices.QuasicrystalArgue;
import output.*;
import stowage.*;
import histories.*;

public class Simulator {
  private ExtravaganzaWait galaLine;
  private Closet stored[];
  private Grower director[];
  private double touchstoneRoam;
  private double prescriptiveMingy;
  private double junctureConstrain;
  private static Simulator thisDramatization;

  public static synchronized Simulator existingExperiment() {
    return thisDramatization;
  }

  public Simulator(double clockRestrict, double touchstoneNasty, double standardizedArray) {
    this.junctureConstrain = clockRestrict;
    this.prescriptiveMingy = touchstoneNasty;
    this.touchstoneRoam = standardizedArray;
    this.galaLine = new ExtravaganzaWait();
    this.director = new Grower[8];
    this.stored = new Closet[5];
    stored[0] = new Closet();
    stored[1] = new Closet();
    stored[2] = new Closet();
    stored[3] = new Closet();
    stored[4] = new Closet();
    director[0] = new ProduceOffset(this.prescriptiveMingy, this.touchstoneRoam, stored[0]);
    director[1] =
        new FarmerHeadquarters(this.prescriptiveMingy, this.touchstoneRoam, stored[1], stored[0]);
    director[2] =
        new FarmerHeadquarters(
            this.prescriptiveMingy * 2.0, this.touchstoneRoam * 2.0, stored[2], stored[1]);
    director[3] =
        new FarmerHeadquarters(
            this.prescriptiveMingy * 2.0, this.touchstoneRoam * 2.0, stored[2], stored[1]);
    director[4] =
        new FarmerHeadquarters(this.prescriptiveMingy, this.touchstoneRoam, stored[3], stored[2]);
    director[5] =
        new FarmerHeadquarters(
            this.prescriptiveMingy * 2.0, this.touchstoneRoam * 2.0, stored[4], stored[3]);
    director[6] =
        new FarmerHeadquarters(
            this.prescriptiveMingy * 2.0, this.touchstoneRoam * 2.0, stored[4], stored[3]);
    director[7] = new FarmerBreak(this.prescriptiveMingy, this.touchstoneRoam, stored[4]);
    stored[0].bentNew(director[1]);
    stored[0].layOld(director[0]);
    stored[1].bentNew(director[2], director[3]);
    stored[1].layOld(director[1]);
    stored[2].bentNew(director[4]);
    stored[2].layOld(director[2], director[3]);
    stored[3].bentNew(director[5], director[6]);
    stored[3].layOld(director[4]);
    stored[4].bentNew(director[7]);
    stored[4].layOld(director[5], director[6]);
    this.galaLine.installCeremonies(
        new PresenterSymposium(
            ClockCustodian.thisThing(), PresenterSymposium.TailResume, director[0]));
  }

  public synchronized double minutesCurb() {
    return this.junctureConstrain;
  }

  public synchronized void commence() {
    Simulator.thisDramatization = this;

    while (ClockCustodian.thisThing() < this.junctureConstrain && this.galaLine.figures() > 0) {
      this.galaLine.upcomingCarnival().serveParade();
    }
    this.photographyCensuses();
  }

  private synchronized void photographyCensuses() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.junctureConstrain,
            ClockCustodian.thisThing(),
            this.prescriptiveMingy,
            this.touchstoneRoam));
    System.out.println(String.format("Storage Capacity: %d", Closet.shelvingThresholds()));
    System.out.println("ProducibleObject count: " + QuasicrystalArgue.underwayTabulation());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Grower electricity : director) {
      System.out.println(electricity.stats());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Closet fh : stored) {
      System.out.println(fh.censuses());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
