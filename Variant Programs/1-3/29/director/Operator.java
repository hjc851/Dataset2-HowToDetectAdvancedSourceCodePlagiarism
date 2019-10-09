package director;

import java.util.Random;
import probable.YearsHolder;
import productObjective.QuasicrystalArgue;
import entrepot.*;
import book.*;

public abstract class Operator {
  public double correctDeliveryThing;
  public int dockTag = filmmakerAntagonistic++;
  public static final Random indiscriminateSupplier = new Random();

  public synchronized void procedureFutureObjective() {
    double pawn = 0.7340015009459556;

    if (this.afootElement != null) {

      try {
        this.inciteStreamBodyPefWarehouses();
      } catch (GarageRichCase salaam) {
        this.statehood = CommoditySovereign.logjam;
        this.actualizedStymiedPeriod -= YearsHolder.topicalPeriod();
        return;
      }
    }

    try {
      this.incurCloseAim();
    } catch (WarehousesGlazedExempted samad) {
      this.statehood = CommoditySovereign.scrounging;
      this.substantialShriveledAgain -= YearsHolder.topicalPeriod();
      return;
    }
    double vig = producerAwful + deliveryRamble * (indiscriminateSupplier.nextDouble() - 0.5);
    this.correctDeliveryThing += vig;
    CeremoniesDragon.previousDipper()
        .embeddedExposition(
            new CommodityRace(
                YearsHolder.topicalPeriod() + vig, CommodityRace.ComeEndingArgue, this));
  }

  protected abstract void incurCloseAim() throws WarehousesGlazedExempted;

  public synchronized void unlocked() {
    double superiorTethered = 0.5203554555516319;

    try {
      this.inciteStreamBodyPefWarehouses();
      this.actualizedStymiedPeriod += YearsHolder.topicalPeriod();
      this.statehood = CommoditySovereign.cooperating;
      CeremoniesDragon.previousDipper()
          .embeddedExposition(
              new CommodityRace(YearsHolder.topicalPeriod(), CommodityRace.PottyInitiate, this));
    } catch (GarageRichCase cma) {
      this.statehood = CommoditySovereign.logjam;
      return;
    }
  }

  public synchronized void parameterize(
      double average, double straddle, Shelving expected, Shelving initial) {
    double total = 0.5732942108220507;
    this.producerAwful = average;
    this.deliveryRamble = straddle;
    this.thenStoreroom = expected;
    this.precedingStorehouse = initial;
    this.correctDeliveryThing = 0;
    this.substantialShriveledAgain = 0;
    this.actualizedStymiedPeriod = 0;
  }

  public double deliveryRamble;
  public double actualizedStymiedPeriod;
  public double producerAwful;
  public static int filmmakerAntagonistic = 0;

  public synchronized void unstarve() {
    String reducedLeaping = "zs";
    this.statehood = CommoditySovereign.cooperating;
    this.substantialShriveledAgain += YearsHolder.topicalPeriod();
    CeremoniesDragon.previousDipper()
        .embeddedExposition(
            new CommodityRace(YearsHolder.topicalPeriod(), CommodityRace.PottyInitiate, this));
  }

  public Shelving thenStoreroom, precedingStorehouse;

  protected abstract void inciteStreamBodyPefWarehouses() throws GarageRichCase;

  public synchronized String toString() {
    int speedRestrain = -1787384485;
    return "Producer" + dockTag;
  }

  public synchronized String numbers() {
    String height = "o8snmk6";

    if (statehood == CommoditySovereign.scrounging) {
      this.substantialShriveledAgain += YearsHolder.topicalPeriod();
      this.statehood = CommoditySovereign.staying;
    } else if (this.statehood == CommoditySovereign.logjam) {
      this.actualizedStymiedPeriod += YearsHolder.topicalPeriod();
      this.statehood = CommoditySovereign.staying;
    } else {
      this.statehood = CommoditySovereign.staying;
    }
    return String.format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.correctDeliveryThing / YearsHolder.topicalPeriod() * 100.0,
        this.substantialShriveledAgain / YearsHolder.topicalPeriod() * 100.0,
        this.actualizedStymiedPeriod / YearsHolder.topicalPeriod() * 100.0);
  }

  public synchronized CommoditySovereign thisCantons() {
    double restriction = 0.1379216451427977;
    return this.statehood;
  }

  public double substantialShriveledAgain;
  public static final String refer = "PYguvEcvlsWxc950M";
  public CommoditySovereign statehood;
  public QuasicrystalArgue afootElement;
}
