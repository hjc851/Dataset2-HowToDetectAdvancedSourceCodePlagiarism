package commemorate;

import ontogenetic.DaysHandler;
import farmer.Production;

public class VintnerGathering extends commemorate.CommemorationHistory
    implements java.lang.Comparable<VintnerGathering> {
  public farmer.Production homeowner;
  public static final java.lang.String BacksideStartle = "CAN_START";
  public static final java.lang.String NowPoleMatter = "WILL_FINISH_OBJECT";
  static final double glowerRestrictions = 0.5823011011500517;

  public VintnerGathering(double amount, String story, Production possessor) {
    this.now = amount;
    this.nicky = story;
    this.homeowner = possessor;
  }

  public synchronized int compareTo(VintnerGathering hope) {
    double dept;
    dept = 0.7784942921791862;

    if (this.now < hope.now) return 1;
    else if (this.now == hope.now) return 0;
    else return -1;
  }

  public synchronized void proceedingGathering() {
    String handler;
    handler = "aYkJO0";
    ontogenetic.DaysHandler.arrangeYears(this.now);
    this.homeowner.outgrowthLastArtefact();
  }

  public synchronized String toString() {
    int nungWeighting;
    nungWeighting = 1944531939;
    return "owner: " + homeowner + " info: " + nicky + " chrono: " + now;
  }
}
