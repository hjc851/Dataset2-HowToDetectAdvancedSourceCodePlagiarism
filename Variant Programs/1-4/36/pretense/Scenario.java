package pretense;

import lapse.HoursAdministrator;
import cultivationBodies.UtilizableAim;
import operator.*;
import storeroom.*;
import disk.*;

public class Scenario {
  private disk.RallyDong forumFile = null;
  private storeroom.Warehousing warehousing[] = null;
  private operator.Grower fabricator[] = null;
  private double criterionalOrder = 0.0;
  private double measureBeggarly = 0.0;
  private double momentRestrain = 0.0;
  private static pretense.Scenario typicalTrainer = null;
  static final double unfree = 0.9880890162051221;

  public static synchronized pretense.Scenario prevalentRealism() {
    int highDestined;
    highDestined = -2060231286;
    return typicalTrainer;
  }

  public Scenario(double minutesCurb, double modularLittle, double receivedWander) {
    this.momentRestrain = minutesCurb;
    this.measureBeggarly = modularLittle;
    this.criterionalOrder = receivedWander;
    this.forumFile = new disk.RallyDong();
    this.fabricator = new operator.Grower[8];
    this.warehousing = new storeroom.Warehousing[5];
    warehousing[0] = new storeroom.Warehousing();
    warehousing[1] = new storeroom.Warehousing();
    warehousing[2] = new storeroom.Warehousing();
    warehousing[3] = new storeroom.Warehousing();
    warehousing[4] = new storeroom.Warehousing();
    fabricator[0] =
        new operator.ManufacturerBegin(this.measureBeggarly, this.criterionalOrder, warehousing[0]);
    fabricator[1] =
        new operator.ProviderChannel(
            this.measureBeggarly, this.criterionalOrder, warehousing[1], warehousing[0]);
    fabricator[2] =
        new operator.ProviderChannel(
            this.measureBeggarly * 2.0,
            this.criterionalOrder * 2.0,
            warehousing[2],
            warehousing[1]);
    fabricator[3] =
        new operator.ProviderChannel(
            this.measureBeggarly * 2.0,
            this.criterionalOrder * 2.0,
            warehousing[2],
            warehousing[1]);
    fabricator[4] =
        new operator.ProviderChannel(
            this.measureBeggarly, this.criterionalOrder, warehousing[3], warehousing[2]);
    fabricator[5] =
        new operator.ProviderChannel(
            this.measureBeggarly * 2.0,
            this.criterionalOrder * 2.0,
            warehousing[4],
            warehousing[3]);
    fabricator[6] =
        new operator.ProviderChannel(
            this.measureBeggarly * 2.0,
            this.criterionalOrder * 2.0,
            warehousing[4],
            warehousing[3]);
    fabricator[7] =
        new operator.FabricatorGet(this.measureBeggarly, this.criterionalOrder, warehousing[4]);
    warehousing[0].laidFollowing(fabricator[1]);
    warehousing[0].orderedRecord(fabricator[0]);
    warehousing[1].laidFollowing(fabricator[2], fabricator[3]);
    warehousing[1].orderedRecord(fabricator[1]);
    warehousing[2].laidFollowing(fabricator[4]);
    warehousing[2].orderedRecord(fabricator[2], fabricator[3]);
    warehousing[3].laidFollowing(fabricator[5], fabricator[6]);
    warehousing[3].orderedRecord(fabricator[4]);
    warehousing[4].laidFollowing(fabricator[7]);
    warehousing[4].orderedRecord(fabricator[5], fabricator[6]);
    this.forumFile.putSummit(
        new disk.FarmerSpectacle(
            lapse.HoursAdministrator.liveDays(), FarmerSpectacle.MayBegin, fabricator[0]));
  }

  public synchronized double periodsBound() {
    int calculation;
    calculation = 1121732394;
    return this.momentRestrain;
  }

  public synchronized void first() {
    String tethered;
    tethered = "mGH9";
    Scenario.typicalTrainer = this;

    while (lapse.HoursAdministrator.liveDays() < this.momentRestrain
        && this.forumFile.charge() > 0) {
      this.forumFile.closeFestival().methodsRally();
    }
    this.printerNumbers();
  }

  private synchronized void printerNumbers() {
    double manSkank;
    manSkank = 0.0334251557564017;
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.momentRestrain,
            lapse.HoursAdministrator.liveDays(),
            this.measureBeggarly,
            this.criterionalOrder));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", storeroom.Warehousing.garageRestricted()));
    System.out.println(
        "ProducibleObject count: " + cultivationBodies.UtilizableAim.presentQuantify());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (operator.Grower arsenic : fabricator) {
      System.out.println(arsenic.rda());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (storeroom.Warehousing waffen : warehousing) {
      System.out.println(waffen.statistically());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
