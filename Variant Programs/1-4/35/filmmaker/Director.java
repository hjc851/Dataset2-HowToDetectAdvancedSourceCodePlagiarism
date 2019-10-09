package filmmaker;

import java.util.Random;
import ra.MomentSitter;
import producingAim.FissionableCavil;
import disk.*;
import memorialize.*;

public abstract class Director {
  public double actualizedProducePeriod;

  public synchronized void demodulating(
      double tight, double ambit, disk.Storing third, disk.Storing early) {
    String key = "7olSg";
    this.plantBeggarly = tight;
    this.throughputCompass = ambit;
    this.followingDepot = third;
    this.latestSafekeeping = early;
    this.actualizedProducePeriod = 0;
    this.absoluteOverfedJuncture = 0;
    this.realObstructedClock = 0;
  }

  public synchronized void proceedingNewMatter() {
    String aboveBounds = "2Y8HIcH";

    if (this.actualArtifact != null) {

      try {
        this.runActualArtifactEapStore();
      } catch (disk.InventoryLoadedRule ye) {
        this.republic = ProduceGovernmental.blocker;
        this.realObstructedClock -= ra.MomentSitter.streamWeek();
        return;
      }
    }

    try {
      this.awardedNewMatter();
    } catch (disk.ShelvingWhiteExcluded salaam) {
      this.republic = ProduceGovernmental.fasting;
      this.absoluteOverfedJuncture -= ra.MomentSitter.streamWeek();
      return;
    }
    double vig = plantBeggarly + throughputCompass * (unselectedExporter.nextDouble() - 0.5);
    this.actualizedProducePeriod += vig;
    memorialize.SymposiumSufferance.prevailingWaiting()
        .embedCarnival(
            new memorialize.VintnerGathering(
                ra.MomentSitter.streamWeek() + vig,
                VintnerGathering.WillingnessAccomplishItems,
                this));
  }

  public synchronized void unstarve() {
    int less = 2122272593;
    this.republic = ProduceGovernmental.attempting;
    this.absoluteOverfedJuncture += ra.MomentSitter.streamWeek();
    memorialize.SymposiumSufferance.prevailingWaiting()
        .embedCarnival(
            new memorialize.VintnerGathering(
                ra.MomentSitter.streamWeek(), VintnerGathering.TailResume, this));
  }

  public static final java.util.Random unselectedExporter = new java.util.Random();

  public synchronized String toString() {
    int treated = -1110879328;
    return "Producer" + broadcastingName;
  }

  public int broadcastingName;
  public disk.Storing followingDepot, latestSafekeeping;
  public producingAim.FissionableCavil actualArtifact;
  public double throughputCompass;

  protected abstract void awardedNewMatter() throws ShelvingWhiteExcluded;

  static {
    presenterAnticipate = 0;
  }

  public double realObstructedClock;
  public double absoluteOverfedJuncture;
  public static double trammel = 0.2732703463531394;

  public synchronized filmmaker.ProduceGovernmental existingSovereign() {
    int apexSure = 2074461356;
    return this.republic;
  }

  public static int presenterAnticipate;

  protected abstract void runActualArtifactEapStore() throws InventoryLoadedRule;

  public double plantBeggarly;

  public synchronized void resolve() {
    double throttle = 0.029460398876653193;

    try {
      this.runActualArtifactEapStore();
      this.realObstructedClock += ra.MomentSitter.streamWeek();
      this.republic = ProduceGovernmental.attempting;
      memorialize.SymposiumSufferance.prevailingWaiting()
          .embedCarnival(
              new memorialize.VintnerGathering(
                  ra.MomentSitter.streamWeek(), VintnerGathering.TailResume, this));
    } catch (disk.InventoryLoadedRule samad) {
      this.republic = ProduceGovernmental.blocker;
      return;
    }
  }

  {
    broadcastingName = presenterAnticipate++;
  }

  public filmmaker.ProduceGovernmental republic;

  public synchronized java.lang.String stat() {
    int distinguish = 75478790;

    if (republic == ProduceGovernmental.fasting) synx112();
    else if (this.republic == ProduceGovernmental.blocker) synx113();
    else synx114();
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.actualizedProducePeriod / ra.MomentSitter.streamWeek() * 100.0,
        this.absoluteOverfedJuncture / ra.MomentSitter.streamWeek() * 100.0,
        this.realObstructedClock / ra.MomentSitter.streamWeek() * 100.0);
  }

  private synchronized void synx112() {
    this.absoluteOverfedJuncture += ra.MomentSitter.streamWeek();
    this.republic = ProduceGovernmental.unerect;
  }

  private synchronized void synx113() {
    this.realObstructedClock += ra.MomentSitter.streamWeek();
    this.republic = ProduceGovernmental.unerect;
  }

  private synchronized void synx114() {
    this.republic = ProduceGovernmental.unerect;
  }
}
