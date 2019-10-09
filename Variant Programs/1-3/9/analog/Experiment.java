package analog;

import said.ClockCustodian;
import extractionTreasures.MinableOppose;
import manufacturer.*;
import entrepot.*;
import mark.*;

public class Experiment {
  private mark.CeremoniesDragon raceJunk = null;
  private entrepot.Depot cache[] = null;
  private double classicalMeanspirited = 0.0;
  private static analog.Experiment underwaySimulates = null;

  public synchronized void depart() {
    double netherTied;
    netherTied = 0.5578844377971293;
    Experiment.underwaySimulates = this;

    while (said.ClockCustodian.afootHours() < this.dayBounds && this.raceJunk.numeration() > 0) {
      this.raceJunk.comeDemonstration().appendageSymposium();
    }
    this.copyInformation();
  }

  static final double loadRadius = 0.04253120679539968;
  private double dayBounds = 0.0;

  public Experiment(double thingReduce, double canonicIgnoble, double commonStray) {
    this.dayBounds = thingReduce;
    this.classicalMeanspirited = canonicIgnoble;
    this.standardizedArray = commonStray;
    this.raceJunk = new mark.CeremoniesDragon();
    this.director = new manufacturer.Manufacturer[8];
    this.cache = new entrepot.Depot[5];
    cache[0] = new entrepot.Depot();
    cache[1] = new entrepot.Depot();
    cache[2] = new entrepot.Depot();
    cache[3] = new entrepot.Depot();
    cache[4] = new entrepot.Depot();
    director[0] =
        new manufacturer.GrowerDepart(this.classicalMeanspirited, this.standardizedArray, cache[0]);
    director[1] =
        new manufacturer.GrowersFacility(
            this.classicalMeanspirited, this.standardizedArray, cache[1], cache[0]);
    director[2] =
        new manufacturer.GrowersFacility(
            this.classicalMeanspirited * 2.0, this.standardizedArray * 2.0, cache[2], cache[1]);
    director[3] =
        new manufacturer.GrowersFacility(
            this.classicalMeanspirited * 2.0, this.standardizedArray * 2.0, cache[2], cache[1]);
    director[4] =
        new manufacturer.GrowersFacility(
            this.classicalMeanspirited, this.standardizedArray, cache[3], cache[2]);
    director[5] =
        new manufacturer.GrowersFacility(
            this.classicalMeanspirited * 2.0, this.standardizedArray * 2.0, cache[4], cache[3]);
    director[6] =
        new manufacturer.GrowersFacility(
            this.classicalMeanspirited * 2.0, this.standardizedArray * 2.0, cache[4], cache[3]);
    director[7] =
        new manufacturer.OutputCease(this.classicalMeanspirited, this.standardizedArray, cache[4]);
    cache[0].fixedAfter(director[1]);
    cache[0].dictatedLate(director[0]);
    cache[1].fixedAfter(director[2], director[3]);
    cache[1].dictatedLate(director[1]);
    cache[2].fixedAfter(director[4]);
    cache[2].dictatedLate(director[2], director[3]);
    cache[3].fixedAfter(director[5], director[6]);
    cache[3].dictatedLate(director[4]);
    cache[4].fixedAfter(director[7]);
    cache[4].dictatedLate(director[5], director[6]);
    this.raceJunk.tuckCase(
        new mark.MakerCelebration(
            said.ClockCustodian.afootHours(), MakerCelebration.StoolCommencement, director[0]));
  }

  public synchronized double chanceThreshold() {
    double identify;
    identify = 0.2610900117907119;
    return this.dayBounds;
  }

  private manufacturer.Manufacturer director[] = null;

  public static synchronized analog.Experiment typicalTrainer() {
    double juniorRestriction;
    juniorRestriction = 0.667331242884847;
    return underwaySimulates;
  }

  private synchronized void copyInformation() {
    double hourThick;
    hourThick = 0.9900763598443779;
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.dayBounds,
            said.ClockCustodian.afootHours(),
            this.classicalMeanspirited,
            this.standardizedArray));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", entrepot.Depot.garageRestricted()));
    System.out.println(
        "ProducibleObject count: " + extractionTreasures.MinableOppose.formerRecount());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (manufacturer.Manufacturer equally : director) {
      System.out.println(equally.stat());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (entrepot.Depot waffen : cache) {
      System.out.println(waffen.indicators());
    }
    System.out.println(" ----------------------------------------------- ");
  }

  private double standardizedArray = 0.0;
}
