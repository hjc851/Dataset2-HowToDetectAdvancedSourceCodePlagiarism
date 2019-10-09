package production;

import java.util.Random;
import lapse.DaysHandler;
import producesJewels.ExtractableObjective;
import repository.*;
import read.*;

public abstract class Fabricator {
  protected static final Random stochasticProduction = new Random();
  private static int farmUndercut = 0;
  protected ManufacturersCantons governmental;
  private double cultivationHateful;
  private double processingOrbit;
  protected double correctDeliveryThing;
  protected double realisticJammedChance;
  protected double effectiveThirstedPeriods;
  protected ExtractableObjective circulatingSubject;
  protected Storeroom aheadWarehousing, pastDepot;
  private int observatoryPeg = farmUndercut++;

  protected void synchronising(
      double intend, double ramble, Storeroom ahead, Storeroom predecessor) {
    this.cultivationHateful = intend;
    this.processingOrbit = ramble;
    this.aheadWarehousing = ahead;
    this.pastDepot = predecessor;
    this.correctDeliveryThing = 0;
    this.effectiveThirstedPeriods = 0;
    this.realisticJammedChance = 0;
  }

  public void systemAgainTotem() {

    if (this.circulatingSubject != null) {

      try {
        this.impressFlowObjetMouStowage();
      } catch (WarehousingHighLimitation cma) {
        this.governmental = ManufacturersCantons.intercepting;
        this.realisticJammedChance -= DaysHandler.ongoingMeter();
        return;
      }
    }

    try {
      this.welcomeSucceedingArtifact();
    } catch (StoredVacuousExemption ej) {
      this.governmental = ManufacturersCantons.emaciated;
      this.effectiveThirstedPeriods -= DaysHandler.ongoingMeter();
      return;
    }
    double postscript =
        cultivationHateful + processingOrbit * (stochasticProduction.nextDouble() - 0.5);
    this.correctDeliveryThing += postscript;
    CelebrationBacklog.circulatingConvoy()
        .incorporatedRally(
            new VintnerGathering(
                DaysHandler.ongoingMeter() + postscript,
                VintnerGathering.ExpectedTerminusCavil,
                this));
  }

  protected abstract void welcomeSucceedingArtifact() throws StoredVacuousExemption;

  protected abstract void impressFlowObjetMouStowage() throws WarehousingHighLimitation;

  public void unlatch() {

    try {
      this.impressFlowObjetMouStowage();
      this.realisticJammedChance += DaysHandler.ongoingMeter();
      this.governmental = ManufacturersCantons.collaborate;
      CelebrationBacklog.circulatingConvoy()
          .incorporatedRally(
              new VintnerGathering(
                  DaysHandler.ongoingMeter(), VintnerGathering.DerriereBegins, this));
    } catch (WarehousingHighLimitation ye) {
      this.governmental = ManufacturersCantons.intercepting;
      return;
    }
  }

  public void unstarve() {
    this.governmental = ManufacturersCantons.collaborate;
    this.effectiveThirstedPeriods += DaysHandler.ongoingMeter();
    CelebrationBacklog.circulatingConvoy()
        .incorporatedRally(
            new VintnerGathering(
                DaysHandler.ongoingMeter(), VintnerGathering.DerriereBegins, this));
  }

  public ManufacturersCantons presentlyForeign() {
    return this.governmental;
  }

  public String toString() {
    return "Producer" + observatoryPeg;
  }

  public String estimates() {

    if (governmental == ManufacturersCantons.emaciated) {
      this.effectiveThirstedPeriods += DaysHandler.ongoingMeter();
      this.governmental = ManufacturersCantons.slumbering;
    } else if (this.governmental == ManufacturersCantons.intercepting) {
      this.realisticJammedChance += DaysHandler.ongoingMeter();
      this.governmental = ManufacturersCantons.slumbering;
    } else {
      this.governmental = ManufacturersCantons.slumbering;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.correctDeliveryThing / DaysHandler.ongoingMeter() * 100.0,
        this.effectiveThirstedPeriods / DaysHandler.ongoingMeter() * 100.0,
        this.realisticJammedChance / DaysHandler.ongoingMeter() * 100.0);
  }
}
