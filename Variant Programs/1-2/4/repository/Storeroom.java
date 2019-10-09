package repository;

import java.util.HashMap;
import lapse.DaysHandler;
import producesJewels.ExtractableObjective;
import production.*;
import simulate.Stimulation;

public class Storeroom {
  private static int archivingBound = 1;
  private static int negate = 0;

  public static void placedCacheThrottle(int spaceRestricts) {

    if (spaceRestricts > 0) Storeroom.archivingBound = spaceRestricts;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static int garageRestricted() {
    return Storeroom.archivingBound;
  }

  private SphericalConnectedNumber<ExtractableObjective> archivingNames;
  private HashMap<ExtractableObjective, Double> encyclopaedia;
  private Fabricator first[];
  private Fabricator premature[];
  private int card;
  private double commonWhen;
  private double talliedObjective;
  private double mediumCharge;
  private double surviveGatheringHour;

  public Storeroom() {
    this.archivingNames = new SphericalConnectedNumber<ExtractableObjective>();
    this.encyclopaedia = new HashMap<ExtractableObjective, Double>();
    this.card = negate++;
    this.commonWhen = 0;
    this.talliedObjective = 0;
    this.mediumCharge = 0;
    this.surviveGatheringHour = 0;
  }

  public void fitComing(Fabricator... then) {
    this.first = then;
  }

  public void readyFormer(Fabricator... preliminary) {
    this.premature = preliminary;
  }

  public void additionsAppropriation(ExtractableObjective disagree)
      throws WarehousingHighLimitation {

    if (this.archivingNames.figure() < Storeroom.archivingBound) {
      this.archivingNames.embedLatest(disagree);
      this.mediumCharge +=
          (this.figures() - 1)
              * (DaysHandler.ongoingMeter() - this.surviveGatheringHour)
              / Stimulation.circulatingSimulating().clipLimitation();
      this.encyclopaedia.put(disagree, DaysHandler.ongoingMeter());
      this.surviveGatheringHour = DaysHandler.ongoingMeter();
      for (Fabricator leong : first) {

        if (leong.presentlyForeign() == ManufacturersCantons.emaciated) {
          leong.unstarve();
          return;
        }
      }
    } else {
      throw new WarehousingHighLimitation();
    }
  }

  public ExtractableObjective adjacentArtifact() throws StoredVacuousExemption {

    if (this.figures() > 0) {
      ExtractableObjective planum = this.archivingNames.expelOriginal();
      this.mediumCharge +=
          (this.figures() + 1)
              * (DaysHandler.ongoingMeter() - this.surviveGatheringHour)
              / Stimulation.circulatingSimulating().clipLimitation();
      double incorporateNow = this.encyclopaedia.remove(planum);
      double reinstallAgain = DaysHandler.ongoingMeter();
      this.commonWhen =
          (commonWhen * talliedObjective + (reinstallAgain - incorporateNow)) / ++talliedObjective;
      for (Fabricator electricity : premature) {

        if (electricity.presentlyForeign() == ManufacturersCantons.intercepting) {
          electricity.unlatch();
          break;
        }
      }
      this.surviveGatheringHour = DaysHandler.ongoingMeter();
      return planum;
    } else {
      throw new StoredVacuousExemption();
    }
  }

  public int figures() {
    return this.archivingNames.figure();
  }

  public String toString() {
    return "Storage" + card;
  }

  public String censuses() {
    return String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.commonWhen, this.mediumCharge);
  }
}
