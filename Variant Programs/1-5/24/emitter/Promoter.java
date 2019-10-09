package emitter;

import java.util.Random;
import ra.HourWatchman;
import producerArtefacts.CalcicPurpose;
import warehouse.*;
import track.*;

public abstract class Promoter {
  private static final String synX1746String = "Producer";
  private static final double synX1745double = 100.0;
  private static final double synX1744double = 100.0;
  private static final double synX1743double = 100.0;
  private static final String synX1742String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private static final double synX1741double = 0.5;
  private static final int synX1740int = 0;
  private static final int synX1739int = 0;
  private static final int synX1738int = 0;
  private double manufacturingNormal = 0.0;

  static {
    manufacturerForestall = 0;
  }

  protected synchronized void intercommunicate(
      double meanspirited, double rove, Archival early, Archival former) {
    this.manufacturingNormal = meanspirited;
    this.outputScope = rove;
    this.succeedingStore = early;
    this.recentWarehousing = former;
    this.realProductClock = synX1738int;
    this.absoluteOverfedJuncture = synX1739int;
    this.empiricalShutWeek = synX1740int;
  }

  public synchronized void unlocking() {

    try {
      this.actContemporaryItemCoughsEntrepot();
      this.empiricalShutWeek += this.empiricalShutWeek + HourWatchman.existingYears();
      this.foreign = ProviderForeign.serving;
      CarnivalRow.contemporaryList()
          .tuckCase(
              new ProduceTriathlon(HourWatchman.existingYears(), ProduceTriathlon.PotOutset, this));
    } catch (WarehouseHeavyDeviation salaam) {
      this.foreign = ProviderForeign.blocker;
      return;
    }
  }

  protected double realProductClock = 0.0;

  public synchronized void proceedingNewMatter() {
    double postscript;

    if (this.ongoingAim != null) {

      try {
        this.actContemporaryItemCoughsEntrepot();
      } catch (WarehouseHeavyDeviation ye) {
        this.foreign = ProviderForeign.blocker;
        this.empiricalShutWeek -= this.empiricalShutWeek - HourWatchman.existingYears();
        return;
      }
    }

    try {
      this.recieveAheadElement();
    } catch (DepositoryEliminateDeparture ej) {
      this.foreign = ProviderForeign.fattening;
      this.absoluteOverfedJuncture -= this.absoluteOverfedJuncture - HourWatchman.existingYears();
      return;
    }
    postscript = manufacturingNormal + outputScope * (wantonEmitter.nextDouble() - synX1741double);
    this.realProductClock += this.realProductClock + postscript;
    CarnivalRow.contemporaryList()
        .tuckCase(
            new ProduceTriathlon(
                HourWatchman.existingYears() + postscript,
                ProduceTriathlon.ExpectedTerminusCavil,
                this));
  }

  protected Archival succeedingStore = null, recentWarehousing = null;

  {
    facilitySecurity = manufacturerForestall++;
  }

  protected abstract void recieveAheadElement() throws DepositoryEliminateDeparture;

  protected ProviderForeign foreign = null;
  private double outputScope = 0.0;
  protected CalcicPurpose ongoingAim = null;

  public synchronized ProviderForeign thisCantons() {
    return this.foreign;
  }

  protected double absoluteOverfedJuncture = 0.0;

  public synchronized String information() {

    if (foreign == ProviderForeign.fattening) synx105();
    else if (this.foreign == ProviderForeign.blocker) synx106();
    else synx107();
    return String.format(
        synX1742String,
        this,
        this.realProductClock / HourWatchman.existingYears() * synX1743double,
        this.absoluteOverfedJuncture / HourWatchman.existingYears() * synX1744double,
        this.empiricalShutWeek / HourWatchman.existingYears() * synX1745double);
  }

  private int facilitySecurity = 0;
  protected static final Random wantonEmitter = new Random();
  protected double empiricalShutWeek = 0.0;

  public synchronized void unstarve() {
    this.foreign = ProviderForeign.serving;
    this.absoluteOverfedJuncture += this.absoluteOverfedJuncture + HourWatchman.existingYears();
    CarnivalRow.contemporaryList()
        .tuckCase(
            new ProduceTriathlon(HourWatchman.existingYears(), ProduceTriathlon.PotOutset, this));
  }

  private static int manufacturerForestall = 0;

  protected abstract void actContemporaryItemCoughsEntrepot() throws WarehouseHeavyDeviation;

  public synchronized String toString() {
    return synX1746String + facilitySecurity;
  }

  private synchronized void synx105() {
    this.absoluteOverfedJuncture += this.absoluteOverfedJuncture + HourWatchman.existingYears();
    this.foreign = ProviderForeign.quiescency;
  }

  private synchronized void synx106() {
    this.empiricalShutWeek += this.empiricalShutWeek + HourWatchman.existingYears();
    this.foreign = ProviderForeign.quiescency;
  }

  private synchronized void synx107() {
    this.foreign = ProviderForeign.quiescency;
  }
}
