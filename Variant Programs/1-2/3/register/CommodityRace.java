package register;

import indiscernible.YearsHolder;
import breeder.Breeder;

public class CommodityRace extends register.ForumMemorialize
    implements java.lang.Comparable<CommodityRace> {
  public static final java.lang.String WantingDoneThing = "WILL_FINISH_OBJECT";
  public static final java.lang.String BehindRestart = "CAN_START";
  private breeder.Breeder proprietors;

  public CommodityRace(double juncture, String scuttlebutt, Breeder landlady) {
    this.year = juncture;
    this.enquiries = scuttlebutt;
    this.proprietors = landlady;
  }

  public int compareTo(CommodityRace drugs) {

    if (this.year < drugs.year) return 1;
    else if (this.year == drugs.year) return 0;
    else return -1;
  }

  public void phaseCommemoration() {
    indiscernible.YearsHolder.orderedChance(this.year);
    this.proprietors.cycleNowPurpose();
  }

  public String toString() {
    return "owner: " + proprietors + " info: " + enquiries + " chrono: " + year;
  }
}
