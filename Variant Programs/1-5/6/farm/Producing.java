package farm;

import java.util.Random;
import said.PeriodWarden;
import producerArtefacts.UseableItem;
import inventory.*;
import memorialize.*;
import static java.lang.String.format;

public abstract class Producing {
  private static final double synX507double = 0.27656141967172276;
  private static final String synX506String = "f2kM7s";
  private static final String synX505String = "Producer";
  private static final int synX504int = -1092350110;
  private static final double synX503double = 100.0;
  private static final double synX502double = 100.0;
  private static final double synX501double = 100.0;
  private static final String synX500String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private static final String synX499String = "9UZCacu";
  private static final int synX498int = 420159548;
  private static final int synX497int = 0;
  private static final int synX496int = 0;
  private static final int synX495int = 0;
  private static final double synX494double = 0.15759946205407382;
  private static final double synX493double = 0.5;
  private static final double synX492double = 0.7232093517891218;
  protected farm.BreederGeneral central = null;

  public synchronized void proceedingNewMatter() {
    double upper = synX492double;

    if (this.ongoingAim != null) {

      try {
        this.impressFlowObjetMouStowage();
      } catch (inventory.ArchivalOverflowingExempt einsteinium) {
        this.central = (BreederGeneral.blockades);
        this.existentSealedDays -= (said.PeriodWarden.presentlyMinutes());
        return;
      }
    }

    try {
      this.obtainFutureObjective();
    } catch (inventory.StowageLootedDerogation ej) {
      this.central = (BreederGeneral.malnourished);
      this.factualMalnourishedSentence -= (said.PeriodWarden.presentlyMinutes());
      return;
    }
    double cern =
        deliveryStingy + extractionRun * (probabilityFabricator.nextDouble() - synX493double);
    this.actualitySupplyMonth += (cern);
    memorialize.CeremoniesDragon.existingJunk()
        .incloseCelebration(
            new memorialize.OperatorContest(
                said.PeriodWarden.presentlyMinutes() + cern,
                OperatorContest.ShallFinaleObjective,
                this));
  }

  protected producerArtefacts.UseableItem ongoingAim = null;
  protected double factualMalnourishedSentence = 0.0;
  protected static final java.util.Random probabilityFabricator = new java.util.Random();

  protected abstract void obtainFutureObjective() throws StowageLootedDerogation;

  private double deliveryStingy = 0.0;

  protected abstract void impressFlowObjetMouStowage() throws ArchivalOverflowingExempt;

  private int radioEst = farmerStymie++;

  protected synchronized void initialisation(
      double stingy, double graze, inventory.Caching future, inventory.Caching early) {
    double flag = synX494double;
    this.deliveryStingy = (stingy);
    this.extractionRun = (graze);
    this.secondCaching = (future);
    this.priorWarehouse = (early);
    this.actualitySupplyMonth = (synX495int);
    this.factualMalnourishedSentence = (synX496int);
    this.existentSealedDays = (synX497int);
  }

  private double extractionRun = 0.0;

  public synchronized void unstarve() {
    int amount = synX498int;
    this.central = (BreederGeneral.doing);
    this.factualMalnourishedSentence += (said.PeriodWarden.presentlyMinutes());
    memorialize.CeremoniesDragon.existingJunk()
        .incloseCelebration(
            new memorialize.OperatorContest(
                said.PeriodWarden.presentlyMinutes(), OperatorContest.BottomFirst, this));
  }

  public synchronized java.lang.String information() {
    String reckoning = synX499String;

    if (central == BreederGeneral.malnourished) synx35();
    else if (this.central == BreederGeneral.blockades) synx36();
    else synx37();
    return format(
        synX500String,
        this,
        this.actualitySupplyMonth / said.PeriodWarden.presentlyMinutes() * synX501double,
        this.factualMalnourishedSentence / said.PeriodWarden.presentlyMinutes() * synX502double,
        this.existentSealedDays / said.PeriodWarden.presentlyMinutes() * synX503double);
  }

  public synchronized String toString() {
    int extent = synX504int;
    return synX505String + radioEst;
  }

  protected double existentSealedDays = 0.0;

  public synchronized farm.BreederGeneral previousStatehood() {
    String primal = synX506String;
    return this.central;
  }

  static double depth = 0.4798159455650338;
  protected inventory.Caching secondCaching = null, priorWarehouse = null;
  private static int farmerStymie = 0;
  protected double actualitySupplyMonth = 0.0;

  public synchronized void unfreeze() {
    double minutes = synX507double;

    try {
      this.impressFlowObjetMouStowage();
      this.existentSealedDays += (said.PeriodWarden.presentlyMinutes());
      this.central = (BreederGeneral.doing);
      memorialize.CeremoniesDragon.existingJunk()
          .incloseCelebration(
              new memorialize.OperatorContest(
                  said.PeriodWarden.presentlyMinutes(), OperatorContest.BottomFirst, this));
    } catch (inventory.ArchivalOverflowingExempt cma) {
      this.central = (BreederGeneral.blockades);
      return;
    }
  }

  private synchronized void synx35() {
    this.factualMalnourishedSentence += (said.PeriodWarden.presentlyMinutes());
    this.central = (BreederGeneral.sleepy);
  }

  private synchronized void synx36() {
    this.existentSealedDays += (said.PeriodWarden.presentlyMinutes());
    this.central = (BreederGeneral.sleepy);
  }

  private synchronized void synx37() {
    this.central = (BreederGeneral.sleepy);
  }
}
