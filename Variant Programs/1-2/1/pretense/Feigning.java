package pretense;

import glanced.SentenceGoalie;
import producesJewels.CalcicPurpose;
import farmer.*;
import warehouse.*;
import mark.*;

public class Feigning {
  private static pretense.Feigning topicalSimulated;

  public static pretense.Feigning prevalentRealism() {
    return topicalSimulated;
  }

  private double chanceThreshold;
  private double authoritativeHateful;
  private double standardizedArray;
  private farmer.Vintner breeder[];
  private warehouse.Warehouse warehousing[];
  private mark.ExtravaganzaWait forumFile;

  public Feigning(double periodTrammel, double regularUngenerous, double stockRamble) {
    this.chanceThreshold = periodTrammel;
    this.authoritativeHateful = regularUngenerous;
    this.standardizedArray = stockRamble;
    this.forumFile = new mark.ExtravaganzaWait();
    this.breeder = new farmer.Vintner[8];
    this.warehousing = new warehouse.Warehouse[5];
    warehousing[0] = new warehouse.Warehouse();
    warehousing[1] = new warehouse.Warehouse();
    warehousing[2] = new warehouse.Warehouse();
    warehousing[3] = new warehouse.Warehouse();
    warehousing[4] = new warehouse.Warehouse();
    breeder[0] =
        new farmer.FarmRun(this.authoritativeHateful, this.standardizedArray, warehousing[0]);
    breeder[1] =
        new farmer.ProviderChannel(
            this.authoritativeHateful, this.standardizedArray, warehousing[1], warehousing[0]);
    breeder[2] =
        new farmer.ProviderChannel(
            this.authoritativeHateful * 2.0,
            this.standardizedArray * 2.0,
            warehousing[2],
            warehousing[1]);
    breeder[3] =
        new farmer.ProviderChannel(
            this.authoritativeHateful * 2.0,
            this.standardizedArray * 2.0,
            warehousing[2],
            warehousing[1]);
    breeder[4] =
        new farmer.ProviderChannel(
            this.authoritativeHateful, this.standardizedArray, warehousing[3], warehousing[2]);
    breeder[5] =
        new farmer.ProviderChannel(
            this.authoritativeHateful * 2.0,
            this.standardizedArray * 2.0,
            warehousing[4],
            warehousing[3]);
    breeder[6] =
        new farmer.ProviderChannel(
            this.authoritativeHateful * 2.0,
            this.standardizedArray * 2.0,
            warehousing[4],
            warehousing[3]);
    breeder[7] =
        new farmer.FabricatorGet(this.authoritativeHateful, this.standardizedArray, warehousing[4]);
    warehousing[0].fixedAfter(breeder[1]);
    warehousing[0].arrangeAgo(breeder[0]);
    warehousing[1].fixedAfter(breeder[2], breeder[3]);
    warehousing[1].arrangeAgo(breeder[1]);
    warehousing[2].fixedAfter(breeder[4]);
    warehousing[2].arrangeAgo(breeder[2], breeder[3]);
    warehousing[3].fixedAfter(breeder[5], breeder[6]);
    warehousing[3].arrangeAgo(breeder[4]);
    warehousing[4].fixedAfter(breeder[7]);
    warehousing[4].arrangeAgo(breeder[5], breeder[6]);
    this.forumFile.addCommemoration(
        new mark.DirectorSeminar(
            glanced.SentenceGoalie.theOpportunity(), DirectorSeminar.ToiletBegan, breeder[0]));
  }

  public double againRestricted() {
    return this.chanceThreshold;
  }

  public void restart() {
    Feigning.topicalSimulated = this;

    while (glanced.SentenceGoalie.theOpportunity() < this.chanceThreshold
        && this.forumFile.numbers() > 0) {
      this.forumFile.nowRace().systemContest();
    }
    this.reprintingStatistician();
  }

  private void reprintingStatistician() {
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.chanceThreshold,
            glanced.SentenceGoalie.theOpportunity(),
            this.authoritativeHateful,
            this.standardizedArray));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", warehouse.Warehouse.repositoryThreshold()));
    System.out.println("ProducibleObject count: " + producesJewels.CalcicPurpose.newTotal());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (farmer.Vintner equally : breeder) {
      System.out.println(equally.records());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (warehouse.Warehouse fh : warehousing) {
      System.out.println(fh.censuses());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
