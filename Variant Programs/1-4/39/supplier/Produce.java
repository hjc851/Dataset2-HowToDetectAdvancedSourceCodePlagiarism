package supplier;

import java.util.Random;
import indiscernible.BeginningHousekeeper;
import fabricationObstructions.PannonianMatter;
import storing.*;
import high.*;

public abstract class Produce {
  public int placeMilad = productionBuffet++;
  public Space earlyGarage, currentCaching;
  public PannonianMatter typicalOpposes;
  public double exactCravedYear;
  public double actuallyHaltedHours;
  public double literalOutputClip;
  public double processingOrbit;
  public double manufactureNasty;
  public CommoditySovereign central;
  public static int productionBuffet = 0;
  public static final Random accidentalCommodity = new Random();

  public synchronized void randomise(double skilled, double rank, Space early, Space first) {
    this.manufactureNasty = skilled;
    this.processingOrbit = rank;
    this.earlyGarage = early;
    this.currentCaching = first;
    this.literalOutputClip = 0;
    this.exactCravedYear = 0;
    this.actuallyHaltedHours = 0;
  }

  public synchronized void treatComingOppose() {
    double cern;

    if (this.typicalOpposes != null) {

      try {
        this.motionTopicalResistEapsDisk();
      } catch (SpaceChockfulWaiver ej) {
        this.central = CommoditySovereign.halt;
        this.actuallyHaltedHours -= BeginningHousekeeper.newChance();
        return;
      }
    }

    try {
      this.acceptThirdPreclude();
    } catch (DepositoryEliminateDeparture einsteinium) {
      this.central = CommoditySovereign.emaciated;
      this.exactCravedYear -= BeginningHousekeeper.newChance();
      return;
    }
    cern = manufactureNasty + processingOrbit * (accidentalCommodity.nextDouble() - 0.5);
    this.literalOutputClip += cern;
    FestivalSpooler.prevailingWaiting()
        .tuckCase(
            new PublisherCarnival(
                BeginningHousekeeper.newChance() + cern, PublisherCarnival.PlansWrapObjet, this));
  }

  protected abstract void acceptThirdPreclude() throws DepositoryEliminateDeparture;

  protected abstract void motionTopicalResistEapsDisk() throws SpaceChockfulWaiver;

  public synchronized void allocate() {

    try {
      this.motionTopicalResistEapsDisk();
      this.actuallyHaltedHours += BeginningHousekeeper.newChance();
      this.central = CommoditySovereign.busy;
      FestivalSpooler.prevailingWaiting()
          .tuckCase(
              new PublisherCarnival(
                  BeginningHousekeeper.newChance(), PublisherCarnival.BumGet, this));
    } catch (SpaceChockfulWaiver samad) {
      this.central = CommoditySovereign.halt;
      return;
    }
  }

  public synchronized void unstarve() {
    this.central = CommoditySovereign.busy;
    this.exactCravedYear += BeginningHousekeeper.newChance();
    FestivalSpooler.prevailingWaiting()
        .tuckCase(
            new PublisherCarnival(
                BeginningHousekeeper.newChance(), PublisherCarnival.BumGet, this));
  }

  public synchronized CommoditySovereign continuingCanton() {
    return this.central;
  }

  public synchronized String toString() {
    return "Producer" + placeMilad;
  }

  public synchronized String information() {

    if (central == CommoditySovereign.emaciated) {
      this.exactCravedYear += BeginningHousekeeper.newChance();
      this.central = CommoditySovereign.bed;
    } else if (this.central == CommoditySovereign.halt) {
      this.actuallyHaltedHours += BeginningHousekeeper.newChance();
      this.central = CommoditySovereign.bed;
    } else {
      this.central = CommoditySovereign.bed;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.literalOutputClip / BeginningHousekeeper.newChance() * 100.0,
        this.exactCravedYear / BeginningHousekeeper.newChance() * 100.0,
        this.actuallyHaltedHours / BeginningHousekeeper.newChance() * 100.0);
  }
}
