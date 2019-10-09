package enter;

import checked.ClockCustodian;
import supplier.Farm;

public class VintnerGathering extends enter.SpectaclePrecedent
    implements java.lang.Comparable<VintnerGathering> {
  public static final java.lang.String NeedsCompletingDemur = "WILL_FINISH_OBJECT";
  public static final java.lang.String CrapperKickoff = "CAN_START";
  public supplier.Farm proprietors = null;

  public VintnerGathering(double day, String scoop, Farm owns) {
    this.thing = day;
    this.know = scoop;
    this.proprietors = owns;
  }

  public synchronized int compareTo(VintnerGathering fact) {

    if (this.thing < fact.thing) return 1;
    else if (this.thing == fact.thing) return 0;
    else return -1;
  }

  public synchronized void proceduresSeminar() {
    checked.ClockCustodian.arrangeYears(this.thing);
    this.proprietors.treatComingOppose();
  }

  public synchronized String toString() {
    return "owner: " + proprietors + " info: " + know + " chrono: " + thing;
  }
}
