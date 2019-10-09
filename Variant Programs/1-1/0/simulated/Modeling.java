package simulated;

import glanced.YearWarder;
import manufactureOrnaments.ImmiscibleDisagree;
import producing.*;
import warehousing.*;
import platter.*;

public class Modeling {
  private static Modeling existingExperiment;

  public static Modeling presentlySynthesizer() {
    return existingExperiment;
  }

  private double clipLimitation;
  private double receivedMiserly;
  private double acceptedRun;
  private Provider production[];
  private Memory depot[];
  private SpectacleSuspense forumFile;

  public Modeling(double againRestricted, double regularUngenerous, double acceptableReach) {
    this.clipLimitation = againRestricted;
    this.receivedMiserly = regularUngenerous;
    this.acceptedRun = acceptableReach;
    this.forumFile = new SpectacleSuspense();
    this.production = new Provider[8];
    this.depot = new Memory[5];
    depot[0] = new Memory();
    depot[1] = new Memory();
    depot[2] = new Memory();
    depot[3] = new Memory();
    depot[4] = new Memory();
    production[0] = new CommodityBegan(this.receivedMiserly, this.acceptedRun, depot[0]);
    production[1] = new GrowerFirehouse(this.receivedMiserly, this.acceptedRun, depot[1], depot[0]);
    production[2] =
        new GrowerFirehouse(this.receivedMiserly * 2.0, this.acceptedRun * 2.0, depot[2], depot[1]);
    production[3] =
        new GrowerFirehouse(this.receivedMiserly * 2.0, this.acceptedRun * 2.0, depot[2], depot[1]);
    production[4] = new GrowerFirehouse(this.receivedMiserly, this.acceptedRun, depot[3], depot[2]);
    production[5] =
        new GrowerFirehouse(this.receivedMiserly * 2.0, this.acceptedRun * 2.0, depot[4], depot[3]);
    production[6] =
        new GrowerFirehouse(this.receivedMiserly * 2.0, this.acceptedRun * 2.0, depot[4], depot[3]);
    production[7] = new OutputCease(this.receivedMiserly, this.acceptedRun, depot[4]);
    depot[0].bentNew(production[1]);
    depot[0].putPreceding(production[0]);
    depot[1].bentNew(production[2], production[3]);
    depot[1].putPreceding(production[1]);
    depot[2].bentNew(production[4]);
    depot[2].putPreceding(production[2], production[3]);
    depot[3].bentNew(production[5], production[6]);
    depot[3].putPreceding(production[4]);
    depot[4].bentNew(production[7]);
    depot[4].putPreceding(production[5], production[6]);
    this.forumFile.inscribeSeminar(
        new ProduceTriathlon(
            YearWarder.existingYears(), ProduceTriathlon.ButtDepart, production[0]));
  }

  public double periodsBound() {
    return this.clipLimitation;
  }

  public void go() {
    Modeling.existingExperiment = this;

    while (YearWarder.existingYears() < this.clipLimitation && this.forumFile.matter() > 0) {
      this.forumFile.soonCommemoration().outgrowthTournament();
    }
    this.editionStatisticians();
  }

  private void editionStatisticians() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.clipLimitation,
            YearWarder.existingYears(),
            this.receivedMiserly,
            this.acceptedRun));
    System.out.println(String.format("Storage Capacity: %d", Memory.shelvingThresholds()));
    System.out.println("ProducibleObject count: " + ImmiscibleDisagree.thisGet());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Provider arsenic : production) {
      System.out.println(arsenic.figure());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Memory ora : depot) {
      System.out.println(ora.statistically());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
