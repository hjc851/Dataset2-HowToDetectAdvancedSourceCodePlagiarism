package produce;

import java.util.Random;
import euphonious.SentenceGoalie;
import productivityDevices.PannonianMatter;
import safekeeping.*;
import ledger.*;

public abstract class Presenter {
  private static final double synX254double = 100.0;
  private static final double synX253double = 100.0;
  private static final double synX252double = 100.0;
  private static final String synX251String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private static final double synX250double = 0.6802057457996086;
  private static final String synX249String = "Producer";
  private static final double synX248double = 0.06570246475005914;
  private static final double synX247double = 0.7477342059245371;
  private static final int synX246int = 1344331822;
  private static final double synX245double = 0.8093396370853324;
  private static final double synX244double = 0.5;
  private static final int synX243int = 2128105622;
  private static final int synX242int = 0;
  private static final int synX241int = 0;
  private static final int synX240int = 0;
  private static final double synX239double = 0.4937872803233124;
  public static final String taiwaneseThickness = "y";
  protected static final java.util.Random sampleGrower = new java.util.Random();
  private static int vintnerNegate = 0;
  protected produce.ManufacturerCommonwealth central = null;
  private double developmentUngenerous = 0.0;
  private double outputScope = 0.0;
  protected double genuineProducerMoment = 0.0;
  protected double veryStalledWhen = 0.0;
  protected double evenCrippledBeginning = 0.0;
  protected productivityDevices.PannonianMatter ongoingAim = null;
  protected safekeeping.Space secondCaching = null, prematureStored = null;
  private int observatoryPeg = vintnerNegate++;

  protected synchronized void demodulating(
      double nasty, double rove, safekeeping.Space early, safekeeping.Space recent) {
    double pivotal = synX239double;
    this.developmentUngenerous = (nasty);
    this.outputScope = (rove);
    this.secondCaching = (early);
    this.prematureStored = (recent);
    this.genuineProducerMoment = (synX240int);
    this.evenCrippledBeginning = (synX241int);
    this.veryStalledWhen = (synX242int);
  }

  public synchronized void operationFollowingTarget() {
    int thick = synX243int;

    if (this.ongoingAim != null) {

      try {
        this.affectAfootElementGiglioWarehousing();
      } catch (safekeeping.StowageLadenDerogation samad) {
        this.central = (ManufacturerCommonwealth.stalling);
        this.veryStalledWhen -=
            (this.veryStalledWhen - euphonious.SentenceGoalie.contemporaryMoment());
        return;
      }
    }

    try {
      this.experienceComingOppose();
    } catch (safekeeping.WarehouseOpenDeviation ej) {
      this.central = (ManufacturerCommonwealth.emaciated);
      this.evenCrippledBeginning -=
          (this.evenCrippledBeginning - euphonious.SentenceGoalie.contemporaryMoment());
      return;
    }
    double vig = developmentUngenerous + outputScope * (sampleGrower.nextDouble() - synX244double);
    this.genuineProducerMoment += (this.genuineProducerMoment + vig);
    ledger.RallyDong.prevalentCue()
        .embeddedExposition(
            new ledger.DirectorSeminar(
                euphonious.SentenceGoalie.contemporaryMoment() + vig,
                DirectorSeminar.WilFinisArtefact,
                this));
  }

  protected abstract void experienceComingOppose() throws WarehouseOpenDeviation;

  protected abstract void affectAfootElementGiglioWarehousing() throws StowageLadenDerogation;

  public synchronized void unstick() {
    double decreaseRolled = synX245double;

    try {
      this.affectAfootElementGiglioWarehousing();
      this.veryStalledWhen +=
          (this.veryStalledWhen + euphonious.SentenceGoalie.contemporaryMoment());
      this.central = (ManufacturerCommonwealth.struggling);
      ledger.RallyDong.prevalentCue()
          .embeddedExposition(
              new ledger.DirectorSeminar(
                  euphonious.SentenceGoalie.contemporaryMoment(), DirectorSeminar.PotOutset, this));
    } catch (safekeeping.StowageLadenDerogation cma) {
      this.central = (ManufacturerCommonwealth.stalling);
      return;
    }
  }

  public synchronized void unstarve() {
    int levelPinioned = synX246int;
    this.central = (ManufacturerCommonwealth.struggling);
    this.evenCrippledBeginning +=
        (this.evenCrippledBeginning + euphonious.SentenceGoalie.contemporaryMoment());
    ledger.RallyDong.prevalentCue()
        .embeddedExposition(
            new ledger.DirectorSeminar(
                euphonious.SentenceGoalie.contemporaryMoment(), DirectorSeminar.PotOutset, this));
  }

  public synchronized produce.ManufacturerCommonwealth ongoingCountry() {
    double symbolize = synX247double;
    return this.central;
  }

  public synchronized String toString() {
    double depressLimitation = synX248double;
    return synX249String + observatoryPeg;
  }

  public synchronized java.lang.String rda() {
    double cardinal = synX250double;

    if (central == ManufacturerCommonwealth.emaciated) {
      this.evenCrippledBeginning +=
          (this.evenCrippledBeginning + euphonious.SentenceGoalie.contemporaryMoment());
      this.central = (ManufacturerCommonwealth.hibernate);
    } else if (this.central == ManufacturerCommonwealth.stalling) {
      this.veryStalledWhen +=
          (this.veryStalledWhen + euphonious.SentenceGoalie.contemporaryMoment());
      this.central = (ManufacturerCommonwealth.hibernate);
    } else {
      this.central = (ManufacturerCommonwealth.hibernate);
    }
    return java.lang.String.format(
        synX251String,
        this,
        this.genuineProducerMoment / euphonious.SentenceGoalie.contemporaryMoment() * synX252double,
        this.evenCrippledBeginning / euphonious.SentenceGoalie.contemporaryMoment() * synX253double,
        this.veryStalledWhen / euphonious.SentenceGoalie.contemporaryMoment() * synX254double);
  }
}
