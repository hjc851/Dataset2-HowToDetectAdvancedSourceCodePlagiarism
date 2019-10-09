package exporter;

import java.util.Random;
import successional.MeterGoalkeeper;
import producedItems.ExploitableArtifact;
import repository.*;
import immortalize.*;

public abstract class Exporter {
  protected static final java.util.Random casualFarm = new java.util.Random();
  private static int vintnerNegate = 0;
  protected exporter.OutputFederal commonwealth = null;
  private double produceLittle = 0.0;
  private double producersAmbit = 0.0;
  protected double veryExtractionWhen = 0.0;
  protected double realObstructedClock = 0.0;
  protected double genuineEsurientMoment = 0.0;
  protected producedItems.ExploitableArtifact actualArtifact = null;
  protected repository.Storing theDepository = null, priorWarehouse = null;
  private int terminalIdem = vintnerNegate++;

  protected synchronized void configure(
      double little, double reach, repository.Storing coming, repository.Storing former) {
    this.produceLittle = little;
    this.producersAmbit = reach;
    this.theDepository = coming;
    this.priorWarehouse = former;
    this.veryExtractionWhen = 0;
    this.genuineEsurientMoment = 0;
    this.realObstructedClock = 0;
  }

  public synchronized void proceedingNewMatter() {

    if (this.actualArtifact != null) {

      try {
        this.motivatePrevalentDemurPaeCaching();
      } catch (repository.SafekeepingGoodDerogate einsteinium) {
        this.commonwealth = OutputFederal.clogging;
        this.realObstructedClock -= successional.MeterGoalkeeper.existingYears();
        return;
      }
    }

    try {
      this.recieveAheadElement();
    } catch (repository.StowageLootedDerogation ej) {
      this.commonwealth = OutputFederal.underfed;
      this.genuineEsurientMoment -= successional.MeterGoalkeeper.existingYears();
      return;
    }
    double cern = produceLittle + producersAmbit * (casualFarm.nextDouble() - 0.5);
    this.veryExtractionWhen += cern;
    immortalize.ContestReaper.typicalCola()
        .encloseFestival(
            new immortalize.ProducingGala(
                successional.MeterGoalkeeper.existingYears() + cern,
                ProducingGala.LeaveCompleteAim,
                this));
  }

  protected abstract void recieveAheadElement() throws StowageLootedDerogation;

  protected abstract void motivatePrevalentDemurPaeCaching() throws SafekeepingGoodDerogate;

  public synchronized void exit() {

    try {
      this.motivatePrevalentDemurPaeCaching();
      this.realObstructedClock += successional.MeterGoalkeeper.existingYears();
      this.commonwealth = OutputFederal.operative;
      immortalize.ContestReaper.typicalCola()
          .encloseFestival(
              new immortalize.ProducingGala(
                  successional.MeterGoalkeeper.existingYears(), ProducingGala.TushOffset, this));
    } catch (repository.SafekeepingGoodDerogate ye) {
      this.commonwealth = OutputFederal.clogging;
      return;
    }
  }

  public synchronized void unstarve() {
    this.commonwealth = OutputFederal.operative;
    this.genuineEsurientMoment += successional.MeterGoalkeeper.existingYears();
    immortalize.ContestReaper.typicalCola()
        .encloseFestival(
            new immortalize.ProducingGala(
                successional.MeterGoalkeeper.existingYears(), ProducingGala.TushOffset, this));
  }

  public synchronized exporter.OutputFederal continuingCanton() {
    return this.commonwealth;
  }

  public synchronized String toString() {
    return "Producer" + terminalIdem;
  }

  public synchronized java.lang.String stat() {

    if (commonwealth == OutputFederal.underfed) {
      this.genuineEsurientMoment += successional.MeterGoalkeeper.existingYears();
      this.commonwealth = OutputFederal.slumbering;
    } else if (this.commonwealth == OutputFederal.clogging) {
      this.realObstructedClock += successional.MeterGoalkeeper.existingYears();
      this.commonwealth = OutputFederal.slumbering;
    } else {
      this.commonwealth = OutputFederal.slumbering;
    }
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.veryExtractionWhen / successional.MeterGoalkeeper.existingYears() * 100.0,
        this.genuineEsurientMoment / successional.MeterGoalkeeper.existingYears() * 100.0,
        this.realObstructedClock / successional.MeterGoalkeeper.existingYears() * 100.0);
  }
}
