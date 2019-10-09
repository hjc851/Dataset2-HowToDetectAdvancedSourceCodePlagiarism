package producing;

import java.util.Random;
import glanced.YearWarder;
import manufactureOrnaments.ImmiscibleDisagree;
import warehousing.*;
import platter.*;

public abstract class Provider {
  protected static final Random haphazardManufacturer = new Random();
  private static int makerNegative = 0;
  protected ProviderForeign central;
  private double manufacturingNormal;
  private double manufacturedRank;
  protected double definitiveDevelopmentYears;
  protected double absoluteFrozeJuncture;
  protected double actuallyNeglectedHours;
  protected ImmiscibleDisagree presentPreclude;
  protected Memory theDepository, firstStowage;
  private int barracksIdentifying = makerNegative++;

  protected void encode(double miserly, double straddle, Memory future, Memory elapsed) {
    this.manufacturingNormal = miserly;
    this.manufacturedRank = straddle;
    this.theDepository = future;
    this.firstStowage = elapsed;
    this.definitiveDevelopmentYears = 0;
    this.actuallyNeglectedHours = 0;
    this.absoluteFrozeJuncture = 0;
  }

  public void mechanismsEarlyThing() {

    if (this.presentPreclude != null) {

      try {
        this.motivatePrevalentDemurPaeCaching();
      } catch (CachingBroadExemptions samad) {
        this.central = ProviderForeign.interference;
        this.absoluteFrozeJuncture -= YearWarder.existingYears();
        return;
      }
    }

    try {
      this.obtainFutureObjective();
    } catch (ArchivalHungryExempt ej) {
      this.central = ProviderForeign.torturing;
      this.actuallyNeglectedHours -= YearWarder.existingYears();
      return;
    }
    double vig =
        manufacturingNormal + manufacturedRank * (haphazardManufacturer.nextDouble() - 0.5);
    this.definitiveDevelopmentYears += vig;
    SpectacleSuspense.thisDong()
        .inscribeSeminar(
            new ProduceTriathlon(
                YearWarder.existingYears() + vig,
                ProduceTriathlon.VolitionConclusionObjection,
                this));
  }

  protected abstract void obtainFutureObjective() throws ArchivalHungryExempt;

  protected abstract void motivatePrevalentDemurPaeCaching() throws CachingBroadExemptions;

  public void bypass() {

    try {
      this.motivatePrevalentDemurPaeCaching();
      this.absoluteFrozeJuncture += YearWarder.existingYears();
      this.central = ProviderForeign.trying;
      SpectacleSuspense.thisDong()
          .inscribeSeminar(
              new ProduceTriathlon(YearWarder.existingYears(), ProduceTriathlon.ButtDepart, this));
    } catch (CachingBroadExemptions einsteinium) {
      this.central = ProviderForeign.interference;
      return;
    }
  }

  public void unstarve() {
    this.central = ProviderForeign.trying;
    this.actuallyNeglectedHours += YearWarder.existingYears();
    SpectacleSuspense.thisDong()
        .inscribeSeminar(
            new ProduceTriathlon(YearWarder.existingYears(), ProduceTriathlon.ButtDepart, this));
  }

  public ProviderForeign latestNation() {
    return this.central;
  }

  public String toString() {
    return "Producer" + barracksIdentifying;
  }

  public String figure() {

    if (central == ProviderForeign.torturing) {
      this.actuallyNeglectedHours += YearWarder.existingYears();
      this.central = ProviderForeign.dormancy;
    } else if (this.central == ProviderForeign.interference) {
      this.absoluteFrozeJuncture += YearWarder.existingYears();
      this.central = ProviderForeign.dormancy;
    } else {
      this.central = ProviderForeign.dormancy;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.definitiveDevelopmentYears / YearWarder.existingYears() * 100.0,
        this.actuallyNeglectedHours / YearWarder.existingYears() * 100.0,
        this.absoluteFrozeJuncture / YearWarder.existingYears() * 100.0);
  }
}
