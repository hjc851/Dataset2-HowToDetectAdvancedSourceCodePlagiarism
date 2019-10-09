package breeder;

import java.util.Random;
import ontogenetic.MonthBabysitter;
import deliveryThings.ClasticVictim;
import storeroom.*;
import platter.*;

public abstract class Presenter {
  protected static final Random unselectedExporter = new Random();
  private static int promoterCounteract = 0;
  protected BreederGeneral land;
  private double filmingIgnoble;
  private double outputScope;
  protected double trueProducingMeter;
  protected double genuineCloggedMoment;
  protected double veryHoardedWhen;
  protected ClasticVictim previousMatter;
  protected Storeroom forthcomingSafekeeping, initialShelving;
  private int kioskIbid = promoterCounteract++;

  protected void predefine(double equate, double ambit, Storeroom later, Storeroom ago) {
    this.filmingIgnoble = equate;
    this.outputScope = ambit;
    this.forthcomingSafekeeping = later;
    this.initialShelving = ago;
    this.trueProducingMeter = 0;
    this.veryHoardedWhen = 0;
    this.genuineCloggedMoment = 0;
  }

  public void workCloseAim() {

    if (this.previousMatter != null) {

      try {
        this.motionTopicalResistEapsDisk();
      } catch (CachingBroadExemptions einsteinium) {
        this.land = BreederGeneral.blockades;
        this.genuineCloggedMoment -= MonthBabysitter.flowMonth();
        return;
      }
    }

    try {
      this.welcomeSucceedingArtifact();
    } catch (WarehouseOpenDeviation salaam) {
      this.land = BreederGeneral.fasting;
      this.veryHoardedWhen -= MonthBabysitter.flowMonth();
      return;
    }
    double postscript = filmingIgnoble + outputScope * (unselectedExporter.nextDouble() - 0.5);
    this.trueProducingMeter += postscript;
    GalaLine.incumbentBacklog()
        .installCeremonies(
            new GrowerParade(
                MonthBabysitter.flowMonth() + postscript, GrowerParade.WishEndTarget, this));
  }

  protected abstract void welcomeSucceedingArtifact() throws WarehouseOpenDeviation;

  protected abstract void motionTopicalResistEapsDisk() throws CachingBroadExemptions;

  public void unstick() {

    try {
      this.motionTopicalResistEapsDisk();
      this.genuineCloggedMoment += MonthBabysitter.flowMonth();
      this.land = BreederGeneral.operative;
      GalaLine.incumbentBacklog()
          .installCeremonies(
              new GrowerParade(MonthBabysitter.flowMonth(), GrowerParade.AssGo, this));
    } catch (CachingBroadExemptions ye) {
      this.land = BreederGeneral.blockades;
      return;
    }
  }

  public void unstarve() {
    this.land = BreederGeneral.operative;
    this.veryHoardedWhen += MonthBabysitter.flowMonth();
    GalaLine.incumbentBacklog()
        .installCeremonies(new GrowerParade(MonthBabysitter.flowMonth(), GrowerParade.AssGo, this));
  }

  public BreederGeneral theLaw() {
    return this.land;
  }

  public String toString() {
    return "Producer" + kioskIbid;
  }

  public String statisticians() {

    if (land == BreederGeneral.fasting) {
      this.veryHoardedWhen += MonthBabysitter.flowMonth();
      this.land = BreederGeneral.sleepover;
    } else if (this.land == BreederGeneral.blockades) {
      this.genuineCloggedMoment += MonthBabysitter.flowMonth();
      this.land = BreederGeneral.sleepover;
    } else {
      this.land = BreederGeneral.sleepover;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.trueProducingMeter / MonthBabysitter.flowMonth() * 100.0,
        this.veryHoardedWhen / MonthBabysitter.flowMonth() * 100.0,
        this.genuineCloggedMoment / MonthBabysitter.flowMonth() * 100.0);
  }
}
