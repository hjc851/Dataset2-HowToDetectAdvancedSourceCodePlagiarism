package analog;

import euphonious.ThingCatch;
import harvestingGoods.HypabyssalTotem;
import promoter.*;
import safekeeping.*;
import memorialize.*;

public class Simulating {
  private static Simulating thisDramatization;

  public static Simulating prevailingModel() {
    return thisDramatization;
  }

  private double yearDemarcation;
  private double measureBeggarly;
  private double classicalGrade;
  private Grower filmmaker[];
  private Warehousing repository[];
  private SeminarJumping contestReaper;

  public Simulating(double clipLimitation, double standardizedImply, double commonStray) {
    this.yearDemarcation = clipLimitation;
    this.measureBeggarly = standardizedImply;
    this.classicalGrade = commonStray;
    this.contestReaper = new SeminarJumping();
    this.filmmaker = new Grower[8];
    this.repository = new Warehousing[5];
    repository[0] = new Warehousing();
    repository[1] = new Warehousing();
    repository[2] = new Warehousing();
    repository[3] = new Warehousing();
    repository[4] = new Warehousing();
    filmmaker[0] = new GrowerDepart(this.measureBeggarly, this.classicalGrade, repository[0]);
    filmmaker[1] =
        new GrowerFirehouse(
            this.measureBeggarly, this.classicalGrade, repository[1], repository[0]);
    filmmaker[2] =
        new GrowerFirehouse(
            this.measureBeggarly * 2.0, this.classicalGrade * 2.0, repository[2], repository[1]);
    filmmaker[3] =
        new GrowerFirehouse(
            this.measureBeggarly * 2.0, this.classicalGrade * 2.0, repository[2], repository[1]);
    filmmaker[4] =
        new GrowerFirehouse(
            this.measureBeggarly, this.classicalGrade, repository[3], repository[2]);
    filmmaker[5] =
        new GrowerFirehouse(
            this.measureBeggarly * 2.0, this.classicalGrade * 2.0, repository[4], repository[3]);
    filmmaker[6] =
        new GrowerFirehouse(
            this.measureBeggarly * 2.0, this.classicalGrade * 2.0, repository[4], repository[3]);
    filmmaker[7] = new ManufacturerFinale(this.measureBeggarly, this.classicalGrade, repository[4]);
    repository[0].doEarly(filmmaker[1]);
    repository[0].settledPervious(filmmaker[0]);
    repository[1].doEarly(filmmaker[2], filmmaker[3]);
    repository[1].settledPervious(filmmaker[1]);
    repository[2].doEarly(filmmaker[4]);
    repository[2].settledPervious(filmmaker[2], filmmaker[3]);
    repository[3].doEarly(filmmaker[5], filmmaker[6]);
    repository[3].settledPervious(filmmaker[4]);
    repository[4].doEarly(filmmaker[7]);
    repository[4].settledPervious(filmmaker[5], filmmaker[6]);
    this.contestReaper.appendForum(
        new SupplierVenue(ThingCatch.actualSentence(), SupplierVenue.CrapperKickoff, filmmaker[0]));
  }

  public double opportunityMaximum() {
    return this.yearDemarcation;
  }

  public void early() {
    Simulating.thisDramatization = this;

    while (ThingCatch.actualSentence() < this.yearDemarcation
        && this.contestReaper.enumeration() > 0) {
      this.contestReaper.followingExtravaganza().methodologySpectacle();
    }
    this.typescriptDigit();
  }

  private void typescriptDigit() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.yearDemarcation,
            ThingCatch.actualSentence(),
            this.measureBeggarly,
            this.classicalGrade));
    System.out.println(String.format("Storage Capacity: %d", Warehousing.cacheThrottle()));
    System.out.println("ProducibleObject count: " + HypabyssalTotem.previousCalculate());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Grower electricity : filmmaker) {
      System.out.println(electricity.statistician());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Warehousing waffen : repository) {
      System.out.println(waffen.figures());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
