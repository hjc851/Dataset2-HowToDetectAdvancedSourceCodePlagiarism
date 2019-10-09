package histories;

import lapse.BeginningHousekeeper;
import output.Grower;

public class GrowerParade extends CarnivalDisk implements Comparable<GrowerParade> {
  private Grower employer;
  public static final String FundamentOriginate = "CAN_START";
  public static final String LeaveCompleteAim = "WILL_FINISH_OBJECT";

  public GrowerParade(double clip, String informing, Grower landlady) {
    this.meter = clip;
    this.briefing = informing;
    this.employer = landlady;
  }

  public synchronized int compareTo(GrowerParade and) {

    if (this.meter < and.meter) return 1;
    else if (this.meter == and.meter) return 0;
    else return -1;
  }

  public synchronized void proceedingsExposition() {
    BeginningHousekeeper.fixThing(this.meter);
    this.employer.litigateIncomingItem();
  }

  public synchronized String toString() {
    return "owner: " + employer + " info: " + briefing + " chrono: " + meter;
  }
}
