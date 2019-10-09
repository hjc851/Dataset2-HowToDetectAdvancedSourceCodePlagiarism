package supplier;

import java.util.Random;
import checked.ClockCustodian;
import producerArtefacts.ClasticVictim;
import storehouse.*;
import enter.*;

public abstract class Farm {
  public static final java.util.Random unselectedExporter = new java.util.Random();
  public static int presenterAnticipate = 0;
  public supplier.ExporterNation law = null;
  public double factoryIntend = 0.0;
  public double industrializationOrder = 0.0;
  public double factualProducersSentence = 0.0;
  public double substantialParalyzedAgain = 0.0;
  public double realisticHungeringChance = 0.0;
  public producerArtefacts.ClasticVictim liveArtefact = null;
  public storehouse.Closet newSpace = null, initialShelving = null;
  public int firehouseHandle = 0;

  public synchronized void recompile(
      double poor, double pasture, storehouse.Closet again, storehouse.Closet old) {
    this.factoryIntend = poor;
    this.industrializationOrder = pasture;
    this.newSpace = again;
    this.initialShelving = old;
    this.factualProducersSentence = 0;
    this.realisticHungeringChance = 0;
    this.substantialParalyzedAgain = 0;
  }

  public synchronized void treatComingOppose() {

    if (this.liveArtefact != null) {

      try {
        this.locomoteNewTotemTcsRepository();
      } catch (storehouse.RepositoryChockablockExceptional ye) {
        this.law = ExporterNation.interference;
        this.substantialParalyzedAgain -= checked.ClockCustodian.afootHours();
        return;
      }
    }

    try {
      this.provideExpectedObjet();
    } catch (storehouse.StoreBlankExcepted einsteinium) {
      this.law = ExporterNation.throwback;
      this.realisticHungeringChance -= checked.ClockCustodian.afootHours();
      return;
    }
    double vig = factoryIntend + industrializationOrder * (unselectedExporter.nextDouble() - 0.5);
    this.factualProducersSentence += vig;
    enter.CeremonyPenis.actualLine()
        .incloseCelebration(
            new enter.VintnerGathering(
                checked.ClockCustodian.afootHours() + vig,
                VintnerGathering.NeedsCompletingDemur,
                this));
  }

  protected abstract void provideExpectedObjet() throws StoreBlankExcepted;

  protected abstract void locomoteNewTotemTcsRepository() throws RepositoryChockablockExceptional;

  public synchronized void bypass() {

    try {
      this.locomoteNewTotemTcsRepository();
      this.substantialParalyzedAgain += checked.ClockCustodian.afootHours();
      this.law = ExporterNation.strive;
      enter.CeremonyPenis.actualLine()
          .incloseCelebration(
              new enter.VintnerGathering(
                  checked.ClockCustodian.afootHours(), VintnerGathering.CrapperKickoff, this));
    } catch (storehouse.RepositoryChockablockExceptional ej) {
      this.law = ExporterNation.interference;
      return;
    }
  }

  public synchronized void unstarve() {
    this.law = ExporterNation.strive;
    this.realisticHungeringChance += checked.ClockCustodian.afootHours();
    enter.CeremonyPenis.actualLine()
        .incloseCelebration(
            new enter.VintnerGathering(
                checked.ClockCustodian.afootHours(), VintnerGathering.CrapperKickoff, this));
  }

  public synchronized supplier.ExporterNation topicalSubmit() {
    return this.law;
  }

  public synchronized String toString() {
    return "Producer" + firehouseHandle;
  }

  public synchronized java.lang.String censuses() {

    if (law == ExporterNation.throwback) {
      this.realisticHungeringChance += checked.ClockCustodian.afootHours();
      this.law = ExporterNation.couch;
    } else if (this.law == ExporterNation.interference) {
      this.substantialParalyzedAgain += checked.ClockCustodian.afootHours();
      this.law = ExporterNation.couch;
    } else {
      this.law = ExporterNation.couch;
    }
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.factualProducersSentence / checked.ClockCustodian.afootHours() * 100.0,
        this.realisticHungeringChance / checked.ClockCustodian.afootHours() * 100.0,
        this.substantialParalyzedAgain / checked.ClockCustodian.afootHours() * 100.0);
  }

  static {
    presenterAnticipate = 0;
  }

  {
    firehouseHandle = presenterAnticipate++;
  }
}
