package feigning;

import ontogenetic.MonthBabysitter;
import deliveryThings.ClasticVictim;
import breeder.*;
import storeroom.*;
import platter.*;

public class Realism {
  private static Realism presentlySynthesizer;

  public static Realism underwaySimulates() {
    return presentlySynthesizer;
  }

  private double sentenceConfine;
  private double criterialBase;
  private double casebookSwan;
  private Presenter presenter[];
  private Storeroom garage[];
  private GalaLine festivalSpooler;

  public Realism(double yearsCurtail, double regularUngenerous, double canonicalCompass) {
    this.sentenceConfine = yearsCurtail;
    this.criterialBase = regularUngenerous;
    this.casebookSwan = canonicalCompass;
    this.festivalSpooler = new GalaLine();
    this.presenter = new Presenter[8];
    this.garage = new Storeroom[5];
    garage[0] = new Storeroom();
    garage[1] = new Storeroom();
    garage[2] = new Storeroom();
    garage[3] = new Storeroom();
    garage[4] = new Storeroom();
    presenter[0] = new PublisherJump(this.criterialBase, this.casebookSwan, garage[0]);
    presenter[1] =
        new ManufacturersArea(this.criterialBase, this.casebookSwan, garage[1], garage[0]);
    presenter[2] =
        new ManufacturersArea(
            this.criterialBase * 2.0, this.casebookSwan * 2.0, garage[2], garage[1]);
    presenter[3] =
        new ManufacturersArea(
            this.criterialBase * 2.0, this.casebookSwan * 2.0, garage[2], garage[1]);
    presenter[4] =
        new ManufacturersArea(this.criterialBase, this.casebookSwan, garage[3], garage[2]);
    presenter[5] =
        new ManufacturersArea(
            this.criterialBase * 2.0, this.casebookSwan * 2.0, garage[4], garage[3]);
    presenter[6] =
        new ManufacturersArea(
            this.criterialBase * 2.0, this.casebookSwan * 2.0, garage[4], garage[3]);
    presenter[7] = new PromoterFinal(this.criterialBase, this.casebookSwan, garage[4]);
    garage[0].placeSoon(presenter[1]);
    garage[0].settledPervious(presenter[0]);
    garage[1].placeSoon(presenter[2], presenter[3]);
    garage[1].settledPervious(presenter[1]);
    garage[2].placeSoon(presenter[4]);
    garage[2].settledPervious(presenter[2], presenter[3]);
    garage[3].placeSoon(presenter[5], presenter[6]);
    garage[3].settledPervious(presenter[4]);
    garage[4].placeSoon(presenter[7]);
    garage[4].settledPervious(presenter[5], presenter[6]);
    this.festivalSpooler.installCeremonies(
        new GrowerParade(MonthBabysitter.flowMonth(), GrowerParade.AssGo, presenter[0]));
  }

  public double periodsBound() {
    return this.sentenceConfine;
  }

  public void originate() {
    Realism.presentlySynthesizer = this;

    while (MonthBabysitter.flowMonth() < this.sentenceConfine
        && this.festivalSpooler.census() > 0) {
      this.festivalSpooler.aheadForum().mechanismSummit();
    }
    this.paperSurveys();
  }

  private void paperSurveys() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.sentenceConfine,
            MonthBabysitter.flowMonth(),
            this.criterialBase,
            this.casebookSwan));
    System.out.println(String.format("Storage Capacity: %d", Storeroom.depositoryConstrain()));
    System.out.println("ProducibleObject count: " + ClasticVictim.prevalentCalculation());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Presenter arsenic : presenter) {
      System.out.println(arsenic.statisticians());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Storeroom waffen : garage) {
      System.out.println(waffen.censuses());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
