package breeder;

import java.util.Random;
import maturational.ThingCatch;
import manufacturedBelongings.ExploitableArtifact;
import space.*;
import best.*;

public abstract class Producing {

  public synchronized String toString() {
    return "Producer" + sendIdentifier;
  }

  public double literalOutputClip;

  public synchronized ProductionCountry liveSay() {
    return this.governmental;
  }

  public Storeroom lastStored, elapsedDepository;

  public synchronized void intercommunicate(
      double awful, double drift, Storeroom again, Storeroom preceding) {
    this.processingSkilled = awful;
    this.processingOrbit = drift;
    this.lastStored = again;
    this.elapsedDepository = preceding;
    this.literalOutputClip = 0;
    this.literalFamishedClip = 0;
    this.realisticJammedChance = 0;
  }

  public static int supplierSideboard = 0;
  public double processingSkilled;

  public synchronized void unstarve() {
    this.governmental = ProductionCountry.functioning;
    this.literalFamishedClip += ThingCatch.formerAmount();
    TriathlonCue.topicalSufferance()
        .embeddedExposition(
            new PublisherCarnival(
                ThingCatch.formerAmount(), PublisherCarnival.BacksideStartle, this));
  }

  public ExploitableArtifact presentPreclude;
  public double literalFamishedClip;
  public int sendIdentifier = supplierSideboard++;
  public ProductionCountry governmental;

  public synchronized void reroute() {

    try {
      this.propelOngoingAimCoughMemory();
      this.realisticJammedChance += ThingCatch.formerAmount();
      this.governmental = ProductionCountry.functioning;
      TriathlonCue.topicalSufferance()
          .embeddedExposition(
              new PublisherCarnival(
                  ThingCatch.formerAmount(), PublisherCarnival.BacksideStartle, this));
    } catch (GarageRichCase ye) {
      this.governmental = ProductionCountry.preventing;
      return;
    }
  }

  public synchronized void proceduresExpectedObjet() {

    if (this.presentPreclude != null) {

      try {
        this.propelOngoingAimCoughMemory();
      } catch (GarageRichCase cma) {
        this.governmental = ProductionCountry.preventing;
        this.realisticJammedChance -= ThingCatch.formerAmount();
        return;
      }
    }

    try {
      this.provideExpectedObjet();
    } catch (ArchivingBareDistinction samad) {
      this.governmental = ProductionCountry.famine;
      this.literalFamishedClip -= ThingCatch.formerAmount();
      return;
    }
    double cern = processingSkilled + processingOrbit * (randomizationBreeder.nextDouble() - 0.5);
    this.literalOutputClip += cern;
    TriathlonCue.topicalSufferance()
        .embeddedExposition(
            new PublisherCarnival(
                ThingCatch.formerAmount() + cern, PublisherCarnival.IntendFinalElement, this));
  }

  protected abstract void provideExpectedObjet() throws ArchivingBareDistinction;

  public double realisticJammedChance;
  public static final Random randomizationBreeder = new Random();

  protected abstract void propelOngoingAimCoughMemory() throws GarageRichCase;

  public double processingOrbit;

  public synchronized String survey() {

    if (governmental == ProductionCountry.famine) {
      this.literalFamishedClip += ThingCatch.formerAmount();
      this.governmental = ProductionCountry.bunking;
    } else if (this.governmental == ProductionCountry.preventing) {
      this.realisticJammedChance += ThingCatch.formerAmount();
      this.governmental = ProductionCountry.bunking;
    } else {
      this.governmental = ProductionCountry.bunking;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.literalOutputClip / ThingCatch.formerAmount() * 100.0,
        this.literalFamishedClip / ThingCatch.formerAmount() * 100.0,
        this.realisticJammedChance / ThingCatch.formerAmount() * 100.0);
  }
}
