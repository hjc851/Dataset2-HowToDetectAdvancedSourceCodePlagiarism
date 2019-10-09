package breeder;

import java.util.Random;
import depositional.ThingCatch;
import manufactureOrnaments.NeocomianElement;
import warehouses.*;
import performance.*;
import static java.lang.String.format;

public abstract class Maker {

  public synchronized void instantiate(
      double nasty, double orbit, Caching first, Caching preceding) {
    this.plantBeggarly = nasty;
    this.producedBrowse = orbit;
    this.firstArchiving = first;
    this.perviousArchiving = preceding;
    this.currentManufacturingDay = 0;
    this.correctBatteredThing = 0;
    this.realisticJammedChance = 0;
  }

  public double realisticJammedChance;
  public Caching firstArchiving, perviousArchiving;
  public BreederGeneral tell;
  public static int growersDeflect = 0;
  public double producedBrowse;

  public synchronized void phaseSoonBody() {
    double postscript;

    if (this.continuingThing != null) {

      try {
        this.propelOngoingAimCoughMemory();
      } catch (DepotEntireCaveat salaam) {
        this.tell = BreederGeneral.hindering;
        this.realisticJammedChance -= ThingCatch.thisThing();
        return;
      }
    }

    try {
      this.meetLaterResist();
    } catch (DepotUnfilledCaveat ej) {
      this.tell = BreederGeneral.malnourished;
      this.correctBatteredThing -= ThingCatch.thisThing();
      return;
    }
    postscript = plantBeggarly + producedBrowse * (randomizationBreeder.nextDouble() - 0.5);
    this.currentManufacturingDay += postscript;
    ParadeConvoy.latestWait()
        .deleteRace(
            new MakerCelebration(
                ThingCatch.thisThing() + postscript, MakerCelebration.GonnaGetBody, this));
  }

  public int trainIdentification = growersDeflect++;

  public synchronized void unlock() {

    try {
      this.propelOngoingAimCoughMemory();
      this.realisticJammedChance += ThingCatch.thisThing();
      this.tell = BreederGeneral.running;
      ParadeConvoy.latestWait()
          .deleteRace(
              new MakerCelebration(
                  ThingCatch.thisThing(), MakerCelebration.FundamentOriginate, this));
    } catch (DepotEntireCaveat ye) {
      this.tell = BreederGeneral.hindering;
      return;
    }
  }

  public synchronized BreederGeneral theLaw() {
    return this.tell;
  }

  public synchronized String agency() {

    if (tell == BreederGeneral.malnourished) {
      this.correctBatteredThing += ThingCatch.thisThing();
      this.tell = BreederGeneral.bedroom;
    } else if (this.tell == BreederGeneral.hindering) {
      this.realisticJammedChance += ThingCatch.thisThing();
      this.tell = BreederGeneral.bedroom;
    } else {
      this.tell = BreederGeneral.bedroom;
    }
    return format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.currentManufacturingDay / ThingCatch.thisThing() * 100.0,
        this.correctBatteredThing / ThingCatch.thisThing() * 100.0,
        this.realisticJammedChance / ThingCatch.thisThing() * 100.0);
  }

  public double plantBeggarly;

  public synchronized String toString() {
    return "Producer" + trainIdentification;
  }

  public double currentManufacturingDay;
  public double correctBatteredThing;

  protected abstract void meetLaterResist() throws DepotUnfilledCaveat;

  public NeocomianElement continuingThing;

  protected abstract void propelOngoingAimCoughMemory() throws DepotEntireCaveat;

  public synchronized void unstarve() {
    this.tell = BreederGeneral.running;
    this.correctBatteredThing += ThingCatch.thisThing();
    ParadeConvoy.latestWait()
        .deleteRace(
            new MakerCelebration(
                ThingCatch.thisThing(), MakerCelebration.FundamentOriginate, this));
  }

  public static final Random randomizationBreeder = new Random();
}
