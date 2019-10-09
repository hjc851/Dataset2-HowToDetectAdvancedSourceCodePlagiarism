package fabricator;

import java.util.Random;
import looked.MeterGoalkeeper;
import industrializationInstallations.InterpretableResist;
import warehouses.*;
import book.*;

public abstract class Publisher {

  public synchronized void serveFirstSubject() {

    if (this.afootElement != null) {

      try {
        this.inciteStreamBodyPefWarehouses();
      } catch (ArchivalOverflowingExempt salaam) {
        this.canton = PresenterSubmit.thwarting;
        this.empiricalShutWeek -= MeterGoalkeeper.thisThing();
        return;
      }
    }

    try {
      this.collectNowPurpose();
    } catch (ShelvingWhiteExcluded ej) {
      this.canton = PresenterSubmit.famine;
      this.actuallyNeglectedHours -= MeterGoalkeeper.thisThing();
      return;
    }
    double writes = factoryIntend + factoryStray * (arbitraryProducing.nextDouble() - 0.5);
    this.realProductClock += writes;
    CelebrationBacklog.presentlyPecker()
        .injectedGathering(
            new ProduceTriathlon(
                MeterGoalkeeper.thisThing() + writes, ProduceTriathlon.WilFinisArtefact, this));
  }

  public synchronized PresenterSubmit topicalSubmit() {
    return this.canton;
  }

  protected double empiricalShutWeek = 0.0;
  private double factoryStray = 0.0;

  static {
    outputTabulator = 0;
  }

  protected InterpretableResist afootElement = null;
  protected PresenterSubmit canton = null;

  public synchronized void undo() {

    try {
      this.inciteStreamBodyPefWarehouses();
      this.empiricalShutWeek += MeterGoalkeeper.thisThing();
      this.canton = PresenterSubmit.employing;
      CelebrationBacklog.presentlyPecker()
          .injectedGathering(
              new ProduceTriathlon(
                  MeterGoalkeeper.thisThing(), ProduceTriathlon.BunsCommences, this));
    } catch (ArchivalOverflowingExempt einsteinium) {
      this.canton = PresenterSubmit.thwarting;
      return;
    }
  }

  private int postCaller = 0;

  public synchronized String toString() {
    return "Producer" + postCaller;
  }

  protected synchronized void overwrite(
      double equate, double ambit, Inventory future, Inventory preceding) {
    this.factoryIntend = equate;
    this.factoryStray = ambit;
    this.incomingEntrepot = future;
    this.earlierDisk = preceding;
    this.realProductClock = 0;
    this.actuallyNeglectedHours = 0;
    this.empiricalShutWeek = 0;
  }

  protected Inventory incomingEntrepot = null, earlierDisk = null;

  protected abstract void inciteStreamBodyPefWarehouses() throws ArchivalOverflowingExempt;

  public synchronized String survey() {

    if (canton == PresenterSubmit.famine) {
      this.actuallyNeglectedHours += MeterGoalkeeper.thisThing();
      this.canton = PresenterSubmit.nap;
    } else if (this.canton == PresenterSubmit.thwarting) {
      this.empiricalShutWeek += MeterGoalkeeper.thisThing();
      this.canton = PresenterSubmit.nap;
    } else {
      this.canton = PresenterSubmit.nap;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.realProductClock / MeterGoalkeeper.thisThing() * 100.0,
        this.actuallyNeglectedHours / MeterGoalkeeper.thisThing() * 100.0,
        this.empiricalShutWeek / MeterGoalkeeper.thisThing() * 100.0);
  }

  protected double realProductClock = 0.0;
  protected double actuallyNeglectedHours = 0.0;
  protected static final Random arbitraryProducing = new Random();
  private double factoryIntend = 0.0;

  {
    postCaller = outputTabulator++;
  }

  public synchronized void unstarve() {
    this.canton = PresenterSubmit.employing;
    this.actuallyNeglectedHours += MeterGoalkeeper.thisThing();
    CelebrationBacklog.presentlyPecker()
        .injectedGathering(
            new ProduceTriathlon(
                MeterGoalkeeper.thisThing(), ProduceTriathlon.BunsCommences, this));
  }

  private static int outputTabulator = 0;

  protected abstract void collectNowPurpose() throws ShelvingWhiteExcluded;
}
