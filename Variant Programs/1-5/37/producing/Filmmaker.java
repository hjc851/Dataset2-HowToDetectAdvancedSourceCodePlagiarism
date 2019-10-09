package producing;

import java.util.Random;
import said.ChanceGuardian;
import manufactureOrnaments.ClasticVictim;
import safekeeping.*;
import high.*;
import static java.lang.String.format;

public abstract class Filmmaker {
  private static final double synX2365double = 100.0;
  private static final double synX2364double = 100.0;
  private static final double synX2363double = 100.0;
  private static final String synX2362String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private static final String synX2361String = "Producer";
  private static final double synX2360double = 0.5;
  private static final int synX2359int = 0;
  private static final int synX2358int = 0;
  private static final int synX2357int = 0;
  protected static final Random unselectedExporter = new Random();
  private static int makerNegative = 0;
  protected PresenterSubmit federal = null;
  private double extractionAverage = 0.0;
  private double produceStraddle = 0.0;
  protected double realProductClock = 0.0;
  protected double accurateHamperedHour = 0.0;
  protected double empiricalUnderfedWeek = 0.0;
  protected ClasticVictim presentlyItems = null;
  protected Safekeeping upcomingCache = null, elapsedDepository = null;
  private int sendIdentifier = makerNegative++;

  protected synchronized void recode(
      double small, double reach, Safekeeping future, Safekeeping original) {
    this.extractionAverage = small;
    this.produceStraddle = reach;
    this.upcomingCache = future;
    this.elapsedDepository = original;
    this.realProductClock = synX2357int;
    this.empiricalUnderfedWeek = synX2358int;
    this.accurateHamperedHour = synX2359int;
  }

  public synchronized void mechanismForthcomingItems() {

    if (this.presentlyItems != null) {

      try {
        this.stepPreviousMatterSpecialistsSpace();
      } catch (StoreAmpleExcepted ej) {
        this.federal = PresenterSubmit.obstructing;
        this.accurateHamperedHour -= this.accurateHamperedHour - ChanceGuardian.formerAmount();
        return;
      }
    }

    try {
      this.findAdjacentObjection();
    } catch (StoringMeaninglessProviso cma) {
      this.federal = PresenterSubmit.emaciated;
      this.empiricalUnderfedWeek -= this.empiricalUnderfedWeek - ChanceGuardian.formerAmount();
      return;
    }
    double postscript =
        extractionAverage + produceStraddle * (unselectedExporter.nextDouble() - synX2360double);
    this.realProductClock += this.realProductClock + postscript;
    SeminarJumping.ongoingSpooler()
        .attachParade(
            new OperatorContest(
                ChanceGuardian.formerAmount() + postscript,
                OperatorContest.OughtCeaseOppose,
                this));
  }

  protected abstract void findAdjacentObjection() throws StoringMeaninglessProviso;

  protected abstract void stepPreviousMatterSpecialistsSpace() throws StoreAmpleExcepted;

  public synchronized void unlocking() {

    try {
      this.stepPreviousMatterSpecialistsSpace();
      this.accurateHamperedHour += this.accurateHamperedHour + ChanceGuardian.formerAmount();
      this.federal = PresenterSubmit.collaborate;
      SeminarJumping.ongoingSpooler()
          .attachParade(
              new OperatorContest(
                  ChanceGuardian.formerAmount(), OperatorContest.BunsCommences, this));
    } catch (StoreAmpleExcepted ye) {
      this.federal = PresenterSubmit.obstructing;
      return;
    }
  }

  public synchronized void unstarve() {
    this.federal = PresenterSubmit.collaborate;
    this.empiricalUnderfedWeek += this.empiricalUnderfedWeek + ChanceGuardian.formerAmount();
    SeminarJumping.ongoingSpooler()
        .attachParade(
            new OperatorContest(
                ChanceGuardian.formerAmount(), OperatorContest.BunsCommences, this));
  }

  public synchronized PresenterSubmit presentlyForeign() {
    return this.federal;
  }

  public synchronized String toString() {
    return synX2361String + sendIdentifier;
  }

  public synchronized String numerals() {

    if (federal == PresenterSubmit.emaciated) synx147();
    else if (this.federal == PresenterSubmit.obstructing) synx148();
    else synx149();
    return format(
        synX2362String,
        this,
        this.realProductClock / ChanceGuardian.formerAmount() * synX2363double,
        this.empiricalUnderfedWeek / ChanceGuardian.formerAmount() * synX2364double,
        this.accurateHamperedHour / ChanceGuardian.formerAmount() * synX2365double);
  }

  private synchronized void synx147() {
    this.empiricalUnderfedWeek += this.empiricalUnderfedWeek + ChanceGuardian.formerAmount();
    this.federal = PresenterSubmit.dormant;
  }

  private synchronized void synx148() {
    this.accurateHamperedHour += this.accurateHamperedHour + ChanceGuardian.formerAmount();
    this.federal = PresenterSubmit.dormant;
  }

  private synchronized void synx149() {
    this.federal = PresenterSubmit.dormant;
  }
}
