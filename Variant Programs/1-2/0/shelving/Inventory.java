package shelving;

import java.util.HashMap;
import ra.MonthBabysitter;
import processingCreations.ExhaustibleBody;
import manufacturer.*;
import analog.Emulation;

public class Inventory {
  private static int cachingRestrictions = 1;
  private static int reverse = 0;

  public static void primedDiskTrammel(int depositoryConstrain) {

    if (depositoryConstrain > 0) Inventory.cachingRestrictions = depositoryConstrain;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static int safekeepingCurb() {
    return Inventory.cachingRestrictions;
  }

  private shelving.FlierAttributedShortlist<ExhaustibleBody> storingTilt;
  private java.util.HashMap<ExhaustibleBody, Double> pronunciation;
  private manufacturer.Provider again[];
  private manufacturer.Provider predecessor[];
  private int pictures;
  private double typicalHour;
  private double seenBelongings;
  private double typicalCalculate;
  private double conclusionSummitMinutes;

  public Inventory() {
    this.storingTilt = new shelving.FlierAttributedShortlist<ExhaustibleBody>();
    this.pronunciation = new java.util.HashMap<ExhaustibleBody, Double>();
    this.pictures = reverse++;
    this.typicalHour = 0;
    this.seenBelongings = 0;
    this.typicalCalculate = 0;
    this.conclusionSummitMinutes = 0;
  }

  public void readyAdjacent(manufacturer.Provider... last) {
    this.again = last;
  }

  public void placeSuccessive(manufacturer.Provider... pervious) {
    this.predecessor = pervious;
  }

  public void contributeDetail(processingCreations.ExhaustibleBody objection)
      throws CacheTotalAnomaly {

    if (this.storingTilt.charge() < Inventory.cachingRestrictions) {
      this.storingTilt.embeddedParting(objection);
      this.typicalCalculate +=
          (this.reckoning() - 1)
              * (ra.MonthBabysitter.presentlyMinutes() - this.conclusionSummitMinutes)
              / analog.Emulation.presentAnalog().beginningThresholds();
      this.pronunciation.put(objection, ra.MonthBabysitter.presentlyMinutes());
      this.conclusionSummitMinutes = ra.MonthBabysitter.presentlyMinutes();
      for (manufacturer.Provider equally : again) {

        if (equally.topicalSubmit() == ProductionCountry.fattening) {
          equally.unstarve();
          return;
        }
      }
    } else {
      throw new shelving.CacheTotalAnomaly();
    }
  }

  public processingCreations.ExhaustibleBody comeSection() throws CacheDrainedAnomaly {

    if (this.reckoning() > 0) {
      processingCreations.ExhaustibleBody trapezium = this.storingTilt.expelOriginal();
      this.typicalCalculate +=
          (this.reckoning() + 1)
              * (ra.MonthBabysitter.presentlyMinutes() - this.conclusionSummitMinutes)
              / analog.Emulation.presentAnalog().beginningThresholds();
      double deleteYears = this.pronunciation.remove(trapezium);
      double disposeAmount = ra.MonthBabysitter.presentlyMinutes();
      this.typicalHour =
          (typicalHour * seenBelongings + (disposeAmount - deleteYears)) / ++seenBelongings;
      for (manufacturer.Provider leong : predecessor) {

        if (leong.topicalSubmit() == ProductionCountry.halting) {
          leong.unlocked();
          break;
        }
      }
      this.conclusionSummitMinutes = ra.MonthBabysitter.presentlyMinutes();
      return trapezium;
    } else {
      throw new shelving.CacheDrainedAnomaly();
    }
  }

  public int reckoning() {
    return this.storingTilt.charge();
  }

  public String toString() {
    return "Storage" + pictures;
  }

  public java.lang.String statisticians() {
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.typicalHour, this.typicalCalculate);
  }
}
