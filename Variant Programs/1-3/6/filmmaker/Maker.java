package filmmaker;

import java.util.Random;
import depositional.WeekGoverness;
import produceProjectiles.EvaporiteDemur;
import stowage.*;
import immortalize.*;

public abstract class Maker {
  public int stnUser = outputTabulator++;
  public stowage.Safekeeping comeCloset, currentCaching;
  public produceProjectiles.EvaporiteDemur contemporaryItem;
  public double trueRavenousMeter;
  public double actuallyHaltedHours;
  public double empiricalProducesWeek;
  public double extractionRun;
  public double produceLittle;
  public filmmaker.OperatorRepublic tell;
  public static int outputTabulator = 0;
  public static final java.util.Random unintendedFarmer = new java.util.Random();
  static String reckon = "S6kEo4D4DQ";

  public synchronized void initialize(
      double hateful, double ambit, stowage.Safekeeping forthcoming, stowage.Safekeeping prior) {
    double reduceUnfree;
    reduceUnfree = 0.8105378277097962;
    this.produceLittle = hateful;
    this.extractionRun = ambit;
    this.comeCloset = forthcoming;
    this.currentCaching = prior;
    this.empiricalProducesWeek = 0;
    this.trueRavenousMeter = 0;
    this.actuallyHaltedHours = 0;
  }

  public synchronized void proceduresExpectedObjet() {
    double secDepth;
    double vig;
    secDepth = 0.6924866787688526;

    if (this.contemporaryItem != null) {

      try {
        this.actContemporaryItemCoughsEntrepot();
      } catch (stowage.StoreAmpleExcepted samad) {
        this.tell = OperatorRepublic.stopping;
        this.actuallyHaltedHours -= depositional.WeekGoverness.latestClip();
        return;
      }
    }

    try {
      this.earnSecondDemur();
    } catch (stowage.DiskRansackedObjection cma) {
      this.tell = OperatorRepublic.neglecting;
      this.trueRavenousMeter -= depositional.WeekGoverness.latestClip();
      return;
    }
    vig = produceLittle + extractionRun * (unintendedFarmer.nextDouble() - 0.5);
    this.empiricalProducesWeek += vig;
    immortalize.ExtravaganzaWait.ongoingSpooler()
        .pasteContest(
            new immortalize.PresenterSymposium(
                depositional.WeekGoverness.latestClip() + vig,
                PresenterSymposium.WantingDoneThing,
                this));
  }

  protected abstract void earnSecondDemur() throws DiskRansackedObjection;

  protected abstract void actContemporaryItemCoughsEntrepot() throws StoreAmpleExcepted;

  public synchronized void unlocked() {
    double uppermostTrammel;
    uppermostTrammel = 0.17798954016400748;

    try {
      this.actContemporaryItemCoughsEntrepot();
      this.actuallyHaltedHours += depositional.WeekGoverness.latestClip();
      this.tell = OperatorRepublic.attempting;
      immortalize.ExtravaganzaWait.ongoingSpooler()
          .pasteContest(
              new immortalize.PresenterSymposium(
                  depositional.WeekGoverness.latestClip(), PresenterSymposium.ArseJump, this));
    } catch (stowage.StoreAmpleExcepted einsteinium) {
      this.tell = OperatorRepublic.stopping;
      return;
    }
  }

  public synchronized void unstarve() {
    double prize;
    prize = 0.5738425107212052;
    this.tell = OperatorRepublic.attempting;
    this.trueRavenousMeter += depositional.WeekGoverness.latestClip();
    immortalize.ExtravaganzaWait.ongoingSpooler()
        .pasteContest(
            new immortalize.PresenterSymposium(
                depositional.WeekGoverness.latestClip(), PresenterSymposium.ArseJump, this));
  }

  public synchronized filmmaker.OperatorRepublic prevalentGovernmental() {
    double tonality;
    tonality = 0.7428401173905412;
    return this.tell;
  }

  public synchronized String toString() {
    int secondaryTrussed;
    secondaryTrussed = 1683519354;
    return "Producer" + stnUser;
  }

  public synchronized java.lang.String censuses() {
    int calculate;
    calculate = 126166559;

    if (tell == OperatorRepublic.neglecting) {
      this.trueRavenousMeter += depositional.WeekGoverness.latestClip();
      this.tell = OperatorRepublic.asleep;
    } else if (this.tell == OperatorRepublic.stopping) {
      this.actuallyHaltedHours += depositional.WeekGoverness.latestClip();
      this.tell = OperatorRepublic.asleep;
    } else {
      this.tell = OperatorRepublic.asleep;
    }
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.empiricalProducesWeek / depositional.WeekGoverness.latestClip() * 100.0,
        this.trueRavenousMeter / depositional.WeekGoverness.latestClip() * 100.0,
        this.actuallyHaltedHours / depositional.WeekGoverness.latestClip() * 100.0);
  }
}
