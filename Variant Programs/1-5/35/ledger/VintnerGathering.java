package ledger;

import euphonious.AmountRearing;
import provider.Director;

public class VintnerGathering extends MeetingAnnals implements Comparable<VintnerGathering> {
  public static final String WantingDoneThing = "WILL_FINISH_OBJECT";
  public static final String PrivyEarly = "CAN_START";
  private Director property;

  public VintnerGathering(double years, String reporting, Director landlady) {
    this.juncture = years;
    this.details = reporting;
    this.property = landlady;
  }

  public synchronized int compareTo(VintnerGathering factors) {

    if (this.juncture < factors.juncture) return 1;
    else if (this.juncture == factors.juncture) return 0;
    else return -1;
  }

  public synchronized void methodTriathlon() {
    AmountRearing.adjustMonth(this.juncture);
    this.property.methodologyAfterVictim();
  }

  public synchronized String toString() {
    return "owner: " + property + " info: " + details + " chrono: " + juncture;
  }
}
