package maker;

import java.util.Random;
import metamorphic.MomentSitter;
import producingAim.PerformableObjection;
import garage.*;
import disk.*;

public abstract class Farm {
  public int headquartersPhoto = 0;
  public Shelving forthcomingSafekeeping = null, initialShelving = null;
  public PerformableObjection prevailingObjective = null;
  public double genuineEsurientMoment = 0.0;
  public double actuallyHaltedHours = 0.0;
  public double specificProcessingNow = 0.0;
  public double producedBrowse = 0.0;
  public double throughputSmall = 0.0;
  public CommoditySovereign land = null;
  public static int providerAgainst = 0;
  public static final Random accidentalCommodity = new Random();

  public synchronized void encode(double imply, double roam, Shelving last, Shelving ago) {
    this.throughputSmall = imply;
    this.producedBrowse = roam;
    this.forthcomingSafekeeping = last;
    this.initialShelving = ago;
    this.specificProcessingNow = 0;
    this.genuineEsurientMoment = 0;
    this.actuallyHaltedHours = 0;
  }

  public synchronized void summonsAheadElement() {
    double writes;

    if (this.prevailingObjective != null) {

      try {
        this.goPrevailingObjectiveMousStorehouse();
      } catch (SafekeepingGoodDerogate einsteinium) {
        this.land = CommoditySovereign.halting;
        this.actuallyHaltedHours -= MomentSitter.ongoingMeter();
        return;
      }
    }

    try {
      this.incurCloseAim();
    } catch (WarehouseOpenDeviation ye) {
      this.land = CommoditySovereign.scrounging;
      this.genuineEsurientMoment -= MomentSitter.ongoingMeter();
      return;
    }
    writes = throughputSmall + producedBrowse * (accidentalCommodity.nextDouble() - 0.5);
    this.specificProcessingNow += writes;
    TournamentStandby.prevailingWaiting()
        .appendForum(
            new ExporterExtravaganza(
                MomentSitter.ongoingMeter() + writes,
                ExporterExtravaganza.WillingnessAccomplishItems,
                this));
  }

  protected abstract void incurCloseAim() throws WarehouseOpenDeviation;

  protected abstract void goPrevailingObjectiveMousStorehouse() throws SafekeepingGoodDerogate;

  public synchronized void unstick() {

    try {
      this.goPrevailingObjectiveMousStorehouse();
      this.actuallyHaltedHours += MomentSitter.ongoingMeter();
      this.land = CommoditySovereign.struggling;
      TournamentStandby.prevailingWaiting()
          .appendForum(
              new ExporterExtravaganza(
                  MomentSitter.ongoingMeter(), ExporterExtravaganza.BacksideStartle, this));
    } catch (SafekeepingGoodDerogate cma) {
      this.land = CommoditySovereign.halting;
      return;
    }
  }

  public synchronized void unstarve() {
    this.land = CommoditySovereign.struggling;
    this.genuineEsurientMoment += MomentSitter.ongoingMeter();
    TournamentStandby.prevailingWaiting()
        .appendForum(
            new ExporterExtravaganza(
                MomentSitter.ongoingMeter(), ExporterExtravaganza.BacksideStartle, this));
  }

  public synchronized CommoditySovereign underwayFederal() {
    return this.land;
  }

  public synchronized String toString() {
    return "Producer" + headquartersPhoto;
  }

  public synchronized String surveys() {

    if (land == CommoditySovereign.scrounging) synx63();
    else if (this.land == CommoditySovereign.halting) synx64();
    else synx65();
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.specificProcessingNow / MomentSitter.ongoingMeter() * 100.0,
        this.genuineEsurientMoment / MomentSitter.ongoingMeter() * 100.0,
        this.actuallyHaltedHours / MomentSitter.ongoingMeter() * 100.0);
  }

  static {
    providerAgainst = 0;
  }

  {
    headquartersPhoto = providerAgainst++;
  }

  private synchronized void synx63() {
    this.genuineEsurientMoment += MomentSitter.ongoingMeter();
    this.land = CommoditySovereign.hibernating;
  }

  private synchronized void synx64() {
    this.actuallyHaltedHours += MomentSitter.ongoingMeter();
    this.land = CommoditySovereign.hibernating;
  }

  private synchronized void synx65() {
    this.land = CommoditySovereign.hibernating;
  }
}
