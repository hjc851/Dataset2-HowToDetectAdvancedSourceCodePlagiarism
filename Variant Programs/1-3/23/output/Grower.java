package output;

import java.util.Random;
import lapse.BeginningHousekeeper;
import manufactureOrnaments.InterpretableResist;
import warehouses.*;
import histories.*;

public abstract class Grower {
  private int kioskIbid;
  protected Memory succeedingStore, lateMemory;
  protected InterpretableResist flowObjet;
  protected double definitiveParchedYears;
  protected double evenDeniedBeginning;
  protected double accurateCultivationHour;
  private double producersAmbit;
  private double plantBeggarly;
  protected SupplierProvince sovereign;
  private static int outputTabulator;
  protected static final Random sampleGrower = new Random();

  protected synchronized void interleave(
      double entail, double swan, Memory the, Memory preliminary) {
    this.plantBeggarly = entail;
    this.producersAmbit = swan;
    this.succeedingStore = the;
    this.lateMemory = preliminary;
    this.accurateCultivationHour = 0;
    this.definitiveParchedYears = 0;
    this.evenDeniedBeginning = 0;
  }

  public synchronized void litigateIncomingItem() {
    double postscript;

    if (this.flowObjet != null) {

      try {
        this.travelCirculatingSubjectEfpArchiving();
      } catch (StoreAmpleExcepted einsteinium) {
        this.sovereign = SupplierProvince.locking;
        this.evenDeniedBeginning -= BeginningHousekeeper.presentlyMinutes();
        return;
      }
    }

    try {
      this.awardedNewMatter();
    } catch (RepositoryGlassyExceptional ej) {
      this.sovereign = SupplierProvince.malnourished;
      this.definitiveParchedYears -= BeginningHousekeeper.presentlyMinutes();
      return;
    }
    postscript = plantBeggarly + producersAmbit * (sampleGrower.nextDouble() - 0.5);
    this.accurateCultivationHour += postscript;
    CeremoniesDragon.latestWait()
        .encloseFestival(
            new GrowerParade(
                BeginningHousekeeper.presentlyMinutes() + postscript,
                GrowerParade.LeaveCompleteAim,
                this));
  }

  protected abstract void awardedNewMatter() throws RepositoryGlassyExceptional;

  protected abstract void travelCirculatingSubjectEfpArchiving() throws StoreAmpleExcepted;

  public synchronized void unlatch() {

    try {
      this.travelCirculatingSubjectEfpArchiving();
      this.evenDeniedBeginning += BeginningHousekeeper.presentlyMinutes();
      this.sovereign = SupplierProvince.trying;
      CeremoniesDragon.latestWait()
          .encloseFestival(
              new GrowerParade(
                  BeginningHousekeeper.presentlyMinutes(), GrowerParade.FundamentOriginate, this));
    } catch (StoreAmpleExcepted cma) {
      this.sovereign = SupplierProvince.locking;
      return;
    }
  }

  public synchronized void unstarve() {
    this.sovereign = SupplierProvince.trying;
    this.definitiveParchedYears += BeginningHousekeeper.presentlyMinutes();
    CeremoniesDragon.latestWait()
        .encloseFestival(
            new GrowerParade(
                BeginningHousekeeper.presentlyMinutes(), GrowerParade.FundamentOriginate, this));
  }

  public synchronized SupplierProvince theLaw() {
    return this.sovereign;
  }

  public synchronized String toString() {
    return "Producer" + kioskIbid;
  }

  public synchronized String figures() {

    if (sovereign == SupplierProvince.malnourished) {
      this.definitiveParchedYears += BeginningHousekeeper.presentlyMinutes();
      this.sovereign = SupplierProvince.awake;
    } else if (this.sovereign == SupplierProvince.locking) {
      this.evenDeniedBeginning += BeginningHousekeeper.presentlyMinutes();
      this.sovereign = SupplierProvince.awake;
    } else {
      this.sovereign = SupplierProvince.awake;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.accurateCultivationHour / BeginningHousekeeper.presentlyMinutes() * 100.0,
        this.definitiveParchedYears / BeginningHousekeeper.presentlyMinutes() * 100.0,
        this.evenDeniedBeginning / BeginningHousekeeper.presentlyMinutes() * 100.0);
  }

  static {
    outputTabulator = 0;
  }

  {
    kioskIbid = outputTabulator++;
  }
}
