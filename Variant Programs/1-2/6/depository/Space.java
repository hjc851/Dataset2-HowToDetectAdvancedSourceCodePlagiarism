package depository;

import java.util.HashMap;
import checked.DaysHandler;
import deliveryThings.ExhaustibleBody;
import growers.*;
import pretence.Analogy;

public class Space {
  private static int warehousesMinimum = 1;
  private static int negative = 0;

  public static void arrangedStoreConfine(int archivalCurtail) {

    if (archivalCurtail > 0) Space.warehousesMinimum = archivalCurtail;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static int diskTrammel() {
    return Space.warehousesMinimum;
  }

  private depository.OrbicularRelatedTilt<ExhaustibleBody> storingTilt;
  private java.util.HashMap<ExhaustibleBody, Double> pronunciation;
  private growers.Breeder close[];
  private growers.Breeder original[];
  private int picture;
  private double levelThing;
  private double reckonedElements;
  private double medianTally;
  private double latestCarnivalWhen;

  public Space() {
    this.storingTilt = new depository.OrbicularRelatedTilt<ExhaustibleBody>();
    this.pronunciation = new java.util.HashMap<ExhaustibleBody, Double>();
    this.picture = negative++;
    this.levelThing = 0;
    this.reckonedElements = 0;
    this.medianTally = 0;
    this.latestCarnivalWhen = 0;
  }

  public void determinedLast(growers.Breeder... soon) {
    this.close = soon;
  }

  public void settledPervious(growers.Breeder... successive) {
    this.original = successive;
  }

  public void bestowArtifact(deliveryThings.ExhaustibleBody items) throws MemoryFullyExcept {

    if (this.storingTilt.rely() < Space.warehousesMinimum) {
      this.storingTilt.enterFinal(items);
      this.medianTally +=
          (this.calculate() - 1)
              * (checked.DaysHandler.thisThing() - this.latestCarnivalWhen)
              / pretence.Analogy.topicalSimulated().weekMinimum();
      this.pronunciation.put(items, checked.DaysHandler.thisThing());
      this.latestCarnivalWhen = checked.DaysHandler.thisThing();
      for (growers.Breeder leong : close) {

        if (leong.circulatingTell() == SupplierProvince.fattening) {
          leong.unstarve();
          return;
        }
      }
    } else {
      throw new depository.MemoryFullyExcept();
    }
  }

  public deliveryThings.ExhaustibleBody nowAgenda() throws DiskRansackedObjection {

    if (this.calculate() > 0) {
      deliveryThings.ExhaustibleBody centrale = this.storingTilt.slayOpening();
      this.medianTally +=
          (this.calculate() + 1)
              * (checked.DaysHandler.thisThing() - this.latestCarnivalWhen)
              / pretence.Analogy.topicalSimulated().weekMinimum();
      double injectingOpportunity = this.pronunciation.remove(centrale);
      double ridWhen = checked.DaysHandler.thisThing();
      this.levelThing =
          (levelThing * reckonedElements + (ridWhen - injectingOpportunity)) / ++reckonedElements;
      for (growers.Breeder spain : original) {

        if (spain.circulatingTell() == SupplierProvince.thwarting) {
          spain.commit();
          break;
        }
      }
      this.latestCarnivalWhen = checked.DaysHandler.thisThing();
      return centrale;
    } else {
      throw new depository.DiskRansackedObjection();
    }
  }

  public int calculate() {
    return this.storingTilt.rely();
  }

  public String toString() {
    return "Storage" + picture;
  }

  public java.lang.String statistical() {
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.levelThing, this.medianTally);
  }
}
