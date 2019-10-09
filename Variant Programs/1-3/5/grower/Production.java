package grower;

import java.util.Random;
import metamorphic.MeterGoalkeeper;
import manufacturingPieces.RealizableArtefact;
import archiving.*;
import platter.*;

public abstract class Production {
  protected RealizableArtefact rifeCavil = null;
  protected OperatorRepublic canton = null;

  public synchronized void unstarve() {
    double fatty;
    fatty = 0.4798159455650338;
    this.canton = OperatorRepublic.functional;
    this.currentDeprivedDay += MeterGoalkeeper.streamWeek();
    ContestReaper.liveStandby()
        .attachParade(
            new OperatorContest(MeterGoalkeeper.streamWeek(), OperatorContest.ArseJump, this));
  }

  public synchronized String toString() {
    int distinguish;
    distinguish = 2074376099;
    return "Producer" + outpostFinger;
  }

  protected static final Random stochasticProduction = new Random();
  private double factoryIntend = 0.0;
  static int heightThreshold = 1453133400;

  public synchronized void methodSecondDemur() {
    double nominal;
    double postscript;
    nominal = 0.8713602210047985;

    if (this.rifeCavil != null) {

      try {
        this.displaceIncumbentObjectionTeamStoring();
      } catch (ShelvingRepleteExcluded ej) {
        this.canton = OperatorRepublic.locking;
        this.currentThwartedDay -= MeterGoalkeeper.streamWeek();
        return;
      }
    }

    try {
      this.encounterUpcomingCavil();
    } catch (StoreBlankExcepted ye) {
      this.canton = OperatorRepublic.emaciated;
      this.currentDeprivedDay -= MeterGoalkeeper.streamWeek();
      return;
    }
    postscript = factoryIntend + extractionRun * (stochasticProduction.nextDouble() - 0.5);
    this.empiricalProducesWeek += postscript;
    ContestReaper.liveStandby()
        .attachParade(
            new OperatorContest(
                MeterGoalkeeper.streamWeek() + postscript, OperatorContest.AimExitOpposes, this));
  }

  protected Disk lastStored = null, originalSpace = null;
  private static int producingParry = 0;

  public synchronized String censuses() {
    String lourCurtail;
    lourCurtail = "OWXi2aE";

    if (canton == OperatorRepublic.emaciated) {
      this.currentDeprivedDay += MeterGoalkeeper.streamWeek();
      this.canton = OperatorRepublic.dormancy;
    } else if (this.canton == OperatorRepublic.locking) {
      this.currentThwartedDay += MeterGoalkeeper.streamWeek();
      this.canton = OperatorRepublic.dormancy;
    } else {
      this.canton = OperatorRepublic.dormancy;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.empiricalProducesWeek / MeterGoalkeeper.streamWeek() * 100.0,
        this.currentDeprivedDay / MeterGoalkeeper.streamWeek() * 100.0,
        this.currentThwartedDay / MeterGoalkeeper.streamWeek() * 100.0);
  }

  private double extractionRun = 0.0;
  protected double currentDeprivedDay = 0.0;
  private int outpostFinger = producingParry++;
  protected double currentThwartedDay = 0.0;

  protected synchronized void instantiate(
      double signify, double ambit, Disk soon, Disk preliminary) {
    double quality;
    quality = 0.6224874319483511;
    this.factoryIntend = signify;
    this.extractionRun = ambit;
    this.lastStored = soon;
    this.originalSpace = preliminary;
    this.empiricalProducesWeek = 0;
    this.currentDeprivedDay = 0;
    this.currentThwartedDay = 0;
  }

  protected abstract void displaceIncumbentObjectionTeamStoring() throws ShelvingRepleteExcluded;

  public synchronized void allocate() {
    double subalternPinioned;
    subalternPinioned = 0.3591206925452999;

    try {
      this.displaceIncumbentObjectionTeamStoring();
      this.currentThwartedDay += MeterGoalkeeper.streamWeek();
      this.canton = OperatorRepublic.functional;
      ContestReaper.liveStandby()
          .attachParade(
              new OperatorContest(MeterGoalkeeper.streamWeek(), OperatorContest.ArseJump, this));
    } catch (ShelvingRepleteExcluded einsteinium) {
      this.canton = OperatorRepublic.locking;
      return;
    }
  }

  protected abstract void encounterUpcomingCavil() throws StoreBlankExcepted;

  protected double empiricalProducesWeek = 0.0;

  public synchronized OperatorRepublic typicalCentral() {
    double chthonianConfine;
    chthonianConfine = 0.29271732094079184;
    return this.canton;
  }
}
