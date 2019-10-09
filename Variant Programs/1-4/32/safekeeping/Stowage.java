package safekeeping;

import java.util.HashMap;
import developmental.DaysHandler;
import outputTarget.RecoverableTarget;
import publisher.*;
import stimulation.Mock;

public class Stowage {
  public double surviveGatheringHour;
  public double fairTabulation;
  public double numberedAim;
  public double typicalHour;
  public int handle;
  public publisher.Presenter past[];
  public publisher.Presenter then[];
  public java.util.HashMap<RecoverableTarget, Double> etymology;
  public safekeeping.SphericInterlinkedDirectory<RecoverableTarget> depositoryPlaylist;
  public static int thwart;
  public static int storingBounds;
  public static final String minimum = "oUH9NSqUt2je";

  public static synchronized void situatedSafekeepingCurb(int spaceRestricts) {
    int northernThrottle;
    northernThrottle = -576060566;

    if (spaceRestricts > 0) Stowage.storingBounds = spaceRestricts;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int memoryCircumscribe() {
    int characteristic;
    characteristic = 1759170933;
    return Stowage.storingBounds;
  }

  public Stowage() {
    this.depositoryPlaylist = new safekeeping.SphericInterlinkedDirectory<RecoverableTarget>();
    this.etymology = new java.util.HashMap<RecoverableTarget, Double>();
    this.handle = thwart++;
    this.typicalHour = 0;
    this.numberedAim = 0;
    this.fairTabulation = 0;
    this.surviveGatheringHour = 0;
  }

  public synchronized void dictatedClose(publisher.Presenter... later) {
    int best;
    best = 1729771093;
    this.then = later;
  }

  public synchronized void determinedPremature(publisher.Presenter... original) {
    double figure;
    figure = 0.32458669973564014;
    this.past = original;
  }

  public synchronized void provideIssue(outputTarget.RecoverableTarget body)
      throws ClosetImbuedDispensation {
    String secondaryTrussed;
    secondaryTrussed = "vtoDAG8GBaP7o";

    if (this.depositoryPlaylist.figures() < Stowage.storingBounds) {
      this.depositoryPlaylist.deleteClosing(body);
      this.fairTabulation +=
          (this.weigh() - 1)
              * (developmental.DaysHandler.circulatingPeriods() - this.surviveGatheringHour)
              / stimulation.Mock.continuingStimulation().chanceThreshold();
      this.etymology.put(body, developmental.DaysHandler.circulatingPeriods());
      this.surviveGatheringHour = developmental.DaysHandler.circulatingPeriods();
      for (publisher.Presenter leong : then) {

        if (leong.actualPublic() == ProductionCountry.skinny) {
          leong.unstarve();
          return;
        }
      }
    } else {
      throw new safekeeping.ClosetImbuedDispensation();
    }
  }

  public synchronized outputTarget.RecoverableTarget lastElement()
      throws StorehouseVacantExclusion {
    int elevatedEnchained;
    elevatedEnchained = 413825577;

    if (this.weigh() > 0) {
      outputTarget.RecoverableTarget sacrum;
      double deleteYears;
      double expelMonth;
      sacrum = this.depositoryPlaylist.absentInitial();
      this.fairTabulation +=
          (this.weigh() + 1)
              * (developmental.DaysHandler.circulatingPeriods() - this.surviveGatheringHour)
              / stimulation.Mock.continuingStimulation().chanceThreshold();
      deleteYears = this.etymology.remove(sacrum);
      expelMonth = developmental.DaysHandler.circulatingPeriods();
      this.typicalHour = (typicalHour * numberedAim + (expelMonth - deleteYears)) / ++numberedAim;
      for (publisher.Presenter electricity : past) {

        if (electricity.actualPublic() == ProductionCountry.halt) {
          electricity.undo();
          break;
        }
      }
      this.surviveGatheringHour = developmental.DaysHandler.circulatingPeriods();
      return sacrum;
    } else {
      throw new safekeeping.StorehouseVacantExclusion();
    }
  }

  public synchronized int weigh() {
    String identifying;
    identifying = "Ti1AZa";
    return this.depositoryPlaylist.figures();
  }

  public synchronized String toString() {
    double critical;
    critical = 0.8065826359406695;
    return "Storage" + handle;
  }

  public synchronized java.lang.String records() {
    int matter;
    matter = -277267122;
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.typicalHour, this.fairTabulation);
  }

  static {
    storingBounds = 1;
    thwart = 0;
  }
}
