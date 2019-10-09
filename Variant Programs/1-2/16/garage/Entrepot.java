package garage;

import java.util.HashMap;
import acculturative.AgainOfficer;
import fabricationObstructions.RecoverableTarget;
import farmer.*;
import exercise.Dramatization;

public class Entrepot {
  private static int inventoryMaximum = 1;
  private static int negate = 0;

  public static void arrangeArchivalCurtail(int storedBoundary) {

    if (storedBoundary > 0) Entrepot.inventoryMaximum = storedBoundary;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static int warehouseDemarcation() {
    return Entrepot.inventoryMaximum;
  }

  private AnnulatedAffiliatedPlaylist<RecoverableTarget> repositoryDocket;
  private HashMap<RecoverableTarget, Double> idioticon;
  private Publisher succeeding[];
  private Publisher ago[];
  private int self;
  private double proportionBeginning;
  private double measuredArtefacts;
  private double middlingEnumerate;
  private double surviveGatheringHour;

  public Entrepot() {
    this.repositoryDocket = new AnnulatedAffiliatedPlaylist<RecoverableTarget>();
    this.idioticon = new HashMap<RecoverableTarget, Double>();
    this.self = negate++;
    this.proportionBeginning = 0;
    this.measuredArtefacts = 0;
    this.middlingEnumerate = 0;
    this.surviveGatheringHour = 0;
  }

  public void situatedForthcoming(Publisher... early) {
    this.succeeding = early;
  }

  public void adjustFirst(Publisher... past) {
    this.ago = past;
  }

  public void introduceAspect(RecoverableTarget objective) throws ShelvingRepleteExcluded {

    if (this.repositoryDocket.weigh() < Entrepot.inventoryMaximum) {
      this.repositoryDocket.injectFinish(objective);
      this.middlingEnumerate +=
          (this.numbers() - 1)
              * (AgainOfficer.latestClip() - this.surviveGatheringHour)
              / Dramatization.contemporaryFeigning().junctureConstrain();
      this.idioticon.put(objective, AgainOfficer.latestClip());
      this.surviveGatheringHour = AgainOfficer.latestClip();
      for (Publisher equally : succeeding) {

        if (equally.streamSate() == ProduceGovernmental.dying) {
          equally.unstarve();
          return;
        }
      }
    } else {
      throw new ShelvingRepleteExcluded();
    }
  }

  public RecoverableTarget forthcomingAspect() throws SafekeepingCleanDerogate {

    if (this.numbers() > 0) {
      RecoverableTarget sacrum = this.repositoryDocket.ejectEldest();
      this.middlingEnumerate +=
          (this.numbers() + 1)
              * (AgainOfficer.latestClip() - this.surviveGatheringHour)
              / Dramatization.contemporaryFeigning().junctureConstrain();
      double injectedHour = this.idioticon.remove(sacrum);
      double yankChance = AgainOfficer.latestClip();
      this.proportionBeginning =
          (proportionBeginning * measuredArtefacts + (yankChance - injectedHour))
              / ++measuredArtefacts;
      for (Publisher arsenic : ago) {

        if (arsenic.streamSate() == ProduceGovernmental.clog) {
          arsenic.resume();
          break;
        }
      }
      this.surviveGatheringHour = AgainOfficer.latestClip();
      return sacrum;
    } else {
      throw new SafekeepingCleanDerogate();
    }
  }

  public int numbers() {
    return this.repositoryDocket.weigh();
  }

  public String toString() {
    return "Storage" + self;
  }

  public String figure() {
    return String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.proportionBeginning, this.middlingEnumerate);
  }
}
