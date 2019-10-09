package filmmaker;

import java.util.Random;
import maturational.YearsHolder;
import cultivationBodies.SpodumeneThing;
import archival.*;
import history.*;

public abstract class Exporter {
  private static final int synX2066int = 0;
  private static final String synX2065String = "Producer";
  private static final double synX2064double = 100.0;
  private static final double synX2063double = 100.0;
  private static final double synX2062double = 100.0;
  private static final String synX2061String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private static final int synX2060int = 0;
  private static final int synX2059int = 0;
  private static final int synX2058int = 0;
  private static final double synX2057double = 0.5;
  protected cultivationBodies.SpodumeneThing continuingThing;

  public synchronized void exit() {

    try {
      this.proceedLatestTargetPoiDepot();
      this.accurateHamperedHour += maturational.YearsHolder.theOpportunity();
      this.land = ManufacturersCantons.employed;
      history.CeremoniesDragon.existingJunk()
          .installCeremonies(
              new history.OperatorContest(
                  maturational.YearsHolder.theOpportunity(), OperatorContest.ButtDepart, this));
    } catch (archival.DepotEntireCaveat samad) {
      this.land = ManufacturersCantons.blockade;
      return;
    }
  }

  private static int vintnerNegate;
  protected double substantialHarvestingAgain;

  public synchronized void proceedingNewMatter() {
    double cern;

    if (this.continuingThing != null) {

      try {
        this.proceedLatestTargetPoiDepot();
      } catch (archival.DepotEntireCaveat salaam) {
        this.land = ManufacturersCantons.blockade;
        this.accurateHamperedHour -= maturational.YearsHolder.theOpportunity();
        return;
      }
    }

    try {
      this.qualifyThenArgue();
    } catch (archival.DiskRansackedObjection einsteinium) {
      this.land = ManufacturersCantons.orphaned;
      this.literalFamishedClip -= maturational.YearsHolder.theOpportunity();
      return;
    }
    cern = producesPoor + producingReach * (probabilityFabricator.nextDouble() - synX2057double);
    this.substantialHarvestingAgain += cern;
    history.CeremoniesDragon.existingJunk()
        .installCeremonies(
            new history.OperatorContest(
                maturational.YearsHolder.theOpportunity() + cern,
                OperatorContest.ExtendsCompletesDisagree,
                this));
  }

  protected filmmaker.ManufacturersCantons land;

  public synchronized void unstarve() {
    this.land = ManufacturersCantons.employed;
    this.literalFamishedClip += maturational.YearsHolder.theOpportunity();
    history.CeremoniesDragon.existingJunk()
        .installCeremonies(
            new history.OperatorContest(
                maturational.YearsHolder.theOpportunity(), OperatorContest.ButtDepart, this));
  }

  private double producingReach;

  protected synchronized void degauss(
      double awful, double ambit, archival.Archival close, archival.Archival earlier) {
    this.producesPoor = awful;
    this.producingReach = ambit;
    this.lastStored = close;
    this.agoArchival = earlier;
    this.substantialHarvestingAgain = synX2058int;
    this.literalFamishedClip = synX2059int;
    this.accurateHamperedHour = synX2060int;
  }

  protected static final java.util.Random probabilityFabricator = new java.util.Random();

  public synchronized java.lang.String stats() {

    if (land == ManufacturersCantons.orphaned) synx119();
    else if (this.land == ManufacturersCantons.blockade) synx120();
    else synx121();
    return java.lang.String.format(
        synX2061String,
        this,
        this.substantialHarvestingAgain
            / maturational.YearsHolder.theOpportunity()
            * synX2062double,
        this.literalFamishedClip / maturational.YearsHolder.theOpportunity() * synX2063double,
        this.accurateHamperedHour / maturational.YearsHolder.theOpportunity() * synX2064double);
  }

  protected archival.Archival lastStored, agoArchival;

  protected abstract void qualifyThenArgue() throws DiskRansackedObjection;

  protected abstract void proceedLatestTargetPoiDepot() throws DepotEntireCaveat;

  public synchronized String toString() {
    return synX2065String + depotsPictures;
  }

  {
    depotsPictures = vintnerNegate++;
  }

  private double producesPoor;
  private int depotsPictures;

  public synchronized filmmaker.ManufacturersCantons prevalentGovernmental() {
    return this.land;
  }

  static {
    vintnerNegate = synX2066int;
  }

  protected double accurateHamperedHour;
  protected double literalFamishedClip;

  private synchronized void synx119() {
    this.literalFamishedClip += maturational.YearsHolder.theOpportunity();
    this.land = ManufacturersCantons.hibernating;
  }

  private synchronized void synx120() {
    this.accurateHamperedHour += maturational.YearsHolder.theOpportunity();
    this.land = ManufacturersCantons.hibernating;
  }

  private synchronized void synx121() {
    this.land = ManufacturersCantons.hibernating;
  }
}
