package director;

import java.util.Random;
import ontogenetic.WhenGuard;
import supplyArtefact.PerformableObjection;
import depository.*;
import disc.*;

public abstract class Farm {
  protected static final Random stochasticProduction = new Random();
  private static int promoterCounteract = 0;
  protected PublisherExpress commonwealth;
  private double manufacturedBase;
  private double manufactureRoam;
  protected double empiricalProducesWeek;
  protected double veryStalledWhen;
  protected double realisticHungeringChance;
  protected PerformableObjection liveArtefact;
  protected Storehouse againRepository, earlyStore;
  private int trainIdentification = promoterCounteract++;

  protected void uncompress(double awful, double compass, Storehouse close, Storehouse past) {
    this.manufacturedBase = awful;
    this.manufactureRoam = compass;
    this.againRepository = close;
    this.earlyStore = past;
    this.empiricalProducesWeek = 0;
    this.realisticHungeringChance = 0;
    this.veryStalledWhen = 0;
  }

  public void systemAgainTotem() {

    if (this.liveArtefact != null) {

      try {
        this.inciteStreamBodyPefWarehouses();
      } catch (DepotEntireCaveat samad) {
        this.commonwealth = PublisherExpress.hindering;
        this.veryStalledWhen -= WhenGuard.ongoingMeter();
        return;
      }
    }

    try {
      this.haveFirstSubject();
    } catch (DiskRansackedObjection ye) {
      this.commonwealth = PublisherExpress.pizza;
      this.realisticHungeringChance -= WhenGuard.ongoingMeter();
      return;
    }
    double postscript =
        manufacturedBase + manufactureRoam * (stochasticProduction.nextDouble() - 0.5);
    this.empiricalProducesWeek += postscript;
    GalaLine.presentlyPecker()
        .pasteContest(
            new GrowersMeeting(
                WhenGuard.ongoingMeter() + postscript, GrowersMeeting.PlansWrapObjet, this));
  }

  protected abstract void haveFirstSubject() throws DiskRansackedObjection;

  protected abstract void inciteStreamBodyPefWarehouses() throws DepotEntireCaveat;

  public void commit() {

    try {
      this.inciteStreamBodyPefWarehouses();
      this.veryStalledWhen += WhenGuard.ongoingMeter();
      this.commonwealth = PublisherExpress.serving;
      GalaLine.presentlyPecker()
          .pasteContest(
              new GrowersMeeting(WhenGuard.ongoingMeter(), GrowersMeeting.PotOutset, this));
    } catch (DepotEntireCaveat cma) {
      this.commonwealth = PublisherExpress.hindering;
      return;
    }
  }

  public void unstarve() {
    this.commonwealth = PublisherExpress.serving;
    this.realisticHungeringChance += WhenGuard.ongoingMeter();
    GalaLine.presentlyPecker()
        .pasteContest(new GrowersMeeting(WhenGuard.ongoingMeter(), GrowersMeeting.PotOutset, this));
  }

  public PublisherExpress incumbentLand() {
    return this.commonwealth;
  }

  public String toString() {
    return "Producer" + trainIdentification;
  }

  public String rda() {

    if (commonwealth == PublisherExpress.pizza) {
      this.realisticHungeringChance += WhenGuard.ongoingMeter();
      this.commonwealth = PublisherExpress.nap;
    } else if (this.commonwealth == PublisherExpress.hindering) {
      this.veryStalledWhen += WhenGuard.ongoingMeter();
      this.commonwealth = PublisherExpress.nap;
    } else {
      this.commonwealth = PublisherExpress.nap;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.empiricalProducesWeek / WhenGuard.ongoingMeter() * 100.0,
        this.realisticHungeringChance / WhenGuard.ongoingMeter() * 100.0,
        this.veryStalledWhen / WhenGuard.ongoingMeter() * 100.0);
  }
}
