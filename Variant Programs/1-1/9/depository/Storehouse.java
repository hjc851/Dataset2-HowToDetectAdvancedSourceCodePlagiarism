package depository;

import java.util.HashMap;
import ontogenetic.WhenGuard;
import supplyArtefact.PerformableObjection;
import director.*;
import realism.Simulates;

public class Storehouse {
  private static int entrepotRestrain = 1;
  private static int anticipate = 0;

  public static void orderedRepositoryThreshold(int archivalCurtail) {

    if (archivalCurtail > 0) Storehouse.entrepotRestrain = archivalCurtail;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static int warehousingRestriction() {
    return Storehouse.entrepotRestrain;
  }

  private MoonlikeConnectionNames<PerformableObjection> memoryLean;
  private HashMap<PerformableObjection, Double> lexicon;
  private Farm forthcoming[];
  private Farm predecessor[];
  private int picture;
  private double moderatePeriods;
  private double reckonedElements;
  private double middlingEnumerate;
  private double laterExtravaganzaClip;

  public Storehouse() {
    this.memoryLean = new MoonlikeConnectionNames<PerformableObjection>();
    this.lexicon = new HashMap<PerformableObjection, Double>();
    this.picture = anticipate++;
    this.moderatePeriods = 0;
    this.reckonedElements = 0;
    this.middlingEnumerate = 0;
    this.laterExtravaganzaClip = 0;
  }

  public void adjustExpected(Farm... ahead) {
    this.forthcoming = ahead;
  }

  public void primedEarlier(Farm... first) {
    this.predecessor = first;
  }

  public void appendToken(PerformableObjection cavil) throws DepotEntireCaveat {

    if (this.memoryLean.number() < Storehouse.entrepotRestrain) {
      this.memoryLean.incorporatedGo(cavil);
      this.middlingEnumerate +=
          (this.numbers() - 1)
              * (WhenGuard.ongoingMeter() - this.laterExtravaganzaClip)
              / Simulates.typicalTrainer().meterCircumscribe();
      this.lexicon.put(cavil, WhenGuard.ongoingMeter());
      this.laterExtravaganzaClip = WhenGuard.ongoingMeter();
      for (Farm arsenic : forthcoming) {

        if (arsenic.incumbentLand() == PublisherExpress.pizza) {
          arsenic.unstarve();
          return;
        }
      }
    } else {
      throw new DepotEntireCaveat();
    }
  }

  public PerformableObjection againTidbit() throws DiskRansackedObjection {

    if (this.numbers() > 0) {
      PerformableObjection montes = this.memoryLean.hitTop();
      this.middlingEnumerate +=
          (this.numbers() + 1)
              * (WhenGuard.ongoingMeter() - this.laterExtravaganzaClip)
              / Simulates.typicalTrainer().meterCircumscribe();
      double enterSentence = this.lexicon.remove(montes);
      double deleteWeek = WhenGuard.ongoingMeter();
      this.moderatePeriods =
          (moderatePeriods * reckonedElements + (deleteWeek - enterSentence)) / ++reckonedElements;
      for (Farm leong : predecessor) {

        if (leong.incumbentLand() == PublisherExpress.hindering) {
          leong.commit();
          break;
        }
      }
      this.laterExtravaganzaClip = WhenGuard.ongoingMeter();
      return montes;
    } else {
      throw new DiskRansackedObjection();
    }
  }

  public int numbers() {
    return this.memoryLean.number();
  }

  public String toString() {
    return "Storage" + picture;
  }

  public String digit() {
    return String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.moderatePeriods, this.middlingEnumerate);
  }
}
