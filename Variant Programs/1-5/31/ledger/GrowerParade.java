package ledger;

import ra.DayCaretaker;
import producing.Supplier;

public class GrowerParade extends ExpositionAccomplishment implements Comparable<GrowerParade> {

  public synchronized void summonsForum() {
    DayCaretaker.arrangeYears(this.month);
    this.boss.formalitiesComeDisagree();
  }

  public static final String IntendsCoatingResist = "WILL_FINISH_OBJECT";
  public static final String FannyBegun = "CAN_START";

  public GrowerParade(double days, String know, Supplier permittee) {
    this.month = (days);
    this.intel = (know);
    this.boss = (permittee);
  }

  public synchronized int compareTo(GrowerParade fact) {

    if (this.month < fact.month) return 1;
    else if (this.month == fact.month) return 0;
    else return -1;
  }

  public synchronized String toString() {
    return ("owner: " + boss + " info: " + intel + " chrono: " + month);
  }

  public Supplier boss = null;
}
