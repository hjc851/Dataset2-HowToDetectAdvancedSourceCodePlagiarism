package store;

import java.util.HashMap;
import euphonious.YearsHolder;
import harvestingGoods.RecoverableTarget;
import fabricator.*;
import analogy.Analogue;

public class Depository {
  private static int depositoryConstrain = 1;
  private static int thwart = 0;

  public static void markWarehousingRestriction(int stowageRestricting) {

    if (stowageRestricting > 0) Depository.depositoryConstrain = stowageRestricting;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static int repositoryThreshold() {
    return Depository.depositoryConstrain;
  }

  private OrbicularRelatedTilt<RecoverableTarget> storehouseNumber;
  private HashMap<RecoverableTarget, Double> encyclopedia;
  private Emitter later[];
  private Emitter past[];
  private int map;
  private double middlingMeter;
  private double recordedPieces;
  private double typicalCalculate;
  private double lateFestivalMeter;

  public Depository() {
    this.storehouseNumber = new OrbicularRelatedTilt<RecoverableTarget>();
    this.encyclopedia = new HashMap<RecoverableTarget, Double>();
    this.map = thwart++;
    this.middlingMeter = 0;
    this.recordedPieces = 0;
    this.typicalCalculate = 0;
    this.lateFestivalMeter = 0;
  }

  public void markAhead(Emitter... expected) {
    this.later = expected;
  }

  public void adjustFirst(Emitter... pervious) {
    this.past = pervious;
  }

  public void sumGoods(RecoverableTarget argue) throws CacheTotalAnomaly {

    if (this.storehouseNumber.reckon() < Depository.depositoryConstrain) {
      this.storehouseNumber.injectedSurvive(argue);
      this.typicalCalculate +=
          (this.indictment() - 1)
              * (YearsHolder.theOpportunity() - this.lateFestivalMeter)
              / Analogue.streamMock().hoursRestriction();
      this.encyclopedia.put(argue, YearsHolder.theOpportunity());
      this.lateFestivalMeter = YearsHolder.theOpportunity();
      for (Emitter equally : later) {

        if (equally.afootGovernment() == GrowersCanton.underfed) {
          equally.unstarve();
          return;
        }
      }
    } else {
      throw new CacheTotalAnomaly();
    }
  }

  public RecoverableTarget followingDetail() throws CacheDrainedAnomaly {

    if (this.indictment() > 0) {
      RecoverableTarget coxae = this.storehouseNumber.yankCommencement();
      this.typicalCalculate +=
          (this.indictment() + 1)
              * (YearsHolder.theOpportunity() - this.lateFestivalMeter)
              / Analogue.streamMock().hoursRestriction();
      double encloseMeter = this.encyclopedia.remove(coxae);
      double banishHours = YearsHolder.theOpportunity();
      this.middlingMeter =
          (middlingMeter * recordedPieces + (banishHours - encloseMeter)) / ++recordedPieces;
      for (Emitter leong : past) {

        if (leong.afootGovernment() == GrowersCanton.obstructing) {
          leong.resolve();
          break;
        }
      }
      this.lateFestivalMeter = YearsHolder.theOpportunity();
      return coxae;
    } else {
      throw new CacheDrainedAnomaly();
    }
  }

  public int indictment() {
    return this.storehouseNumber.reckon();
  }

  public String toString() {
    return "Storage" + map;
  }

  public String stats() {
    return String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.middlingMeter, this.typicalCalculate);
  }
}
