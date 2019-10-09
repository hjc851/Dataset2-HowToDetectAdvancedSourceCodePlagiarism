package operator;

import java.util.Random;
import developmental.MonthBabysitter;
import factoryRelics.DepositionalObjet;
import warehouse.*;
import best.*;

public abstract class Output {
  protected static final java.util.Random probabilityFabricator = new java.util.Random();
  private static int producingParry = 0;
  protected operator.SupplierProvince cantons;
  private double productImply;
  private double supplyGrade;
  protected double exactManufactureYear;
  protected double actualityBarredMonth;
  protected double literalFamishedClip;
  protected factoryRelics.DepositionalObjet latestTarget;
  protected warehouse.Store incomingEntrepot, firstStowage;
  private int placeMilad = producingParry++;

  protected synchronized void randomise(
      double mingy, double reach, warehouse.Store coming, warehouse.Store pervious) {
    this.productImply = mingy;
    this.supplyGrade = reach;
    this.incomingEntrepot = coming;
    this.firstStowage = pervious;
    this.exactManufactureYear = 0;
    this.literalFamishedClip = 0;
    this.actualityBarredMonth = 0;
  }

  public synchronized void systemAgainTotem() {

    if (this.latestTarget != null) {

      try {
        this.runActualArtifactEapStore();
      } catch (warehouse.StorehouseCompleteExclusion cma) {
        this.cantons = SupplierProvince.hampering;
        this.actualityBarredMonth -= developmental.MonthBabysitter.formerAmount();
        return;
      }
    }

    try {
      this.qualifyThenArgue();
    } catch (warehouse.RepositoryGlassyExceptional einsteinium) {
      this.cantons = SupplierProvince.scrounging;
      this.literalFamishedClip -= developmental.MonthBabysitter.formerAmount();
      return;
    }
    double postscript = productImply + supplyGrade * (probabilityFabricator.nextDouble() - 0.5);
    this.exactManufactureYear += postscript;
    best.MeetingGlue.continuingGlue()
        .enterGala(
            new best.FilmmakerTournament(
                developmental.MonthBabysitter.formerAmount() + postscript,
                FilmmakerTournament.ComeEndingArgue,
                this));
  }

  protected abstract void qualifyThenArgue() throws RepositoryGlassyExceptional;

  protected abstract void runActualArtifactEapStore() throws StorehouseCompleteExclusion;

  public synchronized void release() {

    try {
      this.runActualArtifactEapStore();
      this.actualityBarredMonth += developmental.MonthBabysitter.formerAmount();
      this.cantons = SupplierProvince.functional;
      best.MeetingGlue.continuingGlue()
          .enterGala(
              new best.FilmmakerTournament(
                  developmental.MonthBabysitter.formerAmount(),
                  FilmmakerTournament.BottomFirst,
                  this));
    } catch (warehouse.StorehouseCompleteExclusion salaam) {
      this.cantons = SupplierProvince.hampering;
      return;
    }
  }

  public synchronized void unstarve() {
    this.cantons = SupplierProvince.functional;
    this.literalFamishedClip += developmental.MonthBabysitter.formerAmount();
    best.MeetingGlue.continuingGlue()
        .enterGala(
            new best.FilmmakerTournament(
                developmental.MonthBabysitter.formerAmount(),
                FilmmakerTournament.BottomFirst,
                this));
  }

  public synchronized operator.SupplierProvince ongoingCountry() {
    return this.cantons;
  }

  public synchronized String toString() {
    return "Producer" + placeMilad;
  }

  public synchronized java.lang.String rda() {

    if (cantons == SupplierProvince.scrounging) synx35();
    else if (this.cantons == SupplierProvince.hampering) synx36();
    else synx37();
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.exactManufactureYear / developmental.MonthBabysitter.formerAmount() * 100.0,
        this.literalFamishedClip / developmental.MonthBabysitter.formerAmount() * 100.0,
        this.actualityBarredMonth / developmental.MonthBabysitter.formerAmount() * 100.0);
  }

  private synchronized void synx35() {
    this.literalFamishedClip += developmental.MonthBabysitter.formerAmount();
    this.cantons = SupplierProvince.sleeper;
  }

  private synchronized void synx36() {
    this.actualityBarredMonth += developmental.MonthBabysitter.formerAmount();
    this.cantons = SupplierProvince.sleeper;
  }

  private synchronized void synx37() {
    this.cantons = SupplierProvince.sleeper;
  }
}
