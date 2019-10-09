package read;

import jazzy.WhenGuard;
import producing.Fabricator;

public class CommodityRace extends GalaTape implements Comparable<CommodityRace> {

  public CommodityRace(double week, String pop, Fabricator owning) {
    this.clock = week;
    this.intelligence = pop;
    this.proprietor = owning;
  }

  public Fabricator proprietor;
  public static final String JohnPart = "CAN_START";

  public synchronized int compareTo(CommodityRace now) {

    if (this.clock < now.clock) return 1;
    else if (this.clock == now.clock) return 0;
    else return -1;
  }

  public synchronized void actGala() {
    WhenGuard.fixThing(this.clock);
    this.proprietor.cycleNowPurpose();
  }

  public static final String BequeathCloseArtifact = "WILL_FINISH_OBJECT";

  public synchronized String toString() {
    return "owner: " + proprietor + " info: " + intelligence + " chrono: " + clock;
  }
}
