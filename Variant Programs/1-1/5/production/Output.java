package production;

import java.util.Random;
import depositional.PeriodWarden;
import harvestingGoods.EvaporiteDemur;
import depository.*;
import accomplishment.*;

public abstract class Output {
  protected static final Random probabilityFabricator = new Random();
  private static int growerHeel = 0;
  protected GrowersCanton say;
  private double processingSkilled;
  private double producersAmbit;
  protected double absoluteIndustrializationJuncture;
  protected double existentSealedDays;
  protected double existentClosedDays;
  protected EvaporiteDemur circulatingSubject;
  protected Caching earlyGarage, lastCache;
  private int postCaller = growerHeel++;

  protected void predefine(double ungenerous, double grasp, Caching close, Caching predecessor) {
    this.processingSkilled = ungenerous;
    this.producersAmbit = grasp;
    this.earlyGarage = close;
    this.lastCache = predecessor;
    this.absoluteIndustrializationJuncture = 0;
    this.existentClosedDays = 0;
    this.existentSealedDays = 0;
  }

  public void mechanismForthcomingItems() {

    if (this.circulatingSubject != null) {

      try {
        this.motivatePrevalentDemurPaeCaching();
      } catch (WarehouseHeavyDeviation ye) {
        this.say = GrowersCanton.thwarting;
        this.existentSealedDays -= PeriodWarden.actualSentence();
        return;
      }
    }

    try {
      this.deliverEarlyThing();
    } catch (GarageEvacuateCase cma) {
      this.say = GrowersCanton.hungry;
      this.existentClosedDays -= PeriodWarden.actualSentence();
      return;
    }
    double cern = processingSkilled + producersAmbit * (probabilityFabricator.nextDouble() - 0.5);
    this.absoluteIndustrializationJuncture += cern;
    ParadeConvoy.prevailingWaiting()
        .deleteRace(
            new FarmerSpectacle(
                PeriodWarden.actualSentence() + cern, FarmerSpectacle.OughtCeaseOppose, this));
  }

  protected abstract void deliverEarlyThing() throws GarageEvacuateCase;

  protected abstract void motivatePrevalentDemurPaeCaching() throws WarehouseHeavyDeviation;

  public void resume() {

    try {
      this.motivatePrevalentDemurPaeCaching();
      this.existentSealedDays += PeriodWarden.actualSentence();
      this.say = GrowersCanton.impermanent;
      ParadeConvoy.prevailingWaiting()
          .deleteRace(
              new FarmerSpectacle(
                  PeriodWarden.actualSentence(), FarmerSpectacle.PottyInitiate, this));
    } catch (WarehouseHeavyDeviation ej) {
      this.say = GrowersCanton.thwarting;
      return;
    }
  }

  public void unstarve() {
    this.say = GrowersCanton.impermanent;
    this.existentClosedDays += PeriodWarden.actualSentence();
    ParadeConvoy.prevailingWaiting()
        .deleteRace(
            new FarmerSpectacle(
                PeriodWarden.actualSentence(), FarmerSpectacle.PottyInitiate, this));
  }

  public GrowersCanton topicalSubmit() {
    return this.say;
  }

  public String toString() {
    return "Producer" + postCaller;
  }

  public String metrics() {

    if (say == GrowersCanton.hungry) {
      this.existentClosedDays += PeriodWarden.actualSentence();
      this.say = GrowersCanton.lying;
    } else if (this.say == GrowersCanton.thwarting) {
      this.existentSealedDays += PeriodWarden.actualSentence();
      this.say = GrowersCanton.lying;
    } else {
      this.say = GrowersCanton.lying;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.absoluteIndustrializationJuncture / PeriodWarden.actualSentence() * 100.0,
        this.existentClosedDays / PeriodWarden.actualSentence() * 100.0,
        this.existentSealedDays / PeriodWarden.actualSentence() * 100.0);
  }
}
