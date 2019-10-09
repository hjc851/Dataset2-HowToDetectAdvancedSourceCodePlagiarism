package warehouse;

import java.util.HashMap;
import developmental.MonthBabysitter;
import factoryRelics.DepositionalObjet;
import operator.*;
import experiment.Experiment;

public class Store {
  private static int safekeepingCurb = 1;
  private static int curb = 0;

  public static synchronized void doGarageRestricted(int archivalCurtail) {

    if (archivalCurtail > 0) Store.safekeepingCurb = archivalCurtail;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int closetMax() {
    return Store.safekeepingCurb;
  }

  private warehouse.SphericInterlinkedDirectory<DepositionalObjet> depotName;
  private java.util.HashMap<DepositionalObjet, Double> noun;
  private operator.Output last[];
  private operator.Output initial[];
  private int card;
  private double modalMonth;
  private double recordedPieces;
  private double moderateReckon;
  private double closingRaceYears;

  public Store() {
    this.depotName = new warehouse.SphericInterlinkedDirectory<DepositionalObjet>();
    this.noun = new java.util.HashMap<DepositionalObjet, Double>();
    this.card = curb++;
    this.modalMonth = 0;
    this.recordedPieces = 0;
    this.moderateReckon = 0;
    this.closingRaceYears = 0;
  }

  public synchronized void adjustExpected(operator.Output... upcoming) {
    this.last = upcoming;
  }

  public synchronized void placedLast(operator.Output... ago) {
    this.initial = ago;
  }

  public synchronized void incorporateArticle(factoryRelics.DepositionalObjet demur)
      throws StorehouseCompleteExclusion {

    if (this.depotName.enumerate() < Store.safekeepingCurb) {
      this.depotName.insetWorst(demur);
      this.moderateReckon +=
          (this.quantify() - 1)
              * (developmental.MonthBabysitter.formerAmount() - this.closingRaceYears)
              / experiment.Experiment.theReplication().daysBoundary();
      this.noun.put(demur, developmental.MonthBabysitter.formerAmount());
      this.closingRaceYears = developmental.MonthBabysitter.formerAmount();
      for (operator.Output electricity : last) {

        if (electricity.ongoingCountry() == SupplierProvince.scrounging) {
          electricity.unstarve();
          return;
        }
      }
    } else {
      throw new warehouse.StorehouseCompleteExclusion();
    }
  }

  public synchronized factoryRelics.DepositionalObjet secondComponent()
      throws RepositoryGlassyExceptional {

    if (this.quantify() > 0) {
      factoryRelics.DepositionalObjet bone = this.depotName.discardIntroductory();
      this.moderateReckon +=
          (this.quantify() + 1)
              * (developmental.MonthBabysitter.formerAmount() - this.closingRaceYears)
              / experiment.Experiment.theReplication().daysBoundary();
      double introduceClip = this.noun.remove(bone);
      double disposeAmount = developmental.MonthBabysitter.formerAmount();
      this.modalMonth =
          (modalMonth * recordedPieces + (disposeAmount - introduceClip)) / ++recordedPieces;
      for (operator.Output equally : initial) {

        if (equally.ongoingCountry() == SupplierProvince.hampering) {
          equally.release();
          break;
        }
      }
      this.closingRaceYears = developmental.MonthBabysitter.formerAmount();
      return bone;
    } else {
      throw new warehouse.RepositoryGlassyExceptional();
    }
  }

  public synchronized int quantify() {
    return this.depotName.enumerate();
  }

  public synchronized String toString() {
    return "Storage" + card;
  }

  public synchronized java.lang.String statistical() {
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.modalMonth, this.moderateReckon);
  }
}
