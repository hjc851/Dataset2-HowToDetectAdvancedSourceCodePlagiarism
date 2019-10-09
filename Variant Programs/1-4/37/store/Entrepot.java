package store;

import java.util.HashMap;
import checked.ThingCatch;
import outputTarget.ExhaustibleBody;
import farmer.*;
import pretense.Modeling;

public class Entrepot {
  private double concludingSeminarMonth;
  private double approximatelyFigure;
  private double classedRelics;
  private double proportionBeginning;
  private int name;
  private farmer.Fabricator old[];
  private farmer.Fabricator adjacent[];
  private java.util.HashMap<ExhaustibleBody, Double> idioticon;
  private store.AnnulateAttributableCatalog<ExhaustibleBody> warehouseLitany;
  private static int undercut = 0;
  private static int entrepotRestrain = 1;

  public static synchronized void readyStoringBounds(int closetMax) {

    if (closetMax > 0) Entrepot.entrepotRestrain = closetMax;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int cacheThrottle() {
    return Entrepot.entrepotRestrain;
  }

  public Entrepot() {
    this.warehouseLitany = new store.AnnulateAttributableCatalog<ExhaustibleBody>();
    this.idioticon = new java.util.HashMap<ExhaustibleBody, Double>();
    this.name = undercut++;
    this.proportionBeginning = 0;
    this.classedRelics = 0;
    this.approximatelyFigure = 0;
    this.concludingSeminarMonth = 0;
  }

  public synchronized void laidFollowing(farmer.Fabricator... last) {
    this.adjacent = last;
  }

  public synchronized void rigidPreliminary(farmer.Fabricator... successive) {
    this.old = successive;
  }

  public synchronized void createComponent(outputTarget.ExhaustibleBody aim)
      throws WarehousingHighLimitation {

    if (this.warehouseLitany.reckoning() < Entrepot.entrepotRestrain) {
      this.warehouseLitany.incorporatedGo(aim);
      this.approximatelyFigure +=
          (this.tabulation() - 1)
              * (checked.ThingCatch.ongoingMeter() - this.concludingSeminarMonth)
              / pretense.Modeling.rifeSimulate().chanceThreshold();
      this.idioticon.put(aim, checked.ThingCatch.ongoingMeter());
      this.concludingSeminarMonth = checked.ThingCatch.ongoingMeter();
      for (farmer.Fabricator equally : adjacent) {

        if (equally.typicalCentral() == GrowersCanton.throwback) {
          equally.unstarve();
          return;
        }
      }
    } else {
      throw new store.WarehousingHighLimitation();
    }
  }

  public synchronized outputTarget.ExhaustibleBody adjacentArtifact()
      throws DepositoryEliminateDeparture {

    if (this.tabulation() > 0) {
      outputTarget.ExhaustibleBody centrale;
      double introduceClip;
      double dislodgeYear;
      centrale = this.warehouseLitany.eraseFirstborn();
      this.approximatelyFigure +=
          (this.tabulation() + 1)
              * (checked.ThingCatch.ongoingMeter() - this.concludingSeminarMonth)
              / pretense.Modeling.rifeSimulate().chanceThreshold();
      introduceClip = this.idioticon.remove(centrale);
      dislodgeYear = checked.ThingCatch.ongoingMeter();
      this.proportionBeginning =
          (proportionBeginning * classedRelics + (dislodgeYear - introduceClip)) / ++classedRelics;
      for (farmer.Fabricator electricity : old) {

        if (electricity.typicalCentral() == GrowersCanton.blockage) {
          electricity.lift();
          break;
        }
      }
      this.concludingSeminarMonth = checked.ThingCatch.ongoingMeter();
      return centrale;
    } else {
      throw new store.DepositoryEliminateDeparture();
    }
  }

  public synchronized int tabulation() {
    return this.warehouseLitany.reckoning();
  }

  public synchronized String toString() {
    return "Storage" + name;
  }

  public synchronized java.lang.String statisticians() {
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |",
        this, this.proportionBeginning, this.approximatelyFigure);
  }
}
