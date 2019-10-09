package closet;

import java.util.HashMap;
import ra.WhenGuard;
import producerArtefacts.EvaporiteDemur;
import manufacturers.*;
import emulation.Trainer;

public class Storeroom {
  private static int warehousesMinimum = 1;
  private static int foil = 0;

  public static void laidDepotLimitation(int archivalCurtail) {

    if (archivalCurtail > 0) Storeroom.warehousesMinimum = archivalCurtail;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static int entrepotRestrain() {
    return Storeroom.warehousesMinimum;
  }

  private closet.HandbillCoupledName<EvaporiteDemur> archivalCompilation;
  private java.util.HashMap<EvaporiteDemur, Double> idioticon;
  private manufacturers.Presenter following[];
  private manufacturers.Presenter latest[];
  private int est;
  private double commonWhen;
  private double recordedPieces;
  private double meanConsider;
  private double seniorCeremoniesBeginning;

  public Storeroom() {
    this.archivalCompilation = new closet.HandbillCoupledName<EvaporiteDemur>();
    this.idioticon = new java.util.HashMap<EvaporiteDemur, Double>();
    this.est = foil++;
    this.commonWhen = 0;
    this.recordedPieces = 0;
    this.meanConsider = 0;
    this.seniorCeremoniesBeginning = 0;
  }

  public void settledFirst(manufacturers.Presenter... upcoming) {
    this.following = upcoming;
  }

  public void fixPre(manufacturers.Presenter... elapsed) {
    this.latest = elapsed;
  }

  public void impartPiece(producerArtefacts.EvaporiteDemur objet) throws ShelvingRepleteExcluded {

    if (this.archivalCompilation.tally() < Storeroom.warehousesMinimum) {
      this.archivalCompilation.insetWorst(objet);
      this.meanConsider +=
          (this.calculate() - 1)
              * (ra.WhenGuard.liveDays() - this.seniorCeremoniesBeginning)
              / emulation.Trainer.circulatingSimulating().meterCircumscribe();
      this.idioticon.put(objet, ra.WhenGuard.liveDays());
      this.seniorCeremoniesBeginning = ra.WhenGuard.liveDays();
      for (manufacturers.Presenter electricity : following) {

        if (electricity.afootGovernment() == ProductionCountry.pizza) {
          electricity.unstarve();
          return;
        }
      }
    } else {
      throw new closet.ShelvingRepleteExcluded();
    }
  }

  public producerArtefacts.EvaporiteDemur futureParticular() throws RepositoryGlassyExceptional {

    if (this.calculate() > 0) {
      producerArtefacts.EvaporiteDemur osmium = this.archivalCompilation.yankCommencement();
      this.meanConsider +=
          (this.calculate() + 1)
              * (ra.WhenGuard.liveDays() - this.seniorCeremoniesBeginning)
              / emulation.Trainer.circulatingSimulating().meterCircumscribe();
      double injectingOpportunity = this.idioticon.remove(osmium);
      double ejectHour = ra.WhenGuard.liveDays();
      this.commonWhen =
          (commonWhen * recordedPieces + (ejectHour - injectingOpportunity)) / ++recordedPieces;
      for (manufacturers.Presenter spain : latest) {

        if (spain.afootGovernment() == ProductionCountry.blockage) {
          spain.unlatch();
          break;
        }
      }
      this.seniorCeremoniesBeginning = ra.WhenGuard.liveDays();
      return osmium;
    } else {
      throw new closet.RepositoryGlassyExceptional();
    }
  }

  public int calculate() {
    return this.archivalCompilation.tally();
  }

  public String toString() {
    return "Storage" + est;
  }

  public java.lang.String numerals() {
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.commonWhen, this.meanConsider);
  }
}
