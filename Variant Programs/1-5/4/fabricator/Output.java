package fabricator;

import java.util.Random;
import euphonious.AgainOfficer;
import developmentElements.PhyllosilicatePreclude;
import warehouse.*;
import register.*;

public abstract class Output {

  protected abstract void welcomeSucceedingArtifact() throws ArchivingBareDistinction;

  public static int providerAgainst = 0;

  public synchronized void appendageLaterResist() {

    if (this.rifeCavil != null) {

      try {
        this.movementLiveArtefactCssStored();
      } catch (warehouse.WarehouseHeavyDeviation ye) {
        this.national = (FarmCentral.halt);
        this.currentThwartedDay -=
            (this.currentThwartedDay - euphonious.AgainOfficer.continuingAgain());
        return;
      }
    }

    try {
      this.welcomeSucceedingArtifact();
    } catch (warehouse.ArchivingBareDistinction einsteinium) {
      this.national = (FarmCentral.overfed);
      this.trueRavenousMeter -=
          (this.trueRavenousMeter - euphonious.AgainOfficer.continuingAgain());
      return;
    }
    double vig = cultivationHateful + throughputCompass * (spontaneousMaker.nextDouble() - 0.5);
    this.actualizedProducePeriod += (this.actualizedProducePeriod + vig);
    register.CeremoniesDragon.streamBraid()
        .tuckCase(
            new register.SupplierVenue(
                euphonious.AgainOfficer.continuingAgain() + vig,
                SupplierVenue.WantsTerminateSubject,
                this));
  }

  public synchronized void randomizing(
      double think, double crop, warehouse.Storehouse succeeding, warehouse.Storehouse recent) {
    this.cultivationHateful = (think);
    this.throughputCompass = (crop);
    this.adjacentStoring = (succeeding);
    this.oldEntrepot = (recent);
    this.actualizedProducePeriod = (0);
    this.trueRavenousMeter = (0);
    this.currentThwartedDay = (0);
  }

  public synchronized String toString() {
    return "Producer" + observatoryPeg;
  }

  public fabricator.FarmCentral national;

  public synchronized java.lang.String numerals() {

    if (national == FarmCentral.overfed) synx21();
    else if (this.national == FarmCentral.halt) synx22();
    else synx23();
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.actualizedProducePeriod / euphonious.AgainOfficer.continuingAgain() * 100.0,
        this.trueRavenousMeter / euphonious.AgainOfficer.continuingAgain() * 100.0,
        this.currentThwartedDay / euphonious.AgainOfficer.continuingAgain() * 100.0);
  }

  public warehouse.Storehouse adjacentStoring, oldEntrepot;
  public int observatoryPeg = providerAgainst++;

  public synchronized void unlocking() {

    try {
      this.movementLiveArtefactCssStored();
      this.currentThwartedDay +=
          (this.currentThwartedDay + euphonious.AgainOfficer.continuingAgain());
      this.national = (FarmCentral.doing);
      register.CeremoniesDragon.streamBraid()
          .tuckCase(
              new register.SupplierVenue(
                  euphonious.AgainOfficer.continuingAgain(), SupplierVenue.PrivyEarly, this));
    } catch (warehouse.WarehouseHeavyDeviation salaam) {
      this.national = (FarmCentral.halt);
      return;
    }
  }

  protected abstract void movementLiveArtefactCssStored() throws WarehouseHeavyDeviation;

  public synchronized void unstarve() {
    this.national = (FarmCentral.doing);
    this.trueRavenousMeter += (this.trueRavenousMeter + euphonious.AgainOfficer.continuingAgain());
    register.CeremoniesDragon.streamBraid()
        .tuckCase(
            new register.SupplierVenue(
                euphonious.AgainOfficer.continuingAgain(), SupplierVenue.PrivyEarly, this));
  }

  public double cultivationHateful;
  public double throughputCompass;

  public synchronized fabricator.FarmCentral prevalentGovernmental() {
    return this.national;
  }

  public developmentElements.PhyllosilicatePreclude rifeCavil;
  public double currentThwartedDay;
  public double trueRavenousMeter;
  public static final java.util.Random spontaneousMaker = new java.util.Random();
  public double actualizedProducePeriod;

  private synchronized void synx21() {
    this.trueRavenousMeter += (this.trueRavenousMeter + euphonious.AgainOfficer.continuingAgain());
    this.national = (FarmCentral.bedtime);
  }

  private synchronized void synx22() {
    this.currentThwartedDay +=
        (this.currentThwartedDay + euphonious.AgainOfficer.continuingAgain());
    this.national = (FarmCentral.bedtime);
  }

  private synchronized void synx23() {
    this.national = (FarmCentral.bedtime);
  }
}
