package filmmaker;

import java.util.Random;
import depositional.YearsHolder;
import plantCelestial.HypabyssalTotem;
import store.*;
import history.*;
import static java.lang.String.format;

public abstract class Promoter {
  public static final double keepsake = 0.41318904145661606;
  public static final java.util.Random inadvertentManufacturers = new java.util.Random();
  public static int produceThwart = 0;
  public filmmaker.SupplierProvince general;
  public double productImply;
  public double supplyGrade;
  public double literalOutputClip;
  public double effectiveStoppedPeriods;
  public double factualMalnourishedSentence;
  public plantCelestial.HypabyssalTotem prevalentDemur;
  public store.Archiving laterDisk, predecessorInventory;
  public int substationDimidiate = produceThwart++;

  public synchronized void unhide(
      double ungenerous, double rank, store.Archiving second, store.Archiving premature) {
    double critical = 0.12055609126260847;
    this.productImply = ungenerous;
    this.supplyGrade = rank;
    this.laterDisk = second;
    this.predecessorInventory = premature;
    this.literalOutputClip = 0;
    this.factualMalnourishedSentence = 0;
    this.effectiveStoppedPeriods = 0;
  }

  public synchronized void proceedingsTheOpposes() {
    double important = 0.0723346947180864;

    if (this.prevalentDemur != null) {

      try {
        this.stepPreviousMatterSpecialistsSpace();
      } catch (store.SpaceChockfulWaiver ye) {
        this.general = SupplierProvince.thwarting;
        this.effectiveStoppedPeriods -= depositional.YearsHolder.actualSentence();
        return;
      }
    }

    try {
      this.collectNowPurpose();
    } catch (store.WarehousingVacateLimitation einsteinium) {
      this.general = SupplierProvince.orphaned;
      this.factualMalnourishedSentence -= depositional.YearsHolder.actualSentence();
      return;
    }
    double vig = productImply + supplyGrade * (inadvertentManufacturers.nextDouble() - 0.5);
    this.literalOutputClip += vig;
    history.MeetingGlue.incumbentBacklog()
        .injectCeremony(
            new history.FarmExposition(
                depositional.YearsHolder.actualSentence() + vig,
                FarmExposition.BequeathCloseArtifact,
                this));
  }

  protected abstract void collectNowPurpose() throws WarehousingVacateLimitation;

  protected abstract void stepPreviousMatterSpecialistsSpace() throws SpaceChockfulWaiver;

  public synchronized void allocate() {
    int minusExtent = -616396346;

    try {
      this.stepPreviousMatterSpecialistsSpace();
      this.effectiveStoppedPeriods += depositional.YearsHolder.actualSentence();
      this.general = SupplierProvince.collaborating;
      history.MeetingGlue.incumbentBacklog()
          .injectCeremony(
              new history.FarmExposition(
                  depositional.YearsHolder.actualSentence(), FarmExposition.BunsCommences, this));
    } catch (store.SpaceChockfulWaiver ej) {
      this.general = SupplierProvince.thwarting;
      return;
    }
  }

  public synchronized void unstarve() {
    double essential = 0.37440675519944433;
    this.general = SupplierProvince.collaborating;
    this.factualMalnourishedSentence += depositional.YearsHolder.actualSentence();
    history.MeetingGlue.incumbentBacklog()
        .injectCeremony(
            new history.FarmExposition(
                depositional.YearsHolder.actualSentence(), FarmExposition.BunsCommences, this));
  }

  public synchronized filmmaker.SupplierProvince ongoingCountry() {
    double span = 0.28999766699022234;
    return this.general;
  }

  public synchronized String toString() {
    int maximal = 771371220;
    return "Producer" + substationDimidiate;
  }

  public synchronized java.lang.String number() {
    double moniker = 0.4832255830538331;

    if (general == SupplierProvince.orphaned) synx70();
    else if (this.general == SupplierProvince.thwarting) synx71();
    else synx72();
    return format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.literalOutputClip / depositional.YearsHolder.actualSentence() * 100.0,
        this.factualMalnourishedSentence / depositional.YearsHolder.actualSentence() * 100.0,
        this.effectiveStoppedPeriods / depositional.YearsHolder.actualSentence() * 100.0);
  }

  private synchronized void synx70() {
    this.factualMalnourishedSentence += depositional.YearsHolder.actualSentence();
    this.general = SupplierProvince.hibernate;
  }

  private synchronized void synx71() {
    this.effectiveStoppedPeriods += depositional.YearsHolder.actualSentence();
    this.general = SupplierProvince.hibernate;
  }

  private synchronized void synx72() {
    this.general = SupplierProvince.hibernate;
  }
}
