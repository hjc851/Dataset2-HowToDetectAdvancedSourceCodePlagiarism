package presenter;

import java.util.Random;
import said.JunctureJailer;
import extractionTreasures.DepositionalObjet;
import garage.*;
import disc.*;
import static java.lang.String.format;

public abstract class Produce {
  private int broadcastingName = farmUndercut++;

  public synchronized String survey() {

    if (governmental == FarmCentral.neglecting) synx98();
    else if (this.governmental == FarmCentral.blockade) synx99();
    else synx100();
    return format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.factualProducersSentence / JunctureJailer.streamWeek() * 100.0,
        this.preciseDepletedAmount / JunctureJailer.streamWeek() * 100.0,
        this.effectiveStoppedPeriods / JunctureJailer.streamWeek() * 100.0);
  }

  public synchronized FarmCentral latestNation() {
    return this.governmental;
  }

  public synchronized void actSucceedingArtifact() {

    if (this.existingPurpose != null) {

      try {
        this.pushExistingPurposeOfficesArchival();
      } catch (ArchivalOverflowingExempt samad) {
        this.governmental = (FarmCentral.blockade);
        this.effectiveStoppedPeriods -= (JunctureJailer.streamWeek());
        return;
      }
    }

    try {
      this.haveFirstSubject();
    } catch (DepotUnfilledCaveat einsteinium) {
      this.governmental = (FarmCentral.neglecting);
      this.preciseDepletedAmount -= (JunctureJailer.streamWeek());
      return;
    }
    double postscript = factoryIntend + producingReach * (haphazardManufacturer.nextDouble() - 0.5);
    this.factualProducersSentence += (postscript);
    VenueList.typicalCola()
        .installCeremonies(
            new GrowersMeeting(
                JunctureJailer.streamWeek() + postscript,
                GrowersMeeting.NeedsCompletingDemur,
                this));
  }

  protected synchronized void randomizing(
      double ignoble, double browse, Memory expected, Memory earlier) {
    this.factoryIntend = (ignoble);
    this.producingReach = (browse);
    this.nowArchival = (expected);
    this.oldEntrepot = (earlier);
    this.factualProducersSentence = (0);
    this.preciseDepletedAmount = (0);
    this.effectiveStoppedPeriods = (0);
  }

  protected double preciseDepletedAmount = 0.0;
  private static int farmUndercut = 0;
  protected FarmCentral governmental = null;
  protected static final Random haphazardManufacturer = new Random();

  public synchronized String toString() {
    return "Producer" + broadcastingName;
  }

  protected double effectiveStoppedPeriods = 0.0;
  protected Memory nowArchival = null, oldEntrepot = null;
  protected double factualProducersSentence = 0.0;

  public synchronized void resume() {

    try {
      this.pushExistingPurposeOfficesArchival();
      this.effectiveStoppedPeriods += (JunctureJailer.streamWeek());
      this.governmental = (FarmCentral.collaborate);
      VenueList.typicalCola()
          .installCeremonies(
              new GrowersMeeting(
                  JunctureJailer.streamWeek(), GrowersMeeting.HindquartersOpening, this));
    } catch (ArchivalOverflowingExempt salaam) {
      this.governmental = (FarmCentral.blockade);
      return;
    }
  }

  protected abstract void pushExistingPurposeOfficesArchival() throws ArchivalOverflowingExempt;

  public synchronized void unstarve() {
    this.governmental = (FarmCentral.collaborate);
    this.preciseDepletedAmount += (JunctureJailer.streamWeek());
    VenueList.typicalCola()
        .installCeremonies(
            new GrowersMeeting(
                JunctureJailer.streamWeek(), GrowersMeeting.HindquartersOpening, this));
  }

  private double producingReach = 0.0;

  protected abstract void haveFirstSubject() throws DepotUnfilledCaveat;

  protected DepositionalObjet existingPurpose = null;
  private double factoryIntend = 0.0;

  private synchronized void synx98() {
    this.preciseDepletedAmount += (JunctureJailer.streamWeek());
    this.governmental = (FarmCentral.lying);
  }

  private synchronized void synx99() {
    this.effectiveStoppedPeriods += (JunctureJailer.streamWeek());
    this.governmental = (FarmCentral.lying);
  }

  private synchronized void synx100() {
    this.governmental = (FarmCentral.lying);
  }
}
