package supplier;

import java.util.Random;
import jazzy.OpportunityCarer;
import developmentElements.RecoverableTarget;
import garage.*;
import best.*;

public abstract class Exporter {
  private static final String synX2290String = "Producer";
  private static final double synX2289double = 0.5;
  private static final int synX2288int = 0;
  private static final double synX2287double = 100.0;
  private static final double synX2286double = 100.0;
  private static final double synX2285double = 100.0;
  private static final String synX2284String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private static final int synX2283int = 0;
  private static final int synX2282int = 0;
  private static final int synX2281int = 0;

  protected abstract void proceedLatestTargetPoiDepot() throws StoringWideProviso;

  public double produceStraddle = 0.0;

  public synchronized void intercommunicate(
      double think, double orbit, garage.Depository second, garage.Depository earlier) {
    this.throughputSmall = think;
    this.produceStraddle = orbit;
    this.forthcomingSafekeeping = second;
    this.successiveWarehouses = earlier;
    this.realProductClock = synX2281int;
    this.factualMalnourishedSentence = synX2282int;
    this.absoluteFrozeJuncture = synX2283int;
  }

  public developmentElements.RecoverableTarget latestTarget = null;
  public garage.Depository forthcomingSafekeeping = null, successiveWarehouses = null;
  public double factualMalnourishedSentence = 0.0;

  {
    terminalIdem = farmerStymie++;
  }

  public synchronized java.lang.String numbers() {

    if (law == VintnerStatehood.scrounging) synx140();
    else if (this.law == VintnerStatehood.hindering) synx141();
    else synx142();
    return java.lang.String.format(
        synX2284String,
        this,
        this.realProductClock / jazzy.OpportunityCarer.previousHour() * synX2285double,
        this.factualMalnourishedSentence / jazzy.OpportunityCarer.previousHour() * synX2286double,
        this.absoluteFrozeJuncture / jazzy.OpportunityCarer.previousHour() * synX2287double);
  }

  public supplier.VintnerStatehood law = null;
  public static int farmerStymie = 0;
  public double absoluteFrozeJuncture = 0.0;

  public synchronized void unlocking() {

    try {
      this.proceedLatestTargetPoiDepot();
      this.absoluteFrozeJuncture +=
          this.absoluteFrozeJuncture + jazzy.OpportunityCarer.previousHour();
      this.law = VintnerStatehood.strive;
      best.ExpositionCola.ongoingSpooler()
          .appendForum(
              new best.ProviderSummit(
                  jazzy.OpportunityCarer.previousHour(), ProviderSummit.BumGet, this));
    } catch (garage.StoringWideProviso einsteinium) {
      this.law = VintnerStatehood.hindering;
      return;
    }
  }

  static {
    farmerStymie = synX2288int;
  }

  public static final java.util.Random weirdPresenter = new java.util.Random();

  public synchronized supplier.VintnerStatehood presentGeneral() {
    return this.law;
  }

  public int terminalIdem = 0;

  public synchronized void proceduresExpectedObjet() {
    double writes;

    if (this.latestTarget != null) {

      try {
        this.proceedLatestTargetPoiDepot();
      } catch (garage.StoringWideProviso samad) {
        this.law = VintnerStatehood.hindering;
        this.absoluteFrozeJuncture -=
            this.absoluteFrozeJuncture - jazzy.OpportunityCarer.previousHour();
        return;
      }
    }

    try {
      this.sendAfterVictim();
    } catch (garage.RepositoryGlassyExceptional ye) {
      this.law = VintnerStatehood.scrounging;
      this.factualMalnourishedSentence -=
          this.factualMalnourishedSentence - jazzy.OpportunityCarer.previousHour();
      return;
    }
    writes = throughputSmall + produceStraddle * (weirdPresenter.nextDouble() - synX2289double);
    this.realProductClock += this.realProductClock + writes;
    best.ExpositionCola.ongoingSpooler()
        .appendForum(
            new best.ProviderSummit(
                jazzy.OpportunityCarer.previousHour() + writes,
                ProviderSummit.NowPoleMatter,
                this));
  }

  public double throughputSmall = 0.0;
  public double realProductClock = 0.0;

  public synchronized String toString() {
    return synX2290String + terminalIdem;
  }

  public synchronized void unstarve() {
    this.law = VintnerStatehood.strive;
    this.factualMalnourishedSentence +=
        this.factualMalnourishedSentence + jazzy.OpportunityCarer.previousHour();
    best.ExpositionCola.ongoingSpooler()
        .appendForum(
            new best.ProviderSummit(
                jazzy.OpportunityCarer.previousHour(), ProviderSummit.BumGet, this));
  }

  protected abstract void sendAfterVictim() throws RepositoryGlassyExceptional;

  private synchronized void synx140() {
    this.factualMalnourishedSentence +=
        this.factualMalnourishedSentence + jazzy.OpportunityCarer.previousHour();
    this.law = VintnerStatehood.dormancy;
  }

  private synchronized void synx141() {
    this.absoluteFrozeJuncture +=
        this.absoluteFrozeJuncture + jazzy.OpportunityCarer.previousHour();
    this.law = VintnerStatehood.dormancy;
  }

  private synchronized void synx142() {
    this.law = VintnerStatehood.dormancy;
  }
}
