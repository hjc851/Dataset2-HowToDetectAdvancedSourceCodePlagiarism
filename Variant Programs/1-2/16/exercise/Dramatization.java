package exercise;

import acculturative.AgainOfficer;
import fabricationObstructions.RecoverableTarget;
import farmer.*;
import garage.*;
import show.*;

public class Dramatization {
  private static Dramatization afootModeling;

  public static Dramatization contemporaryFeigning() {
    return afootModeling;
  }

  private double weekMinimum;
  private double prescriptiveMingy;
  private double classicalGrade;
  private Publisher director[];
  private Entrepot storehouse[];
  private FestivalSpooler triathlonCue;

  public Dramatization(double chanceThreshold, double acceptedAverage, double criterionScope) {
    this.weekMinimum = chanceThreshold;
    this.prescriptiveMingy = acceptedAverage;
    this.classicalGrade = criterionScope;
    this.triathlonCue = new FestivalSpooler();
    this.director = new Publisher[8];
    this.storehouse = new Entrepot[5];
    storehouse[0] = new Entrepot();
    storehouse[1] = new Entrepot();
    storehouse[2] = new Entrepot();
    storehouse[3] = new Entrepot();
    storehouse[4] = new Entrepot();
    director[0] = new PresenterGet(this.prescriptiveMingy, this.classicalGrade, storehouse[0]);
    director[1] =
        new ProduceTerminus(
            this.prescriptiveMingy, this.classicalGrade, storehouse[1], storehouse[0]);
    director[2] =
        new ProduceTerminus(
            this.prescriptiveMingy * 2.0, this.classicalGrade * 2.0, storehouse[2], storehouse[1]);
    director[3] =
        new ProduceTerminus(
            this.prescriptiveMingy * 2.0, this.classicalGrade * 2.0, storehouse[2], storehouse[1]);
    director[4] =
        new ProduceTerminus(
            this.prescriptiveMingy, this.classicalGrade, storehouse[3], storehouse[2]);
    director[5] =
        new ProduceTerminus(
            this.prescriptiveMingy * 2.0, this.classicalGrade * 2.0, storehouse[4], storehouse[3]);
    director[6] =
        new ProduceTerminus(
            this.prescriptiveMingy * 2.0, this.classicalGrade * 2.0, storehouse[4], storehouse[3]);
    director[7] = new PromoterFinal(this.prescriptiveMingy, this.classicalGrade, storehouse[4]);
    storehouse[0].situatedForthcoming(director[1]);
    storehouse[0].adjustFirst(director[0]);
    storehouse[1].situatedForthcoming(director[2], director[3]);
    storehouse[1].adjustFirst(director[1]);
    storehouse[2].situatedForthcoming(director[4]);
    storehouse[2].adjustFirst(director[2], director[3]);
    storehouse[3].situatedForthcoming(director[5], director[6]);
    storehouse[3].adjustFirst(director[4]);
    storehouse[4].situatedForthcoming(director[7]);
    storehouse[4].adjustFirst(director[5], director[6]);
    this.triathlonCue.installCeremonies(
        new CommodityRace(AgainOfficer.latestClip(), CommodityRace.ArseJump, director[0]));
  }

  public double junctureConstrain() {
    return this.weekMinimum;
  }

  public void run() {
    Dramatization.afootModeling = this;

    while (AgainOfficer.latestClip() < this.weekMinimum && this.triathlonCue.numeration() > 0) {
      this.triathlonCue.lastTournament().cycleRace();
    }
    this.publicationsStatistically();
  }

  private void publicationsStatistically() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.weekMinimum,
            AgainOfficer.latestClip(),
            this.prescriptiveMingy,
            this.classicalGrade));
    System.out.println(String.format("Storage Capacity: %d", Entrepot.warehouseDemarcation()));
    System.out.println("ProducibleObject count: " + RecoverableTarget.formerRecount());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Publisher electricity : director) {
      System.out.println(electricity.statistician());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Entrepot waffen : storehouse) {
      System.out.println(waffen.figure());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
