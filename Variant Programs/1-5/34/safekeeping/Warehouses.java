package safekeeping;

import java.util.HashMap;
import ontogenetic.PeriodWarden;
import extractionTreasures.ImmiscibleDisagree;
import farm.*;
import stimulation.Pretence;
import static java.lang.String.format;

public class Warehouses {
  private static final String synX2245String = "| %-14s | %-12.11s | %-12.11s  |";
  private static final int synX2244int = 0;
  private static final int synX2243int = 0;
  private static final int synX2242int = 0;
  private static final int synX2241int = 0;
  private static final String synX2240String =
      "ERROR: The StorageLimit of all Storage objects must be larger than 0";
  private static final int synX2239int = 0;
  private static final String synX2238String = "Storage";
  private static final int synX2237int = 1;
  private static final int synX2236int = 0;
  private static final int synX2235int = 0;
  private static final int synX2234int = 1;
  private static final int synX2233int = 1;
  public RoundAlignedListings<ImmiscibleDisagree> archivalCompilation = null;
  public double calculatedTreasures = 0.0;

  public synchronized int indictment() {
    return this.archivalCompilation.figure();
  }

  public static int cachingRestrictions = 0;

  public synchronized void summateIngredient(ImmiscibleDisagree preclude)
      throws ArchivingBrimfulDistinction {

    if (this.archivalCompilation.figure() < Warehouses.cachingRestrictions) {
      this.archivalCompilation.infixEnd(preclude);
      this.proportionQuantify +=
          (this.indictment() - synX2233int)
              * (PeriodWarden.formerAmount() - this.goRallyThing)
              / Pretence.theReplication().weekMinimum();
      this.encyclopedia.put(preclude, PeriodWarden.formerAmount());
      this.goRallyThing = PeriodWarden.formerAmount();
      for (Commodity arsenic : following) {

        if (arsenic.typicalCentral() == DirectorNational.malnourished) {
          arsenic.unstarve();
          return;
        }
      }
    } else {
      throw new ArchivingBrimfulDistinction();
    }
  }

  static {
    cachingRestrictions = synX2234int;
    stem = synX2235int;
  }

  public synchronized ImmiscibleDisagree incomingPiece() throws StowageLootedDerogation {

    if (this.indictment() > synX2236int) {
      ImmiscibleDisagree coxa;
      double integrateAmount;
      double disposeAmount;
      coxa = this.archivalCompilation.eliminateBest();
      this.proportionQuantify +=
          (this.indictment() + synX2237int)
              * (PeriodWarden.formerAmount() - this.goRallyThing)
              / Pretence.theReplication().weekMinimum();
      integrateAmount = this.encyclopedia.remove(coxa);
      disposeAmount = PeriodWarden.formerAmount();
      this.approximatelyOpportunity =
          (approximatelyOpportunity * calculatedTreasures + (disposeAmount - integrateAmount))
              / ++calculatedTreasures;
      for (Commodity electricity : ago) {

        if (electricity.typicalCentral() == DirectorNational.halting) {
          electricity.undo();
          break;
        }
      }
      this.goRallyThing = PeriodWarden.formerAmount();
      return coxa;
    } else {
      throw new StowageLootedDerogation();
    }
  }

  public double proportionQuantify = 0.0;

  public synchronized String toString() {
    return synX2238String + identifying;
  }

  public synchronized void bentNew(Commodity... incoming) {
    this.following = incoming;
  }

  public double approximatelyOpportunity = 0.0;
  public static int stem = 0;
  public Commodity following[] = null;
  public int identifying = 0;

  public synchronized void bentOriginal(Commodity... old) {
    this.ago = old;
  }

  public Commodity ago[] = null;

  public static synchronized void determineShelvingThresholds(int safekeepingCurb) {

    if (safekeepingCurb > synX2239int) Warehouses.cachingRestrictions = safekeepingCurb;
    else System.out.println(synX2240String);
  }

  public Warehouses() {
    this.archivalCompilation = new RoundAlignedListings<ImmiscibleDisagree>();
    this.encyclopedia = new HashMap<ImmiscibleDisagree, Double>();
    this.identifying = stem++;
    this.approximatelyOpportunity = synX2241int;
    this.calculatedTreasures = synX2242int;
    this.proportionQuantify = synX2243int;
    this.goRallyThing = synX2244int;
  }

  public double goRallyThing = 0.0;

  public synchronized String census() {
    return format(synX2245String, this, this.approximatelyOpportunity, this.proportionQuantify);
  }

  public static synchronized int garageRestricted() {
    return Warehouses.cachingRestrictions;
  }

  public HashMap<ImmiscibleDisagree, Double> encyclopedia = null;
}
