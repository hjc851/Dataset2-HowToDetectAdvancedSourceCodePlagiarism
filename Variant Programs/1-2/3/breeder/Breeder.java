package breeder;

import java.util.Random;
import indiscernible.YearsHolder;
import fabricationObstructions.UseableItem;
import store.*;
import register.*;

public abstract class Breeder {
  protected static final java.util.Random unintendedFarmer = new java.util.Random();
  private static int commodityDispel = 0;
  protected breeder.FarmCentral central;
  private double factoryIntend;
  private double producesPasture;
  protected double veryExtractionWhen;
  protected double actualizedStymiedPeriod;
  protected double existentClosedDays;
  protected fabricationObstructions.UseableItem continuingThing;
  protected store.Entrepot aheadWarehousing, finalGarage;
  private int facilitySecurity = commodityDispel++;

  protected void recode(
      double normal, double browse, store.Entrepot upcoming, store.Entrepot first) {
    this.factoryIntend = normal;
    this.producesPasture = browse;
    this.aheadWarehousing = upcoming;
    this.finalGarage = first;
    this.veryExtractionWhen = 0;
    this.existentClosedDays = 0;
    this.actualizedStymiedPeriod = 0;
  }

  public void cycleNowPurpose() {

    if (this.continuingThing != null) {

      try {
        this.motionTopicalResistEapsDisk();
      } catch (store.GarageRichCase einsteinium) {
        this.central = FarmCentral.clog;
        this.actualizedStymiedPeriod -= indiscernible.YearsHolder.latestClip();
        return;
      }
    }

    try {
      this.findAdjacentObjection();
    } catch (store.RepositoryGlassyExceptional ye) {
      this.central = FarmCentral.malnourished;
      this.existentClosedDays -= indiscernible.YearsHolder.latestClip();
      return;
    }
    double vig = factoryIntend + producesPasture * (unintendedFarmer.nextDouble() - 0.5);
    this.veryExtractionWhen += vig;
    register.CommemorationBraid.circulatingConvoy()
        .incorporateTriathlon(
            new register.CommodityRace(
                indiscernible.YearsHolder.latestClip() + vig,
                CommodityRace.WantingDoneThing,
                this));
  }

  protected abstract void findAdjacentObjection() throws RepositoryGlassyExceptional;

  protected abstract void motionTopicalResistEapsDisk() throws GarageRichCase;

  public void unfreeze() {

    try {
      this.motionTopicalResistEapsDisk();
      this.actualizedStymiedPeriod += indiscernible.YearsHolder.latestClip();
      this.central = FarmCentral.functioning;
      register.CommemorationBraid.circulatingConvoy()
          .incorporateTriathlon(
              new register.CommodityRace(
                  indiscernible.YearsHolder.latestClip(), CommodityRace.BehindRestart, this));
    } catch (store.GarageRichCase cma) {
      this.central = FarmCentral.clog;
      return;
    }
  }

  public void unstarve() {
    this.central = FarmCentral.functioning;
    this.existentClosedDays += indiscernible.YearsHolder.latestClip();
    register.CommemorationBraid.circulatingConvoy()
        .incorporateTriathlon(
            new register.CommodityRace(
                indiscernible.YearsHolder.latestClip(), CommodityRace.BehindRestart, this));
  }

  public breeder.FarmCentral afootGovernment() {
    return this.central;
  }

  public String toString() {
    return "Producer" + facilitySecurity;
  }

  public java.lang.String survey() {

    if (central == FarmCentral.malnourished) {
      this.existentClosedDays += indiscernible.YearsHolder.latestClip();
      this.central = FarmCentral.slumber;
    } else if (this.central == FarmCentral.clog) {
      this.actualizedStymiedPeriod += indiscernible.YearsHolder.latestClip();
      this.central = FarmCentral.slumber;
    } else {
      this.central = FarmCentral.slumber;
    }
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.veryExtractionWhen / indiscernible.YearsHolder.latestClip() * 100.0,
        this.existentClosedDays / indiscernible.YearsHolder.latestClip() * 100.0,
        this.actualizedStymiedPeriod / indiscernible.YearsHolder.latestClip() * 100.0);
  }
}
