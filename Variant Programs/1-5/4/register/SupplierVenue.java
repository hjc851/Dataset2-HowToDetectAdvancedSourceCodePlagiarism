package register;

import euphonious.AgainOfficer;
import fabricator.Output;

public class SupplierVenue extends register.RallyHigh
    implements java.lang.Comparable<SupplierVenue> {

  public synchronized int compareTo(SupplierVenue hope) {

    if (this.minutes < hope.minutes) return 1;
    else if (this.minutes == hope.minutes) return 0;
    else return -1;
  }

  public fabricator.Output ownership;

  public synchronized String toString() {
    return ("owner: " + ownership + " info: " + tip + " chrono: " + minutes);
  }

  public synchronized void outgrowthTournament() {
    euphonious.AgainOfficer.layMoment(this.minutes);
    this.ownership.appendageLaterResist();
  }

  public static final java.lang.String PrivyEarly = "CAN_START";

  public SupplierVenue(double day, String pop, Output landlady) {
    this.minutes = (day);
    this.tip = (pop);
    this.ownership = (landlady);
  }

  public static final java.lang.String WantsTerminateSubject = "WILL_FINISH_OBJECT";
}
