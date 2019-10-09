package grower;

import java.util.Random;
import said.BeginningHousekeeper;
import producesJewels.DepositionalObjet;
import safekeeping.*;
import tape.*;

public abstract class Output {
  private int firehouseHandle = presenterAnticipate++;
  protected safekeeping.Store lastStored = null, lateMemory = null;
  protected producesJewels.DepositionalObjet thisArgue = null;
  protected double currentDeprivedDay = 0.0;
  protected double trueBlockadedMeter = 0.0;
  protected double absoluteIndustrializationJuncture = 0.0;
  private double supplyGrade = 0.0;
  private double factoryIntend = 0.0;
  protected grower.ProviderForeign sovereign = null;
  private static int presenterAnticipate = 0;
  protected static final java.util.Random selectiveOperator = new java.util.Random();

  protected synchronized void randomizing(
      double stingy, double crop, safekeeping.Store again, safekeeping.Store recent) {
    this.factoryIntend = stingy;
    this.supplyGrade = crop;
    this.lastStored = again;
    this.lateMemory = recent;
    this.absoluteIndustrializationJuncture = 0;
    this.currentDeprivedDay = 0;
    this.trueBlockadedMeter = 0;
  }

  public synchronized void appendageLaterResist() {
    double cern;

    if (this.thisArgue != null) {

      try {
        this.motionTopicalResistEapsDisk();
      } catch (safekeeping.WarehousesOverfullExempted samad) {
        this.sovereign = ProviderForeign.clogging;
        this.trueBlockadedMeter -= said.BeginningHousekeeper.streamWeek();
        return;
      }
    }

    try {
      this.welcomeSucceedingArtifact();
    } catch (safekeeping.SafekeepingCleanDerogate einsteinium) {
      this.sovereign = ProviderForeign.neglecting;
      this.currentDeprivedDay -= said.BeginningHousekeeper.streamWeek();
      return;
    }
    cern = factoryIntend + supplyGrade * (selectiveOperator.nextDouble() - 0.5);
    this.absoluteIndustrializationJuncture += cern;
    tape.CelebrationBacklog.presentDragon()
        .incorporateTriathlon(
            new tape.ProductionFestival(
                said.BeginningHousekeeper.streamWeek() + cern,
                ProductionFestival.NowPoleMatter,
                this));
  }

  protected abstract void welcomeSucceedingArtifact() throws SafekeepingCleanDerogate;

  protected abstract void motionTopicalResistEapsDisk() throws WarehousesOverfullExempted;

  public synchronized void lift() {

    try {
      this.motionTopicalResistEapsDisk();
      this.trueBlockadedMeter += said.BeginningHousekeeper.streamWeek();
      this.sovereign = ProviderForeign.collaborating;
      tape.CelebrationBacklog.presentDragon()
          .incorporateTriathlon(
              new tape.ProductionFestival(
                  said.BeginningHousekeeper.streamWeek(), ProductionFestival.FannyBegun, this));
    } catch (safekeeping.WarehousesOverfullExempted cma) {
      this.sovereign = ProviderForeign.clogging;
      return;
    }
  }

  public synchronized void unstarve() {
    this.sovereign = ProviderForeign.collaborating;
    this.currentDeprivedDay += said.BeginningHousekeeper.streamWeek();
    tape.CelebrationBacklog.presentDragon()
        .incorporateTriathlon(
            new tape.ProductionFestival(
                said.BeginningHousekeeper.streamWeek(), ProductionFestival.FannyBegun, this));
  }

  public synchronized grower.ProviderForeign existingSovereign() {
    return this.sovereign;
  }

  public synchronized String toString() {
    return "Producer" + firehouseHandle;
  }

  public synchronized java.lang.String digit() {

    if (sovereign == ProviderForeign.neglecting) {
      this.currentDeprivedDay += said.BeginningHousekeeper.streamWeek();
      this.sovereign = ProviderForeign.hibernating;
    } else if (this.sovereign == ProviderForeign.clogging) {
      this.trueBlockadedMeter += said.BeginningHousekeeper.streamWeek();
      this.sovereign = ProviderForeign.hibernating;
    } else {
      this.sovereign = ProviderForeign.hibernating;
    }
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.absoluteIndustrializationJuncture / said.BeginningHousekeeper.streamWeek() * 100.0,
        this.currentDeprivedDay / said.BeginningHousekeeper.streamWeek() * 100.0,
        this.trueBlockadedMeter / said.BeginningHousekeeper.streamWeek() * 100.0);
  }
}
