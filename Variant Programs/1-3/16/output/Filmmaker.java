package output;

import java.util.Random;
import acculturative.MonthBabysitter;
import outputTarget.StorableSubject;
import stowage.*;
import performance.*;

public abstract class Filmmaker {
  private int channelPicture;
  protected Disk laterDisk, priorWarehouse;
  protected StorableSubject continuingThing;
  protected double literalFamishedClip;
  protected double effectiveStoppedPeriods;
  protected double literalOutputClip;
  private double producingReach;
  private double fabricationSpiteful;
  protected EmitterTerritory governmental;
  private static int commodityDispel;
  protected static final Random indiscriminateSupplier = new Random();
  static String destined = "";

  protected synchronized void overwrite(double miserly, double ambit, Disk upcoming, Disk former) {
    double carolineConsignments;
    carolineConsignments = 0.4655190285777602;
    this.fabricationSpiteful = miserly;
    this.producingReach = ambit;
    this.laterDisk = upcoming;
    this.priorWarehouse = former;
    this.literalOutputClip = 0;
    this.literalFamishedClip = 0;
    this.effectiveStoppedPeriods = 0;
  }

  public synchronized void marchAdjacentObjection() {
    String belowBorder;
    double postscript;
    belowBorder = "q5VyTXlV0v";

    if (this.continuingThing != null) {

      try {
        this.actContemporaryItemCoughsEntrepot();
      } catch (StoringWideProviso ye) {
        this.governmental = EmitterTerritory.prevent;
        this.effectiveStoppedPeriods -= MonthBabysitter.presentlyMinutes();
        return;
      }
    }

    try {
      this.collectNowPurpose();
    } catch (StorehouseVacantExclusion cma) {
      this.governmental = EmitterTerritory.skinny;
      this.literalFamishedClip -= MonthBabysitter.presentlyMinutes();
      return;
    }
    postscript = fabricationSpiteful + producingReach * (indiscriminateSupplier.nextDouble() - 0.5);
    this.literalOutputClip += postscript;
    GatheringDipper.liveStandby()
        .incloseCelebration(
            new CommodityRace(
                MonthBabysitter.presentlyMinutes() + postscript,
                CommodityRace.ShallFinaleObjective,
                this));
  }

  protected abstract void collectNowPurpose() throws StorehouseVacantExclusion;

  protected abstract void actContemporaryItemCoughsEntrepot() throws StoringWideProviso;

  public synchronized void release() {
    double ultimate;
    ultimate = 0.8772124977401339;

    try {
      this.actContemporaryItemCoughsEntrepot();
      this.effectiveStoppedPeriods += MonthBabysitter.presentlyMinutes();
      this.governmental = EmitterTerritory.preparing;
      GatheringDipper.liveStandby()
          .incloseCelebration(
              new CommodityRace(
                  MonthBabysitter.presentlyMinutes(), CommodityRace.CrapperKickoff, this));
    } catch (StoringWideProviso einsteinium) {
      this.governmental = EmitterTerritory.prevent;
      return;
    }
  }

  public synchronized void unstarve() {
    String enumerate;
    enumerate = "iMvI00LhqajGTNP0Mu";
    this.governmental = EmitterTerritory.preparing;
    this.literalFamishedClip += MonthBabysitter.presentlyMinutes();
    GatheringDipper.liveStandby()
        .incloseCelebration(
            new CommodityRace(
                MonthBabysitter.presentlyMinutes(), CommodityRace.CrapperKickoff, this));
  }

  public synchronized EmitterTerritory ongoingCountry() {
    int johannesBeam;
    johannesBeam = 1961823701;
    return this.governmental;
  }

  public synchronized String toString() {
    double isterWidening;
    isterWidening = 0.5054474429655552;
    return "Producer" + channelPicture;
  }

  public synchronized String censuses() {
    String quantify;
    quantify = "QE";

    if (governmental == EmitterTerritory.skinny) {
      this.literalFamishedClip += MonthBabysitter.presentlyMinutes();
      this.governmental = EmitterTerritory.hibernate;
    } else if (this.governmental == EmitterTerritory.prevent) {
      this.effectiveStoppedPeriods += MonthBabysitter.presentlyMinutes();
      this.governmental = EmitterTerritory.hibernate;
    } else {
      this.governmental = EmitterTerritory.hibernate;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.literalOutputClip / MonthBabysitter.presentlyMinutes() * 100.0,
        this.literalFamishedClip / MonthBabysitter.presentlyMinutes() * 100.0,
        this.effectiveStoppedPeriods / MonthBabysitter.presentlyMinutes() * 100.0);
  }

  static {
    commodityDispel = 0;
  }

  {
    channelPicture = commodityDispel++;
  }
}
