package warehouses;

import java.util.HashMap;
import depositional.ThingCatch;
import manufactureOrnaments.NeocomianElement;
import breeder.*;
import pretence.Emulation;
import static java.lang.String.format;

public class Caching {
  public Maker ahead[];
  public static int tabulator = 0;

  public synchronized NeocomianElement thirdThing() throws DepotUnfilledCaveat {

    if (this.consider() > 0) {
      NeocomianElement ischium;
      double insetMoment;
      double undoJuncture;
      ischium = this.archivalCompilation.dismantleFreshman();
      this.intermediateMatter +=
          (this.consider() + 1)
              * (ThingCatch.thisThing() - this.latterCommemorationWeek)
              / Emulation.flowEmulation().dayBounds();
      insetMoment = this.encyclopaedia.remove(ischium);
      undoJuncture = ThingCatch.thisThing();
      this.normalClip = (normalClip * culledJewels + (undoJuncture - insetMoment)) / ++culledJewels;
      for (Maker equally : pervious) {

        if (equally.theLaw() == BreederGeneral.hindering) {
          equally.unlock();
          break;
        }
      }
      this.latterCommemorationWeek = ThingCatch.thisThing();
      return ischium;
    } else {
      throw new DepotUnfilledCaveat();
    }
  }

  public GlobularCorrelatedBlacklist<NeocomianElement> archivalCompilation;
  public HashMap<NeocomianElement, Double> encyclopaedia;

  public synchronized String surveys() {
    return format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.normalClip, this.intermediateMatter);
  }

  public Maker pervious[];

  public static synchronized int diskTrammel() {
    return Caching.shelvingThresholds;
  }

  public Caching() {
    this.archivalCompilation = new GlobularCorrelatedBlacklist<NeocomianElement>();
    this.encyclopaedia = new HashMap<NeocomianElement, Double>();
    this.peg = tabulator++;
    this.normalClip = 0;
    this.culledJewels = 0;
    this.intermediateMatter = 0;
    this.latterCommemorationWeek = 0;
  }

  public double normalClip;

  public synchronized void putFuture(Maker... come) {
    this.ahead = come;
  }

  public synchronized void prepareCurrent(Maker... late) {
    this.pervious = late;
  }

  public static synchronized void orderedRepositoryThreshold(int warehousingRestriction) {

    if (warehousingRestriction > 0) Caching.shelvingThresholds = warehousingRestriction;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public double latterCommemorationWeek;
  public static int shelvingThresholds = 1;
  public double intermediateMatter;

  public synchronized int consider() {
    return this.archivalCompilation.figure();
  }

  public synchronized String toString() {
    return "Storage" + peg;
  }

  public int peg;

  public synchronized void additionsAppropriation(NeocomianElement purpose)
      throws DepotEntireCaveat {

    if (this.archivalCompilation.figure() < Caching.shelvingThresholds) {
      this.archivalCompilation.deleteClosing(purpose);
      this.intermediateMatter +=
          (this.consider() - 1)
              * (ThingCatch.thisThing() - this.latterCommemorationWeek)
              / Emulation.flowEmulation().dayBounds();
      this.encyclopaedia.put(purpose, ThingCatch.thisThing());
      this.latterCommemorationWeek = ThingCatch.thisThing();
      for (Maker leong : ahead) {

        if (leong.theLaw() == BreederGeneral.malnourished) {
          leong.unstarve();
          return;
        }
      }
    } else {
      throw new DepotEntireCaveat();
    }
  }

  public double culledJewels;
}
