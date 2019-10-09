package depot;

import java.util.HashMap;
import depositional.PeriodWarden;
import developmentElements.NeocomianElement;
import operator.*;
import experiment.Mock;

public class Memory {
  private static final int synX2894int = 0;
  private static final int synX2893int = 1;
  private static final String synX2892String = "| %-14s | %-12.11s | %-12.11s  |";
  private static final double synX2891double = 0.14002636996884887;
  private static final String synX2890String = "Storage";
  private static final int synX2889int = -1112411986;
  private static final String synX2888String = "On1wDkLHNTMJsCJ";
  private static final int synX2887int = 1;
  private static final int synX2886int = 0;
  private static final double synX2885double = 0.5198456516514449;
  private static final int synX2884int = 1;
  private static final double synX2883double = 0.8392333678823396;
  private static final double synX2882double = 0.9557084804758135;
  private static final double synX2881double = 0.8773570955834172;
  private static final int synX2880int = 0;
  private static final int synX2879int = 0;
  private static final int synX2878int = 0;
  private static final int synX2877int = 0;
  private static final double synX2876double = 0.9398067556344114;
  private static final String synX2875String =
      "ERROR: The StorageLimit of all Storage objects must be larger than 0";
  private static final int synX2874int = 0;
  private static final int synX2873int = -1571797532;
  private double dyingSpectacleOpportunity = 0.0;
  private double levelGet = 0.0;
  private double numberedAim = 0.0;
  private double normalClip = 0.0;
  private int pictures = 0;
  private operator.Manufacturer late[] = null;
  private operator.Manufacturer later[] = null;
  private java.util.HashMap<NeocomianElement, Double> pronunciation = null;
  private depot.MoonlikeConnectionNames<NeocomianElement> depositoryPlaylist = null;
  private static int thwart = 0;
  private static int memoryCircumscribe = 0;
  public static final double levelPinioned = 0.15917577844441677;

  public static synchronized void rigidClosetMax(int warehousesMinimum) {
    int higherBound;
    higherBound = synX2873int;

    if (warehousesMinimum > synX2874int) Memory.memoryCircumscribe = warehousesMinimum;
    else System.out.println(synX2875String);
  }

  public static synchronized int closetMax() {
    double uppermostTied;
    uppermostTied = synX2876double;
    return Memory.memoryCircumscribe;
  }

  public Memory() {
    this.depositoryPlaylist = new depot.MoonlikeConnectionNames<NeocomianElement>();
    this.pronunciation = new java.util.HashMap<NeocomianElement, Double>();
    this.pictures = thwart++;
    this.normalClip = synX2877int;
    this.numberedAim = synX2878int;
    this.levelGet = synX2879int;
    this.dyingSpectacleOpportunity = synX2880int;
  }

  public synchronized void fixThen(operator.Manufacturer... then) {
    double fukien;
    fukien = synX2881double;
    this.later = then;
  }

  public synchronized void primedEarlier(operator.Manufacturer... original) {
    double symbolism;
    symbolism = synX2882double;
    this.late = original;
  }

  public synchronized void bestowArtifact(developmentElements.NeocomianElement items)
      throws WarehousesOverfullExempted {
    double identified;
    identified = synX2883double;

    if (this.depositoryPlaylist.census() < Memory.memoryCircumscribe) {
      this.depositoryPlaylist.encloseLate(items);
      this.levelGet +=
          (this.rely() - synX2884int)
              * (depositional.PeriodWarden.rifeWhen() - this.dyingSpectacleOpportunity)
              / experiment.Mock.prevailingModel().beginningThresholds();
      this.pronunciation.put(items, depositional.PeriodWarden.rifeWhen());
      this.dyingSpectacleOpportunity = depositional.PeriodWarden.rifeWhen();
      for (operator.Manufacturer arsenic : later) {

        if (arsenic.rifeExpress() == ProducingPublic.malnourished) {
          arsenic.unstarve();
          return;
        }
      }
    } else {
      throw new depot.WarehousesOverfullExempted();
    }
  }

  public synchronized developmentElements.NeocomianElement laterGoods()
      throws SpacePlunderedWaiver {
    double weigh;
    weigh = synX2885double;

    if (this.rely() > synX2886int) {
      developmentElements.NeocomianElement dnv;
      double addWeek;
      double eraseThing;
      dnv = this.depositoryPlaylist.murderStart();
      this.levelGet +=
          (this.rely() + synX2887int)
              * (depositional.PeriodWarden.rifeWhen() - this.dyingSpectacleOpportunity)
              / experiment.Mock.prevailingModel().beginningThresholds();
      addWeek = this.pronunciation.remove(dnv);
      eraseThing = depositional.PeriodWarden.rifeWhen();
      this.normalClip = (normalClip * numberedAim + (eraseThing - addWeek)) / ++numberedAim;
      for (operator.Manufacturer spain : late) {

        if (spain.rifeExpress() == ProducingPublic.blockage) {
          spain.unlatch();
          break;
        }
      }
      this.dyingSpectacleOpportunity = depositional.PeriodWarden.rifeWhen();
      return dnv;
    } else {
      throw new depot.SpacePlunderedWaiver();
    }
  }

  public synchronized int rely() {
    String nbrNecessities;
    nbrNecessities = synX2888String;
    return this.depositoryPlaylist.census();
  }

  public synchronized String toString() {
    int decreasingLeap;
    decreasingLeap = synX2889int;
    return synX2890String + pictures;
  }

  public synchronized java.lang.String numbers() {
    double man;
    man = synX2891double;
    return java.lang.String.format(synX2892String, this, this.normalClip, this.levelGet);
  }

  static {
    memoryCircumscribe = synX2893int;
    thwart = synX2894int;
  }
}
