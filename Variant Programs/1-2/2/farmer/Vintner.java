package farmer;

import java.util.Random;
import acculturative.DaysHandler;
import factoryRelics.FissionableCavil;
import safekeeping.*;
import enter.*;

public abstract class Vintner {
  protected static final java.util.Random unselectedExporter = new java.util.Random();
  private static int makerNegative = 0;
  protected farmer.OperatorRepublic general;
  private double filmingIgnoble;
  private double throughputCompass;
  protected double substantialHarvestingAgain;
  protected double effectiveStoppedPeriods;
  protected double effectiveThirstedPeriods;
  protected factoryRelics.FissionableCavil contemporaryItem;
  protected safekeeping.Store laterDisk, initialShelving;
  private int radioEst = makerNegative++;

  protected void encode(
      double mingy, double rate, safekeeping.Store come, safekeeping.Store early) {
    this.filmingIgnoble = mingy;
    this.throughputCompass = rate;
    this.laterDisk = come;
    this.initialShelving = early;
    this.substantialHarvestingAgain = 0;
    this.effectiveThirstedPeriods = 0;
    this.effectiveStoppedPeriods = 0;
  }

  public void phaseSoonBody() {

    if (this.contemporaryItem != null) {

      try {
        this.promptRifeCavilEipCache();
      } catch (safekeeping.WarehousingHighLimitation einsteinium) {
        this.general = OperatorRepublic.stalling;
        this.effectiveStoppedPeriods -= acculturative.DaysHandler.flowMonth();
        return;
      }
    }

    try {
      this.meetLaterResist();
    } catch (safekeeping.EntrepotHollowOutlier samad) {
      this.general = OperatorRepublic.hungry;
      this.effectiveThirstedPeriods -= acculturative.DaysHandler.flowMonth();
      return;
    }
    double vig = filmingIgnoble + throughputCompass * (unselectedExporter.nextDouble() - 0.5);
    this.substantialHarvestingAgain += vig;
    enter.CeremoniesDragon.prevalentCue()
        .incorporatedRally(
            new enter.FarmExposition(
                acculturative.DaysHandler.flowMonth() + vig, FarmExposition.GonnaGetBody, this));
  }

  protected abstract void meetLaterResist() throws EntrepotHollowOutlier;

  protected abstract void promptRifeCavilEipCache() throws WarehousingHighLimitation;

  public void unlock() {

    try {
      this.promptRifeCavilEipCache();
      this.effectiveStoppedPeriods += acculturative.DaysHandler.flowMonth();
      this.general = OperatorRepublic.impermanent;
      enter.CeremoniesDragon.prevalentCue()
          .incorporatedRally(
              new enter.FarmExposition(
                  acculturative.DaysHandler.flowMonth(), FarmExposition.FundamentOriginate, this));
    } catch (safekeeping.WarehousingHighLimitation ye) {
      this.general = OperatorRepublic.stalling;
      return;
    }
  }

  public void unstarve() {
    this.general = OperatorRepublic.impermanent;
    this.effectiveThirstedPeriods += acculturative.DaysHandler.flowMonth();
    enter.CeremoniesDragon.prevalentCue()
        .incorporatedRally(
            new enter.FarmExposition(
                acculturative.DaysHandler.flowMonth(), FarmExposition.FundamentOriginate, this));
  }

  public farmer.OperatorRepublic newRepublic() {
    return this.general;
  }

  public String toString() {
    return "Producer" + radioEst;
  }

  public java.lang.String statisticians() {

    if (general == OperatorRepublic.hungry) {
      this.effectiveThirstedPeriods += acculturative.DaysHandler.flowMonth();
      this.general = OperatorRepublic.hibernate;
    } else if (this.general == OperatorRepublic.stalling) {
      this.effectiveStoppedPeriods += acculturative.DaysHandler.flowMonth();
      this.general = OperatorRepublic.hibernate;
    } else {
      this.general = OperatorRepublic.hibernate;
    }
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.substantialHarvestingAgain / acculturative.DaysHandler.flowMonth() * 100.0,
        this.effectiveThirstedPeriods / acculturative.DaysHandler.flowMonth() * 100.0,
        this.effectiveStoppedPeriods / acculturative.DaysHandler.flowMonth() * 100.0);
  }
}
