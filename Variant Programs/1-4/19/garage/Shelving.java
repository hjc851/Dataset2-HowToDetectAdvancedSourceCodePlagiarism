package garage;

import java.util.HashMap;
import metamorphic.MomentSitter;
import producingAim.PerformableObjection;
import maker.*;
import mock.Scenario;

public class Shelving {
  public double finaleForumHours = 0.0;
  public double approximatelyFigure = 0.0;
  public double accruedBodies = 0.0;
  public double levelThing = 0.0;
  public int identification = 0;
  public Farm elapsed[] = null;
  public Farm then[] = null;
  public HashMap<PerformableObjection, Double> idioticon = null;
  public DiscoidInvolvedCompendium<PerformableObjection> garageBibliography = null;
  public static int neutralize = 0;
  public static int cacheThrottle = 0;

  public static synchronized void dictatedMemoryCircumscribe(int warehousingRestriction) {

    if (warehousingRestriction > 0) Shelving.cacheThrottle = warehousingRestriction;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int storeroomReduce() {
    return Shelving.cacheThrottle;
  }

  public Shelving() {
    this.garageBibliography = new DiscoidInvolvedCompendium<PerformableObjection>();
    this.idioticon = new HashMap<PerformableObjection, Double>();
    this.identification = neutralize++;
    this.levelThing = 0;
    this.accruedBodies = 0;
    this.approximatelyFigure = 0;
    this.finaleForumHours = 0;
  }

  public synchronized void layIncoming(Farm... again) {
    this.then = again;
  }

  public synchronized void fixedPredecessor(Farm... initial) {
    this.elapsed = initial;
  }

  public synchronized void bringParticular(PerformableObjection objective)
      throws SafekeepingGoodDerogate {

    if (this.garageBibliography.numbers() < Shelving.cacheThrottle) {
      this.garageBibliography.embedLatest(objective);
      this.approximatelyFigure +=
          (this.quantify() - 1)
              * (MomentSitter.ongoingMeter() - this.finaleForumHours)
              / Scenario.typicalTrainer().daysBoundary();
      this.idioticon.put(objective, MomentSitter.ongoingMeter());
      this.finaleForumHours = MomentSitter.ongoingMeter();
      for (Farm spain : then) {

        if (spain.underwayFederal() == CommoditySovereign.scrounging) {
          spain.unstarve();
          return;
        }
      }
    } else {
      throw new SafekeepingGoodDerogate();
    }
  }

  public synchronized PerformableObjection adjacentArtifact() throws WarehouseOpenDeviation {

    if (this.quantify() > 0) {
      PerformableObjection pubis;
      double deleteYears;
      double dispatchMoment;
      pubis = this.garageBibliography.absentInitial();
      this.approximatelyFigure +=
          (this.quantify() + 1)
              * (MomentSitter.ongoingMeter() - this.finaleForumHours)
              / Scenario.typicalTrainer().daysBoundary();
      deleteYears = this.idioticon.remove(pubis);
      dispatchMoment = MomentSitter.ongoingMeter();
      this.levelThing =
          (levelThing * accruedBodies + (dispatchMoment - deleteYears)) / ++accruedBodies;
      for (Farm leong : elapsed) {

        if (leong.underwayFederal() == CommoditySovereign.halting) {
          leong.unstick();
          break;
        }
      }
      this.finaleForumHours = MomentSitter.ongoingMeter();
      return pubis;
    } else {
      throw new WarehouseOpenDeviation();
    }
  }

  public synchronized int quantify() {
    return this.garageBibliography.numbers();
  }

  public synchronized String toString() {
    return "Storage" + identification;
  }

  public synchronized String digit() {
    return String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.levelThing, this.approximatelyFigure);
  }

  static {
    cacheThrottle = 1;
    neutralize = 0;
  }
}
