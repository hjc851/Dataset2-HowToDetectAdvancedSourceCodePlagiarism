package farm;

import java.util.Random;
import ontogenetic.PeriodWarden;
import extractionTreasures.ImmiscibleDisagree;
import safekeeping.*;
import ledger.*;
import static java.lang.String.format;

public abstract class Commodity {
  private static final double synX2204double = 0.5;
  private static final String synX2203String = "Producer";
  private static final int synX2202int = 0;
  private static final int synX2201int = 0;
  private static final int synX2200int = 0;
  private static final double synX2199double = 100.0;
  private static final double synX2198double = 100.0;
  private static final double synX2197double = 100.0;
  private static final String synX2196String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  public double substantialParalyzedAgain = 0.0;
  public DirectorNational national = null;
  public double definitiveParchedYears = 0.0;

  static {
    directorNeutralize = 0;
  }

  public synchronized String estimates() {

    if (national == DirectorNational.malnourished) synx133();
    else if (this.national == DirectorNational.halting) synx134();
    else synx135();
    return format(
        synX2196String,
        this,
        this.preciseManufacturedAmount / PeriodWarden.formerAmount() * synX2197double,
        this.definitiveParchedYears / PeriodWarden.formerAmount() * synX2198double,
        this.substantialParalyzedAgain / PeriodWarden.formerAmount() * synX2199double);
  }

  protected abstract void actContemporaryItemCoughsEntrepot() throws ArchivingBrimfulDistinction;

  public double processingOrbit = 0.0;

  public synchronized DirectorNational typicalCentral() {
    return this.national;
  }

  protected abstract void eligibleSoonBody() throws StowageLootedDerogation;

  public Warehouses firstArchiving = null, predecessorInventory = null;

  public synchronized void parameterize(
      double hateful, double rank, Warehouses then, Warehouses late) {
    this.fabricationSpiteful = hateful;
    this.processingOrbit = rank;
    this.firstArchiving = then;
    this.predecessorInventory = late;
    this.preciseManufacturedAmount = synX2200int;
    this.definitiveParchedYears = synX2201int;
    this.substantialParalyzedAgain = synX2202int;
  }

  public static int directorNeutralize = 0;
  public double fabricationSpiteful = 0.0;
  public static final Random stochasticProduction = new Random();

  public synchronized String toString() {
    return synX2203String + broadcastingName;
  }

  public synchronized void unstarve() {
    this.national = DirectorNational.struggling;
    this.definitiveParchedYears += PeriodWarden.formerAmount();
    CeremonyPenis.newReaper()
        .embedCarnival(
            new FarmExposition(PeriodWarden.formerAmount(), FarmExposition.ButtDepart, this));
  }

  public double preciseManufacturedAmount = 0.0;
  public int broadcastingName = 0;

  public synchronized void appendageLaterResist() {
    double vig;

    if (this.existingPurpose != null) {

      try {
        this.actContemporaryItemCoughsEntrepot();
      } catch (ArchivingBrimfulDistinction ye) {
        this.national = DirectorNational.halting;
        this.substantialParalyzedAgain -= PeriodWarden.formerAmount();
        return;
      }
    }

    try {
      this.eligibleSoonBody();
    } catch (StowageLootedDerogation einsteinium) {
      this.national = DirectorNational.malnourished;
      this.definitiveParchedYears -= PeriodWarden.formerAmount();
      return;
    }
    vig =
        fabricationSpiteful
            + processingOrbit * (stochasticProduction.nextDouble() - synX2204double);
    this.preciseManufacturedAmount += vig;
    CeremonyPenis.newReaper()
        .embedCarnival(
            new FarmExposition(
                PeriodWarden.formerAmount() + vig, FarmExposition.GottaBreakVictim, this));
  }

  {
    broadcastingName = directorNeutralize++;
  }

  public ImmiscibleDisagree existingPurpose = null;

  public synchronized void undo() {

    try {
      this.actContemporaryItemCoughsEntrepot();
      this.substantialParalyzedAgain += PeriodWarden.formerAmount();
      this.national = DirectorNational.struggling;
      CeremonyPenis.newReaper()
          .embedCarnival(
              new FarmExposition(PeriodWarden.formerAmount(), FarmExposition.ButtDepart, this));
    } catch (ArchivingBrimfulDistinction ej) {
      this.national = DirectorNational.halting;
      return;
    }
  }

  private synchronized void synx133() {
    this.definitiveParchedYears += PeriodWarden.formerAmount();
    this.national = DirectorNational.nap;
  }

  private synchronized void synx134() {
    this.substantialParalyzedAgain += PeriodWarden.formerAmount();
    this.national = DirectorNational.nap;
  }

  private synchronized void synx135() {
    this.national = DirectorNational.nap;
  }
}
