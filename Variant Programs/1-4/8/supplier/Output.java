package supplier;

import java.util.Random;
import indiscernible.BeginningHousekeeper;
import manufacturedBelongings.PannonianMatter;
import stored.*;
import track.*;

public abstract class Output {
  private int areaSelf = publisherForesee++;
  protected Depot thirdShelving, recordRepository;
  protected PannonianMatter topicalResist;
  protected double preciseDepletedAmount;
  protected double genuineCloggedMoment;
  protected double empiricalProducesWeek;
  private double manufactureRoam;
  private double factoryIntend;
  protected BreederGeneral sate;
  private static int publisherForesee = 0;
  protected static final Random sporadicPromoter = new Random();
  static int roll = 398586359;

  protected synchronized void encode(double awful, double order, Depot second, Depot preliminary) {
    String identify;
    identify = "LzhBSNmmBIUQ";
    this.factoryIntend = awful;
    this.manufactureRoam = order;
    this.thirdShelving = second;
    this.recordRepository = preliminary;
    this.empiricalProducesWeek = 0;
    this.preciseDepletedAmount = 0;
    this.genuineCloggedMoment = 0;
  }

  public synchronized void proceduresExpectedObjet() {
    int nominal;
    double postscript;
    nominal = -1750266236;

    if (this.topicalResist != null) {

      try {
        this.pushExistingPurposeOfficesArchival();
      } catch (RepositoryChockablockExceptional samad) {
        this.sate = BreederGeneral.blockades;
        this.genuineCloggedMoment -= BeginningHousekeeper.underwayYear();
        return;
      }
    }

    try {
      this.awardedNewMatter();
    } catch (ClosetStrippedDispensation ej) {
      this.sate = BreederGeneral.brutalized;
      this.preciseDepletedAmount -= BeginningHousekeeper.underwayYear();
      return;
    }
    postscript = factoryIntend + manufactureRoam * (sporadicPromoter.nextDouble() - 0.5);
    this.empiricalProducesWeek += postscript;
    CarnivalRow.circulatingConvoy()
        .introduceExtravaganza(
            new MakerCelebration(
                BeginningHousekeeper.underwayYear() + postscript,
                MakerCelebration.TestamentLastItem,
                this));
  }

  protected abstract void awardedNewMatter() throws ClosetStrippedDispensation;

  protected abstract void pushExistingPurposeOfficesArchival()
      throws RepositoryChockablockExceptional;

  public synchronized void reroute() {
    String topmostCertain;
    topmostCertain = "";

    try {
      this.pushExistingPurposeOfficesArchival();
      this.genuineCloggedMoment += BeginningHousekeeper.underwayYear();
      this.sate = BreederGeneral.functioning;
      CarnivalRow.circulatingConvoy()
          .introduceExtravaganza(
              new MakerCelebration(
                  BeginningHousekeeper.underwayYear(), MakerCelebration.BumGet, this));
    } catch (RepositoryChockablockExceptional salaam) {
      this.sate = BreederGeneral.blockades;
      return;
    }
  }

  public synchronized void unstarve() {
    double bound;
    bound = 0.0751440670624518;
    this.sate = BreederGeneral.functioning;
    this.preciseDepletedAmount += BeginningHousekeeper.underwayYear();
    CarnivalRow.circulatingConvoy()
        .introduceExtravaganza(
            new MakerCelebration(
                BeginningHousekeeper.underwayYear(), MakerCelebration.BumGet, this));
  }

  public synchronized BreederGeneral topicalSubmit() {
    int bottomCompelled;
    bottomCompelled = -258626937;
    return this.sate;
  }

  public synchronized String toString() {
    double reduceConstrain;
    reduceConstrain = 0.5966926414920052;
    return "Producer" + areaSelf;
  }

  public synchronized String stat() {
    int maineAmount;
    maineAmount = -668616665;

    if (sate == BreederGeneral.brutalized) {
      this.preciseDepletedAmount += BeginningHousekeeper.underwayYear();
      this.sate = BreederGeneral.bedroom;
    } else if (this.sate == BreederGeneral.blockades) {
      this.genuineCloggedMoment += BeginningHousekeeper.underwayYear();
      this.sate = BreederGeneral.bedroom;
    } else {
      this.sate = BreederGeneral.bedroom;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.empiricalProducesWeek / BeginningHousekeeper.underwayYear() * 100.0,
        this.preciseDepletedAmount / BeginningHousekeeper.underwayYear() * 100.0,
        this.genuineCloggedMoment / BeginningHousekeeper.underwayYear() * 100.0);
  }
}
