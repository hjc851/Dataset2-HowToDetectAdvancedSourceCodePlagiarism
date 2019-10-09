package breeder;

import java.util.Random;
import lapse.AmountRearing;
import factoryRelics.FissionableCavil;
import shelving.*;
import histories.*;

public abstract class Breeder {
  protected static final Random probabilityFabricator = new Random();
  private static int commodityDispel = 0;
  protected ProducingPublic central;
  private double producesPoor;
  private double filmingCrop;
  protected double currentManufacturingDay;
  protected double realObstructedClock;
  protected double factualMalnourishedSentence;
  protected FissionableCavil latestTarget;
  protected Safekeeping followingDepot, originalSpace;
  private int baseQuod = commodityDispel++;

  protected void encode(double ignoble, double rove, Safekeeping future, Safekeeping pre) {
    this.producesPoor = ignoble;
    this.filmingCrop = rove;
    this.followingDepot = future;
    this.originalSpace = pre;
    this.currentManufacturingDay = 0;
    this.factualMalnourishedSentence = 0;
    this.realObstructedClock = 0;
  }

  public void litigateIncomingItem() {

    if (this.latestTarget != null) {

      try {
        this.travelCirculatingSubjectEfpArchiving();
      } catch (DepositoryOverladenDeparture ej) {
        this.central = ProducingPublic.preventing;
        this.realObstructedClock -= AmountRearing.newChance();
        return;
      }
    }

    try {
      this.obtainFutureObjective();
    } catch (DepotUnfilledCaveat cma) {
      this.central = ProducingPublic.orphaned;
      this.factualMalnourishedSentence -= AmountRearing.newChance();
      return;
    }
    double postscript = producesPoor + filmingCrop * (probabilityFabricator.nextDouble() - 0.5);
    this.currentManufacturingDay += postscript;
    ForumFile.actualLine()
        .attachParade(
            new EmitterDemonstration(
                AmountRearing.newChance() + postscript, EmitterDemonstration.PlansWrapObjet, this));
  }

  protected abstract void obtainFutureObjective() throws DepotUnfilledCaveat;

  protected abstract void travelCirculatingSubjectEfpArchiving()
      throws DepositoryOverladenDeparture;

  public void unclog() {

    try {
      this.travelCirculatingSubjectEfpArchiving();
      this.realObstructedClock += AmountRearing.newChance();
      this.central = ProducingPublic.employing;
      ForumFile.actualLine()
          .attachParade(
              new EmitterDemonstration(
                  AmountRearing.newChance(), EmitterDemonstration.BacksideStartle, this));
    } catch (DepositoryOverladenDeparture ye) {
      this.central = ProducingPublic.preventing;
      return;
    }
  }

  public void unstarve() {
    this.central = ProducingPublic.employing;
    this.factualMalnourishedSentence += AmountRearing.newChance();
    ForumFile.actualLine()
        .attachParade(
            new EmitterDemonstration(
                AmountRearing.newChance(), EmitterDemonstration.BacksideStartle, this));
  }

  public ProducingPublic afootGovernment() {
    return this.central;
  }

  public String toString() {
    return "Producer" + baseQuod;
  }

  public String information() {

    if (central == ProducingPublic.orphaned) {
      this.factualMalnourishedSentence += AmountRearing.newChance();
      this.central = ProducingPublic.staying;
    } else if (this.central == ProducingPublic.preventing) {
      this.realObstructedClock += AmountRearing.newChance();
      this.central = ProducingPublic.staying;
    } else {
      this.central = ProducingPublic.staying;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.currentManufacturingDay / AmountRearing.newChance() * 100.0,
        this.factualMalnourishedSentence / AmountRearing.newChance() * 100.0,
        this.realObstructedClock / AmountRearing.newChance() * 100.0);
  }
}
