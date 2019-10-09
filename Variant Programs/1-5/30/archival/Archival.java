package archival;

import java.util.HashMap;
import maturational.YearsHolder;
import cultivationBodies.SpodumeneThing;
import filmmaker.*;
import emulation.Pretense;
import static java.lang.System.out;

public class Archival {
  private static final int synX2167int = 1;
  private static final int synX2166int = 0;
  private static final String synX2165String = "| %-14s | %-12.11s | %-12.11s  |";
  private static final int synX2164int = 1;
  private static final int synX2163int = 0;
  private static final int synX2162int = 0;
  private static final int synX2161int = 0;
  private static final int synX2160int = 0;
  private static final String synX2159String =
      "ERROR: The StorageLimit of all Storage objects must be larger than 0";
  private static final int synX2158int = 0;
  private static final String synX2157String = "Storage";

  public synchronized String toString() {
    return synX2157String + security;
  }

  private archival.OrbicularRelatedTilt<SpodumeneThing> closetCatalog;
  private filmmaker.Exporter succeeding[];

  public static synchronized int warehousingRestriction() {
    return Archival.warehousesMinimum;
  }

  private java.util.HashMap<SpodumeneThing, Double> vocab;
  private static int warehousesMinimum;
  private double numberedAim;

  public static synchronized void arrangedStoreConfine(int cacheThrottle) {

    if (cacheThrottle > synX2158int) Archival.warehousesMinimum = cacheThrottle;
    else out.println(synX2159String);
  }

  private double ordinaryEnumeration;

  public synchronized void prepareCurrent(filmmaker.Exporter... late) {
    this.successive = late;
  }

  public Archival() {
    this.closetCatalog = new archival.OrbicularRelatedTilt<SpodumeneThing>();
    this.vocab = new java.util.HashMap<SpodumeneThing, Double>();
    this.security = buffet++;
    this.halfJuncture = synX2160int;
    this.numberedAim = synX2161int;
    this.ordinaryEnumeration = synX2162int;
    this.finishCeremonyYear = synX2163int;
  }

  private double halfJuncture;
  private filmmaker.Exporter successive[];

  public synchronized void arrangeNow(filmmaker.Exporter... upcoming) {
    this.succeeding = upcoming;
  }

  public synchronized int numbers() {
    return this.closetCatalog.tabulation();
  }

  public synchronized void introduceAspect(cultivationBodies.SpodumeneThing artifact)
      throws DepotEntireCaveat {

    if (this.closetCatalog.tabulation() < Archival.warehousesMinimum) {
      this.closetCatalog.addLatter(artifact);
      this.ordinaryEnumeration +=
          (this.numbers() - synX2164int)
              * (maturational.YearsHolder.theOpportunity() - this.finishCeremonyYear)
              / emulation.Pretense.liveSimulator().meterCircumscribe();
      this.vocab.put(artifact, maturational.YearsHolder.theOpportunity());
      this.finishCeremonyYear = maturational.YearsHolder.theOpportunity();
      for (filmmaker.Exporter arsenic : succeeding) {

        if (arsenic.prevalentGovernmental() == ManufacturersCantons.orphaned) {
          arsenic.unstarve();
          return;
        }
      }
    } else {
      throw new archival.DepotEntireCaveat();
    }
  }

  public synchronized java.lang.String digits() {
    return java.lang.String.format(
        synX2165String, this, this.halfJuncture, this.ordinaryEnumeration);
  }

  private static int buffet;
  private double finishCeremonyYear;

  static {
    warehousesMinimum = 1;
    buffet = 0;
  }

  private int security;

  public synchronized cultivationBodies.SpodumeneThing comeSection() throws DiskRansackedObjection {

    if (this.numbers() > synX2166int) {
      cultivationBodies.SpodumeneThing montes;
      double enterSentence;
      double removalPeriod;
      montes = this.closetCatalog.eraseFirstborn();
      this.ordinaryEnumeration +=
          (this.numbers() + synX2167int)
              * (maturational.YearsHolder.theOpportunity() - this.finishCeremonyYear)
              / emulation.Pretense.liveSimulator().meterCircumscribe();
      enterSentence = this.vocab.remove(montes);
      removalPeriod = maturational.YearsHolder.theOpportunity();
      this.halfJuncture =
          (halfJuncture * numberedAim + (removalPeriod - enterSentence)) / ++numberedAim;
      for (filmmaker.Exporter equally : successive) {

        if (equally.prevalentGovernmental() == ManufacturersCantons.blockade) {
          equally.exit();
          break;
        }
      }
      this.finishCeremonyYear = maturational.YearsHolder.theOpportunity();
      return montes;
    } else {
      throw new archival.DiskRansackedObjection();
    }
  }
}
