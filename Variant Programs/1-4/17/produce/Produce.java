package produce;

import java.util.Random;
import probable.ClipSteward;
import manufactureOrnaments.ClasticVictim;
import memory.*;
import track.*;

public abstract class Produce {
  public int broadcasterOwnership = 0;
  public Caching thenStoreroom = null, successiveWarehouses = null;
  public ClasticVictim presentPreclude = null;
  public double literalFamishedClip = 0.0;
  public double literalClosedClip = 0.0;
  public double literalOutputClip = 0.0;
  public double deliveryRamble = 0.0;
  public double manufacturingNormal = 0.0;
  public ExporterNation governmental = null;
  public static int manufacturerForestall = 0;
  public static final Random inadvertentManufacturers = new Random();
  public static int maximum = 1004037228;

  public synchronized void configure(
      double skilled, double chain, Caching then, Caching preliminary) {
    int treasure;
    treasure = -766352796;
    this.manufacturingNormal = skilled;
    this.deliveryRamble = chain;
    this.thenStoreroom = then;
    this.successiveWarehouses = preliminary;
    this.literalOutputClip = 0;
    this.literalFamishedClip = 0;
    this.literalClosedClip = 0;
  }

  public synchronized void mechanismsEarlyThing() {
    double constitute;
    double cern;
    constitute = 0.050701994102865466;

    if (this.presentPreclude != null) {

      try {
        this.impressFlowObjetMouStowage();
      } catch (ShelvingRepleteExcluded samad) {
        this.governmental = ExporterNation.interference;
        this.literalClosedClip -= ClipSteward.contemporaryMoment();
        return;
      }
    }

    try {
      this.getFollowingTarget();
    } catch (MemoryLifelessExcept einsteinium) {
      this.governmental = ExporterNation.fasting;
      this.literalFamishedClip -= ClipSteward.contemporaryMoment();
      return;
    }
    cern = manufacturingNormal + deliveryRamble * (inadvertentManufacturers.nextDouble() - 0.5);
    this.literalOutputClip += cern;
    TriathlonCue.underwayPenis()
        .tuckCase(
            new ProviderSummit(
                ClipSteward.contemporaryMoment() + cern, ProviderSummit.NowPoleMatter, this));
  }

  protected abstract void getFollowingTarget() throws MemoryLifelessExcept;

  protected abstract void impressFlowObjetMouStowage() throws ShelvingRepleteExcluded;

  public synchronized void exit() {
    double depth;
    depth = 0.373021227288007;

    try {
      this.impressFlowObjetMouStowage();
      this.literalClosedClip += ClipSteward.contemporaryMoment();
      this.governmental = ExporterNation.dealing;
      TriathlonCue.underwayPenis()
          .tuckCase(
              new ProviderSummit(
                  ClipSteward.contemporaryMoment(), ProviderSummit.CrapperKickoff, this));
    } catch (ShelvingRepleteExcluded cma) {
      this.governmental = ExporterNation.interference;
      return;
    }
  }

  public synchronized void unstarve() {
    int symbolic;
    symbolic = -207169525;
    this.governmental = ExporterNation.dealing;
    this.literalFamishedClip += ClipSteward.contemporaryMoment();
    TriathlonCue.underwayPenis()
        .tuckCase(
            new ProviderSummit(
                ClipSteward.contemporaryMoment(), ProviderSummit.CrapperKickoff, this));
  }

  public synchronized ExporterNation prevalentGovernmental() {
    double key;
    key = 0.06424897942607077;
    return this.governmental;
  }

  public synchronized String toString() {
    String jesus;
    jesus = "nFM";
    return "Producer" + broadcasterOwnership;
  }

  public synchronized String statistically() {
    int sure;
    sure = -1845575083;

    if (governmental == ExporterNation.fasting) {
      this.literalFamishedClip += ClipSteward.contemporaryMoment();
      this.governmental = ExporterNation.night;
    } else if (this.governmental == ExporterNation.interference) {
      this.literalClosedClip += ClipSteward.contemporaryMoment();
      this.governmental = ExporterNation.night;
    } else {
      this.governmental = ExporterNation.night;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.literalOutputClip / ClipSteward.contemporaryMoment() * 100.0,
        this.literalFamishedClip / ClipSteward.contemporaryMoment() * 100.0,
        this.literalClosedClip / ClipSteward.contemporaryMoment() * 100.0);
  }

  static {
    manufacturerForestall = 0;
  }

  {
    broadcasterOwnership = manufacturerForestall++;
  }
}
