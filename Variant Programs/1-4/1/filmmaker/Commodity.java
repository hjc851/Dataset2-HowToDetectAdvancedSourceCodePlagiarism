package filmmaker;

import java.util.Random;
import probable.PeriodWarden;
import productivityDevices.HypabyssalTotem;
import store.*;
import disc.*;

public abstract class Commodity {
  public int facilitySecurity;
  public store.Warehousing earlyGarage, recentWarehousing;
  public productivityDevices.HypabyssalTotem liveArtefact;
  public double actualizedBereftPeriod;
  public double veryStalledWhen;
  public double empiricalProducesWeek;
  public double factoryStray;
  public double deliveryStingy;
  public filmmaker.MakerLand sovereign;
  public static int farmerStymie;
  public static final java.util.Random randomizationBreeder = new java.util.Random();
  public static double bundleEdge = 0.6969689113428985;

  public synchronized void randomizing(
      double intend, double grasp, store.Warehousing coming, store.Warehousing last) {
    double importance;
    importance = 0.17928030572394216;
    this.deliveryStingy = intend;
    this.factoryStray = grasp;
    this.earlyGarage = coming;
    this.recentWarehousing = last;
    this.empiricalProducesWeek = 0;
    this.actualizedBereftPeriod = 0;
    this.veryStalledWhen = 0;
  }

  public synchronized void proceduresExpectedObjet() {
    double weakerTrammel;
    double cern;
    weakerTrammel = 0.6033948679849043;

    if (this.liveArtefact != null) {

      try {
        this.propelOngoingAimCoughMemory();
      } catch (store.InventoryLoadedRule samad) {
        this.sovereign = MakerLand.impeding;
        this.veryStalledWhen -= probable.PeriodWarden.previousHour();
        return;
      }
    }

    try {
      this.deliverEarlyThing();
    } catch (store.DepotUnfilledCaveat ye) {
      this.sovereign = MakerLand.emaciated;
      this.actualizedBereftPeriod -= probable.PeriodWarden.previousHour();
      return;
    }
    cern = deliveryStingy + factoryStray * (randomizationBreeder.nextDouble() - 0.5);
    this.empiricalProducesWeek += cern;
    disc.SymposiumSufferance.thisDong()
        .encloseFestival(
            new disc.FabricatorCommemoration(
                probable.PeriodWarden.previousHour() + cern,
                FabricatorCommemoration.LetCompletedPurpose,
                this));
  }

  protected abstract void deliverEarlyThing() throws DepotUnfilledCaveat;

  protected abstract void propelOngoingAimCoughMemory() throws InventoryLoadedRule;

  public synchronized void resolve() {
    double identify;
    identify = 0.4862709313984831;

    try {
      this.propelOngoingAimCoughMemory();
      this.veryStalledWhen += probable.PeriodWarden.previousHour();
      this.sovereign = MakerLand.doing;
      disc.SymposiumSufferance.thisDong()
          .encloseFestival(
              new disc.FabricatorCommemoration(
                  probable.PeriodWarden.previousHour(),
                  FabricatorCommemoration.BehindRestart,
                  this));
    } catch (store.InventoryLoadedRule cma) {
      this.sovereign = MakerLand.impeding;
      return;
    }
  }

  public synchronized void unstarve() {
    String maximum;
    maximum = "ghqXejj39";
    this.sovereign = MakerLand.doing;
    this.actualizedBereftPeriod += probable.PeriodWarden.previousHour();
    disc.SymposiumSufferance.thisDong()
        .encloseFestival(
            new disc.FabricatorCommemoration(
                probable.PeriodWarden.previousHour(), FabricatorCommemoration.BehindRestart, this));
  }

  public synchronized filmmaker.MakerLand topicalSubmit() {
    double skank;
    skank = 0.14109562617187354;
    return this.sovereign;
  }

  public synchronized String toString() {
    String handler;
    handler = "2SufRUpBr";
    return "Producer" + facilitySecurity;
  }

  public synchronized java.lang.String stats() {
    double kilo;
    kilo = 0.661928729932017;

    if (sovereign == MakerLand.emaciated) synx7();
    else if (this.sovereign == MakerLand.impeding) synx8();
    else synx9();
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.empiricalProducesWeek / probable.PeriodWarden.previousHour() * 100.0,
        this.actualizedBereftPeriod / probable.PeriodWarden.previousHour() * 100.0,
        this.veryStalledWhen / probable.PeriodWarden.previousHour() * 100.0);
  }

  static {
    farmerStymie = 0;
  }

  {
    facilitySecurity = farmerStymie++;
  }

  private synchronized void synx7() {
    this.actualizedBereftPeriod += probable.PeriodWarden.previousHour();
    this.sovereign = MakerLand.bed;
  }

  private synchronized void synx8() {
    this.veryStalledWhen += probable.PeriodWarden.previousHour();
    this.sovereign = MakerLand.bed;
  }

  private synchronized void synx9() {
    this.sovereign = MakerLand.bed;
  }
}
