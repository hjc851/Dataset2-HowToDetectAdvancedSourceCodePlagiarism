package filmmaker;

import java.util.Random;
import ontogenetic.NowDoorman;
import supplyArtefact.PerformableObjection;
import stored.*;
import annals.*;

public abstract class Provider {
  private int terminusMap = growerHeel++;
  protected Safekeeping secondCaching = null, predecessorInventory = null;
  protected PerformableObjection presentPreclude = null;
  protected double factualMalnourishedSentence = 0.0;
  protected double correctSuspendedThing = 0.0;
  protected double empiricalProducesWeek = 0.0;
  private double outputScope = 0.0;
  private double producedMingy = 0.0;
  protected FilmmakerSay statehood = null;
  private static int growerHeel = 0;
  protected static final Random haphazardManufacturer = new Random();

  protected synchronized void recompile(
      double stingy, double scope, Safekeeping forthcoming, Safekeeping successive) {
    this.producedMingy = stingy;
    this.outputScope = scope;
    this.secondCaching = forthcoming;
    this.predecessorInventory = successive;
    this.empiricalProducesWeek = 0;
    this.factualMalnourishedSentence = 0;
    this.correctSuspendedThing = 0;
  }

  public synchronized void sueUpcomingCavil() {
    double cern;

    if (this.presentPreclude != null) {

      try {
        this.travelCirculatingSubjectEfpArchiving();
      } catch (StoringWideProviso einsteinium) {
        this.statehood = FilmmakerSay.locking;
        this.correctSuspendedThing -= NowDoorman.latestClip();
        return;
      }
    }

    try {
      this.recipientComeDisagree();
    } catch (CachingVoidExemptions ej) {
      this.statehood = FilmmakerSay.fasting;
      this.factualMalnourishedSentence -= NowDoorman.latestClip();
      return;
    }
    cern = producedMingy + outputScope * (haphazardManufacturer.nextDouble() - 0.5);
    this.empiricalProducesWeek += cern;
    GalaLine.topicalSufferance()
        .injectingSpectacle(
            new GrowerParade(NowDoorman.latestClip() + cern, GrowerParade.PlansWrapObjet, this));
  }

  protected abstract void recipientComeDisagree() throws CachingVoidExemptions;

  protected abstract void travelCirculatingSubjectEfpArchiving() throws StoringWideProviso;

  public synchronized void unclog() {

    try {
      this.travelCirculatingSubjectEfpArchiving();
      this.correctSuspendedThing += NowDoorman.latestClip();
      this.statehood = FilmmakerSay.struggling;
      GalaLine.topicalSufferance()
          .injectingSpectacle(
              new GrowerParade(NowDoorman.latestClip(), GrowerParade.JohnPart, this));
    } catch (StoringWideProviso salaam) {
      this.statehood = FilmmakerSay.locking;
      return;
    }
  }

  public synchronized void unstarve() {
    this.statehood = FilmmakerSay.struggling;
    this.factualMalnourishedSentence += NowDoorman.latestClip();
    GalaLine.topicalSufferance()
        .injectingSpectacle(new GrowerParade(NowDoorman.latestClip(), GrowerParade.JohnPart, this));
  }

  public synchronized FilmmakerSay flowNational() {
    return this.statehood;
  }

  public synchronized String toString() {
    return "Producer" + terminusMap;
  }

  public synchronized String stats() {

    if (statehood == FilmmakerSay.fasting) synx28();
    else if (this.statehood == FilmmakerSay.locking) synx29();
    else synx30();
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.empiricalProducesWeek / NowDoorman.latestClip() * 100.0,
        this.factualMalnourishedSentence / NowDoorman.latestClip() * 100.0,
        this.correctSuspendedThing / NowDoorman.latestClip() * 100.0);
  }

  private synchronized void synx28() {
    this.factualMalnourishedSentence += NowDoorman.latestClip();
    this.statehood = FilmmakerSay.bedroom;
  }

  private synchronized void synx29() {
    this.correctSuspendedThing += NowDoorman.latestClip();
    this.statehood = FilmmakerSay.bedroom;
  }

  private synchronized void synx30() {
    this.statehood = FilmmakerSay.bedroom;
  }
}
