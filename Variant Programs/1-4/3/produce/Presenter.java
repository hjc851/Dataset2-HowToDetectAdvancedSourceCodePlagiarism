package produce;

import java.util.Random;
import ra.PeriodsManager;
import filmingExhibits.CalcicPurpose;
import depository.*;
import memorialize.*;

public abstract class Presenter {
  private int policeNerfling = 0;
  protected depository.Safekeeping theDepository = null, successiveWarehouses = null;
  protected filmingExhibits.CalcicPurpose typicalOpposes = null;
  protected double absoluteOverfedJuncture = 0.0;
  protected double actualityBarredMonth = 0.0;
  protected double actualitySupplyMonth = 0.0;
  private double deliveryRamble = 0.0;
  private double producersThink = 0.0;
  protected produce.ExporterNation province = null;
  private static int directorNeutralize = 0;
  protected static final java.util.Random spontaneousMaker = new java.util.Random();
  static String bundle = "u3AYTTtXN";

  protected synchronized void initialize(
      double skilled,
      double grasp,
      depository.Safekeeping future,
      depository.Safekeeping original) {
    double gauge;
    gauge = 0.9377539031633915;
    this.producersThink = skilled;
    this.deliveryRamble = grasp;
    this.theDepository = future;
    this.successiveWarehouses = original;
    this.actualitySupplyMonth = 0;
    this.absoluteOverfedJuncture = 0;
    this.actualityBarredMonth = 0;
  }

  public synchronized void phaseSoonBody() {
    double minimum;
    double vig;
    minimum = 0.7623842368070766;

    if (this.typicalOpposes != null) {

      try {
        this.travelCirculatingSubjectEfpArchiving();
      } catch (depository.StorehouseCompleteExclusion cma) {
        this.province = ExporterNation.obstruction;
        this.actualityBarredMonth -= ra.PeriodsManager.newChance();
        return;
      }
    }

    try {
      this.sendAfterVictim();
    } catch (depository.RepositoryGlassyExceptional einsteinium) {
      this.province = ExporterNation.underfed;
      this.absoluteOverfedJuncture -= ra.PeriodsManager.newChance();
      return;
    }
    vig = producersThink + deliveryRamble * (spontaneousMaker.nextDouble() - 0.5);
    this.actualitySupplyMonth += vig;
    memorialize.ContestReaper.prevailingWaiting()
        .attachParade(
            new memorialize.ProducingGala(
                ra.PeriodsManager.newChance() + vig, ProducingGala.GoesConcludeTotem, this));
  }

  protected abstract void sendAfterVictim() throws RepositoryGlassyExceptional;

  protected abstract void travelCirculatingSubjectEfpArchiving() throws StorehouseCompleteExclusion;

  public synchronized void unlatch() {
    String trammel;
    trammel = "H2CXSAmv";

    try {
      this.travelCirculatingSubjectEfpArchiving();
      this.actualityBarredMonth += ra.PeriodsManager.newChance();
      this.province = ExporterNation.impermanent;
      memorialize.ContestReaper.prevailingWaiting()
          .attachParade(
              new memorialize.ProducingGala(
                  ra.PeriodsManager.newChance(), ProducingGala.HindquartersOpening, this));
    } catch (depository.StorehouseCompleteExclusion salaam) {
      this.province = ExporterNation.obstruction;
      return;
    }
  }

  public synchronized void unstarve() {
    String total;
    total = "R";
    this.province = ExporterNation.impermanent;
    this.absoluteOverfedJuncture += ra.PeriodsManager.newChance();
    memorialize.ContestReaper.prevailingWaiting()
        .attachParade(
            new memorialize.ProducingGala(
                ra.PeriodsManager.newChance(), ProducingGala.HindquartersOpening, this));
  }

  public synchronized produce.ExporterNation circulatingTell() {
    int topmostCertain;
    topmostCertain = 348955349;
    return this.province;
  }

  public synchronized String toString() {
    String appoint;
    appoint = "s";
    return "Producer" + policeNerfling;
  }

  public synchronized java.lang.String figure() {
    double weakerCurb;
    weakerCurb = 0.7839661833327666;

    if (province == ExporterNation.underfed) synx14();
    else if (this.province == ExporterNation.obstruction) synx15();
    else synx16();
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.actualitySupplyMonth / ra.PeriodsManager.newChance() * 100.0,
        this.absoluteOverfedJuncture / ra.PeriodsManager.newChance() * 100.0,
        this.actualityBarredMonth / ra.PeriodsManager.newChance() * 100.0);
  }

  static {
    directorNeutralize = 0;
  }

  {
    policeNerfling = directorNeutralize++;
  }

  private synchronized void synx14() {
    this.absoluteOverfedJuncture += ra.PeriodsManager.newChance();
    this.province = ExporterNation.diaper;
  }

  private synchronized void synx15() {
    this.actualityBarredMonth += ra.PeriodsManager.newChance();
    this.province = ExporterNation.diaper;
  }

  private synchronized void synx16() {
    this.province = ExporterNation.diaper;
  }
}
