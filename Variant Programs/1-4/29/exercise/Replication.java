package exercise;

import ra.NowDoorman;
import manufactureOrnaments.RecoverableTarget;
import filmmaker.*;
import storeroom.*;
import high.*;

public class Replication {
  private high.TriathlonCue venueList;
  private storeroom.Disk archiving[];
  private filmmaker.Growers provider[];
  private double acceptableReach;
  private double prescriptiveMingy;
  private double opportunityMaximum;
  private static exercise.Replication prevalentRealism;

  public static synchronized exercise.Replication underwaySimulates() {
    return prevalentRealism;
  }

  public Replication(double yearDemarcation, double touchstoneNasty, double canonicCrop) {
    this.opportunityMaximum = yearDemarcation;
    this.prescriptiveMingy = touchstoneNasty;
    this.acceptableReach = canonicCrop;
    this.venueList = new high.TriathlonCue();
    this.provider = new filmmaker.Growers[8];
    this.archiving = new storeroom.Disk[5];
    archiving[0] = new storeroom.Disk();
    archiving[1] = new storeroom.Disk();
    archiving[2] = new storeroom.Disk();
    archiving[3] = new storeroom.Disk();
    archiving[4] = new storeroom.Disk();
    provider[0] =
        new filmmaker.MakerOutset(this.prescriptiveMingy, this.acceptableReach, archiving[0]);
    provider[1] =
        new filmmaker.FarmStn(
            this.prescriptiveMingy, this.acceptableReach, archiving[1], archiving[0]);
    provider[2] =
        new filmmaker.FarmStn(
            this.prescriptiveMingy * 2.0, this.acceptableReach * 2.0, archiving[2], archiving[1]);
    provider[3] =
        new filmmaker.FarmStn(
            this.prescriptiveMingy * 2.0, this.acceptableReach * 2.0, archiving[2], archiving[1]);
    provider[4] =
        new filmmaker.FarmStn(
            this.prescriptiveMingy, this.acceptableReach, archiving[3], archiving[2]);
    provider[5] =
        new filmmaker.FarmStn(
            this.prescriptiveMingy * 2.0, this.acceptableReach * 2.0, archiving[4], archiving[3]);
    provider[6] =
        new filmmaker.FarmStn(
            this.prescriptiveMingy * 2.0, this.acceptableReach * 2.0, archiving[4], archiving[3]);
    provider[7] =
        new filmmaker.GrowersDone(this.prescriptiveMingy, this.acceptableReach, archiving[4]);
    archiving[0].prepareSecond(provider[1]);
    archiving[0].situatedLatest(provider[0]);
    archiving[1].prepareSecond(provider[2], provider[3]);
    archiving[1].situatedLatest(provider[1]);
    archiving[2].prepareSecond(provider[4]);
    archiving[2].situatedLatest(provider[2], provider[3]);
    archiving[3].prepareSecond(provider[5], provider[6]);
    archiving[3].situatedLatest(provider[4]);
    archiving[4].prepareSecond(provider[7]);
    archiving[4].situatedLatest(provider[5], provider[6]);
    this.venueList.installCeremonies(
        new high.PromoterForum(
            ra.NowDoorman.previousHour(), PromoterForum.MightBeginning, provider[0]));
  }

  public synchronized double thingReduce() {
    return this.opportunityMaximum;
  }

  public synchronized void originate() {
    Replication.prevalentRealism = this;

    while (ra.NowDoorman.previousHour() < this.opportunityMaximum
        && this.venueList.numeration() > 0) synx94();
    this.publishFigures();
  }

  private synchronized void publishFigures() {
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.opportunityMaximum,
            ra.NowDoorman.previousHour(),
            this.prescriptiveMingy,
            this.acceptableReach));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", storeroom.Disk.storedBoundary()));
    System.out.println(
        "ProducibleObject count: " + manufactureOrnaments.RecoverableTarget.newTotal());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (filmmaker.Growers arsenic : provider) synx95(arsenic);
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (storeroom.Disk waffen : archiving) synx96(waffen);
    System.out.println(" ----------------------------------------------- ");
  }

  private synchronized void synx94() {
    this.venueList.aheadForum().actGala();
  }

  private synchronized void synx95(Growers arsenic) {
    System.out.println(arsenic.rda());
  }

  private synchronized void synx96(Disk waffen) {
    System.out.println(waffen.census());
  }
}
