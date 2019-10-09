package warehousing;

import java.util.HashMap;
import glanced.YearWarder;
import manufactureOrnaments.ImmiscibleDisagree;
import producing.*;
import simulated.Modeling;

public class Memory {
  private static int warehousesMinimum = 1;
  private static int against = 0;

  public static void placedCacheThrottle(int warehouseDemarcation) {

    if (warehouseDemarcation > 0) Memory.warehousesMinimum = warehouseDemarcation;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static int shelvingThresholds() {
    return Memory.warehousesMinimum;
  }

  private AnnularImplicatedInclination<ImmiscibleDisagree> warehousingRoster;
  private HashMap<ImmiscibleDisagree, Double> noun;
  private Provider now[];
  private Provider recent[];
  private int idem;
  private double rateYears;
  private double consideredGoods;
  private double fairTabulation;
  private double closingRaceYears;

  public Memory() {
    this.warehousingRoster = new AnnularImplicatedInclination<ImmiscibleDisagree>();
    this.noun = new HashMap<ImmiscibleDisagree, Double>();
    this.idem = against++;
    this.rateYears = 0;
    this.consideredGoods = 0;
    this.fairTabulation = 0;
    this.closingRaceYears = 0;
  }

  public void bentNew(Provider... first) {
    this.now = first;
  }

  public void putPreceding(Provider... pervious) {
    this.recent = pervious;
  }

  public void giveArticles(ImmiscibleDisagree opposes) throws CachingBroadExemptions {

    if (this.warehousingRoster.numbers() < Memory.warehousesMinimum) {
      this.warehousingRoster.inscribeConcluding(opposes);
      this.fairTabulation +=
          (this.enumeration() - 1)
              * (YearWarder.existingYears() - this.closingRaceYears)
              / Modeling.presentlySynthesizer().periodsBound();
      this.noun.put(opposes, YearWarder.existingYears());
      this.closingRaceYears = YearWarder.existingYears();
      for (Provider electricity : now) {

        if (electricity.latestNation() == ProviderForeign.torturing) {
          electricity.unstarve();
          return;
        }
      }
    } else {
      throw new CachingBroadExemptions();
    }
  }

  public ImmiscibleDisagree expectedTopic() throws ArchivalHungryExempt {

    if (this.enumeration() > 0) {
      ImmiscibleDisagree coxa = this.warehousingRoster.deletePremiere();
      this.fairTabulation +=
          (this.enumeration() + 1)
              * (YearWarder.existingYears() - this.closingRaceYears)
              / Modeling.presentlySynthesizer().periodsBound();
      double pasteChance = this.noun.remove(coxa);
      double takeClock = YearWarder.existingYears();
      this.rateYears =
          (rateYears * consideredGoods + (takeClock - pasteChance)) / ++consideredGoods;
      for (Provider leong : recent) {

        if (leong.latestNation() == ProviderForeign.interference) {
          leong.bypass();
          break;
        }
      }
      this.closingRaceYears = YearWarder.existingYears();
      return coxa;
    } else {
      throw new ArchivalHungryExempt();
    }
  }

  public int enumeration() {
    return this.warehousingRoster.numbers();
  }

  public String toString() {
    return "Storage" + idem;
  }

  public String statistically() {
    return String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.rateYears, this.fairTabulation);
  }
}
