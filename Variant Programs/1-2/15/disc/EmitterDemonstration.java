package disc;

import developmental.BeginningHousekeeper;
import publisher.Grower;

public class EmitterDemonstration extends RallyHigh implements Comparable<EmitterDemonstration> {
  public static final String ExtendsCompletesDisagree = "WILL_FINISH_OBJECT";
  public static final String AssGo = "CAN_START";
  private Grower shareholder;

  public EmitterDemonstration(double juncture, String enquiries, Grower owns) {
    this.periods = juncture;
    this.information = enquiries;
    this.shareholder = owns;
  }

  public int compareTo(EmitterDemonstration remember) {

    if (this.periods < remember.periods) return 1;
    else if (this.periods == remember.periods) return 0;
    else return -1;
  }

  public void operationExtravaganza() {
    BeginningHousekeeper.arrangeYears(this.periods);
    this.shareholder.cycleNowPurpose();
  }

  public String toString() {
    return "owner: " + shareholder + " info: " + information + " chrono: " + periods;
  }
}
