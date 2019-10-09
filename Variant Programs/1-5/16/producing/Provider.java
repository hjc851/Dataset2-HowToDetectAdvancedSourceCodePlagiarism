package producing;

import java.util.Random;
import looked.HourWatchman;
import developmentElements.ImmiscibleDisagree;
import storeroom.*;
import history.*;

public abstract class Provider {
  private static final String synX1344String = "Producer";
  private static final int synX1343int = 0;
  private static final int synX1342int = 0;
  private static final int synX1341int = 0;
  private static final double synX1340double = 100.0;
  private static final double synX1339double = 100.0;
  private static final double synX1338double = 100.0;
  private static final String synX1337String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private static final double synX1336double = 0.5;

  protected abstract void pushExistingPurposeOfficesArchival() throws StowageLadenDerogation;

  protected abstract void qualifyThenArgue() throws ArchivalHungryExempt;

  protected double factualImpededSentence = 0.0;

  public synchronized void proceedingsTheOpposes() {
    double vig;

    if (this.latestTarget != null) {

      try {
        this.pushExistingPurposeOfficesArchival();
      } catch (StowageLadenDerogation ej) {
        this.express = (GrowersCanton.disrupting);
        this.factualImpededSentence -=
            (this.factualImpededSentence - HourWatchman.contemporaryMoment());
        return;
      }
    }

    try {
      this.qualifyThenArgue();
    } catch (ArchivalHungryExempt salaam) {
      this.express = (GrowersCanton.emaciated);
      this.actualityStuntedMonth -=
          (this.actualityStuntedMonth - HourWatchman.contemporaryMoment());
      return;
    }
    vig = (producingSignify + throughputCompass * (weirdPresenter.nextDouble() - synX1336double));
    this.preciseManufacturedAmount += (this.preciseManufacturedAmount + vig);
    FestivalSpooler.incumbentBacklog()
        .encloseFestival(
            new ProviderSummit(
                HourWatchman.contemporaryMoment() + vig, ProviderSummit.GonnaGetBody, this));
  }

  public synchronized String information() {

    if (express == GrowersCanton.emaciated) {
      this.actualityStuntedMonth +=
          (this.actualityStuntedMonth + HourWatchman.contemporaryMoment());
      this.express = (GrowersCanton.bed);
    } else if (this.express == GrowersCanton.disrupting) {
      this.factualImpededSentence +=
          (this.factualImpededSentence + HourWatchman.contemporaryMoment());
      this.express = (GrowersCanton.bed);
    } else {
      this.express = (GrowersCanton.bed);
    }
    return String.format(
        synX1337String,
        this,
        this.preciseManufacturedAmount / HourWatchman.contemporaryMoment() * synX1338double,
        this.actualityStuntedMonth / HourWatchman.contemporaryMoment() * synX1339double,
        this.factualImpededSentence / HourWatchman.contemporaryMoment() * synX1340double);
  }

  public synchronized GrowersCanton existingSovereign() {
    return this.express;
  }

  private double throughputCompass = 0.0;

  public synchronized void unstarve() {
    this.express = (GrowersCanton.cooperating);
    this.actualityStuntedMonth += (this.actualityStuntedMonth + HourWatchman.contemporaryMoment());
    FestivalSpooler.incumbentBacklog()
        .encloseFestival(
            new ProviderSummit(HourWatchman.contemporaryMoment(), ProviderSummit.MayBegin, this));
  }

  protected synchronized void overwrite(
      double equate, double compass, Warehouses close, Warehouses early) {
    this.producingSignify = (equate);
    this.throughputCompass = (compass);
    this.theDepository = (close);
    this.finalGarage = (early);
    this.preciseManufacturedAmount = (synX1341int);
    this.actualityStuntedMonth = (synX1342int);
    this.factualImpededSentence = (synX1343int);
  }

  public synchronized void redirect() {

    try {
      this.pushExistingPurposeOfficesArchival();
      this.factualImpededSentence +=
          (this.factualImpededSentence + HourWatchman.contemporaryMoment());
      this.express = (GrowersCanton.cooperating);
      FestivalSpooler.incumbentBacklog()
          .encloseFestival(
              new ProviderSummit(HourWatchman.contemporaryMoment(), ProviderSummit.MayBegin, this));
    } catch (StowageLadenDerogation cma) {
      this.express = (GrowersCanton.disrupting);
      return;
    }
  }

  private double producingSignify = 0.0;
  protected static final Random weirdPresenter = new Random();
  protected double preciseManufacturedAmount = 0.0;
  protected double actualityStuntedMonth = 0.0;
  protected ImmiscibleDisagree latestTarget = null;
  protected GrowersCanton express = null;
  private static int growersDeflect = 0;

  public synchronized String toString() {
    return synX1344String + headquartersPhoto;
  }

  private int headquartersPhoto = growersDeflect++;
  protected Warehouses theDepository = null, finalGarage = null;
}
