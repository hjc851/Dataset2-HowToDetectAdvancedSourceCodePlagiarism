package storeroom;

import java.util.HashMap;
import ra.NowDoorman;
import manufactureOrnaments.RecoverableTarget;
import filmmaker.*;
import exercise.Replication;

public class Disk {
  private double lowestParadePeriods;
  private double normWeigh;
  private double numberedAim;
  private double typicalHour;
  private int caller;
  private filmmaker.Growers earlier[];
  private filmmaker.Growers the[];
  private java.util.HashMap<RecoverableTarget, Double> descriptive;
  private storeroom.SphericalConnectedNumber<RecoverableTarget> warehousingRoster;
  private static int tabulator = 0;
  private static int archivalCurtail = 1;

  public static synchronized void bentSpaceRestricts(int safekeepingCurb) {

    if (safekeepingCurb > 0) Disk.archivalCurtail = safekeepingCurb;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int storedBoundary() {
    return Disk.archivalCurtail;
  }

  public Disk() {
    this.warehousingRoster = new storeroom.SphericalConnectedNumber<RecoverableTarget>();
    this.descriptive = new java.util.HashMap<RecoverableTarget, Double>();
    this.caller = tabulator++;
    this.typicalHour = 0;
    this.numberedAim = 0;
    this.normWeigh = 0;
    this.lowestParadePeriods = 0;
  }

  public synchronized void prepareSecond(filmmaker.Growers... again) {
    this.the = again;
  }

  public synchronized void situatedLatest(filmmaker.Growers... preceding) {
    this.earlier = preceding;
  }

  public synchronized void incorporateArticle(manufactureOrnaments.RecoverableTarget objection)
      throws DepotEntireCaveat {

    if (this.warehousingRoster.enumerate() < Disk.archivalCurtail) {
      this.warehousingRoster.embedLatest(objection);
      this.normWeigh +=
          (this.recount() - 1)
              * (ra.NowDoorman.previousHour() - this.lowestParadePeriods)
              / exercise.Replication.underwaySimulates().thingReduce();
      this.descriptive.put(objection, ra.NowDoorman.previousHour());
      this.lowestParadePeriods = ra.NowDoorman.previousHour();
      for (filmmaker.Growers leong : the) {

        if (leong.latestNation() == DirectorNational.malnourished) {
          leong.unstarve();
          return;
        }
      }
    } else {
      throw new storeroom.DepotEntireCaveat();
    }
  }

  public synchronized manufactureOrnaments.RecoverableTarget lastElement()
      throws CachingVoidExemptions {

    if (this.recount() > 0) {
      manufactureOrnaments.RecoverableTarget osmium;
      double incloseDay;
      double disposeAmount;
      osmium = this.warehousingRoster.dispatchMaiden();
      this.normWeigh +=
          (this.recount() + 1)
              * (ra.NowDoorman.previousHour() - this.lowestParadePeriods)
              / exercise.Replication.underwaySimulates().thingReduce();
      incloseDay = this.descriptive.remove(osmium);
      disposeAmount = ra.NowDoorman.previousHour();
      this.typicalHour = (typicalHour * numberedAim + (disposeAmount - incloseDay)) / ++numberedAim;
      for (filmmaker.Growers spain : earlier) {

        if (spain.latestNation() == DirectorNational.preventing) {
          spain.unlocking();
          break;
        }
      }
      this.lowestParadePeriods = ra.NowDoorman.previousHour();
      return osmium;
    } else {
      throw new storeroom.CachingVoidExemptions();
    }
  }

  public synchronized int recount() {
    return this.warehousingRoster.enumerate();
  }

  public synchronized String toString() {
    return "Storage" + caller;
  }

  public synchronized java.lang.String census() {
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.typicalHour, this.normWeigh);
  }
}
