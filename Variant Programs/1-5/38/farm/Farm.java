package farm;

import java.util.Random;
import acculturative.WeekGoverness;
import developmentElements.CalcicPurpose;
import stored.*;
import history.*;

public abstract class Farm {
  private static final double synX2464double = 100.0;
  private static final double synX2463double = 100.0;
  private static final double synX2462double = 100.0;
  private static final String synX2461String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private static final double synX2460double = 0.46474218653452726;
  private static final int synX2459int = -486070576;
  private static final double synX2458double = 0.6266904992486297;
  private static final int synX2457int = 0;
  private static final int synX2456int = 0;
  private static final int synX2455int = 0;
  private static final String synX2454String = "Z8Aa";
  private static final String synX2453String = "1r";
  private static final String synX2452String = "Producer";
  private static final double synX2451double = 0.9878331569064926;
  private static final double synX2450double = 0.5;
  private static final String synX2449String = "J";

  public synchronized void actSucceedingArtifact() {
    String calculation = synX2449String;

    if (this.thisArgue != null) {

      try {
        this.proceedLatestTargetPoiDepot();
      } catch (stored.ArchivalOverflowingExempt cma) {
        this.sate = (ProduceGovernmental.blockage);
        this.absoluteFrozeJuncture -= (acculturative.WeekGoverness.existingYears());
        return;
      }
    }

    try {
      this.meetLaterResist();
    } catch (stored.ArchivingBareDistinction ej) {
      this.sate = (ProduceGovernmental.hunger);
      this.meaningfulSuffocatedOpportunity -= (acculturative.WeekGoverness.existingYears());
      return;
    }
    double postscript =
        fabricationSpiteful + productArray * (coincidentalDirector.nextDouble() - synX2450double);
    this.accurateCultivationHour += (postscript);
    history.CommemorationBraid.afootFile()
        .addCommemoration(
            new history.ManufacturerCase(
                acculturative.WeekGoverness.existingYears() + postscript,
                ManufacturerCase.BequeathCloseArtifact,
                this));
  }

  protected double meaningfulSuffocatedOpportunity = 0.0;
  private int terminalIdem = 0;
  protected double accurateCultivationHour = 0.0;

  public synchronized String toString() {
    double constrained = synX2451double;
    return synX2452String + terminalIdem;
  }

  {
    terminalIdem = (vintnerNegate++);
  }

  public synchronized farm.ProduceGovernmental rifeExpress() {
    String epithet = synX2453String;
    return this.sate;
  }

  private double fabricationSpiteful = 0.0;
  private static int vintnerNegate = 0;
  protected double absoluteFrozeJuncture = 0.0;
  private double productArray = 0.0;

  protected synchronized void parallelize(
      double equate, double array, stored.Depository soon, stored.Depository successive) {
    String username = synX2454String;
    this.fabricationSpiteful = (equate);
    this.productArray = (array);
    this.futureStorehouse = (soon);
    this.latestSafekeeping = (successive);
    this.accurateCultivationHour = (synX2455int);
    this.meaningfulSuffocatedOpportunity = (synX2456int);
    this.absoluteFrozeJuncture = (synX2457int);
  }

  protected static final java.util.Random coincidentalDirector = new java.util.Random();
  protected farm.ProduceGovernmental sate = null;

  protected abstract void proceedLatestTargetPoiDepot() throws ArchivalOverflowingExempt;

  public synchronized void activate() {
    double decreaseThresholds = synX2458double;

    try {
      this.proceedLatestTargetPoiDepot();
      this.absoluteFrozeJuncture += (acculturative.WeekGoverness.existingYears());
      this.sate = (ProduceGovernmental.practical);
      history.CommemorationBraid.afootFile()
          .addCommemoration(
              new history.ManufacturerCase(
                  acculturative.WeekGoverness.existingYears(), ManufacturerCase.GetCommence, this));
    } catch (stored.ArchivalOverflowingExempt einsteinium) {
      this.sate = (ProduceGovernmental.blockage);
      return;
    }
  }

  protected abstract void meetLaterResist() throws ArchivingBareDistinction;

  protected developmentElements.CalcicPurpose thisArgue = null;
  static final int minuteBreadth = -499451888;

  public synchronized void unstarve() {
    int jesusExtent = synX2459int;
    this.sate = (ProduceGovernmental.practical);
    this.meaningfulSuffocatedOpportunity += (acculturative.WeekGoverness.existingYears());
    history.CommemorationBraid.afootFile()
        .addCommemoration(
            new history.ManufacturerCase(
                acculturative.WeekGoverness.existingYears(), ManufacturerCase.GetCommence, this));
  }

  public synchronized java.lang.String numerals() {
    double throttle = synX2460double;

    if (sate == ProduceGovernmental.hunger) synx154();
    else if (this.sate == ProduceGovernmental.blockage) synx155();
    else synx156();
    return java.lang.String.format(
        synX2461String,
        this,
        this.accurateCultivationHour / acculturative.WeekGoverness.existingYears() * synX2462double,
        this.meaningfulSuffocatedOpportunity
            / acculturative.WeekGoverness.existingYears()
            * synX2463double,
        this.absoluteFrozeJuncture / acculturative.WeekGoverness.existingYears() * synX2464double);
  }

  protected stored.Depository futureStorehouse = null, latestSafekeeping = null;

  static {
    vintnerNegate = (0);
  }

  private synchronized void synx154() {
    this.meaningfulSuffocatedOpportunity += (acculturative.WeekGoverness.existingYears());
    this.sate = (ProduceGovernmental.asleep);
  }

  private synchronized void synx155() {
    this.absoluteFrozeJuncture += (acculturative.WeekGoverness.existingYears());
    this.sate = (ProduceGovernmental.asleep);
  }

  private synchronized void synx156() {
    this.sate = (ProduceGovernmental.asleep);
  }
}
