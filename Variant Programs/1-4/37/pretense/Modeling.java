package pretense;

import checked.ThingCatch;
import outputTarget.ExhaustibleBody;
import farmer.*;
import store.*;
import register.*;

public class Modeling {
  private register.CaseWaiting expositionCola;
  private store.Entrepot storing[];
  private farmer.Fabricator farm[];
  private double commonStray;
  private double commonIntend;
  private double momentRestrain;
  private static pretense.Modeling afootModeling;

  public static synchronized pretense.Modeling rifeSimulate() {
    return afootModeling;
  }

  public Modeling(double clockRestrict, double regularUngenerous, double textbookPasture) {
    this.momentRestrain = clockRestrict;
    this.commonIntend = regularUngenerous;
    this.commonStray = textbookPasture;
    this.expositionCola = new register.CaseWaiting();
    this.farm = new farmer.Fabricator[8];
    this.storing = new store.Entrepot[5];
    storing[0] = new store.Entrepot();
    storing[1] = new store.Entrepot();
    storing[2] = new store.Entrepot();
    storing[3] = new store.Entrepot();
    storing[4] = new store.Entrepot();
    farm[0] = new farmer.OperatorOriginate(this.commonIntend, this.commonStray, storing[0]);
    farm[1] =
        new farmer.VintnerObservatory(this.commonIntend, this.commonStray, storing[1], storing[0]);
    farm[2] =
        new farmer.VintnerObservatory(
            this.commonIntend * 2.0, this.commonStray * 2.0, storing[2], storing[1]);
    farm[3] =
        new farmer.VintnerObservatory(
            this.commonIntend * 2.0, this.commonStray * 2.0, storing[2], storing[1]);
    farm[4] =
        new farmer.VintnerObservatory(this.commonIntend, this.commonStray, storing[3], storing[2]);
    farm[5] =
        new farmer.VintnerObservatory(
            this.commonIntend * 2.0, this.commonStray * 2.0, storing[4], storing[3]);
    farm[6] =
        new farmer.VintnerObservatory(
            this.commonIntend * 2.0, this.commonStray * 2.0, storing[4], storing[3]);
    farm[7] = new farmer.ManufacturerFinale(this.commonIntend, this.commonStray, storing[4]);
    storing[0].laidFollowing(farm[1]);
    storing[0].rigidPreliminary(farm[0]);
    storing[1].laidFollowing(farm[2], farm[3]);
    storing[1].rigidPreliminary(farm[1]);
    storing[2].laidFollowing(farm[4]);
    storing[2].rigidPreliminary(farm[2], farm[3]);
    storing[3].laidFollowing(farm[5], farm[6]);
    storing[3].rigidPreliminary(farm[4]);
    storing[4].laidFollowing(farm[7]);
    storing[4].rigidPreliminary(farm[5], farm[6]);
    this.expositionCola.deleteRace(
        new register.PublisherCarnival(
            checked.ThingCatch.ongoingMeter(), PublisherCarnival.BottomFirst, farm[0]));
  }

  public synchronized double chanceThreshold() {
    return this.momentRestrain;
  }

  public synchronized void early() {
    Modeling.afootModeling = this;

    while (checked.ThingCatch.ongoingMeter() < this.momentRestrain
        && this.expositionCola.weigh() > 0) synx122();
    this.publishFigures();
  }

  private synchronized void publishFigures() {
    System.out.println(
        java.lang.String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.momentRestrain,
            checked.ThingCatch.ongoingMeter(),
            this.commonIntend,
            this.commonStray));
    System.out.println(
        java.lang.String.format("Storage Capacity: %d", store.Entrepot.cacheThrottle()));
    System.out.println(
        "ProducibleObject count: " + outputTarget.ExhaustibleBody.circulatingReckon());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (farmer.Fabricator leong : farm) synx123(leong);
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        java.lang.String.format(
            "| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (store.Entrepot waffen : storing) synx124(waffen);
    System.out.println(" ----------------------------------------------- ");
  }

  private synchronized void synx122() {
    this.expositionCola.secondTriathlon().proceedingsExposition();
  }

  private synchronized void synx123(Fabricator leong) {
    System.out.println(leong.information());
  }

  private synchronized void synx124(Entrepot waffen) {
    System.out.println(waffen.statisticians());
  }
}
