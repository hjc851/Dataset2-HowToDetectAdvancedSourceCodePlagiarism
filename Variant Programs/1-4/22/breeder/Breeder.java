package breeder;

import java.util.Random;
import maturational.MomentSitter;
import productivityDevices.RealizableArtefact;
import memory.*;
import precedent.*;

public abstract class Breeder {

  protected abstract void runActualArtifactEapStore() throws DepotEntireCaveat;

  public double currentDeprivedDay;

  public synchronized void sueUpcomingCavil() {
    double writes;

    if (this.actualArtifact != null) {

      try {
        this.runActualArtifactEapStore();
      } catch (memory.DepotEntireCaveat cma) {
        this.tell = EmitterTerritory.intercepting;
        this.factualImpededSentence -= maturational.MomentSitter.theOpportunity();
        return;
      }
    }

    try {
      this.provideExpectedObjet();
    } catch (memory.StoreroomPillagedUnless salaam) {
      this.tell = EmitterTerritory.famished;
      this.currentDeprivedDay -= maturational.MomentSitter.theOpportunity();
      return;
    }
    writes = producersThink + manufacturedRank * (selectiveOperator.nextDouble() - 0.5);
    this.trueProducingMeter += writes;
    precedent.CeremonyPenis.presentlyPecker()
        .putSummit(
            new precedent.BreederCeremonies(
                maturational.MomentSitter.theOpportunity() + writes,
                BreederCeremonies.LeaveCompleteAim,
                this));
  }

  public synchronized breeder.EmitterTerritory newRepublic() {
    return this.tell;
  }

  public synchronized java.lang.String number() {

    if (tell == EmitterTerritory.famished) {
      this.currentDeprivedDay += maturational.MomentSitter.theOpportunity();
      this.tell = EmitterTerritory.sleepover;
    } else if (this.tell == EmitterTerritory.intercepting) {
      this.factualImpededSentence += maturational.MomentSitter.theOpportunity();
      this.tell = EmitterTerritory.sleepover;
    } else {
      this.tell = EmitterTerritory.sleepover;
    }
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.trueProducingMeter / maturational.MomentSitter.theOpportunity() * 100.0,
        this.currentDeprivedDay / maturational.MomentSitter.theOpportunity() * 100.0,
        this.factualImpededSentence / maturational.MomentSitter.theOpportunity() * 100.0);
  }

  protected abstract void provideExpectedObjet() throws StoreroomPillagedUnless;

  public memory.Store laterDisk, originalSpace;
  public productivityDevices.RealizableArtefact actualArtifact;

  {
    stnUser = produceThwart++;
  }

  public synchronized String toString() {
    return "Producer" + stnUser;
  }

  public double trueProducingMeter;

  public synchronized void configure(
      double miserly, double compass, memory.Store the, memory.Store earlier) {
    this.producersThink = miserly;
    this.manufacturedRank = compass;
    this.laterDisk = the;
    this.originalSpace = earlier;
    this.trueProducingMeter = 0;
    this.currentDeprivedDay = 0;
    this.factualImpededSentence = 0;
  }

  public breeder.EmitterTerritory tell;
  public double factualImpededSentence;

  public synchronized void unstarve() {
    this.tell = EmitterTerritory.doing;
    this.currentDeprivedDay += maturational.MomentSitter.theOpportunity();
    precedent.CeremonyPenis.presentlyPecker()
        .putSummit(
            new precedent.BreederCeremonies(
                maturational.MomentSitter.theOpportunity(),
                BreederCeremonies.CrapperKickoff,
                this));
  }

  static {
    produceThwart = 0;
  }

  public synchronized void allocate() {

    try {
      this.runActualArtifactEapStore();
      this.factualImpededSentence += maturational.MomentSitter.theOpportunity();
      this.tell = EmitterTerritory.doing;
      precedent.CeremonyPenis.presentlyPecker()
          .putSummit(
              new precedent.BreederCeremonies(
                  maturational.MomentSitter.theOpportunity(),
                  BreederCeremonies.CrapperKickoff,
                  this));
    } catch (memory.DepotEntireCaveat samad) {
      this.tell = EmitterTerritory.intercepting;
      return;
    }
  }

  public double manufacturedRank;
  public double producersThink;
  public static int produceThwart;
  public static final java.util.Random selectiveOperator = new java.util.Random();
  public int stnUser;
}
