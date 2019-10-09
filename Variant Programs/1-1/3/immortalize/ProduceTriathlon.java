package immortalize;

import ra.NowDoorman;
import presenter.Production;

public class ProduceTriathlon extends CarnivalDisk implements Comparable<ProduceTriathlon> {
  public static final String TestamentLastItem = "WILL_FINISH_OBJECT";
  public static final String ArseJump = "CAN_START";
  private Production contractor;

  public ProduceTriathlon(double moment, String dope, Production operator) {
    this.days = moment;
    this.intel = dope;
    this.contractor = operator;
  }

  public int compareTo(ProduceTriathlon factors) {

    if (this.days < factors.days) return 1;
    else if (this.days == factors.days) return 0;
    else return -1;
  }

  public void formalitiesDemonstration() {
    NowDoorman.determinedDays(this.days);
    this.contractor.operationFollowingTarget();
  }

  public String toString() {
    return "owner: " + contractor + " info: " + intel + " chrono: " + days;
  }
}
