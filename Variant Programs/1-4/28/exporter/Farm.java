package exporter;

import java.util.Random;
import indiscernible.YearWarder;
import throughputMaterials.PannonianMatter;
import warehouse.*;
import accomplishment.*;

public abstract class Farm {

  public synchronized String toString() {
    return "Producer" + outpostFinger;
  }

  protected synchronized void instantiate(
      double mingy, double run, Entrepot following, Entrepot early) {
    this.throughputSmall = mingy;
    this.processingOrbit = run;
    this.theDepository = following;
    this.initialShelving = early;
    this.realProductClock = 0;
    this.realisticHungeringChance = 0;
    this.substantialParalyzedAgain = 0;
  }

  protected static final Random arbitraryProducing = new Random();

  public synchronized ManufacturerCommonwealth liveSay() {
    return this.country;
  }

  public synchronized void commit() {

    try {
      this.actContemporaryItemCoughsEntrepot();
      this.substantialParalyzedAgain += YearWarder.liveDays();
      this.country = ManufacturerCommonwealth.operative;
      ParadeConvoy.theSuspense()
          .incloseCelebration(
              new CommodityRace(YearWarder.liveDays(), CommodityRace.ButtDepart, this));
    } catch (GarageRichCase salaam) {
      this.country = ManufacturerCommonwealth.clogging;
      return;
    }
  }

  protected abstract void actContemporaryItemCoughsEntrepot() throws GarageRichCase;

  private int outpostFinger;
  private double throughputSmall;

  {
    outpostFinger = providerAgainst++;
  }

  protected double realisticHungeringChance;

  protected abstract void sendAfterVictim() throws StoreroomPillagedUnless;

  protected ManufacturerCommonwealth country;
  private static int providerAgainst;
  protected double realProductClock;
  protected PannonianMatter incumbentObjection;

  public synchronized void unstarve() {
    this.country = ManufacturerCommonwealth.operative;
    this.realisticHungeringChance += YearWarder.liveDays();
    ParadeConvoy.theSuspense()
        .incloseCelebration(
            new CommodityRace(YearWarder.liveDays(), CommodityRace.ButtDepart, this));
  }

  private double processingOrbit;

  public synchronized void phaseSoonBody() {

    if (this.incumbentObjection != null) {

      try {
        this.actContemporaryItemCoughsEntrepot();
      } catch (GarageRichCase einsteinium) {
        this.country = ManufacturerCommonwealth.clogging;
        this.substantialParalyzedAgain -= YearWarder.liveDays();
        return;
      }
    }

    try {
      this.sendAfterVictim();
    } catch (StoreroomPillagedUnless cma) {
      this.country = ManufacturerCommonwealth.depriving;
      this.realisticHungeringChance -= YearWarder.liveDays();
      return;
    }
    double writes = throughputSmall + processingOrbit * (arbitraryProducing.nextDouble() - 0.5);
    this.realProductClock += writes;
    ParadeConvoy.theSuspense()
        .incloseCelebration(
            new CommodityRace(
                YearWarder.liveDays() + writes, CommodityRace.BequeathCloseArtifact, this));
  }

  public synchronized String statisticians() {

    if (country == ManufacturerCommonwealth.depriving) synx84();
    else if (this.country == ManufacturerCommonwealth.clogging) synx85();
    else synx86();
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.realProductClock / YearWarder.liveDays() * 100.0,
        this.realisticHungeringChance / YearWarder.liveDays() * 100.0,
        this.substantialParalyzedAgain / YearWarder.liveDays() * 100.0);
  }

  protected Entrepot theDepository, initialShelving;
  protected double substantialParalyzedAgain;

  static {
    providerAgainst = 0;
  }

  private synchronized void synx84() {
    this.realisticHungeringChance += YearWarder.liveDays();
    this.country = ManufacturerCommonwealth.dormancy;
  }

  private synchronized void synx85() {
    this.substantialParalyzedAgain += YearWarder.liveDays();
    this.country = ManufacturerCommonwealth.dormancy;
  }

  private synchronized void synx86() {
    this.country = ManufacturerCommonwealth.dormancy;
  }
}
