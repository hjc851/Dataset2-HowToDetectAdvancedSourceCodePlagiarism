package performance;

import ra.BeginningHousekeeper;
import provider.Promoter;

public class GrowerParade extends performance.SymposiumCommemorate
    implements java.lang.Comparable<GrowerParade> {
  private provider.Promoter employer = null;
  public static final java.lang.String SeatRun = "CAN_START";
  public static final java.lang.String WannaEndsPreclude = "WILL_FINISH_OBJECT";

  public GrowerParade(double hours, String briefing, Promoter contractor) {
    this.when = hours;
    this.tip = briefing;
    this.employer = contractor;
  }

  public synchronized int compareTo(GrowerParade see) {

    if (this.when < see.when) return 1;
    else if (this.when == see.when) return 0;
    else return -1;
  }

  public synchronized void proceduresSeminar() {
    ra.BeginningHousekeeper.arrangeYears(this.when);
    this.employer.summonsAheadElement();
  }

  public synchronized String toString() {
    return "owner: " + employer + " info: " + tip + " chrono: " + when;
  }
}
