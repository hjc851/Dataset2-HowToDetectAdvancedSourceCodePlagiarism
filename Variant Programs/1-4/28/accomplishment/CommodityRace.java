package accomplishment;

import indiscernible.YearWarder;
import exporter.Farm;

public class CommodityRace extends ForumMemorialize implements Comparable<CommodityRace> {
  public static final String BequeathCloseArtifact = "WILL_FINISH_OBJECT";

  public synchronized void cycleRace() {
    YearWarder.settledPeriods(this.days);
    this.employer.phaseSoonBody();
  }

  public synchronized String toString() {
    return "owner: " + employer + " info: " + learn + " chrono: " + days;
  }

  public synchronized int compareTo(CommodityRace say) {

    if (this.days < say.days) return 1;
    else if (this.days == say.days) return 0;
    else return -1;
  }

  public static final String ButtDepart = "CAN_START";
  private Farm employer;

  public CommodityRace(double now, String stuff, Farm boss) {
    this.days = now;
    this.learn = stuff;
    this.employer = boss;
  }
}
