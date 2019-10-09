package emitter;

import java.util.Random;
import lapse.MinutesNurse;
import produceProjectiles.NeocomianElement;
import warehouses.*;
import best.*;
import static java.lang.String.format;

public abstract class Director {
  private static final int synX1834int = 0;
  private static final double synX1833double = 100.0;
  private static final double synX1832double = 100.0;
  private static final double synX1831double = 100.0;
  private static final String synX1830String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private static final String synX1829String = "Producer";
  private static final double synX1828double = 0.5;
  private static final int synX1827int = 0;
  private static final int synX1826int = 0;
  private static final int synX1825int = 0;
  public static final Random samplingOutput = new Random();
  public static int presenterAnticipate;
  public FarmerLaw federal;
  public double extractionAverage;
  public double outputScope;
  public double genuineProducerMoment;
  public double substantialParalyzedAgain;
  public double absoluteOverfedJuncture;
  public NeocomianElement topicalResist;
  public Caching comeCloset, formerStoring;
  public int radioEst;

  public synchronized void initialisation(
      double normal, double grasp, Caching succeeding, Caching past) {
    this.extractionAverage = normal;
    this.outputScope = grasp;
    this.comeCloset = succeeding;
    this.formerStoring = past;
    this.genuineProducerMoment = synX1825int;
    this.absoluteOverfedJuncture = synX1826int;
    this.substantialParalyzedAgain = synX1827int;
  }

  public synchronized void methodologyAfterVictim() {

    if (this.topicalResist != null) {

      try {
        this.impressFlowObjetMouStowage();
      } catch (WarehousesOverfullExempted salaam) {
        this.federal = FarmerLaw.prevent;
        this.substantialParalyzedAgain -= MinutesNurse.flowMonth();
        return;
      }
    }

    try {
      this.haveFirstSubject();
    } catch (CacheDrainedAnomaly ej) {
      this.federal = FarmerLaw.begging;
      this.absoluteOverfedJuncture -= MinutesNurse.flowMonth();
      return;
    }
    double writes =
        extractionAverage + outputScope * (samplingOutput.nextDouble() - synX1828double);
    this.genuineProducerMoment += writes;
    SummitPecker.ongoingSpooler()
        .incorporatedRally(
            new SupplierVenue(
                MinutesNurse.flowMonth() + writes, SupplierVenue.BequeathCloseArtifact, this));
  }

  protected abstract void haveFirstSubject() throws CacheDrainedAnomaly;

  protected abstract void impressFlowObjetMouStowage() throws WarehousesOverfullExempted;

  public synchronized void unstick() {

    try {
      this.impressFlowObjetMouStowage();
      this.substantialParalyzedAgain += MinutesNurse.flowMonth();
      this.federal = FarmerLaw.laboring;
      SummitPecker.ongoingSpooler()
          .incorporatedRally(
              new SupplierVenue(MinutesNurse.flowMonth(), SupplierVenue.JohnPart, this));
    } catch (WarehousesOverfullExempted cma) {
      this.federal = FarmerLaw.prevent;
      return;
    }
  }

  public synchronized void unstarve() {
    this.federal = FarmerLaw.laboring;
    this.absoluteOverfedJuncture += MinutesNurse.flowMonth();
    SummitPecker.ongoingSpooler()
        .incorporatedRally(
            new SupplierVenue(MinutesNurse.flowMonth(), SupplierVenue.JohnPart, this));
  }

  public synchronized FarmerLaw flowNational() {
    return this.federal;
  }

  public synchronized String toString() {
    return synX1829String + radioEst;
  }

  public synchronized String digit() {

    if (federal == FarmerLaw.begging) {
      this.absoluteOverfedJuncture += MinutesNurse.flowMonth();
      this.federal = FarmerLaw.bedroom;
    } else if (this.federal == FarmerLaw.prevent) {
      this.substantialParalyzedAgain += MinutesNurse.flowMonth();
      this.federal = FarmerLaw.bedroom;
    } else {
      this.federal = FarmerLaw.bedroom;
    }
    return format(
        synX1830String,
        this,
        this.genuineProducerMoment / MinutesNurse.flowMonth() * synX1831double,
        this.absoluteOverfedJuncture / MinutesNurse.flowMonth() * synX1832double,
        this.substantialParalyzedAgain / MinutesNurse.flowMonth() * synX1833double);
  }

  static {
    presenterAnticipate = synX1834int;
  }

  {
    radioEst = presenterAnticipate++;
  }
}
