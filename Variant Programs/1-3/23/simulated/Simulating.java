package simulated;

import lapse.BeginningHousekeeper;
import manufactureOrnaments.InterpretableResist;
import output.*;
import warehouses.*;
import histories.*;

public class Simulating {
  private CeremoniesDragon raceJunk;
  private Memory disk[];
  private Grower presenter[];
  private double textbookPasture;
  private double textbookPoor;
  private double yearsCurtail;
  private static Simulating existingExperiment;

  public static synchronized Simulating contemporaryFeigning() {
    return existingExperiment;
  }

  public Simulating(double thingReduce, double acceptableSignify, double definitiveOrbit) {
    this.yearsCurtail = thingReduce;
    this.textbookPoor = acceptableSignify;
    this.textbookPasture = definitiveOrbit;
    this.raceJunk = new CeremoniesDragon();
    this.presenter = new Grower[8];
    this.disk = new Memory[5];
    disk[0] = new Memory();
    disk[1] = new Memory();
    disk[2] = new Memory();
    disk[3] = new Memory();
    disk[4] = new Memory();
    presenter[0] = new FilmmakerInitiate(this.textbookPoor, this.textbookPasture, disk[0]);
    presenter[1] = new EmitterDock(this.textbookPoor, this.textbookPasture, disk[1], disk[0]);
    presenter[2] =
        new EmitterDock(this.textbookPoor * 2.0, this.textbookPasture * 2.0, disk[2], disk[1]);
    presenter[3] =
        new EmitterDock(this.textbookPoor * 2.0, this.textbookPasture * 2.0, disk[2], disk[1]);
    presenter[4] = new EmitterDock(this.textbookPoor, this.textbookPasture, disk[3], disk[2]);
    presenter[5] =
        new EmitterDock(this.textbookPoor * 2.0, this.textbookPasture * 2.0, disk[4], disk[3]);
    presenter[6] =
        new EmitterDock(this.textbookPoor * 2.0, this.textbookPasture * 2.0, disk[4], disk[3]);
    presenter[7] = new ProducingClose(this.textbookPoor, this.textbookPasture, disk[4]);
    disk[0].situatedForthcoming(presenter[1]);
    disk[0].dictatedLate(presenter[0]);
    disk[1].situatedForthcoming(presenter[2], presenter[3]);
    disk[1].dictatedLate(presenter[1]);
    disk[2].situatedForthcoming(presenter[4]);
    disk[2].dictatedLate(presenter[2], presenter[3]);
    disk[3].situatedForthcoming(presenter[5], presenter[6]);
    disk[3].dictatedLate(presenter[4]);
    disk[4].situatedForthcoming(presenter[7]);
    disk[4].dictatedLate(presenter[5], presenter[6]);
    this.raceJunk.encloseFestival(
        new GrowerParade(
            BeginningHousekeeper.presentlyMinutes(),
            GrowerParade.FundamentOriginate,
            presenter[0]));
  }

  public synchronized double beginningThresholds() {
    return this.yearsCurtail;
  }

  public synchronized void outset() {
    Simulating.existingExperiment = this;

    while (BeginningHousekeeper.presentlyMinutes() < this.yearsCurtail
        && this.raceJunk.reckon() > 0) {
      this.raceJunk.thirdCeremonies().proceedingsExposition();
    }
    this.lithographNumber();
  }

  private synchronized void lithographNumber() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.yearsCurtail,
            BeginningHousekeeper.presentlyMinutes(),
            this.textbookPoor,
            this.textbookPasture));
    System.out.println(String.format("Storage Capacity: %d", Memory.stowageRestricting()));
    System.out.println("ProducibleObject count: " + InterpretableResist.underwayTabulation());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Grower leong : presenter) {
      System.out.println(leong.figures());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Memory ora : disk) {
      System.out.println(ora.surveys());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
