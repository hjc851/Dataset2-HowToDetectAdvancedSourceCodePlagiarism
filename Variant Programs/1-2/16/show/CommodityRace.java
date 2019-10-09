package show;

import acculturative.AgainOfficer;
import farmer.Publisher;

public class CommodityRace extends GalaTape implements Comparable<CommodityRace> {
  public static final String ShallFinaleObjective = "WILL_FINISH_OBJECT";
  public static final String ArseJump = "CAN_START";
  private Publisher contractor;

  public CommodityRace(double week, String news, Publisher landlord) {
    this.hour = week;
    this.reporting = news;
    this.contractor = landlord;
  }

  public int compareTo(CommodityRace drugs) {

    if (this.hour < drugs.hour) return 1;
    else if (this.hour == drugs.hour) return 0;
    else return -1;
  }

  public void cycleRace() {
    AgainOfficer.fixThing(this.hour);
    this.contractor.methodsThenArgue();
  }

  public String toString() {
    return "owner: " + contractor + " info: " + reporting + " chrono: " + hour;
  }
}
