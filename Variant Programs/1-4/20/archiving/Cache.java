package archiving;

import java.util.HashMap;
import maturational.OpportunityCarer;
import cultivationBodies.RecoverableTarget;
import presenter.*;
import analog.Dramatization;

public class Cache {
  private static int warehousingRestriction = 1;
  private static int counteract = 0;

  public static synchronized void fixedInventoryMaximum(int storedBoundary) {

    if (storedBoundary > 0) Cache.warehousingRestriction = storedBoundary;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int storingBounds() {
    return Cache.warehousingRestriction;
  }

  private archiving.HandbillCoupledName<RecoverableTarget> storehouseNumber = null;
  private java.util.HashMap<RecoverableTarget, Double> glossary = null;
  private presenter.Manufacturer last[] = null;
  private presenter.Manufacturer former[] = null;
  private int milad = 0;
  private double halfJuncture = 0.0;
  private double accruedBodies = 0.0;
  private double normalNumber = 0.0;
  private double unlikelyContestChance = 0.0;

  public Cache() {
    this.storehouseNumber = new archiving.HandbillCoupledName<RecoverableTarget>();
    this.glossary = new java.util.HashMap<RecoverableTarget, Double>();
    this.milad = counteract++;
    this.halfJuncture = 0;
    this.accruedBodies = 0;
    this.normalNumber = 0;
    this.unlikelyContestChance = 0;
  }

  public synchronized void putFuture(presenter.Manufacturer... incoming) {
    this.last = incoming;
  }

  public synchronized void rigidPreliminary(presenter.Manufacturer... elapsed) {
    this.former = elapsed;
  }

  public synchronized void injectThing(cultivationBodies.RecoverableTarget body)
      throws WarehousingHighLimitation {

    if (this.storehouseNumber.weigh() < Cache.warehousingRestriction) {
      this.storehouseNumber.injectedSurvive(body);
      this.normalNumber +=
          (this.rely() - 1)
              * (maturational.OpportunityCarer.actualSentence() - this.unlikelyContestChance)
              / analog.Dramatization.actualPretending().thingReduce();
      this.glossary.put(body, maturational.OpportunityCarer.actualSentence());
      this.unlikelyContestChance = maturational.OpportunityCarer.actualSentence();
      for (presenter.Manufacturer equally : last) {

        if (equally.existingSovereign() == ProduceGovernmental.famished) {
          equally.unstarve();
          return;
        }
      }
    } else {
      throw new archiving.WarehousingHighLimitation();
    }
  }

  public synchronized cultivationBodies.RecoverableTarget upcomingSomething()
      throws InventoryAbandonRule {

    if (this.rely() > 0) {
      cultivationBodies.RecoverableTarget pubis = this.storehouseNumber.eradicateForward();
      this.normalNumber +=
          (this.rely() + 1)
              * (maturational.OpportunityCarer.actualSentence() - this.unlikelyContestChance)
              / analog.Dramatization.actualPretending().thingReduce();
      double installBeginning = this.glossary.remove(pubis);
      double dismantleNow = maturational.OpportunityCarer.actualSentence();
      this.halfJuncture =
          (halfJuncture * accruedBodies + (dismantleNow - installBeginning)) / ++accruedBodies;
      for (presenter.Manufacturer leong : former) {

        if (leong.existingSovereign() == ProduceGovernmental.disrupting) {
          leong.reactivate();
          break;
        }
      }
      this.unlikelyContestChance = maturational.OpportunityCarer.actualSentence();
      return pubis;
    } else {
      throw new archiving.InventoryAbandonRule();
    }
  }

  public synchronized int rely() {
    return this.storehouseNumber.weigh();
  }

  public synchronized String toString() {
    return "Storage" + milad;
  }

  public synchronized java.lang.String records() {
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.halfJuncture, this.normalNumber);
  }
}
