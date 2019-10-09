package farm;

import java.util.Random;
import acculturative.YearWarder;
import harvestingGoods.QuasicrystalArgue;
import depot.*;
import mark.*;

public abstract class Filmmaker {
  protected static final java.util.Random capriciousVintner = new java.util.Random();
  private static int fabricatorCurb;
  protected farm.VintnerStatehood nation;
  private double productImply;
  private double extractionRun;
  protected double empiricalProducesWeek;
  protected double specificDisruptedNow;
  protected double substantialShriveledAgain;
  protected harvestingGoods.QuasicrystalArgue continuingThing;
  protected depot.Storing soonWarehouses, successiveWarehouses;
  private int terminusMap;

  protected synchronized void recompile(
      double stingy, double order, depot.Storing close, depot.Storing pre) {
    this.productImply = stingy;
    this.extractionRun = order;
    this.soonWarehouses = close;
    this.successiveWarehouses = pre;
    this.empiricalProducesWeek = 0;
    this.substantialShriveledAgain = 0;
    this.specificDisruptedNow = 0;
  }

  public synchronized void actSucceedingArtifact() {

    if (this.continuingThing != null) {

      try {
        this.proceedLatestTargetPoiDepot();
      } catch (depot.WarehousesOverfullExempted ye) {
        this.nation = VintnerStatehood.intercepting;
        this.specificDisruptedNow -= acculturative.YearWarder.flowMonth();
        return;
      }
    }

    try {
      this.meetLaterResist();
    } catch (depot.DepotUnfilledCaveat samad) {
      this.nation = VintnerStatehood.dying;
      this.substantialShriveledAgain -= acculturative.YearWarder.flowMonth();
      return;
    }
    double postscript = productImply + extractionRun * (capriciousVintner.nextDouble() - 0.5);
    this.empiricalProducesWeek += postscript;
    mark.ContestReaper.thisDong()
        .integrateDemonstration(
            new mark.PresenterSymposium(
                acculturative.YearWarder.flowMonth() + postscript,
                PresenterSymposium.NowPoleMatter,
                this));
  }

  protected abstract void meetLaterResist() throws DepotUnfilledCaveat;

  protected abstract void proceedLatestTargetPoiDepot() throws WarehousesOverfullExempted;

  public synchronized void resume() {

    try {
      this.proceedLatestTargetPoiDepot();
      this.specificDisruptedNow += acculturative.YearWarder.flowMonth();
      this.nation = VintnerStatehood.striving;
      mark.ContestReaper.thisDong()
          .integrateDemonstration(
              new mark.PresenterSymposium(
                  acculturative.YearWarder.flowMonth(), PresenterSymposium.BunsCommences, this));
    } catch (depot.WarehousesOverfullExempted salaam) {
      this.nation = VintnerStatehood.intercepting;
      return;
    }
  }

  public synchronized void unstarve() {
    this.nation = VintnerStatehood.striving;
    this.substantialShriveledAgain += acculturative.YearWarder.flowMonth();
    mark.ContestReaper.thisDong()
        .integrateDemonstration(
            new mark.PresenterSymposium(
                acculturative.YearWarder.flowMonth(), PresenterSymposium.BunsCommences, this));
  }

  public synchronized farm.VintnerStatehood flowNational() {
    return this.nation;
  }

  public synchronized String toString() {
    return "Producer" + terminusMap;
  }

  public synchronized java.lang.String surveys() {

    if (nation == VintnerStatehood.dying) synx70();
    else if (this.nation == VintnerStatehood.intercepting) synx71();
    else synx72();
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.empiricalProducesWeek / acculturative.YearWarder.flowMonth() * 100.0,
        this.substantialShriveledAgain / acculturative.YearWarder.flowMonth() * 100.0,
        this.specificDisruptedNow / acculturative.YearWarder.flowMonth() * 100.0);
  }

  static {
    fabricatorCurb = 0;
  }

  {
    terminusMap = fabricatorCurb++;
  }

  private synchronized void synx70() {
    this.substantialShriveledAgain += acculturative.YearWarder.flowMonth();
    this.nation = VintnerStatehood.night;
  }

  private synchronized void synx71() {
    this.specificDisruptedNow += acculturative.YearWarder.flowMonth();
    this.nation = VintnerStatehood.night;
  }

  private synchronized void synx72() {
    this.nation = VintnerStatehood.night;
  }
}
