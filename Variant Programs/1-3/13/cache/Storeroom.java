package cache;

import java.util.HashMap;
import ra.BeginningHousekeeper;
import manufacturingPieces.PhyllosilicatePreclude;
import provider.*;
import emulation.Mock;

public class Storeroom {
  private double finalGalaSentence = 0.0;
  private double avgCensus = 0.0;
  private double calculatedTreasures = 0.0;
  private double halfJuncture = 0.0;
  private int finger = 0;
  private provider.Promoter preliminary[] = null;
  private provider.Promoter then[] = null;
  private java.util.HashMap<PhyllosilicatePreclude, Double> encyclopaedia = null;
  private cache.AnnulatedAffiliatedPlaylist<PhyllosilicatePreclude> repositoryDocket = null;
  private static int negate = 0;
  private static int storeroomReduce = 0;

  public static synchronized void prepareCachingRestrictions(int closetMax) {

    if (closetMax > 0) Storeroom.storeroomReduce = closetMax;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int storeConfine() {
    return Storeroom.storeroomReduce;
  }

  public Storeroom() {
    this.repositoryDocket = new cache.AnnulatedAffiliatedPlaylist<PhyllosilicatePreclude>();
    this.encyclopaedia = new java.util.HashMap<PhyllosilicatePreclude, Double>();
    this.finger = negate++;
    this.halfJuncture = 0;
    this.calculatedTreasures = 0;
    this.avgCensus = 0;
    this.finalGalaSentence = 0;
  }

  public synchronized void solidifyingThe(provider.Promoter... forthcoming) {
    this.then = forthcoming;
  }

  public synchronized void determineInitial(provider.Promoter... past) {
    this.preliminary = past;
  }

  public synchronized void introduceAspect(manufacturingPieces.PhyllosilicatePreclude victim)
      throws StoringWideProviso {

    if (this.repositoryDocket.tally() < Storeroom.storeroomReduce) {
      this.repositoryDocket.inscribingHigh(victim);
      this.avgCensus +=
          (this.numbers() - 1)
              * (ra.BeginningHousekeeper.topicalPeriod() - this.finalGalaSentence)
              / emulation.Mock.theReplication().hourRestricts();
      this.encyclopaedia.put(victim, ra.BeginningHousekeeper.topicalPeriod());
      this.finalGalaSentence = ra.BeginningHousekeeper.topicalPeriod();
      for (provider.Promoter spain : then) {

        if (spain.ongoingCountry() == ManufacturerCommonwealth.emaciated) {
          spain.unstarve();
          return;
        }
      }
    } else {
      throw new cache.StoringWideProviso();
    }
  }

  public synchronized manufacturingPieces.PhyllosilicatePreclude aheadIngredient()
      throws ArchivingBareDistinction {

    if (this.numbers() > 0) {
      manufacturingPieces.PhyllosilicatePreclude montes;
      double injectingOpportunity;
      double murderDays;
      montes = this.repositoryDocket.murderStart();
      this.avgCensus +=
          (this.numbers() + 1)
              * (ra.BeginningHousekeeper.topicalPeriod() - this.finalGalaSentence)
              / emulation.Mock.theReplication().hourRestricts();
      injectingOpportunity = this.encyclopaedia.remove(montes);
      murderDays = ra.BeginningHousekeeper.topicalPeriod();
      this.halfJuncture =
          (halfJuncture * calculatedTreasures + (murderDays - injectingOpportunity))
              / ++calculatedTreasures;
      for (provider.Promoter arsenic : preliminary) {

        if (arsenic.ongoingCountry() == ManufacturerCommonwealth.intercepting) {
          arsenic.lift();
          break;
        }
      }
      this.finalGalaSentence = ra.BeginningHousekeeper.topicalPeriod();
      return montes;
    } else {
      throw new cache.ArchivingBareDistinction();
    }
  }

  public synchronized int numbers() {
    return this.repositoryDocket.tally();
  }

  public synchronized String toString() {
    return "Storage" + finger;
  }

  public synchronized java.lang.String censuses() {
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.halfJuncture, this.avgCensus);
  }

  static {
    storeroomReduce = 1;
    negate = 0;
  }
}
