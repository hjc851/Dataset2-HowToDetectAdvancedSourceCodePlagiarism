package manufacturer;

import java.util.Random;
import indiscernible.ThingCatch;
import filmingExhibits.MinableOppose;
import memory.*;
import ledger.*;

public abstract class Producing {
  protected static final Random indiscriminateSupplier = new Random();
  private static int providerAgainst = 0;
  protected FarmerLaw commonwealth;
  private double productivityTight;
  private double industrializationOrder;
  protected double empiricalProducesWeek;
  protected double realisticJammedChance;
  protected double specificBrutalizedNow;
  protected MinableOppose contemporaryItem;
  protected Depot lastStored, successiveWarehouses;
  private int terminusMap = providerAgainst++;

  protected void overwrite(double stingy, double chain, Depot close, Depot first) {
    this.productivityTight = stingy;
    this.industrializationOrder = chain;
    this.lastStored = close;
    this.successiveWarehouses = first;
    this.empiricalProducesWeek = 0;
    this.specificBrutalizedNow = 0;
    this.realisticJammedChance = 0;
  }

  public void methodsThenArgue() {

    if (this.contemporaryItem != null) {

      try {
        this.locomoteNewTotemTcsRepository();
      } catch (ShelvingRepleteExcluded ye) {
        this.commonwealth = FarmerLaw.blockades;
        this.realisticJammedChance -= ThingCatch.rifeWhen();
        return;
      }
    }

    try {
      this.haveFirstSubject();
    } catch (ArchivingBareDistinction cma) {
      this.commonwealth = FarmerLaw.pizza;
      this.specificBrutalizedNow -= ThingCatch.rifeWhen();
      return;
    }
    double postscript =
        productivityTight + industrializationOrder * (indiscriminateSupplier.nextDouble() - 0.5);
    this.empiricalProducesWeek += postscript;
    GatheringDipper.flowJumping()
        .injectCeremony(
            new VintnerGathering(
                ThingCatch.rifeWhen() + postscript, VintnerGathering.WantsTerminateSubject, this));
  }

  protected abstract void haveFirstSubject() throws ArchivingBareDistinction;

  protected abstract void locomoteNewTotemTcsRepository() throws ShelvingRepleteExcluded;

  public void unstick() {

    try {
      this.locomoteNewTotemTcsRepository();
      this.realisticJammedChance += ThingCatch.rifeWhen();
      this.commonwealth = FarmerLaw.serving;
      GatheringDipper.flowJumping()
          .injectCeremony(
              new VintnerGathering(ThingCatch.rifeWhen(), VintnerGathering.ButtDepart, this));
    } catch (ShelvingRepleteExcluded samad) {
      this.commonwealth = FarmerLaw.blockades;
      return;
    }
  }

  public void unstarve() {
    this.commonwealth = FarmerLaw.serving;
    this.specificBrutalizedNow += ThingCatch.rifeWhen();
    GatheringDipper.flowJumping()
        .injectCeremony(
            new VintnerGathering(ThingCatch.rifeWhen(), VintnerGathering.ButtDepart, this));
  }

  public FarmerLaw rifeExpress() {
    return this.commonwealth;
  }

  public String toString() {
    return "Producer" + terminusMap;
  }

  public String statisticians() {

    if (commonwealth == FarmerLaw.pizza) {
      this.specificBrutalizedNow += ThingCatch.rifeWhen();
      this.commonwealth = FarmerLaw.bedroom;
    } else if (this.commonwealth == FarmerLaw.blockades) {
      this.realisticJammedChance += ThingCatch.rifeWhen();
      this.commonwealth = FarmerLaw.bedroom;
    } else {
      this.commonwealth = FarmerLaw.bedroom;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.empiricalProducesWeek / ThingCatch.rifeWhen() * 100.0,
        this.specificBrutalizedNow / ThingCatch.rifeWhen() * 100.0,
        this.realisticJammedChance / ThingCatch.rifeWhen() * 100.0);
  }
}
