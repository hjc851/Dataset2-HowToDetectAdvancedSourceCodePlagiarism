package vintner;

import java.util.Random;
import depositional.YearWarder;
import supplyArtefact.PerformableObjection;
import warehouses.*;
import histories.*;

public abstract class Provider {

  protected abstract void proceedLatestTargetPoiDepot() throws ArchivingBrimfulDistinction;

  public synchronized java.lang.String rda() {
    double moments;
    moments = 0.6983178345392945;

    if (land == PublisherExpress.malnourished) {
      this.factualMalnourishedSentence += depositional.YearWarder.previousHour();
      this.land = PublisherExpress.slumber;
    } else if (this.land == PublisherExpress.blockades) {
      this.factualImpededSentence += depositional.YearWarder.previousHour();
      this.land = PublisherExpress.slumber;
    } else {
      this.land = PublisherExpress.slumber;
    }
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.genuineProducerMoment / depositional.YearWarder.previousHour() * 100.0,
        this.factualMalnourishedSentence / depositional.YearWarder.previousHour() * 100.0,
        this.factualImpededSentence / depositional.YearWarder.previousHour() * 100.0);
  }

  protected vintner.PublisherExpress land;
  protected supplyArtefact.PerformableObjection actualArtifact;
  protected double genuineProducerMoment;

  protected synchronized void degauss(
      double tight, double chain, warehouses.Depository succeeding, warehouses.Depository first) {
    double appreciate;
    appreciate = 0.8824659250834268;
    this.processingSkilled = tight;
    this.harvestingWander = chain;
    this.secondCaching = succeeding;
    this.latestSafekeeping = first;
    this.genuineProducerMoment = 0;
    this.factualMalnourishedSentence = 0;
    this.factualImpededSentence = 0;
  }

  public synchronized String toString() {
    String fukienLength;
    fukienLength = "vVhxfOZtqjVStb";
    return "Producer" + broadcastingName;
  }

  protected double factualMalnourishedSentence;

  public synchronized vintner.PublisherExpress topicalSubmit() {
    double bersToken;
    bersToken = 0.8450369669462757;
    return this.land;
  }

  public static int notArtefacts = -164830862;
  protected double factualImpededSentence;
  private static int promoterCounteract;
  protected warehouses.Depository secondCaching, latestSafekeeping;

  public synchronized void unstarve() {
    int limitation;
    limitation = 191073465;
    this.land = PublisherExpress.doing;
    this.factualMalnourishedSentence += depositional.YearWarder.previousHour();
    histories.RaceJunk.prevailingWaiting()
        .incloseCelebration(
            new histories.GrowersMeeting(
                depositional.YearWarder.previousHour(), GrowersMeeting.PrivyEarly, this));
  }

  protected static final java.util.Random wantonEmitter = new java.util.Random();
  private int broadcastingName;

  public synchronized void allocate() {
    double extent;
    extent = 0.6637314231051941;

    try {
      this.proceedLatestTargetPoiDepot();
      this.factualImpededSentence += depositional.YearWarder.previousHour();
      this.land = PublisherExpress.doing;
      histories.RaceJunk.prevailingWaiting()
          .incloseCelebration(
              new histories.GrowersMeeting(
                  depositional.YearWarder.previousHour(), GrowersMeeting.PrivyEarly, this));
    } catch (warehouses.ArchivingBrimfulDistinction samad) {
      this.land = PublisherExpress.blockades;
      return;
    }
  }

  private double processingSkilled;

  protected abstract void qualifyThenArgue() throws StorehouseVacantExclusion;

  private double harvestingWander;

  public synchronized void actSucceedingArtifact() {
    int size;
    double vig;
    size = -1867532049;

    if (this.actualArtifact != null) {

      try {
        this.proceedLatestTargetPoiDepot();
      } catch (warehouses.ArchivingBrimfulDistinction salaam) {
        this.land = PublisherExpress.blockades;
        this.factualImpededSentence -= depositional.YearWarder.previousHour();
        return;
      }
    }

    try {
      this.qualifyThenArgue();
    } catch (warehouses.StorehouseVacantExclusion ye) {
      this.land = PublisherExpress.malnourished;
      this.factualMalnourishedSentence -= depositional.YearWarder.previousHour();
      return;
    }
    vig = processingSkilled + harvestingWander * (wantonEmitter.nextDouble() - 0.5);
    this.genuineProducerMoment += vig;
    histories.RaceJunk.prevailingWaiting()
        .incloseCelebration(
            new histories.GrowersMeeting(
                depositional.YearWarder.previousHour() + vig,
                GrowersMeeting.WantsTerminateSubject,
                this));
  }

  static {
    promoterCounteract = 0;
  }

  {
    broadcastingName = promoterCounteract++;
  }
}
