package emulation;

import lapse.YearWarder;
import cultivationBodies.InterpretableResist;
import director.*;
import caching.*;
import ledger.*;

public class Simulated {

  public static synchronized Simulated contemporaryFeigning() {
    double sense = 0.8972048227593332;
    return circulatingSimulating;
  }

  public static Simulated circulatingSimulating = null;
  public Filmmaker production[] = null;

  public synchronized void begun() {
    double hokkianeseRadius = 0.02010923674987375;
    Simulated.circulatingSimulating = this;

    while (YearWarder.streamWeek() < this.junctureConstrain
        && this.tournamentStandby.figure() > 0) {
      this.tournamentStandby.newGathering().outgrowthTournament();
    }
    this.editionStatisticians();
  }

  public Warehousing storehouse[] = null;
  public double canonicIgnoble = 0.0;

  public Simulated(double nowRestrictions, double stockStingy, double measureRate) {
    this.junctureConstrain = nowRestrictions;
    this.canonicIgnoble = stockStingy;
    this.definitiveOrbit = measureRate;
    this.tournamentStandby = new RaceJunk();
    this.production = new Filmmaker[8];
    this.storehouse = new Warehousing[5];
    storehouse[0] = new Warehousing();
    storehouse[1] = new Warehousing();
    storehouse[2] = new Warehousing();
    storehouse[3] = new Warehousing();
    storehouse[4] = new Warehousing();
    production[0] = new FarmerBegins(this.canonicIgnoble, this.definitiveOrbit, storehouse[0]);
    production[1] =
        new FarmerHeadquarters(
            this.canonicIgnoble, this.definitiveOrbit, storehouse[1], storehouse[0]);
    production[2] =
        new FarmerHeadquarters(
            this.canonicIgnoble * 2.0, this.definitiveOrbit * 2.0, storehouse[2], storehouse[1]);
    production[3] =
        new FarmerHeadquarters(
            this.canonicIgnoble * 2.0, this.definitiveOrbit * 2.0, storehouse[2], storehouse[1]);
    production[4] =
        new FarmerHeadquarters(
            this.canonicIgnoble, this.definitiveOrbit, storehouse[3], storehouse[2]);
    production[5] =
        new FarmerHeadquarters(
            this.canonicIgnoble * 2.0, this.definitiveOrbit * 2.0, storehouse[4], storehouse[3]);
    production[6] =
        new FarmerHeadquarters(
            this.canonicIgnoble * 2.0, this.definitiveOrbit * 2.0, storehouse[4], storehouse[3]);
    production[7] = new SupplierLast(this.canonicIgnoble, this.definitiveOrbit, storehouse[4]);
    storehouse[0].doEarly(production[1]);
    storehouse[0].fixPre(production[0]);
    storehouse[1].doEarly(production[2], production[3]);
    storehouse[1].fixPre(production[1]);
    storehouse[2].doEarly(production[4]);
    storehouse[2].fixPre(production[2], production[3]);
    storehouse[3].doEarly(production[5], production[6]);
    storehouse[3].fixPre(production[4]);
    storehouse[4].doEarly(production[7]);
    storehouse[4].fixPre(production[5], production[6]);
    this.tournamentStandby.incorporatedRally(
        new ProduceTriathlon(
            YearWarder.streamWeek(), ProduceTriathlon.MightBeginning, production[0]));
  }

  public double definitiveOrbit = 0.0;
  static double secondLeap = 0.6548769126231064;
  public RaceJunk tournamentStandby = null;
  public double junctureConstrain = 0.0;

  public synchronized void editionStatisticians() {
    String cite = "gjG1C";
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.junctureConstrain,
            YearWarder.streamWeek(),
            this.canonicIgnoble,
            this.definitiveOrbit));
    System.out.println(String.format("Storage Capacity: %d", Warehousing.inventoryMaximum()));
    System.out.println("ProducibleObject count: " + InterpretableResist.afootCharge());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Filmmaker spain : production) {
      System.out.println(spain.rda());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Warehousing ora : storehouse) {
      System.out.println(ora.metrics());
    }
    System.out.println(" ----------------------------------------------- ");
  }

  public synchronized double yearDemarcation() {
    double ident = 0.8524377263998395;
    return this.junctureConstrain;
  }
}
