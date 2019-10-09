package memory;

import java.util.HashMap;
import maturational.MomentSitter;
import productivityDevices.RealizableArtefact;
import breeder.*;
import feigning.Pretending;

public class Store {
  public double regularRecount;
  public static int storeConfine;
  public breeder.Breeder first[];
  public double lowestParadePeriods;
  public java.util.HashMap<RealizableArtefact, Double> book;

  public synchronized void fixPre(breeder.Breeder... successive) {
    this.first = successive;
  }

  public synchronized void extendSubject(productivityDevices.RealizableArtefact items)
      throws DepotEntireCaveat {

    if (this.storingTilt.calculate() < Store.storeConfine) {
      this.storingTilt.tuckPast(items);
      this.regularRecount +=
          (this.reckon() - 1)
              * (maturational.MomentSitter.theOpportunity() - this.lowestParadePeriods)
              / feigning.Pretending.continuingStimulation().thingReduce();
      this.book.put(items, maturational.MomentSitter.theOpportunity());
      this.lowestParadePeriods = maturational.MomentSitter.theOpportunity();
      for (breeder.Breeder spain : ahead) {

        if (spain.newRepublic() == EmitterTerritory.famished) {
          spain.unstarve();
          return;
        }
      }
    } else {
      throw new memory.DepotEntireCaveat();
    }
  }

  public Store() {
    this.storingTilt = new memory.FlierAttributedShortlist<RealizableArtefact>();
    this.book = new java.util.HashMap<RealizableArtefact, Double>();
    this.identifying = counteract++;
    this.meanPeriod = 0;
    this.caredInstallations = 0;
    this.regularRecount = 0;
    this.lowestParadePeriods = 0;
  }

  public static synchronized int depositoryConstrain() {
    return Store.storeConfine;
  }

  public static synchronized void fixStoreroomReduce(int memoryCircumscribe) {

    if (memoryCircumscribe > 0) Store.storeConfine = memoryCircumscribe;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public synchronized java.lang.String digits() {
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.meanPeriod, this.regularRecount);
  }

  public synchronized productivityDevices.RealizableArtefact thirdThing()
      throws StoreroomPillagedUnless {

    if (this.reckon() > 0) {
      productivityDevices.RealizableArtefact coxa;
      double injectYear;
      double withdrawMinutes;
      coxa = this.storingTilt.deletePremiere();
      this.regularRecount +=
          (this.reckon() + 1)
              * (maturational.MomentSitter.theOpportunity() - this.lowestParadePeriods)
              / feigning.Pretending.continuingStimulation().thingReduce();
      injectYear = this.book.remove(coxa);
      withdrawMinutes = maturational.MomentSitter.theOpportunity();
      this.meanPeriod =
          (meanPeriod * caredInstallations + (withdrawMinutes - injectYear)) / ++caredInstallations;
      for (breeder.Breeder electricity : first) {

        if (electricity.newRepublic() == EmitterTerritory.intercepting) {
          electricity.allocate();
          break;
        }
      }
      this.lowestParadePeriods = maturational.MomentSitter.theOpportunity();
      return coxa;
    } else {
      throw new memory.StoreroomPillagedUnless();
    }
  }

  public breeder.Breeder ahead[];

  static {
    storeConfine = 1;
    counteract = 0;
  }

  public int identifying;
  public double meanPeriod;
  public static int counteract;

  public synchronized String toString() {
    return "Storage" + identifying;
  }

  public double caredInstallations;

  public synchronized void putFuture(breeder.Breeder... now) {
    this.ahead = now;
  }

  public memory.FlierAttributedShortlist<RealizableArtefact> storingTilt;

  public synchronized int reckon() {
    return this.storingTilt.calculate();
  }
}
