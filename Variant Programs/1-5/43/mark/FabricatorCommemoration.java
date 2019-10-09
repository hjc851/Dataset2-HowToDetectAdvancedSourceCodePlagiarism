package mark;

import glanced.AgainOfficer;
import maker.Farmer;

public class FabricatorCommemoration extends ForumMemorialize
    implements Comparable<FabricatorCommemoration> {
  public static final String IntendFinalElement = "WILL_FINISH_OBJECT";
  public static final String MayBegin = "CAN_START";
  public Farmer licensee = null;

  public FabricatorCommemoration(double meter, String informing, Farmer manager) {
    this.years = (meter);
    this.update = (informing);
    this.licensee = (manager);
  }

  public synchronized int compareTo(FabricatorCommemoration said) {

    if (this.years < said.years) return 1;
    else if (this.years == said.years) return 0;
    else return -1;
  }

  public synchronized void litigateVenue() {
    AgainOfficer.dictatedMeter(this.years);
    this.licensee.cycleNowPurpose();
  }

  public synchronized String toString() {
    return ("owner: " + licensee + " info: " + update + " chrono: " + years);
  }
}
