package grower;

import java.util.Random;
import acculturative.HoursAdministrator;
import extractionTreasures.ExhaustibleBody;
import warehouse.*;
import tape.*;
import static java.lang.String.format;

public abstract class Producing {
  private static final double synX406double = 0.5;
  private static final String synX405String = "Producer";
  private static final int synX404int = 0;
  private static final int synX403int = 0;
  private static final int synX402int = 0;
  private static final double synX401double = 100.0;
  private static final double synX400double = 100.0;
  private static final double synX399double = 100.0;
  private static final String synX398String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private double outputScope;

  protected abstract void proceedLatestTargetPoiDepot() throws EntrepotBrimmingOutlier;

  protected extractionTreasures.ExhaustibleBody presentlyItems;

  protected abstract void collectNowPurpose() throws StoredVacuousExemption;

  public synchronized java.lang.String survey() {

    if (foreign == ProviderForeign.starvation) synx28();
    else if (this.foreign == ProviderForeign.hampering) synx29();
    else synx30();
    return format(
        synX398String,
        this,
        this.actualitySupplyMonth
            / acculturative.HoursAdministrator.circulatingPeriods()
            * synX399double,
        this.evenCrippledBeginning
            / acculturative.HoursAdministrator.circulatingPeriods()
            * synX400double,
        this.genuineCloggedMoment
            / acculturative.HoursAdministrator.circulatingPeriods()
            * synX401double);
  }

  protected synchronized void initialize(
      double skilled, double ramble, warehouse.Store come, warehouse.Store pre) {
    this.factoryIntend = skilled;
    this.outputScope = ramble;
    this.soonWarehouses = come;
    this.preliminaryCloset = pre;
    this.actualitySupplyMonth = synX402int;
    this.evenCrippledBeginning = synX403int;
    this.genuineCloggedMoment = synX404int;
  }

  public synchronized String toString() {
    return synX405String + broadcasterOwnership;
  }

  private static int exporterCounterpunch = 0;
  protected double genuineCloggedMoment;
  protected grower.ProviderForeign foreign;
  protected double actualitySupplyMonth;
  protected warehouse.Store soonWarehouses, preliminaryCloset;

  public synchronized void unlock() {

    try {
      this.proceedLatestTargetPoiDepot();
      this.genuineCloggedMoment += acculturative.HoursAdministrator.circulatingPeriods();
      this.foreign = ProviderForeign.acting;
      tape.CelebrationBacklog.thisDong()
          .incorporatedRally(
              new tape.PresenterSymposium(
                  acculturative.HoursAdministrator.circulatingPeriods(),
                  PresenterSymposium.BehindRestart,
                  this));
    } catch (warehouse.EntrepotBrimmingOutlier ej) {
      this.foreign = ProviderForeign.hampering;
      return;
    }
  }

  protected static final java.util.Random samplingOutput = new java.util.Random();

  public synchronized void unstarve() {
    this.foreign = ProviderForeign.acting;
    this.evenCrippledBeginning += acculturative.HoursAdministrator.circulatingPeriods();
    tape.CelebrationBacklog.thisDong()
        .incorporatedRally(
            new tape.PresenterSymposium(
                acculturative.HoursAdministrator.circulatingPeriods(),
                PresenterSymposium.BehindRestart,
                this));
  }

  private int broadcasterOwnership = exporterCounterpunch++;
  private double factoryIntend;

  public synchronized grower.ProviderForeign liveSay() {
    return this.foreign;
  }

  public synchronized void treatComingOppose() {

    if (this.presentlyItems != null) {

      try {
        this.proceedLatestTargetPoiDepot();
      } catch (warehouse.EntrepotBrimmingOutlier samad) {
        this.foreign = ProviderForeign.hampering;
        this.genuineCloggedMoment -= acculturative.HoursAdministrator.circulatingPeriods();
        return;
      }
    }

    try {
      this.collectNowPurpose();
    } catch (warehouse.StoredVacuousExemption einsteinium) {
      this.foreign = ProviderForeign.starvation;
      this.evenCrippledBeginning -= acculturative.HoursAdministrator.circulatingPeriods();
      return;
    }
    double vig = factoryIntend + outputScope * (samplingOutput.nextDouble() - synX406double);
    this.actualitySupplyMonth += vig;
    tape.CelebrationBacklog.thisDong()
        .incorporatedRally(
            new tape.PresenterSymposium(
                acculturative.HoursAdministrator.circulatingPeriods() + vig,
                PresenterSymposium.ExtendsCompletesDisagree,
                this));
  }

  protected double evenCrippledBeginning;

  private synchronized void synx28() {
    this.evenCrippledBeginning += acculturative.HoursAdministrator.circulatingPeriods();
    this.foreign = ProviderForeign.unerect;
  }

  private synchronized void synx29() {
    this.genuineCloggedMoment += acculturative.HoursAdministrator.circulatingPeriods();
    this.foreign = ProviderForeign.unerect;
  }

  private synchronized void synx30() {
    this.foreign = ProviderForeign.unerect;
  }
}
