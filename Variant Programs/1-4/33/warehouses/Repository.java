package warehouses;

import java.util.HashMap;
import lapse.JunctureJailer;
import manufacturedBelongings.MinableOppose;
import production.*;
import analogy.Scenario;

public class Repository {
  public double worstVenueMoment = 0.0;
  public double avgCensus = 0.0;
  public double listedObstructions = 0.0;
  public double intermediateDays = 0.0;
  public int dimidiate = 0;
  public Presenter past[] = null;
  public Presenter incoming[] = null;
  public HashMap<MinableOppose, Double> verb = null;
  public RinglikeAssociatedLeaning<MinableOppose> inventoryRegistry = null;
  public static int against = 0;
  public static int spaceRestricts = 0;

  public static synchronized void layEntrepotRestrain(int storeConfine) {

    if (storeConfine > 0) Repository.spaceRestricts = storeConfine;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int archivingBound() {
    return Repository.spaceRestricts;
  }

  public Repository() {
    this.inventoryRegistry = new RinglikeAssociatedLeaning<MinableOppose>();
    this.verb = new HashMap<MinableOppose, Double>();
    this.dimidiate = against++;
    this.intermediateDays = 0;
    this.listedObstructions = 0;
    this.avgCensus = 0;
    this.worstVenueMoment = 0;
  }

  public synchronized void placedUpcoming(Presenter... forthcoming) {
    this.incoming = forthcoming;
  }

  public synchronized void putPreceding(Presenter... old) {
    this.past = old;
  }

  public synchronized void enhanceParagraph(MinableOppose element) throws DiskWholeObjection {

    if (this.inventoryRegistry.figures() < Repository.spaceRestricts) {
      this.inventoryRegistry.injectedSurvive(element);
      this.avgCensus +=
          (this.rely() - 1)
              * (JunctureJailer.formerAmount() - this.worstVenueMoment)
              / Scenario.typicalTrainer().opportunityMaximum();
      this.verb.put(element, JunctureJailer.formerAmount());
      this.worstVenueMoment = JunctureJailer.formerAmount();
      for (Presenter arsenic : incoming) {

        if (arsenic.previousStatehood() == EmitterTerritory.overpopulated) {
          arsenic.unstarve();
          return;
        }
      }
    } else {
      throw new DiskWholeObjection();
    }
  }

  public synchronized MinableOppose afterParagraph() throws DepositoryEliminateDeparture {

    if (this.rely() > 0) {
      MinableOppose sacrum;
      double inscribeMonth;
      double undoJuncture;
      sacrum = this.inventoryRegistry.disposePrototypical();
      this.avgCensus +=
          (this.rely() + 1)
              * (JunctureJailer.formerAmount() - this.worstVenueMoment)
              / Scenario.typicalTrainer().opportunityMaximum();
      inscribeMonth = this.verb.remove(sacrum);
      undoJuncture = JunctureJailer.formerAmount();
      this.intermediateDays =
          (intermediateDays * listedObstructions + (undoJuncture - inscribeMonth))
              / ++listedObstructions;
      for (Presenter electricity : past) {

        if (electricity.previousStatehood() == EmitterTerritory.halt) {
          electricity.allocate();
          break;
        }
      }
      this.worstVenueMoment = JunctureJailer.formerAmount();
      return sacrum;
    } else {
      throw new DepositoryEliminateDeparture();
    }
  }

  public synchronized int rely() {
    return this.inventoryRegistry.figures();
  }

  public synchronized String toString() {
    return "Storage" + dimidiate;
  }

  public synchronized String numerals() {
    return String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.intermediateDays, this.avgCensus);
  }

  static {
    spaceRestricts = 1;
    against = 0;
  }
}
