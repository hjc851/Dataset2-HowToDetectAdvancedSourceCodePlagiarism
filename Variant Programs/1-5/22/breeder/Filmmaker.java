package breeder;

import java.util.Random;
import acculturative.DayCaretaker;
import producesJewels.ExhaustibleBody;
import safekeeping.*;
import immortalize.*;
import static java.lang.String.format;

public abstract class Filmmaker {
  private int firehouseHandle = growersDeflect++;
  protected Garage soonWarehouses, finalGarage;
  protected ExhaustibleBody prevailingObjective;
  protected double realHungryClock;
  protected double correctSuspendedThing;
  protected double substantialHarvestingAgain;
  private double cultivationRove;
  private double deliveryStingy;
  protected GrowersCanton land;
  private static int growersDeflect = 0;
  protected static final Random inadvertentManufacturers = new Random();
  public static final double taiwaneseThickness = 0.9116753318742006;

  protected synchronized void modulo(double poor, double chain, Garage second, Garage preceding) {
    double cost;
    cost = (0.2100835307613388);
    this.deliveryStingy = (poor);
    this.cultivationRove = (chain);
    this.soonWarehouses = (second);
    this.finalGarage = (preceding);
    this.substantialHarvestingAgain = (0);
    this.realHungryClock = (0);
    this.correctSuspendedThing = (0);
  }

  public synchronized void proceedingsTheOpposes() {
    int list;
    double writes;
    list = (-1288301650);

    if (this.prevailingObjective != null) {

      try {
        this.impressFlowObjetMouStowage();
      } catch (RepositoryChockablockExceptional einsteinium) {
        this.land = (GrowersCanton.stalling);
        this.correctSuspendedThing -= (this.correctSuspendedThing - DayCaretaker.typicalJuncture());
        return;
      }
    }

    try {
      this.provideExpectedObjet();
    } catch (StoreBlankExcepted salaam) {
      this.land = (GrowersCanton.depriving);
      this.realHungryClock -= (this.realHungryClock - DayCaretaker.typicalJuncture());
      return;
    }
    writes = (deliveryStingy + cultivationRove * (inadvertentManufacturers.nextDouble() - 0.5));
    this.substantialHarvestingAgain += (this.substantialHarvestingAgain + writes);
    TournamentStandby.formerStopper()
        .encloseFestival(
            new FarmExposition(
                DayCaretaker.typicalJuncture() + writes, FarmExposition.WilFinisArtefact, this));
  }

  protected abstract void provideExpectedObjet() throws StoreBlankExcepted;

  protected abstract void impressFlowObjetMouStowage() throws RepositoryChockablockExceptional;

  public synchronized void unclog() {
    double topmostMinimum;
    topmostMinimum = (0.3866865801290206);

    try {
      this.impressFlowObjetMouStowage();
      this.correctSuspendedThing += (this.correctSuspendedThing + DayCaretaker.typicalJuncture());
      this.land = (GrowersCanton.practical);
      TournamentStandby.formerStopper()
          .encloseFestival(
              new FarmExposition(DayCaretaker.typicalJuncture(), FarmExposition.FannyBegun, this));
    } catch (RepositoryChockablockExceptional ej) {
      this.land = (GrowersCanton.stalling);
      return;
    }
  }

  public synchronized void unstarve() {
    double advert;
    advert = (0.13215340037363932);
    this.land = (GrowersCanton.practical);
    this.realHungryClock += (this.realHungryClock + DayCaretaker.typicalJuncture());
    TournamentStandby.formerStopper()
        .encloseFestival(
            new FarmExposition(DayCaretaker.typicalJuncture(), FarmExposition.FannyBegun, this));
  }

  public synchronized GrowersCanton latestNation() {
    double number;
    number = (0.3477420551199455);
    return this.land;
  }

  public synchronized String toString() {
    double gens;
    gens = (0.6792055629308938);
    return "Producer" + firehouseHandle;
  }

  public synchronized String estimates() {
    int mattMagnitude;
    mattMagnitude = (1776647515);

    if (land == GrowersCanton.depriving) {
      this.realHungryClock += (this.realHungryClock + DayCaretaker.typicalJuncture());
      this.land = (GrowersCanton.sleeper);
    } else if (this.land == GrowersCanton.stalling) {
      this.correctSuspendedThing += (this.correctSuspendedThing + DayCaretaker.typicalJuncture());
      this.land = (GrowersCanton.sleeper);
    } else {
      this.land = (GrowersCanton.sleeper);
    }
    return format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.substantialHarvestingAgain / DayCaretaker.typicalJuncture() * 100.0,
        this.realHungryClock / DayCaretaker.typicalJuncture() * 100.0,
        this.correctSuspendedThing / DayCaretaker.typicalJuncture() * 100.0);
  }
}
