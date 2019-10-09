package promoter;

import java.util.Random;
import euphonious.ThingCatch;
import harvestingGoods.HypabyssalTotem;
import safekeeping.*;
import memorialize.*;

public abstract class Grower {
  protected static final Random spontaneousMaker = new Random();
  private static int breederCounterbalance = 0;
  protected BreederGeneral express;
  private double harvestingMiserly;
  private double producerDrift;
  protected double actualitySupplyMonth;
  protected double veryStalledWhen;
  protected double preciseDepletedAmount;
  protected HypabyssalTotem presentlyItems;
  protected Warehousing laterDisk, pastDepot;
  private int terminalIdem = breederCounterbalance++;

  protected void intercommunicate(
      double skilled, double orbit, Warehousing succeeding, Warehousing late) {
    this.harvestingMiserly = skilled;
    this.producerDrift = orbit;
    this.laterDisk = succeeding;
    this.pastDepot = late;
    this.actualitySupplyMonth = 0;
    this.preciseDepletedAmount = 0;
    this.veryStalledWhen = 0;
  }

  public void marchAdjacentObjection() {

    if (this.presentlyItems != null) {

      try {
        this.affectAfootElementGiglioWarehousing();
      } catch (StowageLadenDerogation einsteinium) {
        this.express = BreederGeneral.hindering;
        this.veryStalledWhen -= ThingCatch.actualSentence();
        return;
      }
    }

    try {
      this.giveAgainTotem();
    } catch (StowageLootedDerogation salaam) {
      this.express = BreederGeneral.brutalized;
      this.preciseDepletedAmount -= ThingCatch.actualSentence();
      return;
    }
    double cern = harvestingMiserly + producerDrift * (spontaneousMaker.nextDouble() - 0.5);
    this.actualitySupplyMonth += cern;
    SeminarJumping.prevailingWaiting()
        .appendForum(
            new SupplierVenue(
                ThingCatch.actualSentence() + cern, SupplierVenue.ShallFinaleObjective, this));
  }

  protected abstract void giveAgainTotem() throws StowageLootedDerogation;

  protected abstract void affectAfootElementGiglioWarehousing() throws StowageLadenDerogation;

  public void resolve() {

    try {
      this.affectAfootElementGiglioWarehousing();
      this.veryStalledWhen += ThingCatch.actualSentence();
      this.express = BreederGeneral.acting;
      SeminarJumping.prevailingWaiting()
          .appendForum(
              new SupplierVenue(ThingCatch.actualSentence(), SupplierVenue.CrapperKickoff, this));
    } catch (StowageLadenDerogation ye) {
      this.express = BreederGeneral.hindering;
      return;
    }
  }

  public void unstarve() {
    this.express = BreederGeneral.acting;
    this.preciseDepletedAmount += ThingCatch.actualSentence();
    SeminarJumping.prevailingWaiting()
        .appendForum(
            new SupplierVenue(ThingCatch.actualSentence(), SupplierVenue.CrapperKickoff, this));
  }

  public BreederGeneral afootGovernment() {
    return this.express;
  }

  public String toString() {
    return "Producer" + terminalIdem;
  }

  public String statistician() {

    if (express == BreederGeneral.brutalized) {
      this.preciseDepletedAmount += ThingCatch.actualSentence();
      this.express = BreederGeneral.diaper;
    } else if (this.express == BreederGeneral.hindering) {
      this.veryStalledWhen += ThingCatch.actualSentence();
      this.express = BreederGeneral.diaper;
    } else {
      this.express = BreederGeneral.diaper;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.actualitySupplyMonth / ThingCatch.actualSentence() * 100.0,
        this.preciseDepletedAmount / ThingCatch.actualSentence() * 100.0,
        this.veryStalledWhen / ThingCatch.actualSentence() * 100.0);
  }
}
