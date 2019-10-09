package storehouse;

import java.util.HashMap;
import checked.ClockCustodian;
import producerArtefacts.ClasticVictim;
import supplier.*;
import realism.Stimulation;
import static java.lang.System.out;

public class Closet {
  public static int memoryCircumscribe = 0;
  public static int counteract = 0;

  public static synchronized void markWarehousingRestriction(int depositoryConstrain) {

    if (depositoryConstrain > 0) Closet.memoryCircumscribe = depositoryConstrain;
    else out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int closetMax() {
    return Closet.memoryCircumscribe;
  }

  public storehouse.AnnularImplicatedInclination<ClasticVictim> cachingRanking = null;
  public java.util.HashMap<ClasticVictim, Double> thesaurus = null;
  public supplier.Farm later[] = null;
  public supplier.Farm last[] = null;
  public int map = 0;
  public double halfJuncture = 0.0;
  public double listedObstructions = 0.0;
  public double percentageCalculation = 0.0;
  public double worstVenueMoment = 0.0;

  public Closet() {
    this.cachingRanking = new storehouse.AnnularImplicatedInclination<ClasticVictim>();
    this.thesaurus = new java.util.HashMap<ClasticVictim, Double>();
    this.map = counteract++;
    this.halfJuncture = 0;
    this.listedObstructions = 0;
    this.percentageCalculation = 0;
    this.worstVenueMoment = 0;
  }

  public synchronized void situatedForthcoming(supplier.Farm... upcoming) {
    this.later = upcoming;
  }

  public synchronized void situatedLatest(supplier.Farm... premature) {
    this.last = premature;
  }

  public synchronized void summateIngredient(producerArtefacts.ClasticVictim aim)
      throws RepositoryChockablockExceptional {

    if (this.cachingRanking.get() < Closet.memoryCircumscribe) {
      this.cachingRanking.pasteUnlikely(aim);
      this.percentageCalculation +=
          (this.numeration() - 1)
              * (checked.ClockCustodian.afootHours() - this.worstVenueMoment)
              / realism.Stimulation.incumbentPretense().againRestricted();
      this.thesaurus.put(aim, checked.ClockCustodian.afootHours());
      this.worstVenueMoment = checked.ClockCustodian.afootHours();
      for (supplier.Farm leong : later) {

        if (leong.topicalSubmit() == ExporterNation.throwback) {
          leong.unstarve();
          return;
        }
      }
    } else {
      throw new storehouse.RepositoryChockablockExceptional();
    }
  }

  public synchronized producerArtefacts.ClasticVictim earlySubject() throws StoreBlankExcepted {

    if (this.numeration() > 0) {
      producerArtefacts.ClasticVictim coccyx = this.cachingRanking.eliminateBest();
      this.percentageCalculation +=
          (this.numeration() + 1)
              * (checked.ClockCustodian.afootHours() - this.worstVenueMoment)
              / realism.Stimulation.incumbentPretense().againRestricted();
      double insertionPeriod = this.thesaurus.remove(coccyx);
      double banishHours = checked.ClockCustodian.afootHours();
      this.halfJuncture =
          (halfJuncture * listedObstructions + (banishHours - insertionPeriod))
              / ++listedObstructions;
      for (supplier.Farm equally : last) {

        if (equally.topicalSubmit() == ExporterNation.interference) {
          equally.bypass();
          break;
        }
      }
      this.worstVenueMoment = checked.ClockCustodian.afootHours();
      return coccyx;
    } else {
      throw new storehouse.StoreBlankExcepted();
    }
  }

  public synchronized int numeration() {
    return this.cachingRanking.get();
  }

  public synchronized String toString() {
    return "Storage" + map;
  }

  public synchronized java.lang.String metrics() {
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.halfJuncture, this.percentageCalculation);
  }

  static {
    memoryCircumscribe = 1;
    counteract = 0;
  }
}
