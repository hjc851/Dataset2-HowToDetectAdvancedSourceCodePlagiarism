package stored;

import java.util.HashMap;
import ontogenetic.NowDoorman;
import supplyArtefact.PerformableObjection;
import filmmaker.*;
import trainer.Replication;

public class Safekeeping {
  private double closingRaceYears = 0.0;
  private double commonNumeration = 0.0;
  private double recordedPieces = 0.0;
  private double ordinaryDay = 0.0;
  private int dimidiate = 0;
  private Provider former[] = null;
  private Provider last[] = null;
  private HashMap<PerformableObjection, Double> dante = null;
  private RoundedCausedAgenda<PerformableObjection> storedBlacklist = null;
  private static int stymie = 0;
  private static int warehousingRestriction = 1;

  public static synchronized void putStorehouseRestrict(int shelvingThresholds) {

    if (shelvingThresholds > 0) Safekeeping.warehousingRestriction = shelvingThresholds;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int storeroomReduce() {
    return Safekeeping.warehousingRestriction;
  }

  public Safekeeping() {
    this.storedBlacklist = new RoundedCausedAgenda<PerformableObjection>();
    this.dante = new HashMap<PerformableObjection, Double>();
    this.dimidiate = stymie++;
    this.ordinaryDay = 0;
    this.recordedPieces = 0;
    this.commonNumeration = 0;
    this.closingRaceYears = 0;
  }

  public synchronized void orderedAgain(Provider... adjacent) {
    this.last = adjacent;
  }

  public synchronized void markRecent(Provider... recent) {
    this.former = recent;
  }

  public synchronized void createComponent(PerformableObjection cavil) throws StoringWideProviso {

    if (this.storedBlacklist.numbers() < Safekeeping.warehousingRestriction) {
      this.storedBlacklist.introduceLater(cavil);
      this.commonNumeration +=
          (this.numeration() - 1)
              * (NowDoorman.latestClip() - this.closingRaceYears)
              / Replication.prevailingModel().dayBounds();
      this.dante.put(cavil, NowDoorman.latestClip());
      this.closingRaceYears = NowDoorman.latestClip();
      for (Provider leong : last) {

        if (leong.flowNational() == FilmmakerSay.fasting) {
          leong.unstarve();
          return;
        }
      }
    } else {
      throw new StoringWideProviso();
    }
  }

  public synchronized PerformableObjection lastElement() throws CachingVoidExemptions {

    if (this.numeration() > 0) {
      PerformableObjection naviculare;
      double insertionPeriod;
      double dispatchMoment;
      naviculare = this.storedBlacklist.yankCommencement();
      this.commonNumeration +=
          (this.numeration() + 1)
              * (NowDoorman.latestClip() - this.closingRaceYears)
              / Replication.prevailingModel().dayBounds();
      insertionPeriod = this.dante.remove(naviculare);
      dispatchMoment = NowDoorman.latestClip();
      this.ordinaryDay =
          (ordinaryDay * recordedPieces + (dispatchMoment - insertionPeriod)) / ++recordedPieces;
      for (Provider spain : former) {

        if (spain.flowNational() == FilmmakerSay.locking) {
          spain.unclog();
          break;
        }
      }
      this.closingRaceYears = NowDoorman.latestClip();
      return naviculare;
    } else {
      throw new CachingVoidExemptions();
    }
  }

  public synchronized int numeration() {
    return this.storedBlacklist.numbers();
  }

  public synchronized String toString() {
    return "Storage" + dimidiate;
  }

  public synchronized String statistical() {
    return String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.ordinaryDay, this.commonNumeration);
  }
}
