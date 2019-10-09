package synthesizer;

import checked.AgainOfficer;
import productObjective.PerformableObjection;
import output.*;
import warehousing.*;
import tally.*;

public class Modeling {
  private static Modeling streamMock;

  public static Modeling circulatingSimulating() {
    return streamMock;
  }

  private double periodTrammel;
  private double regularUngenerous;
  private double authoritativeRove;
  private Exporter fabricator[];
  private Store store[];
  private SymposiumSufferance spectacleSuspense;

  public Modeling(double hoursRestriction, double textbookPoor, double touchstoneRoam) {
    this.periodTrammel = hoursRestriction;
    this.regularUngenerous = textbookPoor;
    this.authoritativeRove = touchstoneRoam;
    this.spectacleSuspense = new SymposiumSufferance();
    this.fabricator = new Exporter[8];
    this.store = new Store[5];
    store[0] = new Store();
    store[1] = new Store();
    store[2] = new Store();
    store[3] = new Store();
    store[4] = new Store();
    fabricator[0] = new GrowersRestart(this.regularUngenerous, this.authoritativeRove, store[0]);
    fabricator[1] =
        new BreederDepots(this.regularUngenerous, this.authoritativeRove, store[1], store[0]);
    fabricator[2] =
        new BreederDepots(
            this.regularUngenerous * 2.0, this.authoritativeRove * 2.0, store[2], store[1]);
    fabricator[3] =
        new BreederDepots(
            this.regularUngenerous * 2.0, this.authoritativeRove * 2.0, store[2], store[1]);
    fabricator[4] =
        new BreederDepots(this.regularUngenerous, this.authoritativeRove, store[3], store[2]);
    fabricator[5] =
        new BreederDepots(
            this.regularUngenerous * 2.0, this.authoritativeRove * 2.0, store[4], store[3]);
    fabricator[6] =
        new BreederDepots(
            this.regularUngenerous * 2.0, this.authoritativeRove * 2.0, store[4], store[3]);
    fabricator[7] = new BreederEnds(this.regularUngenerous, this.authoritativeRove, store[4]);
    store[0].determineThird(fabricator[1]);
    store[0].determineInitial(fabricator[0]);
    store[1].determineThird(fabricator[2], fabricator[3]);
    store[1].determineInitial(fabricator[1]);
    store[2].determineThird(fabricator[4]);
    store[2].determineInitial(fabricator[2], fabricator[3]);
    store[3].determineThird(fabricator[5], fabricator[6]);
    store[3].determineInitial(fabricator[4]);
    store[4].determineThird(fabricator[7]);
    store[4].determineInitial(fabricator[5], fabricator[6]);
    this.spectacleSuspense.tuckCase(
        new PresenterSymposium(
            AgainOfficer.flowMonth(), PresenterSymposium.SeatRun, fabricator[0]));
  }

  public double junctureConstrain() {
    return this.periodTrammel;
  }

  public void commencement() {
    Modeling.streamMock = this;

    while (AgainOfficer.flowMonth() < this.periodTrammel && this.spectacleSuspense.quantify() > 0) {
      this.spectacleSuspense.thenRally().litigateVenue();
    }
    this.copyInformation();
  }

  private void copyInformation() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.periodTrammel,
            AgainOfficer.flowMonth(),
            this.regularUngenerous,
            this.authoritativeRove));
    System.out.println(String.format("Storage Capacity: %d", Store.garageRestricted()));
    System.out.println("ProducibleObject count: " + PerformableObjection.circulatingReckon());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Exporter arsenic : fabricator) {
      System.out.println(arsenic.estimates());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Store fh : store) {
      System.out.println(fh.numerals());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
