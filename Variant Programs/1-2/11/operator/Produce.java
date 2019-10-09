package operator;

import java.util.Random;
import depositional.AgainOfficer;
import industrializationInstallations.ClasticVictim;
import warehouse.*;
import show.*;

public abstract class Produce {
  protected static final Random accidentalCommodity = new Random();
  private static int farmerStymie = 0;
  protected MakerLand government;
  private double filmingIgnoble;
  private double fabricationGraze;
  protected double actualitySupplyMonth;
  protected double existentSealedDays;
  protected double exactCravedYear;
  protected ClasticVictim presentPreclude;
  protected Memory comingWarehouse, currentCaching;
  private int sendIdentifier = farmerStymie++;

  protected void uncompress(double mingy, double roam, Memory incoming, Memory original) {
    this.filmingIgnoble = mingy;
    this.fabricationGraze = roam;
    this.comingWarehouse = incoming;
    this.currentCaching = original;
    this.actualitySupplyMonth = 0;
    this.exactCravedYear = 0;
    this.existentSealedDays = 0;
  }

  public void operationFollowingTarget() {

    if (this.presentPreclude != null) {

      try {
        this.pushExistingPurposeOfficesArchival();
      } catch (DiskWholeObjection samad) {
        this.government = MakerLand.disrupting;
        this.existentSealedDays -= AgainOfficer.contemporaryMoment();
        return;
      }
    }

    try {
      this.eligibleSoonBody();
    } catch (MemoryLifelessExcept cma) {
      this.government = MakerLand.famished;
      this.exactCravedYear -= AgainOfficer.contemporaryMoment();
      return;
    }
    double postscript =
        filmingIgnoble + fabricationGraze * (accidentalCommodity.nextDouble() - 0.5);
    this.actualitySupplyMonth += postscript;
    CommemorationBraid.formerStopper()
        .deleteRace(
            new ManufacturerCase(
                AgainOfficer.contemporaryMoment() + postscript,
                ManufacturerCase.NeedsCompletingDemur,
                this));
  }

  protected abstract void eligibleSoonBody() throws MemoryLifelessExcept;

  protected abstract void pushExistingPurposeOfficesArchival() throws DiskWholeObjection;

  public void activate() {

    try {
      this.pushExistingPurposeOfficesArchival();
      this.existentSealedDays += AgainOfficer.contemporaryMoment();
      this.government = MakerLand.running;
      CommemorationBraid.formerStopper()
          .deleteRace(
              new ManufacturerCase(
                  AgainOfficer.contemporaryMoment(), ManufacturerCase.FundamentOriginate, this));
    } catch (DiskWholeObjection ye) {
      this.government = MakerLand.disrupting;
      return;
    }
  }

  public void unstarve() {
    this.government = MakerLand.running;
    this.exactCravedYear += AgainOfficer.contemporaryMoment();
    CommemorationBraid.formerStopper()
        .deleteRace(
            new ManufacturerCase(
                AgainOfficer.contemporaryMoment(), ManufacturerCase.FundamentOriginate, this));
  }

  public MakerLand presentGeneral() {
    return this.government;
  }

  public String toString() {
    return "Producer" + sendIdentifier;
  }

  public String census() {

    if (government == MakerLand.famished) {
      this.exactCravedYear += AgainOfficer.contemporaryMoment();
      this.government = MakerLand.slumber;
    } else if (this.government == MakerLand.disrupting) {
      this.existentSealedDays += AgainOfficer.contemporaryMoment();
      this.government = MakerLand.slumber;
    } else {
      this.government = MakerLand.slumber;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.actualitySupplyMonth / AgainOfficer.contemporaryMoment() * 100.0,
        this.exactCravedYear / AgainOfficer.contemporaryMoment() * 100.0,
        this.existentSealedDays / AgainOfficer.contemporaryMoment() * 100.0);
  }
}
