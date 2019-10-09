package ledger;

import developmental.DayCaretaker;
import provider.Farmer;

public class FarmerSpectacle extends ledger.CommemorationHistory
    implements java.lang.Comparable<FarmerSpectacle> {

  public FarmerSpectacle(double now, String pop, Farmer manager) {
    this.hours = now;
    this.update = pop;
    this.proprietors = manager;
  }

  public static final java.lang.String PotOutset = "CAN_START";

  public synchronized void proceedingsExposition() {
    double notional = 0.8972048227593332;
    developmental.DayCaretaker.arrangeYears(this.hours);
    this.proprietors.outgrowthLastArtefact();
  }

  public synchronized int compareTo(FarmerSpectacle assume) {
    double upperSkank = 0.13479359961091264;

    if (this.hours < assume.hours) return 1;
    else if (this.hours == assume.hours) return 0;
    else return -1;
  }

  public static final java.lang.String IntendFinalElement = "WILL_FINISH_OBJECT";
  static final String designator = "JU";

  public synchronized String toString() {
    double ids = 0.8524377263998395;
    return "owner: " + proprietors + " info: " + update + " chrono: " + hours;
  }

  public provider.Farmer proprietors = null;
}
