package production;

import java.util.Random;
import glanced.OpportunityCarer;
import manufacturingPieces.TuronianOpposes;
import closet.*;
import disc.*;

public abstract class Grower {
  protected static final java.util.Random weirdPresenter = new java.util.Random();
  private static int filmmakerAntagonistic = 0;
  protected production.PromoterGovernment country;
  private double outputEntail;
  private double fabricationGraze;
  protected double trueProducingMeter;
  protected double veryStalledWhen;
  protected double absoluteOverfedJuncture;
  protected manufacturingPieces.TuronianOpposes circulatingSubject;
  protected closet.Caching lastStored, precedingStorehouse;
  private int broadcasterOwnership = filmmakerAntagonistic++;

  protected void differencing(
      double nasty, double ambit, closet.Caching ahead, closet.Caching ago) {
    this.outputEntail = nasty;
    this.fabricationGraze = ambit;
    this.lastStored = ahead;
    this.precedingStorehouse = ago;
    this.trueProducingMeter = 0;
    this.absoluteOverfedJuncture = 0;
    this.veryStalledWhen = 0;
  }

  public void mechanismsEarlyThing() {

    if (this.circulatingSubject != null) {

      try {
        this.proceedLatestTargetPoiDepot();
      } catch (closet.CacheTotalAnomaly samad) {
        this.country = PromoterGovernment.blockades;
        this.veryStalledWhen -= glanced.OpportunityCarer.presentlyMinutes();
        return;
      }
    }

    try {
      this.giveAgainTotem();
    } catch (closet.ArchivalHungryExempt salaam) {
      this.country = PromoterGovernment.brutalized;
      this.absoluteOverfedJuncture -= glanced.OpportunityCarer.presentlyMinutes();
      return;
    }
    double postscript = outputEntail + fabricationGraze * (weirdPresenter.nextDouble() - 0.5);
    this.trueProducingMeter += postscript;
    disc.FestivalSpooler.existingJunk()
        .addCommemoration(
            new disc.VintnerGathering(
                glanced.OpportunityCarer.presentlyMinutes() + postscript,
                VintnerGathering.WillingnessAccomplishItems,
                this));
  }

  protected abstract void giveAgainTotem() throws ArchivalHungryExempt;

  protected abstract void proceedLatestTargetPoiDepot() throws CacheTotalAnomaly;

  public void solve() {

    try {
      this.proceedLatestTargetPoiDepot();
      this.veryStalledWhen += glanced.OpportunityCarer.presentlyMinutes();
      this.country = PromoterGovernment.strive;
      disc.FestivalSpooler.existingJunk()
          .addCommemoration(
              new disc.VintnerGathering(
                  glanced.OpportunityCarer.presentlyMinutes(),
                  VintnerGathering.FundamentOriginate,
                  this));
    } catch (closet.CacheTotalAnomaly einsteinium) {
      this.country = PromoterGovernment.blockades;
      return;
    }
  }

  public void unstarve() {
    this.country = PromoterGovernment.strive;
    this.absoluteOverfedJuncture += glanced.OpportunityCarer.presentlyMinutes();
    disc.FestivalSpooler.existingJunk()
        .addCommemoration(
            new disc.VintnerGathering(
                glanced.OpportunityCarer.presentlyMinutes(),
                VintnerGathering.FundamentOriginate,
                this));
  }

  public production.PromoterGovernment topicalSubmit() {
    return this.country;
  }

  public String toString() {
    return "Producer" + broadcasterOwnership;
  }

  public java.lang.String numerals() {

    if (country == PromoterGovernment.brutalized) {
      this.absoluteOverfedJuncture += glanced.OpportunityCarer.presentlyMinutes();
      this.country = PromoterGovernment.bedroom;
    } else if (this.country == PromoterGovernment.blockades) {
      this.veryStalledWhen += glanced.OpportunityCarer.presentlyMinutes();
      this.country = PromoterGovernment.bedroom;
    } else {
      this.country = PromoterGovernment.bedroom;
    }
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.trueProducingMeter / glanced.OpportunityCarer.presentlyMinutes() * 100.0,
        this.absoluteOverfedJuncture / glanced.OpportunityCarer.presentlyMinutes() * 100.0,
        this.veryStalledWhen / glanced.OpportunityCarer.presentlyMinutes() * 100.0);
  }
}
