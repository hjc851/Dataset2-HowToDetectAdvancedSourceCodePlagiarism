package operator;

import java.util.Random;
import depositional.PeriodWarden;
import developmentElements.NeocomianElement;
import depot.*;
import show.*;

public abstract class Manufacturer {
  private static final int synX2757int = 0;
  private static final double synX2756double = 100.0;
  private static final double synX2755double = 100.0;
  private static final double synX2754double = 100.0;
  private static final String synX2753String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private static final double synX2752double = 0.8343006400345492;
  private static final String synX2751String = "Producer";
  private static final double synX2750double = 0.1024577331784694;
  private static final double synX2749double = 0.511966490518644;
  private static final double synX2748double = 0.612440368475638;
  private static final double synX2747double = 0.7819041400940681;
  private static final double synX2746double = 0.5;
  private static final double synX2745double = 0.882232806003606;
  private static final int synX2744int = 0;
  private static final int synX2743int = 0;
  private static final int synX2742int = 0;
  private static final String synX2741String = "I48r";
  private int outpostFinger = 0;
  protected depot.Memory futureStorehouse = null, recordRepository = null;
  protected developmentElements.NeocomianElement thisArgue = null;
  protected double currentDeprivedDay = 0.0;
  protected double correctSuspendedThing = 0.0;
  protected double exactManufactureYear = 0.0;
  private double fabricationGraze = 0.0;
  private double manufacturedBase = 0.0;
  protected operator.ProducingPublic tell = null;
  private static int fabricatorCurb = 0;
  protected static final java.util.Random indiscriminateSupplier = new java.util.Random();
  static double backCurtail = 0.07811378909866196;

  protected synchronized void configure(
      double intend, double chain, depot.Memory soon, depot.Memory successive) {
    String restricts;
    restricts = synX2741String;
    this.manufacturedBase = intend;
    this.fabricationGraze = chain;
    this.futureStorehouse = soon;
    this.recordRepository = successive;
    this.exactManufactureYear = synX2742int;
    this.currentDeprivedDay = synX2743int;
    this.correctSuspendedThing = synX2744int;
  }

  public synchronized void litigateIncomingItem() {
    double higherChained;
    double writes;
    higherChained = synX2745double;

    if (this.thisArgue != null) {

      try {
        this.pushExistingPurposeOfficesArchival();
      } catch (depot.WarehousesOverfullExempted samad) {
        this.tell = ProducingPublic.blockage;
        this.correctSuspendedThing -= depositional.PeriodWarden.rifeWhen();
        return;
      }
    }

    try {
      this.encounterUpcomingCavil();
    } catch (depot.SpacePlunderedWaiver salaam) {
      this.tell = ProducingPublic.malnourished;
      this.currentDeprivedDay -= depositional.PeriodWarden.rifeWhen();
      return;
    }
    writes =
        manufacturedBase
            + fabricationGraze * (indiscriminateSupplier.nextDouble() - synX2746double);
    this.exactManufactureYear += writes;
    show.ExtravaganzaWait.contemporaryList()
        .injectedGathering(
            new show.FarmExposition(
                depositional.PeriodWarden.rifeWhen() + writes,
                FarmExposition.WilFinisArtefact,
                this));
  }

  protected abstract void encounterUpcomingCavil() throws SpacePlunderedWaiver;

  protected abstract void pushExistingPurposeOfficesArchival() throws WarehousesOverfullExempted;

  public synchronized void unlatch() {
    double across;
    across = synX2747double;

    try {
      this.pushExistingPurposeOfficesArchival();
      this.correctSuspendedThing += depositional.PeriodWarden.rifeWhen();
      this.tell = ProducingPublic.serving;
      show.ExtravaganzaWait.contemporaryList()
          .injectedGathering(
              new show.FarmExposition(
                  depositional.PeriodWarden.rifeWhen(), FarmExposition.DerriereBegins, this));
    } catch (depot.WarehousesOverfullExempted ye) {
      this.tell = ProducingPublic.blockage;
      return;
    }
  }

  public synchronized void unstarve() {
    double positionFoods;
    positionFoods = synX2748double;
    this.tell = ProducingPublic.serving;
    this.currentDeprivedDay += depositional.PeriodWarden.rifeWhen();
    show.ExtravaganzaWait.contemporaryList()
        .injectedGathering(
            new show.FarmExposition(
                depositional.PeriodWarden.rifeWhen(), FarmExposition.DerriereBegins, this));
  }

  public synchronized operator.ProducingPublic rifeExpress() {
    double speedRestrain;
    speedRestrain = synX2749double;
    return this.tell;
  }

  public synchronized String toString() {
    double asset;
    asset = synX2750double;
    return synX2751String + outpostFinger;
  }

  public synchronized java.lang.String stats() {
    double enchained;
    enchained = synX2752double;

    if (tell == ProducingPublic.malnourished) {
      this.currentDeprivedDay += depositional.PeriodWarden.rifeWhen();
      this.tell = ProducingPublic.couch;
    } else if (this.tell == ProducingPublic.blockage) {
      this.correctSuspendedThing += depositional.PeriodWarden.rifeWhen();
      this.tell = ProducingPublic.couch;
    } else {
      this.tell = ProducingPublic.couch;
    }
    return java.lang.String.format(
        synX2753String,
        this,
        this.exactManufactureYear / depositional.PeriodWarden.rifeWhen() * synX2754double,
        this.currentDeprivedDay / depositional.PeriodWarden.rifeWhen() * synX2755double,
        this.correctSuspendedThing / depositional.PeriodWarden.rifeWhen() * synX2756double);
  }

  static {
    fabricatorCurb = synX2757int;
  }

  {
    outpostFinger = fabricatorCurb++;
  }
}
