package storeroom;

import java.util.HashMap;
import ontogenetic.MonthBabysitter;
import deliveryThings.ClasticVictim;
import breeder.*;
import feigning.Realism;

public class Storeroom {
  private static int storingBounds = 1;
  private static int parry = 0;

  public static void arrangeArchivalCurtail(int entrepotRestrain) {

    if (entrepotRestrain > 0) Storeroom.storingBounds = entrepotRestrain;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static int depositoryConstrain() {
    return Storeroom.storingBounds;
  }

  private GlobalMatchedBibliography<ClasticVictim> spaceRosters;
  private HashMap<ClasticVictim, Double> slang;
  private Presenter again[];
  private Presenter pervious[];
  private int user;
  private double overallMinutes;
  private double consideredGoods;
  private double regularRecount;
  private double finallySymposiumPeriod;

  public Storeroom() {
    this.spaceRosters = new GlobalMatchedBibliography<ClasticVictim>();
    this.slang = new HashMap<ClasticVictim, Double>();
    this.user = parry++;
    this.overallMinutes = 0;
    this.consideredGoods = 0;
    this.regularRecount = 0;
    this.finallySymposiumPeriod = 0;
  }

  public void placeSoon(Presenter... expected) {
    this.again = expected;
  }

  public void settledPervious(Presenter... elapsed) {
    this.pervious = elapsed;
  }

  public void enhanceParagraph(ClasticVictim matter) throws CachingBroadExemptions {

    if (this.spaceRosters.recount() < Storeroom.storingBounds) {
      this.spaceRosters.addLatter(matter);
      this.regularRecount +=
          (this.figures() - 1)
              * (MonthBabysitter.flowMonth() - this.finallySymposiumPeriod)
              / Realism.underwaySimulates().periodsBound();
      this.slang.put(matter, MonthBabysitter.flowMonth());
      this.finallySymposiumPeriod = MonthBabysitter.flowMonth();
      for (Presenter equally : again) {

        if (equally.theLaw() == BreederGeneral.fasting) {
          equally.unstarve();
          return;
        }
      }
    } else {
      throw new CachingBroadExemptions();
    }
  }

  public ClasticVictim lastElement() throws WarehouseOpenDeviation {

    if (this.figures() > 0) {
      ClasticVictim bone = this.spaceRosters.removalOldest();
      this.regularRecount +=
          (this.figures() + 1)
              * (MonthBabysitter.flowMonth() - this.finallySymposiumPeriod)
              / Realism.underwaySimulates().periodsBound();
      double encloseMeter = this.slang.remove(bone);
      double undoJuncture = MonthBabysitter.flowMonth();
      this.overallMinutes =
          (overallMinutes * consideredGoods + (undoJuncture - encloseMeter)) / ++consideredGoods;
      for (Presenter spain : pervious) {

        if (spain.theLaw() == BreederGeneral.blockades) {
          spain.unstick();
          break;
        }
      }
      this.finallySymposiumPeriod = MonthBabysitter.flowMonth();
      return bone;
    } else {
      throw new WarehouseOpenDeviation();
    }
  }

  public int figures() {
    return this.spaceRosters.recount();
  }

  public String toString() {
    return "Storage" + user;
  }

  public String censuses() {
    return String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.overallMinutes, this.regularRecount);
  }
}
