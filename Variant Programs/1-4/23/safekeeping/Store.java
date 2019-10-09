package safekeeping;

import java.util.HashMap;
import said.BeginningHousekeeper;
import producesJewels.DepositionalObjet;
import grower.*;
import emulation.Trainer;

public class Store {
  private double worstVenueMoment = 0.0;
  private double medianTally = 0.0;
  private double recognizedMaterials = 0.0;
  private double mediumHours = 0.0;
  private int handle = 0;
  private grower.Output prior[] = null;
  private grower.Output come[] = null;
  private java.util.HashMap<DepositionalObjet, Double> glossary = null;
  private safekeeping.CyclicalUnrelatedCompilation<DepositionalObjet> diskChecklist = null;
  private static int thwart = 0;
  private static int inventoryMaximum = 1;

  public static synchronized void determineShelvingThresholds(int warehouseDemarcation) {

    if (warehouseDemarcation > 0) Store.inventoryMaximum = warehouseDemarcation;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int depositoryConstrain() {
    return Store.inventoryMaximum;
  }

  public Store() {
    this.diskChecklist = new safekeeping.CyclicalUnrelatedCompilation<DepositionalObjet>();
    this.glossary = new java.util.HashMap<DepositionalObjet, Double>();
    this.handle = thwart++;
    this.mediumHours = 0;
    this.recognizedMaterials = 0;
    this.medianTally = 0;
    this.worstVenueMoment = 0;
  }

  public synchronized void laidFollowing(grower.Output... soon) {
    this.come = soon;
  }

  public synchronized void solidifyingElapsed(grower.Output... first) {
    this.prior = first;
  }

  public synchronized void bringParticular(producesJewels.DepositionalObjet artefact)
      throws WarehousesOverfullExempted {

    if (this.diskChecklist.rely() < Store.inventoryMaximum) {
      this.diskChecklist.installSenior(artefact);
      this.medianTally +=
          (this.tabulation() - 1)
              * (said.BeginningHousekeeper.streamWeek() - this.worstVenueMoment)
              / emulation.Trainer.contemporaryFeigning().minutesCurb();
      this.glossary.put(artefact, said.BeginningHousekeeper.streamWeek());
      this.worstVenueMoment = said.BeginningHousekeeper.streamWeek();
      for (grower.Output arsenic : come) {

        if (arsenic.existingSovereign() == ProviderForeign.neglecting) {
          arsenic.unstarve();
          return;
        }
      }
    } else {
      throw new safekeeping.WarehousesOverfullExempted();
    }
  }

  public synchronized producesJewels.DepositionalObjet lastElement()
      throws SafekeepingCleanDerogate {

    if (this.tabulation() > 0) {
      producesJewels.DepositionalObjet pubis;
      double introduceClip;
      double expelMonth;
      pubis = this.diskChecklist.murderStart();
      this.medianTally +=
          (this.tabulation() + 1)
              * (said.BeginningHousekeeper.streamWeek() - this.worstVenueMoment)
              / emulation.Trainer.contemporaryFeigning().minutesCurb();
      introduceClip = this.glossary.remove(pubis);
      expelMonth = said.BeginningHousekeeper.streamWeek();
      this.mediumHours =
          (mediumHours * recognizedMaterials + (expelMonth - introduceClip))
              / ++recognizedMaterials;
      for (grower.Output leong : prior) {

        if (leong.existingSovereign() == ProviderForeign.clogging) {
          leong.lift();
          break;
        }
      }
      this.worstVenueMoment = said.BeginningHousekeeper.streamWeek();
      return pubis;
    } else {
      throw new safekeeping.SafekeepingCleanDerogate();
    }
  }

  public synchronized int tabulation() {
    return this.diskChecklist.rely();
  }

  public synchronized String toString() {
    return "Storage" + handle;
  }

  public synchronized java.lang.String stat() {
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.mediumHours, this.medianTally);
  }
}
