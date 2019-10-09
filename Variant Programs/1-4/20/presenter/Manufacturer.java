package presenter;

import java.util.Random;
import maturational.OpportunityCarer;
import cultivationBodies.RecoverableTarget;
import archiving.*;
import platter.*;

public abstract class Manufacturer {
  protected static final java.util.Random unintendedFarmer = new java.util.Random();
  private static int manufacturerForestall = 0;
  protected presenter.ProduceGovernmental national = null;
  private double producingSignify = 0.0;
  private double productivitySwan = 0.0;
  protected double evenProductivityBeginning = 0.0;
  protected double realObstructedClock = 0.0;
  protected double exactCravedYear = 0.0;
  protected cultivationBodies.RecoverableTarget latestTarget = null;
  protected archiving.Cache thenStoreroom = null, precedingStorehouse = null;
  private int headquartersPhoto = manufacturerForestall++;

  protected synchronized void init(
      double equate, double reach, archiving.Cache early, archiving.Cache ago) {
    this.producingSignify = equate;
    this.productivitySwan = reach;
    this.thenStoreroom = early;
    this.precedingStorehouse = ago;
    this.evenProductivityBeginning = 0;
    this.exactCravedYear = 0;
    this.realObstructedClock = 0;
  }

  public synchronized void proceedingsTheOpposes() {

    if (this.latestTarget != null) {

      try {
        this.movementLiveArtefactCssStored();
      } catch (archiving.WarehousingHighLimitation samad) {
        this.national = ProduceGovernmental.disrupting;
        this.realObstructedClock -= maturational.OpportunityCarer.actualSentence();
        return;
      }
    }

    try {
      this.obtainFutureObjective();
    } catch (archiving.InventoryAbandonRule cma) {
      this.national = ProduceGovernmental.famished;
      this.exactCravedYear -= maturational.OpportunityCarer.actualSentence();
      return;
    }
    double vig = producingSignify + productivitySwan * (unintendedFarmer.nextDouble() - 0.5);
    this.evenProductivityBeginning += vig;
    platter.ParadeConvoy.formerStopper()
        .infixTournament(
            new platter.BreederCeremonies(
                maturational.OpportunityCarer.actualSentence() + vig,
                BreederCeremonies.IntendFinalElement,
                this));
  }

  protected abstract void obtainFutureObjective() throws InventoryAbandonRule;

  protected abstract void movementLiveArtefactCssStored() throws WarehousingHighLimitation;

  public synchronized void reactivate() {

    try {
      this.movementLiveArtefactCssStored();
      this.realObstructedClock += maturational.OpportunityCarer.actualSentence();
      this.national = ProduceGovernmental.operative;
      platter.ParadeConvoy.formerStopper()
          .infixTournament(
              new platter.BreederCeremonies(
                  maturational.OpportunityCarer.actualSentence(),
                  BreederCeremonies.BacksideStartle,
                  this));
    } catch (archiving.WarehousingHighLimitation ej) {
      this.national = ProduceGovernmental.disrupting;
      return;
    }
  }

  public synchronized void unstarve() {
    this.national = ProduceGovernmental.operative;
    this.exactCravedYear += maturational.OpportunityCarer.actualSentence();
    platter.ParadeConvoy.formerStopper()
        .infixTournament(
            new platter.BreederCeremonies(
                maturational.OpportunityCarer.actualSentence(),
                BreederCeremonies.BacksideStartle,
                this));
  }

  public synchronized presenter.ProduceGovernmental existingSovereign() {
    return this.national;
  }

  public synchronized String toString() {
    return "Producer" + headquartersPhoto;
  }

  public synchronized java.lang.String statisticians() {

    if (national == ProduceGovernmental.famished) {
      this.exactCravedYear += maturational.OpportunityCarer.actualSentence();
      this.national = ProduceGovernmental.dormancy;
    } else if (this.national == ProduceGovernmental.disrupting) {
      this.realObstructedClock += maturational.OpportunityCarer.actualSentence();
      this.national = ProduceGovernmental.dormancy;
    } else {
      this.national = ProduceGovernmental.dormancy;
    }
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.evenProductivityBeginning / maturational.OpportunityCarer.actualSentence() * 100.0,
        this.exactCravedYear / maturational.OpportunityCarer.actualSentence() * 100.0,
        this.realObstructedClock / maturational.OpportunityCarer.actualSentence() * 100.0);
  }
}
