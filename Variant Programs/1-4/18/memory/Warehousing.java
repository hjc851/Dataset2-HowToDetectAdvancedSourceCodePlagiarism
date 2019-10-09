package memory;

import java.util.HashMap;
import jazzy.BeginningHousekeeper;
import outputTarget.PhyllosilicatePreclude;
import output.*;
import simulated.Simulates;

public class Warehousing {
  public static int storeConfine;
  public static int undercut;

  public static synchronized void doGarageRestricted(int archivalCurtail) {

    if (archivalCurtail > 0) Warehousing.storeConfine = archivalCurtail;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int garageRestricted() {
    return Warehousing.storeConfine;
  }

  public memory.RingedInfluencedRoster<PhyllosilicatePreclude> warehouseLitany;
  public java.util.HashMap<PhyllosilicatePreclude, Double> verb;
  public output.Production soon[];
  public output.Production past[];
  public int identifying;
  public double meanPeriod;
  public double reckonedElements;
  public double approximatelyFigure;
  public double finishCeremonyYear;

  public Warehousing() {
    this.warehouseLitany = new memory.RingedInfluencedRoster<PhyllosilicatePreclude>();
    this.verb = new java.util.HashMap<PhyllosilicatePreclude, Double>();
    this.identifying = undercut++;
    this.meanPeriod = 0;
    this.reckonedElements = 0;
    this.approximatelyFigure = 0;
    this.finishCeremonyYear = 0;
  }

  public synchronized void placeSoon(output.Production... first) {
    this.soon = first;
  }

  public synchronized void prepareCurrent(output.Production... old) {
    this.past = old;
  }

  public synchronized void injectThing(outputTarget.PhyllosilicatePreclude objection)
      throws GarageRichCase {

    if (this.warehouseLitany.total() < Warehousing.storeConfine) {
      this.warehouseLitany.inscribeConcluding(objection);
      this.approximatelyFigure +=
          (this.reckon() - 1)
              * (jazzy.BeginningHousekeeper.typicalJuncture() - this.finishCeremonyYear)
              / simulated.Simulates.existingExperiment().nowRestrictions();
      this.verb.put(objection, jazzy.BeginningHousekeeper.typicalJuncture());
      this.finishCeremonyYear = jazzy.BeginningHousekeeper.typicalJuncture();
      for (output.Production leong : soon) {

        if (leong.thisCantons() == ProducingPublic.skinny) {
          leong.unstarve();
          return;
        }
      }
    } else {
      throw new memory.GarageRichCase();
    }
  }

  public synchronized outputTarget.PhyllosilicatePreclude lastElement()
      throws DiskRansackedObjection {

    if (this.reckon() > 0) {
      outputTarget.PhyllosilicatePreclude bone = this.warehouseLitany.ejectEldest();
      this.approximatelyFigure +=
          (this.reckon() + 1)
              * (jazzy.BeginningHousekeeper.typicalJuncture() - this.finishCeremonyYear)
              / simulated.Simulates.existingExperiment().nowRestrictions();
      double installBeginning = this.verb.remove(bone);
      double takeClock = jazzy.BeginningHousekeeper.typicalJuncture();
      this.meanPeriod =
          (meanPeriod * reckonedElements + (takeClock - installBeginning)) / ++reckonedElements;
      for (output.Production equally : past) {

        if (equally.thisCantons() == ProducingPublic.halt) {
          equally.unfreeze();
          break;
        }
      }
      this.finishCeremonyYear = jazzy.BeginningHousekeeper.typicalJuncture();
      return bone;
    } else {
      throw new memory.DiskRansackedObjection();
    }
  }

  public synchronized int reckon() {
    return this.warehouseLitany.total();
  }

  public synchronized String toString() {
    return "Storage" + identifying;
  }

  public synchronized java.lang.String numbers() {
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.meanPeriod, this.approximatelyFigure);
  }

  static {
    storeConfine = 1;
    undercut = 0;
  }
}
