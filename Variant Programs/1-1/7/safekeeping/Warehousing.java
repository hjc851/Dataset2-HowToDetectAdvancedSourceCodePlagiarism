package safekeeping;

import java.util.HashMap;
import euphonious.ThingCatch;
import harvestingGoods.HypabyssalTotem;
import promoter.*;
import analog.Simulating;

public class Warehousing {
  private static int warehousesMinimum = 1;
  private static int forestall = 0;

  public static void laidDepotLimitation(int safekeepingCurb) {

    if (safekeepingCurb > 0) Warehousing.warehousesMinimum = safekeepingCurb;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static int cacheThrottle() {
    return Warehousing.warehousesMinimum;
  }

  private HandbillCoupledName<HypabyssalTotem> stowageCompendium;
  private HashMap<HypabyssalTotem, Double> glossary;
  private Grower future[];
  private Grower ago[];
  private int milad;
  private double ratioChance;
  private double consideredGoods;
  private double medianTally;
  private double finallySymposiumPeriod;

  public Warehousing() {
    this.stowageCompendium = new HandbillCoupledName<HypabyssalTotem>();
    this.glossary = new HashMap<HypabyssalTotem, Double>();
    this.milad = forestall++;
    this.ratioChance = 0;
    this.consideredGoods = 0;
    this.medianTally = 0;
    this.finallySymposiumPeriod = 0;
  }

  public void doEarly(Grower... ahead) {
    this.future = ahead;
  }

  public void settledPervious(Grower... old) {
    this.ago = old;
  }

  public void lendPoint(HypabyssalTotem objet) throws StowageLadenDerogation {

    if (this.stowageCompendium.total() < Warehousing.warehousesMinimum) {
      this.stowageCompendium.injectingDying(objet);
      this.medianTally +=
          (this.census() - 1)
              * (ThingCatch.actualSentence() - this.finallySymposiumPeriod)
              / Simulating.prevailingModel().opportunityMaximum();
      this.glossary.put(objet, ThingCatch.actualSentence());
      this.finallySymposiumPeriod = ThingCatch.actualSentence();
      for (Grower spain : future) {

        if (spain.afootGovernment() == BreederGeneral.brutalized) {
          spain.unstarve();
          return;
        }
      }
    } else {
      throw new StowageLadenDerogation();
    }
  }

  public HypabyssalTotem upcomingSomething() throws StowageLootedDerogation {

    if (this.census() > 0) {
      HypabyssalTotem montes = this.stowageCompendium.undoBasic();
      this.medianTally +=
          (this.census() + 1)
              * (ThingCatch.actualSentence() - this.finallySymposiumPeriod)
              / Simulating.prevailingModel().opportunityMaximum();
      double insertionPeriod = this.glossary.remove(montes);
      double ejectHour = ThingCatch.actualSentence();
      this.ratioChance =
          (ratioChance * consideredGoods + (ejectHour - insertionPeriod)) / ++consideredGoods;
      for (Grower equally : ago) {

        if (equally.afootGovernment() == BreederGeneral.hindering) {
          equally.resolve();
          break;
        }
      }
      this.finallySymposiumPeriod = ThingCatch.actualSentence();
      return montes;
    } else {
      throw new StowageLootedDerogation();
    }
  }

  public int census() {
    return this.stowageCompendium.total();
  }

  public String toString() {
    return "Storage" + milad;
  }

  public String figures() {
    return String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.ratioChance, this.medianTally);
  }
}
