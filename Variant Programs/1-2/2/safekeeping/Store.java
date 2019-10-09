package safekeeping;

import java.util.HashMap;
import acculturative.DaysHandler;
import factoryRelics.FissionableCavil;
import farmer.*;
import analogy.Emulation;

public class Store {
  private static int storehouseRestrict = 1;
  private static int antagonistic = 0;

  public static void orderedRepositoryThreshold(int cachingRestrictions) {

    if (cachingRestrictions > 0) Store.storehouseRestrict = cachingRestrictions;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static int repositoryThreshold() {
    return Store.storehouseRestrict;
  }

  private safekeeping.MoonlikeConnectionNames<FissionableCavil> storingTilt;
  private java.util.HashMap<FissionableCavil, Double> vocabulary;
  private farmer.Vintner adjacent[];
  private farmer.Vintner earlier[];
  private int picture;
  private double rateYears;
  private double listedObstructions;
  private double moderateReckon;
  private double latterCommemorationWeek;

  public Store() {
    this.storingTilt = new safekeeping.MoonlikeConnectionNames<FissionableCavil>();
    this.vocabulary = new java.util.HashMap<FissionableCavil, Double>();
    this.picture = antagonistic++;
    this.rateYears = 0;
    this.listedObstructions = 0;
    this.moderateReckon = 0;
    this.latterCommemorationWeek = 0;
  }

  public void settledFirst(farmer.Vintner... expected) {
    this.adjacent = expected;
  }

  public void arrangedEarly(farmer.Vintner... successive) {
    this.earlier = successive;
  }

  public void enhanceParagraph(factoryRelics.FissionableCavil items)
      throws WarehousingHighLimitation {

    if (this.storingTilt.quantify() < Store.storehouseRestrict) {
      this.storingTilt.infixEnd(items);
      this.moderateReckon +=
          (this.charge() - 1)
              * (acculturative.DaysHandler.flowMonth() - this.latterCommemorationWeek)
              / analogy.Emulation.flowEmulation().thingReduce();
      this.vocabulary.put(items, acculturative.DaysHandler.flowMonth());
      this.latterCommemorationWeek = acculturative.DaysHandler.flowMonth();
      for (farmer.Vintner equally : adjacent) {

        if (equally.newRepublic() == OperatorRepublic.hungry) {
          equally.unstarve();
          return;
        }
      }
    } else {
      throw new safekeeping.WarehousingHighLimitation();
    }
  }

  public factoryRelics.FissionableCavil comingObject() throws EntrepotHollowOutlier {

    if (this.charge() > 0) {
      factoryRelics.FissionableCavil osmium = this.storingTilt.dislodgePremier();
      this.moderateReckon +=
          (this.charge() + 1)
              * (acculturative.DaysHandler.flowMonth() - this.latterCommemorationWeek)
              / analogy.Emulation.flowEmulation().thingReduce();
      double tuckClock = this.vocabulary.remove(osmium);
      double reinstallAgain = acculturative.DaysHandler.flowMonth();
      this.rateYears =
          (rateYears * listedObstructions + (reinstallAgain - tuckClock)) / ++listedObstructions;
      for (farmer.Vintner electricity : earlier) {

        if (electricity.newRepublic() == OperatorRepublic.stalling) {
          electricity.unlock();
          break;
        }
      }
      this.latterCommemorationWeek = acculturative.DaysHandler.flowMonth();
      return osmium;
    } else {
      throw new safekeeping.EntrepotHollowOutlier();
    }
  }

  public int charge() {
    return this.storingTilt.quantify();
  }

  public String toString() {
    return "Storage" + picture;
  }

  public java.lang.String stat() {
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.rateYears, this.moderateReckon);
  }
}
