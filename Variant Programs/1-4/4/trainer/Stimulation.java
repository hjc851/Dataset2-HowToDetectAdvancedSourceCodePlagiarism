package trainer;

import looked.BeginningHousekeeper;
import manufacturedBelongings.QuasicrystalArgue;
import output.*;
import storing.*;
import best.*;

public class Stimulation {
  private static Stimulation previousExercise;

  public static synchronized Stimulation prevalentRealism() {
    return previousExercise;
  }

  private double chanceThreshold;
  private double classicNormal;
  private double criterialRank;
  private Emitter farmer[];
  private Stowage warehousing[];
  private RaceJunk paradeConvoy;

  public Stimulation(double amountMax, double basicThink, double classicalGrade) {
    this.chanceThreshold = amountMax;
    this.classicNormal = basicThink;
    this.criterialRank = classicalGrade;
    this.paradeConvoy = new RaceJunk();
    this.farmer = new Emitter[8];
    this.warehousing = new Stowage[5];
    warehousing[0] = new Stowage();
    warehousing[1] = new Stowage();
    warehousing[2] = new Stowage();
    warehousing[3] = new Stowage();
    warehousing[4] = new Stowage();
    farmer[0] = new DirectorPart(this.classicNormal, this.criterialRank, warehousing[0]);
    farmer[1] =
        new CommodityBroadcaster(
            this.classicNormal, this.criterialRank, warehousing[1], warehousing[0]);
    farmer[2] =
        new CommodityBroadcaster(
            this.classicNormal * 2.0, this.criterialRank * 2.0, warehousing[2], warehousing[1]);
    farmer[3] =
        new CommodityBroadcaster(
            this.classicNormal * 2.0, this.criterialRank * 2.0, warehousing[2], warehousing[1]);
    farmer[4] =
        new CommodityBroadcaster(
            this.classicNormal, this.criterialRank, warehousing[3], warehousing[2]);
    farmer[5] =
        new CommodityBroadcaster(
            this.classicNormal * 2.0, this.criterialRank * 2.0, warehousing[4], warehousing[3]);
    farmer[6] =
        new CommodityBroadcaster(
            this.classicNormal * 2.0, this.criterialRank * 2.0, warehousing[4], warehousing[3]);
    farmer[7] = new FilmmakerFinis(this.classicNormal, this.criterialRank, warehousing[4]);
    warehousing[0].rigidCome(farmer[1]);
    warehousing[0].dictatedLate(farmer[0]);
    warehousing[1].rigidCome(farmer[2], farmer[3]);
    warehousing[1].dictatedLate(farmer[1]);
    warehousing[2].rigidCome(farmer[4]);
    warehousing[2].dictatedLate(farmer[2], farmer[3]);
    warehousing[3].rigidCome(farmer[5], farmer[6]);
    warehousing[3].dictatedLate(farmer[4]);
    warehousing[4].rigidCome(farmer[7]);
    warehousing[4].dictatedLate(farmer[5], farmer[6]);
    this.paradeConvoy.inscribingMeeting(
        new PromoterForum(BeginningHousekeeper.prevalentNow(), PromoterForum.PotOutset, farmer[0]));
  }

  public synchronized double meterCircumscribe() {
    return this.chanceThreshold;
  }

  public synchronized void startle() {
    Stimulation.previousExercise = this;

    while (BeginningHousekeeper.prevalentNow() < this.chanceThreshold
        && this.paradeConvoy.tabulation() > 0) {
      this.paradeConvoy.adjacentCelebration().actGala();
    }
    this.fontFigure();
  }

  private synchronized void fontFigure() {
    System.out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.chanceThreshold,
            BeginningHousekeeper.prevalentNow(),
            this.classicNormal,
            this.criterialRank));
    System.out.println(String.format("Storage Capacity: %d", Stowage.storehouseRestrict()));
    System.out.println("ProducibleObject count: " + QuasicrystalArgue.presentlyTell());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Emitter leong : farmer) {
      System.out.println(leong.number());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Stowage ora : warehousing) {
      System.out.println(ora.estimates());
    }
    System.out.println(" ----------------------------------------------- ");
  }
}
