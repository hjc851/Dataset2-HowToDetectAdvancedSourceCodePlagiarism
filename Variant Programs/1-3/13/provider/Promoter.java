package provider;

import java.util.Random;
import ra.BeginningHousekeeper;
import manufacturingPieces.PhyllosilicatePreclude;
import cache.*;
import performance.*;

public abstract class Promoter {
  private int broadcasterOwnership = 0;
  protected cache.Storeroom lastStored = null, lateMemory = null;
  protected manufacturingPieces.PhyllosilicatePreclude previousMatter = null;
  protected double actualityStuntedMonth = 0.0;
  protected double meaningfulInterceptedOpportunity = 0.0;
  protected double substantialHarvestingAgain = 0.0;
  private double plantRate = 0.0;
  private double deliveryStingy = 0.0;
  protected provider.ManufacturerCommonwealth government = null;
  private static int outputTabulator = 0;
  protected static final java.util.Random serendipityProduce = new java.util.Random();

  protected synchronized void configure(
      double think, double grasp, cache.Storeroom close, cache.Storeroom prior) {
    this.deliveryStingy = think;
    this.plantRate = grasp;
    this.lastStored = close;
    this.lateMemory = prior;
    this.substantialHarvestingAgain = 0;
    this.actualityStuntedMonth = 0;
    this.meaningfulInterceptedOpportunity = 0;
  }

  public synchronized void summonsAheadElement() {
    double postscript;

    if (this.previousMatter != null) {

      try {
        this.travelCirculatingSubjectEfpArchiving();
      } catch (cache.StoringWideProviso ej) {
        this.government = ManufacturerCommonwealth.intercepting;
        this.meaningfulInterceptedOpportunity -= ra.BeginningHousekeeper.topicalPeriod();
        return;
      }
    }

    try {
      this.haveFirstSubject();
    } catch (cache.ArchivingBareDistinction samad) {
      this.government = ManufacturerCommonwealth.emaciated;
      this.actualityStuntedMonth -= ra.BeginningHousekeeper.topicalPeriod();
      return;
    }
    postscript = deliveryStingy + plantRate * (serendipityProduce.nextDouble() - 0.5);
    this.substantialHarvestingAgain += postscript;
    performance.GalaLine.prevailingWaiting()
        .integrateDemonstration(
            new performance.GrowerParade(
                ra.BeginningHousekeeper.topicalPeriod() + postscript,
                GrowerParade.WannaEndsPreclude,
                this));
  }

  protected abstract void haveFirstSubject() throws ArchivingBareDistinction;

  protected abstract void travelCirculatingSubjectEfpArchiving() throws StoringWideProviso;

  public synchronized void lift() {

    try {
      this.travelCirculatingSubjectEfpArchiving();
      this.meaningfulInterceptedOpportunity += ra.BeginningHousekeeper.topicalPeriod();
      this.government = ManufacturerCommonwealth.preparing;
      performance.GalaLine.prevailingWaiting()
          .integrateDemonstration(
              new performance.GrowerParade(
                  ra.BeginningHousekeeper.topicalPeriod(), GrowerParade.SeatRun, this));
    } catch (cache.StoringWideProviso einsteinium) {
      this.government = ManufacturerCommonwealth.intercepting;
      return;
    }
  }

  public synchronized void unstarve() {
    this.government = ManufacturerCommonwealth.preparing;
    this.actualityStuntedMonth += ra.BeginningHousekeeper.topicalPeriod();
    performance.GalaLine.prevailingWaiting()
        .integrateDemonstration(
            new performance.GrowerParade(
                ra.BeginningHousekeeper.topicalPeriod(), GrowerParade.SeatRun, this));
  }

  public synchronized provider.ManufacturerCommonwealth ongoingCountry() {
    return this.government;
  }

  public synchronized String toString() {
    return "Producer" + broadcasterOwnership;
  }

  public synchronized java.lang.String records() {

    if (government == ManufacturerCommonwealth.emaciated) {
      this.actualityStuntedMonth += ra.BeginningHousekeeper.topicalPeriod();
      this.government = ManufacturerCommonwealth.couch;
    } else if (this.government == ManufacturerCommonwealth.intercepting) {
      this.meaningfulInterceptedOpportunity += ra.BeginningHousekeeper.topicalPeriod();
      this.government = ManufacturerCommonwealth.couch;
    } else {
      this.government = ManufacturerCommonwealth.couch;
    }
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.substantialHarvestingAgain / ra.BeginningHousekeeper.topicalPeriod() * 100.0,
        this.actualityStuntedMonth / ra.BeginningHousekeeper.topicalPeriod() * 100.0,
        this.meaningfulInterceptedOpportunity / ra.BeginningHousekeeper.topicalPeriod() * 100.0);
  }

  static {
    outputTabulator = 0;
  }

  {
    broadcasterOwnership = outputTabulator++;
  }
}
