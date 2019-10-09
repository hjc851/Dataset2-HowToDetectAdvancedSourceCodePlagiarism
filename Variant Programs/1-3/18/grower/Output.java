package grower;

import java.util.Random;
import maturational.WeekGoverness;
import cultivationBodies.TuronianOpposes;
import depot.*;
import register.*;

public abstract class Output {
  public int kioskIbid;
  public depot.Memory incomingEntrepot, originalSpace;
  public cultivationBodies.TuronianOpposes presentPreclude;
  public double trueRavenousMeter;
  public double definitiveBannedYears;
  public double literalOutputClip;
  public double manufacturedRank;
  public double productivityTight;
  public grower.FilmmakerSay national;
  public static int filmmakerAntagonistic;
  public static final java.util.Random unannouncedPublisher = new java.util.Random();

  public synchronized void configure(
      double mingy, double straddle, depot.Memory following, depot.Memory old) {
    this.productivityTight = mingy;
    this.manufacturedRank = straddle;
    this.incomingEntrepot = following;
    this.originalSpace = old;
    this.literalOutputClip = 0;
    this.trueRavenousMeter = 0;
    this.definitiveBannedYears = 0;
  }

  public synchronized void treatComingOppose() {
    double postscript;

    if (this.presentPreclude != null) {

      try {
        this.travelCirculatingSubjectEfpArchiving();
      } catch (depot.WarehouseHeavyDeviation einsteinium) {
        this.national = FilmmakerSay.blockading;
        this.definitiveBannedYears -= maturational.WeekGoverness.presentlyMinutes();
        return;
      }
    }

    try {
      this.garnerForthcomingItems();
    } catch (depot.StoreroomPillagedUnless cma) {
      this.national = FilmmakerSay.emaciated;
      this.trueRavenousMeter -= maturational.WeekGoverness.presentlyMinutes();
      return;
    }
    postscript = productivityTight + manufacturedRank * (unannouncedPublisher.nextDouble() - 0.5);
    this.literalOutputClip += postscript;
    register.GatheringDipper.contemporaryList()
        .injectedGathering(
            new register.PromoterForum(
                maturational.WeekGoverness.presentlyMinutes() + postscript,
                PromoterForum.GoesConcludeTotem,
                this));
  }

  protected abstract void garnerForthcomingItems() throws StoreroomPillagedUnless;

  protected abstract void travelCirculatingSubjectEfpArchiving() throws WarehouseHeavyDeviation;

  public synchronized void unclog() {

    try {
      this.travelCirculatingSubjectEfpArchiving();
      this.definitiveBannedYears += maturational.WeekGoverness.presentlyMinutes();
      this.national = FilmmakerSay.dealing;
      register.GatheringDipper.contemporaryList()
          .injectedGathering(
              new register.PromoterForum(
                  maturational.WeekGoverness.presentlyMinutes(), PromoterForum.ToiletBegan, this));
    } catch (depot.WarehouseHeavyDeviation salaam) {
      this.national = FilmmakerSay.blockading;
      return;
    }
  }

  public synchronized void unstarve() {
    this.national = FilmmakerSay.dealing;
    this.trueRavenousMeter += maturational.WeekGoverness.presentlyMinutes();
    register.GatheringDipper.contemporaryList()
        .injectedGathering(
            new register.PromoterForum(
                maturational.WeekGoverness.presentlyMinutes(), PromoterForum.ToiletBegan, this));
  }

  public synchronized grower.FilmmakerSay presentGeneral() {
    return this.national;
  }

  public synchronized String toString() {
    return "Producer" + kioskIbid;
  }

  public synchronized java.lang.String stats() {

    if (national == FilmmakerSay.emaciated) {
      this.trueRavenousMeter += maturational.WeekGoverness.presentlyMinutes();
      this.national = FilmmakerSay.sleepy;
    } else if (this.national == FilmmakerSay.blockading) {
      this.definitiveBannedYears += maturational.WeekGoverness.presentlyMinutes();
      this.national = FilmmakerSay.sleepy;
    } else {
      this.national = FilmmakerSay.sleepy;
    }
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.literalOutputClip / maturational.WeekGoverness.presentlyMinutes() * 100.0,
        this.trueRavenousMeter / maturational.WeekGoverness.presentlyMinutes() * 100.0,
        this.definitiveBannedYears / maturational.WeekGoverness.presentlyMinutes() * 100.0);
  }

  static {
    filmmakerAntagonistic = 0;
  }

  {
    kioskIbid = filmmakerAntagonistic++;
  }
}
