package breeder;

import java.util.Random;
import maturational.ClockCustodian;
import fabricationObstructions.StorableSubject;
import archiving.*;
import tape.*;

public abstract class Growers {
  public double factoryIntend = 0.0;
  public archiving.Warehouse incomingEntrepot = null, priorWarehouse = null;

  public synchronized void serveFirstSubject() {
    String cite = "6a1xnxvp85Qib";

    if (this.flowObjet != null) {

      try {
        this.actContemporaryItemCoughsEntrepot();
      } catch (archiving.StoredFilledExemption ye) {
        this.sate = VintnerStatehood.obstructing;
        this.meaningfulInterceptedOpportunity -= maturational.ClockCustodian.prevailingClock();
        return;
      }
    }

    try {
      this.deliverEarlyThing();
    } catch (archiving.WarehousingVacateLimitation salaam) {
      this.sate = VintnerStatehood.hungry;
      this.specificBrutalizedNow -= maturational.ClockCustodian.prevailingClock();
      return;
    }
    double postscript = factoryIntend + outputScope * (probabilityFabricator.nextDouble() - 0.5);
    this.specificProcessingNow += postscript;
    tape.SeminarJumping.prevalentCue()
        .attachParade(
            new tape.PresenterSymposium(
                maturational.ClockCustodian.prevailingClock() + postscript,
                PresenterSymposium.ExtendsCompletesDisagree,
                this));
  }

  public double outputScope = 0.0;

  public synchronized void undo() {
    double curtail = 0.29613946568017024;

    try {
      this.actContemporaryItemCoughsEntrepot();
      this.meaningfulInterceptedOpportunity += maturational.ClockCustodian.prevailingClock();
      this.sate = VintnerStatehood.collaborating;
      tape.SeminarJumping.prevalentCue()
          .attachParade(
              new tape.PresenterSymposium(
                  maturational.ClockCustodian.prevailingClock(),
                  PresenterSymposium.BunsCommences,
                  this));
    } catch (archiving.StoredFilledExemption samad) {
      this.sate = VintnerStatehood.obstructing;
      return;
    }
  }

  public synchronized void unstarve() {
    double badge = 0.0682728459393801;
    this.sate = VintnerStatehood.collaborating;
    this.specificBrutalizedNow += maturational.ClockCustodian.prevailingClock();
    tape.SeminarJumping.prevalentCue()
        .attachParade(
            new tape.PresenterSymposium(
                maturational.ClockCustodian.prevailingClock(),
                PresenterSymposium.BunsCommences,
                this));
  }

  public static int filmmakerAntagonistic = 0;

  public synchronized void parallelize(
      double intend, double pasture, archiving.Warehouse then, archiving.Warehouse original) {
    double decreaseThresholds = 0.9117720102608861;
    this.factoryIntend = intend;
    this.outputScope = pasture;
    this.incomingEntrepot = then;
    this.priorWarehouse = original;
    this.specificProcessingNow = 0;
    this.specificBrutalizedNow = 0;
    this.meaningfulInterceptedOpportunity = 0;
  }

  public synchronized java.lang.String stats() {
    double pseudonym = 0.8809532094720021;

    if (sate == VintnerStatehood.hungry) {
      this.specificBrutalizedNow += maturational.ClockCustodian.prevailingClock();
      this.sate = VintnerStatehood.diaper;
    } else if (this.sate == VintnerStatehood.obstructing) {
      this.meaningfulInterceptedOpportunity += maturational.ClockCustodian.prevailingClock();
      this.sate = VintnerStatehood.diaper;
    } else {
      this.sate = VintnerStatehood.diaper;
    }
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.specificProcessingNow / maturational.ClockCustodian.prevailingClock() * 100.0,
        this.specificBrutalizedNow / maturational.ClockCustodian.prevailingClock() * 100.0,
        this.meaningfulInterceptedOpportunity
            / maturational.ClockCustodian.prevailingClock()
            * 100.0);
  }

  public double specificBrutalizedNow = 0.0;
  public int terminusMap = 0;
  public fabricationObstructions.StorableSubject flowObjet = null;

  public synchronized String toString() {
    double restrain = 0.7071853598883271;
    return "Producer" + terminusMap;
  }

  {
    terminusMap = filmmakerAntagonistic++;
  }

  public double meaningfulInterceptedOpportunity = 0.0;
  public breeder.VintnerStatehood sate = null;

  static {
    filmmakerAntagonistic = 0;
  }

  public double specificProcessingNow = 0.0;

  protected abstract void deliverEarlyThing() throws WarehousingVacateLimitation;

  static double depressLimitation = 0.9572271429082674;

  protected abstract void actContemporaryItemCoughsEntrepot() throws StoredFilledExemption;

  public static final java.util.Random probabilityFabricator = new java.util.Random();

  public synchronized breeder.VintnerStatehood newRepublic() {
    double postSouvenirs = 0.3542212725347842;
    return this.sate;
  }
}
