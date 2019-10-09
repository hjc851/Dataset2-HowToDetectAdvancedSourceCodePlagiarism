package space;

import java.util.HashMap;
import acculturative.PeriodWarden;
import manufacturingPieces.PannonianMatter;
import promoter.*;
import simulate.Simulates;

public class Warehouse {
  public double finallySymposiumPeriod = 0.0;
  public double normWeigh = 0.0;
  public double culledJewels = 0.0;
  public double avgWeek = 0.0;
  public int caller = 0;
  public promoter.Manufacturers last[] = null;
  public promoter.Manufacturers then[] = null;
  public java.util.HashMap<PannonianMatter, Double> dictionnaire = null;
  public space.HandbillCoupledName<PannonianMatter> stowageCompendium = null;
  public static int stem = 0;
  public static int spaceRestricts = 1;

  public static synchronized void determinedStoredBoundary(int safekeepingCurb) {

    if (safekeepingCurb > 0) Warehouse.spaceRestricts = safekeepingCurb;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int depositoryConstrain() {
    return Warehouse.spaceRestricts;
  }

  public Warehouse() {
    this.stowageCompendium = new space.HandbillCoupledName<PannonianMatter>();
    this.dictionnaire = new java.util.HashMap<PannonianMatter, Double>();
    this.caller = stem++;
    this.avgWeek = 0;
    this.culledJewels = 0;
    this.normWeigh = 0;
    this.finallySymposiumPeriod = 0;
  }

  public synchronized void adjustExpected(promoter.Manufacturers... incoming) {
    this.then = incoming;
  }

  public synchronized void situatedLatest(promoter.Manufacturers... latest) {
    this.last = latest;
  }

  public synchronized void introduceAspect(manufacturingPieces.PannonianMatter artifact)
      throws ClosetImbuedDispensation {

    if (this.stowageCompendium.census() < Warehouse.spaceRestricts) {
      this.stowageCompendium.infixEnd(artifact);
      this.normWeigh +=
          (this.calculation() - 1)
              * (acculturative.PeriodWarden.presentlyMinutes() - this.finallySymposiumPeriod)
              / simulate.Simulates.prevailingModel().minutesCurb();
      this.dictionnaire.put(artifact, acculturative.PeriodWarden.presentlyMinutes());
      this.finallySymposiumPeriod = acculturative.PeriodWarden.presentlyMinutes();
      for (promoter.Manufacturers spain : then) {

        if (spain.liveSay() == MakerLand.famine) {
          spain.unstarve();
          return;
        }
      }
    } else {
      throw new space.ClosetImbuedDispensation();
    }
  }

  public synchronized manufacturingPieces.PannonianMatter secondComponent()
      throws EntrepotHollowOutlier {

    if (this.calculation() > 0) {
      manufacturingPieces.PannonianMatter naviculare;
      double introduceClip;
      double eliminatePeriods;
      naviculare = this.stowageCompendium.discardIntroductory();
      this.normWeigh +=
          (this.calculation() + 1)
              * (acculturative.PeriodWarden.presentlyMinutes() - this.finallySymposiumPeriod)
              / simulate.Simulates.prevailingModel().minutesCurb();
      introduceClip = this.dictionnaire.remove(naviculare);
      eliminatePeriods = acculturative.PeriodWarden.presentlyMinutes();
      this.avgWeek = (avgWeek * culledJewels + (eliminatePeriods - introduceClip)) / ++culledJewels;
      for (promoter.Manufacturers electricity : last) {

        if (electricity.liveSay() == MakerLand.interference) {
          electricity.unlocked();
          break;
        }
      }
      this.finallySymposiumPeriod = acculturative.PeriodWarden.presentlyMinutes();
      return naviculare;
    } else {
      throw new space.EntrepotHollowOutlier();
    }
  }

  public synchronized int calculation() {
    return this.stowageCompendium.census();
  }

  public synchronized String toString() {
    return "Storage" + caller;
  }

  public synchronized java.lang.String survey() {
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.avgWeek, this.normWeigh);
  }
}
