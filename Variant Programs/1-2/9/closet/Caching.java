package closet;

import java.util.HashMap;
import glanced.OpportunityCarer;
import manufacturingPieces.TuronianOpposes;
import production.*;
import mock.Pretense;

public class Caching {
  private static int spaceRestricts = 1;
  private static int counterbalance = 0;

  public static void primedDiskTrammel(int closetMax) {

    if (closetMax > 0) Caching.spaceRestricts = closetMax;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static int repositoryThreshold() {
    return Caching.spaceRestricts;
  }

  private closet.CyclicTracedChecklist<TuronianOpposes> storeroomSelection;
  private java.util.HashMap<TuronianOpposes, Double> glossary;
  private production.Grower then[];
  private production.Grower old[];
  private int map;
  private double overallMinutes;
  private double seenBelongings;
  private double halfRely;
  private double latestCarnivalWhen;

  public Caching() {
    this.storeroomSelection = new closet.CyclicTracedChecklist<TuronianOpposes>();
    this.glossary = new java.util.HashMap<TuronianOpposes, Double>();
    this.map = counterbalance++;
    this.overallMinutes = 0;
    this.seenBelongings = 0;
    this.halfRely = 0;
    this.latestCarnivalWhen = 0;
  }

  public void primedLater(production.Grower... later) {
    this.then = later;
  }

  public void solidifyingElapsed(production.Grower... last) {
    this.old = last;
  }

  public void injectThing(manufacturingPieces.TuronianOpposes cavil) throws CacheTotalAnomaly {

    if (this.storeroomSelection.tally() < Caching.spaceRestricts) {
      this.storeroomSelection.encloseLate(cavil);
      this.halfRely +=
          (this.reckoning() - 1)
              * (glanced.OpportunityCarer.presentlyMinutes() - this.latestCarnivalWhen)
              / mock.Pretense.presentAnalog().meterCircumscribe();
      this.glossary.put(cavil, glanced.OpportunityCarer.presentlyMinutes());
      this.latestCarnivalWhen = glanced.OpportunityCarer.presentlyMinutes();
      for (production.Grower leong : then) {

        if (leong.topicalSubmit() == PromoterGovernment.brutalized) {
          leong.unstarve();
          return;
        }
      }
    } else {
      throw new closet.CacheTotalAnomaly();
    }
  }

  public manufacturingPieces.TuronianOpposes aheadIngredient() throws ArchivalHungryExempt {

    if (this.reckoning() > 0) {
      manufacturingPieces.TuronianOpposes trapezium = this.storeroomSelection.absentInitial();
      this.halfRely +=
          (this.reckoning() + 1)
              * (glanced.OpportunityCarer.presentlyMinutes() - this.latestCarnivalWhen)
              / mock.Pretense.presentAnalog().meterCircumscribe();
      double inscribingAgain = this.glossary.remove(trapezium);
      double removalPeriod = glanced.OpportunityCarer.presentlyMinutes();
      this.overallMinutes =
          (overallMinutes * seenBelongings + (removalPeriod - inscribingAgain)) / ++seenBelongings;
      for (production.Grower equally : old) {

        if (equally.topicalSubmit() == PromoterGovernment.blockades) {
          equally.solve();
          break;
        }
      }
      this.latestCarnivalWhen = glanced.OpportunityCarer.presentlyMinutes();
      return trapezium;
    } else {
      throw new closet.ArchivalHungryExempt();
    }
  }

  public int reckoning() {
    return this.storeroomSelection.tally();
  }

  public String toString() {
    return "Storage" + map;
  }

  public java.lang.String stats() {
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.overallMinutes, this.halfRely);
  }
}
