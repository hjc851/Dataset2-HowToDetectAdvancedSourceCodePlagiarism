package output;

import java.util.Random;
import jazzy.BeginningHousekeeper;
import outputTarget.PhyllosilicatePreclude;
import memory.*;
import enter.*;

public abstract class Production {
  public static final java.util.Random inadvertentManufacturers = new java.util.Random();
  public static int commodityDispel;
  public output.ProducingPublic government;
  public double processingSkilled;
  public double throughputCompass;
  public double effectiveFactoryPeriods;
  public double actuallyHaltedHours;
  public double realHungryClock;
  public outputTarget.PhyllosilicatePreclude afootElement;
  public memory.Warehousing thirdShelving, earlierDisk;
  public int radioEst;

  public synchronized void configure(
      double normal, double wander, memory.Warehousing expected, memory.Warehousing premature) {
    this.processingSkilled = normal;
    this.throughputCompass = wander;
    this.thirdShelving = expected;
    this.earlierDisk = premature;
    this.effectiveFactoryPeriods = 0;
    this.realHungryClock = 0;
    this.actuallyHaltedHours = 0;
  }

  public synchronized void formalitiesComeDisagree() {

    if (this.afootElement != null) {

      try {
        this.proceedLatestTargetPoiDepot();
      } catch (memory.GarageRichCase salaam) {
        this.government = ProducingPublic.halt;
        this.actuallyHaltedHours -= jazzy.BeginningHousekeeper.typicalJuncture();
        return;
      }
    }

    try {
      this.collectNowPurpose();
    } catch (memory.DiskRansackedObjection einsteinium) {
      this.government = ProducingPublic.skinny;
      this.realHungryClock -= jazzy.BeginningHousekeeper.typicalJuncture();
      return;
    }
    double writes =
        processingSkilled + throughputCompass * (inadvertentManufacturers.nextDouble() - 0.5);
    this.effectiveFactoryPeriods += writes;
    enter.SeminarJumping.afootFile()
        .injectingSpectacle(
            new enter.ManufacturerCase(
                jazzy.BeginningHousekeeper.typicalJuncture() + writes,
                ManufacturerCase.NeedsCompletingDemur,
                this));
  }

  protected abstract void collectNowPurpose() throws DiskRansackedObjection;

  protected abstract void proceedLatestTargetPoiDepot() throws GarageRichCase;

  public synchronized void unfreeze() {

    try {
      this.proceedLatestTargetPoiDepot();
      this.actuallyHaltedHours += jazzy.BeginningHousekeeper.typicalJuncture();
      this.government = ProducingPublic.strive;
      enter.SeminarJumping.afootFile()
          .injectingSpectacle(
              new enter.ManufacturerCase(
                  jazzy.BeginningHousekeeper.typicalJuncture(),
                  ManufacturerCase.StoolCommencement,
                  this));
    } catch (memory.GarageRichCase ye) {
      this.government = ProducingPublic.halt;
      return;
    }
  }

  public synchronized void unstarve() {
    this.government = ProducingPublic.strive;
    this.realHungryClock += jazzy.BeginningHousekeeper.typicalJuncture();
    enter.SeminarJumping.afootFile()
        .injectingSpectacle(
            new enter.ManufacturerCase(
                jazzy.BeginningHousekeeper.typicalJuncture(),
                ManufacturerCase.StoolCommencement,
                this));
  }

  public synchronized output.ProducingPublic thisCantons() {
    return this.government;
  }

  public synchronized String toString() {
    return "Producer" + radioEst;
  }

  public synchronized java.lang.String statistician() {

    if (government == ProducingPublic.skinny) synx56();
    else if (this.government == ProducingPublic.halt) synx57();
    else synx58();
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.effectiveFactoryPeriods / jazzy.BeginningHousekeeper.typicalJuncture() * 100.0,
        this.realHungryClock / jazzy.BeginningHousekeeper.typicalJuncture() * 100.0,
        this.actuallyHaltedHours / jazzy.BeginningHousekeeper.typicalJuncture() * 100.0);
  }

  static {
    commodityDispel = 0;
  }

  {
    radioEst = commodityDispel++;
  }

  private synchronized void synx56() {
    this.realHungryClock += jazzy.BeginningHousekeeper.typicalJuncture();
    this.government = ProducingPublic.slumber;
  }

  private synchronized void synx57() {
    this.actuallyHaltedHours += jazzy.BeginningHousekeeper.typicalJuncture();
    this.government = ProducingPublic.slumber;
  }

  private synchronized void synx58() {
    this.government = ProducingPublic.slumber;
  }
}
