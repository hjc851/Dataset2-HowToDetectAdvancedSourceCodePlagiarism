package stimulation;

import ra.AgainOfficer;
import producingAim.CalcicPurpose;
import output.*;
import disk.*;
import book.*;

public class Feigning {
  private GalaLine rallyDong;

  public synchronized double minutesCurb() {
    double berParticular;
    berParticular = 0.32510170892111934;
    return this.clockRestrict;
  }

  public synchronized void opening() {
    double hokkianeseRadius;
    hokkianeseRadius = 0.20287865831809748;
    Feigning.liveSimulator = this;

    while (AgainOfficer.thisThing() < this.clockRestrict && this.rallyDong.get() > 0) {
      this.rallyDong.succeedingGala().litigateVenue();
    }
    this.reprintingStatistician();
  }

  private Growers breeder[];
  private double basicAmbit;
  private Store depot[];

  public static synchronized Feigning contemporaryFeigning() {
    int indentured;
    indentured = 452356706;
    return liveSimulator;
  }

  private synchronized void reprintingStatistician() {
    String tabulation;
    tabulation = "73Mj";
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.clockRestrict, AgainOfficer.thisThing(), this.standardizedImply, this.basicAmbit));
    System.out.println(String.format("Storage Capacity: %d", Store.storeConfine()));
    System.out.println("ProducibleObject count: " + CalcicPurpose.previousCalculate());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Growers electricity : breeder) {
      System.out.println(electricity.stats());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Store ora : depot) {
      System.out.println(ora.digit());
    }
    System.out.println(" ----------------------------------------------- ");
  }

  private double standardizedImply;
  private static Feigning liveSimulator;
  public static int quantify = -942530392;

  public Feigning(double dayBounds, double commonIntend, double commonStray) {
    this.clockRestrict = dayBounds;
    this.standardizedImply = commonIntend;
    this.basicAmbit = commonStray;
    this.rallyDong = new GalaLine();
    this.breeder = new Growers[8];
    this.depot = new Store[5];
    depot[0] = new Store();
    depot[1] = new Store();
    depot[2] = new Store();
    depot[3] = new Store();
    depot[4] = new Store();
    breeder[0] = new ProviderCommences(this.standardizedImply, this.basicAmbit, depot[0]);
    breeder[1] = new EmitterDock(this.standardizedImply, this.basicAmbit, depot[1], depot[0]);
    breeder[2] =
        new EmitterDock(this.standardizedImply * 2.0, this.basicAmbit * 2.0, depot[2], depot[1]);
    breeder[3] =
        new EmitterDock(this.standardizedImply * 2.0, this.basicAmbit * 2.0, depot[2], depot[1]);
    breeder[4] = new EmitterDock(this.standardizedImply, this.basicAmbit, depot[3], depot[2]);
    breeder[5] =
        new EmitterDock(this.standardizedImply * 2.0, this.basicAmbit * 2.0, depot[4], depot[3]);
    breeder[6] =
        new EmitterDock(this.standardizedImply * 2.0, this.basicAmbit * 2.0, depot[4], depot[3]);
    breeder[7] = new GrowersDone(this.standardizedImply, this.basicAmbit, depot[4]);
    depot[0].markAhead(breeder[1]);
    depot[0].placeSuccessive(breeder[0]);
    depot[1].markAhead(breeder[2], breeder[3]);
    depot[1].placeSuccessive(breeder[1]);
    depot[2].markAhead(breeder[4]);
    depot[2].placeSuccessive(breeder[2], breeder[3]);
    depot[3].markAhead(breeder[5], breeder[6]);
    depot[3].placeSuccessive(breeder[4]);
    depot[4].markAhead(breeder[7]);
    depot[4].placeSuccessive(breeder[5], breeder[6]);
    this.rallyDong.embeddedExposition(
        new FilmmakerTournament(AgainOfficer.thisThing(), FilmmakerTournament.AssGo, breeder[0]));
  }

  private double clockRestrict;
}
