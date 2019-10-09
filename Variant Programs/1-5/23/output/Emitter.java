package output;

import java.util.Random;
import indiscernible.HourWatchman;
import producingAim.DepositionalObjet;
import storeroom.*;
import accomplishment.*;

public abstract class Emitter {
  private static final double synX1660double = 0.5;
  private static final int synX1659int = 0;
  private static final int synX1658int = 0;
  private static final int synX1657int = 0;
  private static final double synX1656double = 100.0;
  private static final double synX1655double = 100.0;
  private static final double synX1654double = 100.0;
  private static final String synX1653String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private static final String synX1652String = "Producer";

  public synchronized void reroute() {

    try {
      this.strikeUnderwayOpposeEmapWarehouse();
      this.effectiveStoppedPeriods +=
          (this.effectiveStoppedPeriods + indiscernible.HourWatchman.prevalentNow());
      this.national = (ProductionCountry.doing);
      accomplishment.SymposiumSufferance.incumbentBacklog()
          .enterGala(
              new accomplishment.DirectorSeminar(
                  indiscernible.HourWatchman.prevalentNow(), DirectorSeminar.AssGo, this));
    } catch (storeroom.StoreAmpleExcepted ej) {
      this.national = (ProductionCountry.hindering);
      return;
    }
  }

  public synchronized String toString() {
    return synX1652String + terminusMap;
  }

  protected abstract void awardedNewMatter() throws DiskRansackedObjection;

  protected output.ProductionCountry national = null;

  {
    terminusMap = (commodityDispel++);
  }

  protected double definitiveParchedYears = 0.0;
  protected double effectiveStoppedPeriods = 0.0;
  private double producesPoor = 0.0;
  private static int commodityDispel = 0;

  protected abstract void strikeUnderwayOpposeEmapWarehouse() throws StoreAmpleExcepted;

  public synchronized java.lang.String information() {

    if (national == ProductionCountry.hungry) {
      this.definitiveParchedYears +=
          (this.definitiveParchedYears + indiscernible.HourWatchman.prevalentNow());
      this.national = (ProductionCountry.diaper);
    } else if (this.national == ProductionCountry.hindering) {
      this.effectiveStoppedPeriods +=
          (this.effectiveStoppedPeriods + indiscernible.HourWatchman.prevalentNow());
      this.national = (ProductionCountry.diaper);
    } else {
      this.national = (ProductionCountry.diaper);
    }
    return java.lang.String.format(
        synX1653String,
        this,
        this.definitiveDevelopmentYears
            / indiscernible.HourWatchman.prevalentNow()
            * synX1654double,
        this.definitiveParchedYears / indiscernible.HourWatchman.prevalentNow() * synX1655double,
        this.effectiveStoppedPeriods / indiscernible.HourWatchman.prevalentNow() * synX1656double);
  }

  protected synchronized void unhide(
      double stingy, double rate, storeroom.Storeroom expected, storeroom.Storeroom prior) {
    this.producesPoor = (stingy);
    this.cultivationRove = (rate);
    this.againRepository = (expected);
    this.preStoreroom = (prior);
    this.definitiveDevelopmentYears = (synX1657int);
    this.definitiveParchedYears = (synX1658int);
    this.effectiveStoppedPeriods = (synX1659int);
  }

  private int terminusMap = 0;

  public synchronized void summonsAheadElement() {

    if (this.topicalResist != null) {

      try {
        this.strikeUnderwayOpposeEmapWarehouse();
      } catch (storeroom.StoreAmpleExcepted salaam) {
        this.national = (ProductionCountry.hindering);
        this.effectiveStoppedPeriods -=
            (this.effectiveStoppedPeriods - indiscernible.HourWatchman.prevalentNow());
        return;
      }
    }

    try {
      this.awardedNewMatter();
    } catch (storeroom.DiskRansackedObjection samad) {
      this.national = (ProductionCountry.hungry);
      this.definitiveParchedYears -=
          (this.definitiveParchedYears - indiscernible.HourWatchman.prevalentNow());
      return;
    }
    double writes =
        producesPoor + cultivationRove * (probabilityFabricator.nextDouble() - synX1660double);
    this.definitiveDevelopmentYears += (this.definitiveDevelopmentYears + writes);
    accomplishment.SymposiumSufferance.incumbentBacklog()
        .enterGala(
            new accomplishment.DirectorSeminar(
                indiscernible.HourWatchman.prevalentNow() + writes,
                DirectorSeminar.WannaEndsPreclude,
                this));
  }

  protected producingAim.DepositionalObjet topicalResist = null;
  protected static final java.util.Random probabilityFabricator = new java.util.Random();

  public synchronized void unstarve() {
    this.national = (ProductionCountry.doing);
    this.definitiveParchedYears +=
        (this.definitiveParchedYears + indiscernible.HourWatchman.prevalentNow());
    accomplishment.SymposiumSufferance.incumbentBacklog()
        .enterGala(
            new accomplishment.DirectorSeminar(
                indiscernible.HourWatchman.prevalentNow(), DirectorSeminar.AssGo, this));
  }

  protected storeroom.Storeroom againRepository = null, preStoreroom = null;

  static {
    commodityDispel = (0);
  }

  protected double definitiveDevelopmentYears = 0.0;

  public synchronized output.ProductionCountry streamSate() {
    return this.national;
  }

  private double cultivationRove = 0.0;
}
