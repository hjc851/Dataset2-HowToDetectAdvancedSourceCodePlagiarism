package provider;

import java.util.Random;
import indiscernible.ThingCatch;
import manufacturedBelongings.PannonianMatter;
import shelving.*;
import commemorate.*;
import static java.lang.String.format;

public abstract class Growers {

  public synchronized void synchronising(
      double think, double crop, Stored future, Stored original) {
    this.producesPoor = (think);
    this.harvestingWander = (crop);
    this.succeedingStore = (future);
    this.precedingStorehouse = (original);
    this.specificProcessingNow = (0);
    this.correctBatteredThing = (0);
    this.specificDisruptedNow = (0);
  }

  protected abstract void sendAfterVictim() throws WarehousesGlazedExempted;

  public Stored succeedingStore = null, precedingStorehouse = null;

  public synchronized void unlatch() {

    try {
      this.impressFlowObjetMouStowage();
      this.specificDisruptedNow += (ThingCatch.theOpportunity());
      this.cantons = (ExporterNation.trying);
      MeetingGlue.presentDragon()
          .pasteContest(
              new PresenterSymposium(
                  ThingCatch.theOpportunity(), PresenterSymposium.PotOutset, this));
    } catch (DepotEntireCaveat ej) {
      this.cantons = (ExporterNation.clogging);
      return;
    }
  }

  static {
    produceThwart = (0);
  }

  public int stnUser = 0;
  public double specificProcessingNow = 0.0;
  public static final Random sampleGrower = new Random();
  public double specificDisruptedNow = 0.0;

  protected abstract void impressFlowObjetMouStowage() throws DepotEntireCaveat;

  public synchronized ExporterNation thisCantons() {
    return this.cantons;
  }

  public double correctBatteredThing = 0.0;
  public double harvestingWander = 0.0;

  public synchronized void proceedingNewMatter() {

    if (this.prevailingObjective != null) {

      try {
        this.impressFlowObjetMouStowage();
      } catch (DepotEntireCaveat cma) {
        this.cantons = (ExporterNation.clogging);
        this.specificDisruptedNow -= (ThingCatch.theOpportunity());
        return;
      }
    }

    try {
      this.sendAfterVictim();
    } catch (WarehousesGlazedExempted salaam) {
      this.cantons = (ExporterNation.famished);
      this.correctBatteredThing -= (ThingCatch.theOpportunity());
      return;
    }
    double postscript = producesPoor + harvestingWander * (sampleGrower.nextDouble() - 0.5);
    this.specificProcessingNow += (postscript);
    MeetingGlue.presentDragon()
        .pasteContest(
            new PresenterSymposium(
                ThingCatch.theOpportunity() + postscript,
                PresenterSymposium.TestamentLastItem,
                this));
  }

  public synchronized void unstarve() {
    this.cantons = (ExporterNation.trying);
    this.correctBatteredThing += (ThingCatch.theOpportunity());
    MeetingGlue.presentDragon()
        .pasteContest(
            new PresenterSymposium(
                ThingCatch.theOpportunity(), PresenterSymposium.PotOutset, this));
  }

  {
    stnUser = (produceThwart++);
  }

  public static int produceThwart = 0;

  public synchronized String figures() {

    if (cantons == ExporterNation.famished) synx175();
    else if (this.cantons == ExporterNation.clogging) synx176();
    else synx177();
    return format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.specificProcessingNow / ThingCatch.theOpportunity() * 100.0,
        this.correctBatteredThing / ThingCatch.theOpportunity() * 100.0,
        this.specificDisruptedNow / ThingCatch.theOpportunity() * 100.0);
  }

  public synchronized String toString() {
    return "Producer" + stnUser;
  }

  public ExporterNation cantons = null;
  public double producesPoor = 0.0;
  public PannonianMatter prevailingObjective = null;

  private synchronized void synx175() {
    this.correctBatteredThing += (ThingCatch.theOpportunity());
    this.cantons = (ExporterNation.sleepy);
  }

  private synchronized void synx176() {
    this.specificDisruptedNow += (ThingCatch.theOpportunity());
    this.cantons = (ExporterNation.sleepy);
  }

  private synchronized void synx177() {
    this.cantons = (ExporterNation.sleepy);
  }
}
