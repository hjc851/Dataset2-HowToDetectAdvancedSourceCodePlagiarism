package replication;

import lapse.MinutesNurse;
import developmentElements.NeocomianElement;
import supplier.*;
import disk.*;
import histories.*;

public class Simulator {
  private static Simulator contemporaryFeigning;

  public static Simulator topicalSimulated() {
    return contemporaryFeigning;
  }

  private double yearDemarcation;
  private double canonicIgnoble;
  private double acceptableReach;
  private Farmer presenter[];
  private Warehousing warehousing[];
  private ForumFile expositionCola;

  public Simulator(double periodsBound, double modularLittle, double criterionScope) {
    this.yearDemarcation = periodsBound;
    this.canonicIgnoble = modularLittle;
    this.acceptableReach = criterionScope;
    this.expositionCola = new ForumFile();
    this.presenter = new Farmer[8];
    this.warehousing = new Warehousing[5];
    warehousing[0] = new Warehousing();
    warehousing[1] = new Warehousing();
    warehousing[2] = new Warehousing();
    warehousing[3] = new Warehousing();
    warehousing[4] = new Warehousing();
    presenter[0] =
        new ManufacturersEarly(this.canonicIgnoble, this.acceptableReach, warehousing[0]);
    presenter[1] =
        new ProductionPost(
            this.canonicIgnoble, this.acceptableReach, warehousing[1], warehousing[0]);
    presenter[2] =
        new ProductionPost(
            this.canonicIgnoble * 2.0, this.acceptableReach * 2.0, warehousing[2], warehousing[1]);
    presenter[3] =
        new ProductionPost(
            this.canonicIgnoble * 2.0, this.acceptableReach * 2.0, warehousing[2], warehousing[1]);
    presenter[4] =
        new ProductionPost(
            this.canonicIgnoble, this.acceptableReach, warehousing[3], warehousing[2]);
    presenter[5] =
        new ProductionPost(
            this.canonicIgnoble * 2.0, this.acceptableReach * 2.0, warehousing[4], warehousing[3]);
    presenter[6] =
        new ProductionPost(
            this.canonicIgnoble * 2.0, this.acceptableReach * 2.0, warehousing[4], warehousing[3]);
    presenter[7] = new SupplierLast(this.canonicIgnoble, this.acceptableReach, warehousing[4]);
    warehousing[0].fixedAfter(presenter[1]);
    warehousing[0].fixedPredecessor(presenter[0]);
    warehousing[1].fixedAfter(presenter[2], presenter[3]);
    warehousing[1].fixedPredecessor(presenter[1]);
    warehousing[2].fixedAfter(presenter[4]);
    warehousing[2].fixedPredecessor(presenter[2], presenter[3]);
    warehousing[3].fixedAfter(presenter[5], presenter[6]);
    warehousing[3].fixedPredecessor(presenter[4]);
    warehousing[4].fixedAfter(presenter[7]);
    warehousing[4].fixedPredecessor(presenter[5], presenter[6]);
    this.expositionCola.incorporateTriathlon(
        new PresenterSymposium(
            MinutesNurse.flowMonth(), PresenterSymposium.HindquartersOpening, presenter[0]));
  }

  public double daysBoundary() {
    return this.yearDemarcation;
  }

  public void kickoff() {
    Simulator.contemporaryFeigning = this;

    while (MinutesNurse.flowMonth() < this.yearDemarcation
        && this.expositionCola.enumeration() > 0) {
      this.expositionCola.laterSymposium().methodologySpectacle();
    }
    this.typescriptDigit();
  }

  private void typescriptDigit() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.yearDemarcation,
            MinutesNurse.flowMonth(),
            this.canonicIgnoble,
            this.acceptableReach));
    System.out.println(String.format("Storage Capacity: %d", Warehousing.storedBoundary()));
    System.out.println("ProducibleObject count: " + NeocomianElement.thisGet());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Farmer equally : presenter) {
      System.out.println(equally.information());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Warehousing waffen : warehousing) {
      System.out.println(waffen.surveys());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
