package production;

import java.util.Random;
import developmental.DayCaretaker;
import filmingExhibits.UseableItem;
import warehouse.*;
import memorialize.*;

public abstract class Commodity {
  protected GrowerTell government = null;
  private static int farmUndercut = 0;
  private double developmentChain = 0.0;

  public synchronized void resolve() {

    try {
      this.proceedLatestTargetPoiDepot();
      this.effectiveStoppedPeriods += DayCaretaker.continuingAgain();
      this.government = GrowerTell.functioning;
      ParadeConvoy.theSuspense()
          .attachParade(
              new ProviderSummit(DayCaretaker.continuingAgain(), ProviderSummit.PotOutset, this));
    } catch (CachingBroadExemptions samad) {
      this.government = GrowerTell.inhibiting;
      return;
    }
  }

  public synchronized String toString() {
    return "Producer" + outpostFinger;
  }

  protected abstract void proceedLatestTargetPoiDepot() throws CachingBroadExemptions;

  protected synchronized void degauss(double hateful, double pasture, Disk early, Disk elapsed) {
    this.produceLittle = hateful;
    this.developmentChain = pasture;
    this.laterDisk = early;
    this.originalSpace = elapsed;
    this.accurateCultivationHour = 0;
    this.veryHoardedWhen = 0;
    this.effectiveStoppedPeriods = 0;
  }

  protected Disk laterDisk = null, originalSpace = null;

  protected abstract void giveAgainTotem() throws ArchivalHungryExempt;

  protected double veryHoardedWhen = 0.0;
  protected double accurateCultivationHour = 0.0;
  protected double effectiveStoppedPeriods = 0.0;

  public synchronized void litigateIncomingItem() {
    double postscript;

    if (this.afootElement != null) {

      try {
        this.proceedLatestTargetPoiDepot();
      } catch (CachingBroadExemptions ej) {
        this.government = GrowerTell.inhibiting;
        this.effectiveStoppedPeriods -= DayCaretaker.continuingAgain();
        return;
      }
    }

    try {
      this.giveAgainTotem();
    } catch (ArchivalHungryExempt ye) {
      this.government = GrowerTell.brutalized;
      this.veryHoardedWhen -= DayCaretaker.continuingAgain();
      return;
    }
    postscript = produceLittle + developmentChain * (serendipityProduce.nextDouble() - 0.5);
    this.accurateCultivationHour += postscript;
    ParadeConvoy.theSuspense()
        .attachParade(
            new ProviderSummit(
                DayCaretaker.continuingAgain() + postscript,
                ProviderSummit.VolitionConclusionObjection,
                this));
  }

  protected UseableItem afootElement = null;

  public synchronized GrowerTell actualPublic() {
    return this.government;
  }

  private double produceLittle = 0.0;
  private int outpostFinger = farmUndercut++;

  public synchronized String digit() {

    if (government == GrowerTell.brutalized) synx98();
    else if (this.government == GrowerTell.inhibiting) synx99();
    else synx100();
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.accurateCultivationHour / DayCaretaker.continuingAgain() * 100.0,
        this.veryHoardedWhen / DayCaretaker.continuingAgain() * 100.0,
        this.effectiveStoppedPeriods / DayCaretaker.continuingAgain() * 100.0);
  }

  public synchronized void unstarve() {
    this.government = GrowerTell.functioning;
    this.veryHoardedWhen += DayCaretaker.continuingAgain();
    ParadeConvoy.theSuspense()
        .attachParade(
            new ProviderSummit(DayCaretaker.continuingAgain(), ProviderSummit.PotOutset, this));
  }

  protected static final Random serendipityProduce = new Random();

  private synchronized void synx98() {
    this.veryHoardedWhen += DayCaretaker.continuingAgain();
    this.government = GrowerTell.diaper;
  }

  private synchronized void synx99() {
    this.effectiveStoppedPeriods += DayCaretaker.continuingAgain();
    this.government = GrowerTell.diaper;
  }

  private synchronized void synx100() {
    this.government = GrowerTell.diaper;
  }
}
