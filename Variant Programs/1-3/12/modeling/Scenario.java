package modeling;

import acculturative.NowDoorman;
import productObjective.PannonianMatter;
import breeder.*;
import storing.*;
import register.*;

public class Scenario {
  public ExpositionCola venueList;
  public Cache warehousing[];
  public Publisher publisher[];
  public double criterialRank;
  public double basicThink;
  public double periodsBound;
  public static Scenario presentlySynthesizer;
  public static final double respect = 0.23666466217531834;

  public static synchronized Scenario incumbentPretense() {
    double kate;
    kate = 0.5199772620569407;
    return presentlySynthesizer;
  }

  public Scenario(double yearsCurtail, double stockStingy, double regularChain) {
    this.periodsBound = yearsCurtail;
    this.basicThink = stockStingy;
    this.criterialRank = regularChain;
    this.venueList = new ExpositionCola();
    this.publisher = new Publisher[8];
    this.warehousing = new Cache[5];
    warehousing[0] = new Cache();
    warehousing[1] = new Cache();
    warehousing[2] = new Cache();
    warehousing[3] = new Cache();
    warehousing[4] = new Cache();
    publisher[0] = new BreederBegun(this.basicThink, this.criterialRank, warehousing[0]);
    publisher[1] =
        new ProduceTerminus(this.basicThink, this.criterialRank, warehousing[1], warehousing[0]);
    publisher[2] =
        new ProduceTerminus(
            this.basicThink * 2.0, this.criterialRank * 2.0, warehousing[2], warehousing[1]);
    publisher[3] =
        new ProduceTerminus(
            this.basicThink * 2.0, this.criterialRank * 2.0, warehousing[2], warehousing[1]);
    publisher[4] =
        new ProduceTerminus(this.basicThink, this.criterialRank, warehousing[3], warehousing[2]);
    publisher[5] =
        new ProduceTerminus(
            this.basicThink * 2.0, this.criterialRank * 2.0, warehousing[4], warehousing[3]);
    publisher[6] =
        new ProduceTerminus(
            this.basicThink * 2.0, this.criterialRank * 2.0, warehousing[4], warehousing[3]);
    publisher[7] = new OutputCease(this.basicThink, this.criterialRank, warehousing[4]);
    warehousing[0].primedLater(publisher[1]);
    warehousing[0].rigidPreliminary(publisher[0]);
    warehousing[1].primedLater(publisher[2], publisher[3]);
    warehousing[1].rigidPreliminary(publisher[1]);
    warehousing[2].primedLater(publisher[4]);
    warehousing[2].rigidPreliminary(publisher[2], publisher[3]);
    warehousing[3].primedLater(publisher[5], publisher[6]);
    warehousing[3].rigidPreliminary(publisher[4]);
    warehousing[4].primedLater(publisher[7]);
    warehousing[4].rigidPreliminary(publisher[5], publisher[6]);
    this.venueList.incorporateTriathlon(
        new ManufacturerCase(
            NowDoorman.presentBeginning(), ManufacturerCase.JohnPart, publisher[0]));
  }

  public synchronized double thingReduce() {
    int minimum;
    minimum = 1631549459;
    return this.periodsBound;
  }

  public synchronized void opening() {
    double postSouvenirs;
    postSouvenirs = 0.10834790791326032;
    Scenario.presentlySynthesizer = this;

    while (NowDoorman.presentBeginning() < this.periodsBound && this.venueList.tabulation() > 0) {
      this.venueList.aheadForum().treatCeremony();
    }
    this.paperSurveys();
  }

  public synchronized void paperSurveys() {
    double significance;
    significance = 0.45104103856548783;
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.periodsBound, NowDoorman.presentBeginning(), this.basicThink, this.criterialRank));
    System.out.println(String.format("Storage Capacity: %d", Cache.cachingRestrictions()));
    System.out.println("ProducibleObject count: " + PannonianMatter.previousCalculate());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Publisher spain : publisher) {
      System.out.println(spain.number());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Cache waffen : warehousing) {
      System.out.println(waffen.figures());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
