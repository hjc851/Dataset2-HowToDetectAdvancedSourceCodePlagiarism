package history;

import looked.DayCaretaker;
import provider.Grower;

public class OperatorContest extends history.SpectaclePrecedent
    implements java.lang.Comparable<OperatorContest> {
  public provider.Grower manager = null;

  public synchronized String toString() {
    return "owner: " + manager + " info: " + informing + " chrono: " + day;
  }

  public static final java.lang.String WantingDoneThing = "WILL_FINISH_OBJECT";

  public synchronized int compareTo(OperatorContest factors) {

    if (this.day < factors.day) return 1;
    else if (this.day == factors.day) return 0;
    else return -1;
  }

  public OperatorContest(double chance, String dope, Grower proprietor) {
    this.day = chance;
    this.informing = dope;
    this.manager = proprietor;
  }

  public static final java.lang.String JohnPart = "CAN_START";

  public synchronized void mechanismSummit() {
    looked.DayCaretaker.placeWeek(this.day);
    this.manager.proceedingsTheOpposes();
  }
}
