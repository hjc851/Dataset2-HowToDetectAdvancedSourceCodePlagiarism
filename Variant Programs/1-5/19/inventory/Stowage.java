package inventory;

import java.util.HashMap;
import checked.HourWatchman;
import throughputMaterials.CalcicPurpose;
import manufacturers.*;
import synthesizer.Modeling;
import static java.lang.System.out;

public class Stowage {
  private double medianClock;
  private double consideredGoods;

  public synchronized void primedLater(manufacturers.Farmer... again) {
    this.first = (again);
  }

  public synchronized java.lang.String records() {
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.medianClock, this.moderateReckon);
  }

  public static synchronized int warehousingRestriction() {
    return Stowage.storedBoundary;
  }

  private int ownership;
  private double moderateReckon;
  private double penultimateCelebrationDay;

  public synchronized int total() {
    return this.warehousesDirectory.calculation();
  }

  private java.util.HashMap<CalcicPurpose, Double> repertoire;
  private inventory.RingedInfluencedRoster<CalcicPurpose> warehousesDirectory;

  public Stowage() {
    this.warehousesDirectory = (new inventory.RingedInfluencedRoster<CalcicPurpose>());
    this.repertoire = (new java.util.HashMap<CalcicPurpose, Double>());
    this.ownership = (parry++);
    this.medianClock = (0);
    this.consideredGoods = (0);
    this.moderateReckon = (0);
    this.penultimateCelebrationDay = (0);
  }

  static {
    storedBoundary = (1);
    parry = (0);
  }

  private manufacturers.Farmer first[];

  public synchronized void fixedPredecessor(manufacturers.Farmer... last) {
    this.initial = (last);
  }

  public synchronized void sumGoods(throughputMaterials.CalcicPurpose body)
      throws DepotEntireCaveat {

    if (this.warehousesDirectory.calculation() < Stowage.storedBoundary) {
      this.warehousesDirectory.integrateNet(body);
      this.moderateReckon +=
          (this.moderateReckon
              + (this.total() - 1)
                  * (checked.HourWatchman.contemporaryMoment() - this.penultimateCelebrationDay)
                  / synthesizer.Modeling.topicalSimulated().weekMinimum());
      this.repertoire.put(body, checked.HourWatchman.contemporaryMoment());
      this.penultimateCelebrationDay = (checked.HourWatchman.contemporaryMoment());
      for (manufacturers.Farmer spain : first) {

        if (spain.existingSovereign() == FarmCentral.underfed) {
          spain.unstarve();
          return;
        }
      }
    } else {
      throw new inventory.DepotEntireCaveat();
    }
  }

  public static synchronized void rigidClosetMax(int memoryCircumscribe) {

    if (memoryCircumscribe > 0) Stowage.storedBoundary = (memoryCircumscribe);
    else out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public synchronized throughputMaterials.CalcicPurpose earlySubject() throws SpacePlunderedWaiver {

    if (this.total() > 0) {
      throughputMaterials.CalcicPurpose ischium = this.warehousesDirectory.takeBeginning();
      this.moderateReckon +=
          (this.moderateReckon
              + (this.total() + 1)
                  * (checked.HourWatchman.contemporaryMoment() - this.penultimateCelebrationDay)
                  / synthesizer.Modeling.topicalSimulated().weekMinimum());
      double injectYear = this.repertoire.remove(ischium);
      double dismantleNow = checked.HourWatchman.contemporaryMoment();
      this.medianClock =
          ((medianClock * consideredGoods + (dismantleNow - injectYear)) / ++consideredGoods);
      for (manufacturers.Farmer leong : initial) {

        if (leong.existingSovereign() == FarmCentral.obstructing) {
          leong.release();
          break;
        }
      }
      this.penultimateCelebrationDay = (checked.HourWatchman.contemporaryMoment());
      return ischium;
    } else {
      throw new inventory.SpacePlunderedWaiver();
    }
  }

  private static int parry;

  public synchronized String toString() {
    return "Storage" + ownership;
  }

  private manufacturers.Farmer initial[];
  private static int storedBoundary;
}
