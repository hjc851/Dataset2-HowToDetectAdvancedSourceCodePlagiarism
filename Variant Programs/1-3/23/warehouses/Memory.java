package warehouses;

import java.util.HashMap;
import lapse.BeginningHousekeeper;
import manufactureOrnaments.InterpretableResist;
import output.*;
import simulated.Simulating;

public class Memory {
  private double highMeetingAgain;
  private double middlingEnumerate;
  private double trackedArtefact;
  private double moderatePeriods;
  private int identifying;
  private Grower earlier[];
  private Grower succeeding[];
  private HashMap<InterpretableResist, Double> lexicon;
  private BroadsheetRelationRosters<InterpretableResist> storeInclination;
  private static int counterpunch;
  private static int storeroomReduce;

  public static synchronized void laidDepotLimitation(int inventoryMaximum) {

    if (inventoryMaximum > 0) Memory.storeroomReduce = inventoryMaximum;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public static synchronized int stowageRestricting() {
    return Memory.storeroomReduce;
  }

  public Memory() {
    this.storeInclination = new BroadsheetRelationRosters<InterpretableResist>();
    this.lexicon = new HashMap<InterpretableResist, Double>();
    this.identifying = counterpunch++;
    this.moderatePeriods = 0;
    this.trackedArtefact = 0;
    this.middlingEnumerate = 0;
    this.highMeetingAgain = 0;
  }

  public synchronized void situatedForthcoming(Grower... close) {
    this.succeeding = close;
  }

  public synchronized void dictatedLate(Grower... last) {
    this.earlier = last;
  }

  public synchronized void provideIssue(InterpretableResist purpose) throws StoreAmpleExcepted {

    if (this.storeInclination.calculation() < Memory.storeroomReduce) {
      this.storeInclination.inclosePenultimate(purpose);
      this.middlingEnumerate +=
          (this.tabulation() - 1)
              * (BeginningHousekeeper.presentlyMinutes() - this.highMeetingAgain)
              / Simulating.contemporaryFeigning().beginningThresholds();
      this.lexicon.put(purpose, BeginningHousekeeper.presentlyMinutes());
      this.highMeetingAgain = BeginningHousekeeper.presentlyMinutes();
      for (Grower spain : succeeding) {

        if (spain.theLaw() == SupplierProvince.malnourished) {
          spain.unstarve();
          return;
        }
      }
    } else {
      throw new StoreAmpleExcepted();
    }
  }

  public synchronized InterpretableResist afterParagraph() throws RepositoryGlassyExceptional {

    if (this.tabulation() > 0) {
      InterpretableResist hamatum;
      double deleteYears;
      double eliminatePeriods;
      hamatum = this.storeInclination.hitTop();
      this.middlingEnumerate +=
          (this.tabulation() + 1)
              * (BeginningHousekeeper.presentlyMinutes() - this.highMeetingAgain)
              / Simulating.contemporaryFeigning().beginningThresholds();
      deleteYears = this.lexicon.remove(hamatum);
      eliminatePeriods = BeginningHousekeeper.presentlyMinutes();
      this.moderatePeriods =
          (moderatePeriods * trackedArtefact + (eliminatePeriods - deleteYears))
              / ++trackedArtefact;
      for (Grower arsenic : earlier) {

        if (arsenic.theLaw() == SupplierProvince.locking) {
          arsenic.unlatch();
          break;
        }
      }
      this.highMeetingAgain = BeginningHousekeeper.presentlyMinutes();
      return hamatum;
    } else {
      throw new RepositoryGlassyExceptional();
    }
  }

  public synchronized int tabulation() {
    return this.storeInclination.calculation();
  }

  public synchronized String toString() {
    return "Storage" + identifying;
  }

  public synchronized String surveys() {
    return String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.moderatePeriods, this.middlingEnumerate);
  }

  static {
    storeroomReduce = 1;
    counterpunch = 0;
  }
}
