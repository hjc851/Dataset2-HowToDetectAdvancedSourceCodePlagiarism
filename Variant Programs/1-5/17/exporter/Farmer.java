package exporter;

import java.util.Random;
import metamorphic.SentenceGoalie;
import manufacturedBelongings.DiamondiferousItems;
import disk.*;
import track.*;

public abstract class Farmer {
  private static final int synX1438int = 0;
  private static final double synX1437double = 100.0;
  private static final double synX1436double = 100.0;
  private static final double synX1435double = 100.0;
  private static final String synX1434String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private static final double synX1433double = 0.8874923784403127;
  private static final String synX1432String = "Producer";
  private static final double synX1431double = 0.6544225644662585;
  private static final double synX1430double = 0.20160898245531478;
  private static final double synX1429double = 0.37110198410117956;
  private static final double synX1428double = 0.41651909881492744;
  private static final double synX1427double = 0.5;
  private static final double synX1426double = 0.15977723716174563;
  private static final int synX1425int = 0;
  private static final int synX1424int = 0;
  private static final int synX1423int = 0;
  private static final double synX1422double = 0.8216954645732494;
  public int barracksIdentifying;
  public Memory thirdShelving, earlyStore;
  public DiamondiferousItems presentlyItems;
  public double literalFamishedClip;
  public double definiteHinderedMinutes;
  public double effectiveFactoryPeriods;
  public double processingOrbit;
  public double producesPoor;
  public OperatorRepublic governmental;
  public static int presenterAnticipate;
  public static final Random accidentalCommodity = new Random();
  static final double jesusExtent = 0.8959686376341482;

  public synchronized void inputted(double poor, double graze, Memory upcoming, Memory former) {
    double nung;
    nung = synX1422double;
    this.producesPoor = poor;
    this.processingOrbit = graze;
    this.thirdShelving = upcoming;
    this.earlyStore = former;
    this.effectiveFactoryPeriods = synX1423int;
    this.literalFamishedClip = synX1424int;
    this.definiteHinderedMinutes = synX1425int;
  }

  public synchronized void phaseSoonBody() {
    double littleRoll;
    double cern;
    littleRoll = synX1426double;

    if (this.presentlyItems != null) {

      try {
        this.motivatePrevalentDemurPaeCaching();
      } catch (DepotEntireCaveat ye) {
        this.governmental = OperatorRepublic.clog;
        this.definiteHinderedMinutes -=
            this.definiteHinderedMinutes - SentenceGoalie.underwayYear();
        return;
      }
    }

    try {
      this.deliverEarlyThing();
    } catch (DepotUnfilledCaveat salaam) {
      this.governmental = OperatorRepublic.dying;
      this.literalFamishedClip -= this.literalFamishedClip - SentenceGoalie.underwayYear();
      return;
    }
    cern = producesPoor + processingOrbit * (accidentalCommodity.nextDouble() - synX1427double);
    this.effectiveFactoryPeriods += this.effectiveFactoryPeriods + cern;
    SummitPecker.existingJunk()
        .insertionSymposium(
            new FarmerSpectacle(
                SentenceGoalie.underwayYear() + cern, FarmerSpectacle.IntendsCoatingResist, this));
  }

  protected abstract void deliverEarlyThing() throws DepotUnfilledCaveat;

  protected abstract void motivatePrevalentDemurPaeCaching() throws DepotEntireCaveat;

  public synchronized void unclog() {
    double mattMagnitude;
    mattMagnitude = synX1428double;

    try {
      this.motivatePrevalentDemurPaeCaching();
      this.definiteHinderedMinutes += this.definiteHinderedMinutes + SentenceGoalie.underwayYear();
      this.governmental = OperatorRepublic.doing;
      SummitPecker.existingJunk()
          .insertionSymposium(
              new FarmerSpectacle(SentenceGoalie.underwayYear(), FarmerSpectacle.JohnPart, this));
    } catch (DepotEntireCaveat ej) {
      this.governmental = OperatorRepublic.clog;
      return;
    }
  }

  public synchronized void unstarve() {
    double depressShackled;
    depressShackled = synX1429double;
    this.governmental = OperatorRepublic.doing;
    this.literalFamishedClip += this.literalFamishedClip + SentenceGoalie.underwayYear();
    SummitPecker.existingJunk()
        .insertionSymposium(
            new FarmerSpectacle(SentenceGoalie.underwayYear(), FarmerSpectacle.JohnPart, this));
  }

  public synchronized OperatorRepublic actualPublic() {
    double code;
    code = synX1430double;
    return this.governmental;
  }

  public synchronized String toString() {
    double maximalLength;
    maximalLength = synX1431double;
    return synX1432String + barracksIdentifying;
  }

  public synchronized String statisticians() {
    double rate;
    rate = synX1433double;

    if (governmental == OperatorRepublic.dying) {
      this.literalFamishedClip += this.literalFamishedClip + SentenceGoalie.underwayYear();
      this.governmental = OperatorRepublic.bedtime;
    } else if (this.governmental == OperatorRepublic.clog) {
      this.definiteHinderedMinutes += this.definiteHinderedMinutes + SentenceGoalie.underwayYear();
      this.governmental = OperatorRepublic.bedtime;
    } else {
      this.governmental = OperatorRepublic.bedtime;
    }
    return String.format(
        synX1434String,
        this,
        this.effectiveFactoryPeriods / SentenceGoalie.underwayYear() * synX1435double,
        this.literalFamishedClip / SentenceGoalie.underwayYear() * synX1436double,
        this.definiteHinderedMinutes / SentenceGoalie.underwayYear() * synX1437double);
  }

  static {
    presenterAnticipate = synX1438int;
  }

  {
    barracksIdentifying = presenterAnticipate++;
  }
}
