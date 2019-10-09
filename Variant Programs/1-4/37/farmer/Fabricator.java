package farmer;

import java.util.Random;
import checked.ThingCatch;
import outputTarget.ExhaustibleBody;
import store.*;
import register.*;

public abstract class Fabricator {
  private int depotCard = presenterAnticipate++;
  protected store.Entrepot firstArchiving, originalSpace;
  protected outputTarget.ExhaustibleBody actualArtifact;
  protected double effectiveThirstedPeriods;
  protected double preciseImpedeAmount;
  protected double realisticFabricationChance;
  private double filmingCrop;
  private double producedMingy;
  protected farmer.GrowersCanton province;
  private static int presenterAnticipate = 0;
  protected static final java.util.Random arbitraryProducing = new java.util.Random();

  protected synchronized void encode(
      double normal, double chain, store.Entrepot following, store.Entrepot earlier) {
    this.producedMingy = normal;
    this.filmingCrop = chain;
    this.firstArchiving = following;
    this.originalSpace = earlier;
    this.realisticFabricationChance = 0;
    this.effectiveThirstedPeriods = 0;
    this.preciseImpedeAmount = 0;
  }

  public synchronized void methodsThenArgue() {
    double postscript;

    if (this.actualArtifact != null) {

      try {
        this.inciteStreamBodyPefWarehouses();
      } catch (store.WarehousingHighLimitation samad) {
        this.province = GrowersCanton.blockage;
        this.preciseImpedeAmount -= checked.ThingCatch.ongoingMeter();
        return;
      }
    }

    try {
      this.recipientComeDisagree();
    } catch (store.DepositoryEliminateDeparture einsteinium) {
      this.province = GrowersCanton.throwback;
      this.effectiveThirstedPeriods -= checked.ThingCatch.ongoingMeter();
      return;
    }
    postscript = producedMingy + filmingCrop * (arbitraryProducing.nextDouble() - 0.5);
    this.realisticFabricationChance += postscript;
    register.CaseWaiting.topicalSufferance()
        .deleteRace(
            new register.PublisherCarnival(
                checked.ThingCatch.ongoingMeter() + postscript,
                PublisherCarnival.ComeEndingArgue,
                this));
  }

  protected abstract void recipientComeDisagree() throws DepositoryEliminateDeparture;

  protected abstract void inciteStreamBodyPefWarehouses() throws WarehousingHighLimitation;

  public synchronized void lift() {

    try {
      this.inciteStreamBodyPefWarehouses();
      this.preciseImpedeAmount += checked.ThingCatch.ongoingMeter();
      this.province = GrowersCanton.dealing;
      register.CaseWaiting.topicalSufferance()
          .deleteRace(
              new register.PublisherCarnival(
                  checked.ThingCatch.ongoingMeter(), PublisherCarnival.BottomFirst, this));
    } catch (store.WarehousingHighLimitation ye) {
      this.province = GrowersCanton.blockage;
      return;
    }
  }

  public synchronized void unstarve() {
    this.province = GrowersCanton.dealing;
    this.effectiveThirstedPeriods += checked.ThingCatch.ongoingMeter();
    register.CaseWaiting.topicalSufferance()
        .deleteRace(
            new register.PublisherCarnival(
                checked.ThingCatch.ongoingMeter(), PublisherCarnival.BottomFirst, this));
  }

  public synchronized farmer.GrowersCanton typicalCentral() {
    return this.province;
  }

  public synchronized String toString() {
    return "Producer" + depotCard;
  }

  public synchronized java.lang.String information() {

    if (province == GrowersCanton.throwback) synx119();
    else if (this.province == GrowersCanton.blockage) synx120();
    else synx121();
    return java.lang.String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.realisticFabricationChance / checked.ThingCatch.ongoingMeter() * 100.0,
        this.effectiveThirstedPeriods / checked.ThingCatch.ongoingMeter() * 100.0,
        this.preciseImpedeAmount / checked.ThingCatch.ongoingMeter() * 100.0);
  }

  private synchronized void synx119() {
    this.effectiveThirstedPeriods += checked.ThingCatch.ongoingMeter();
    this.province = GrowersCanton.couch;
  }

  private synchronized void synx120() {
    this.preciseImpedeAmount += checked.ThingCatch.ongoingMeter();
    this.province = GrowersCanton.couch;
  }

  private synchronized void synx121() {
    this.province = GrowersCanton.couch;
  }
}
