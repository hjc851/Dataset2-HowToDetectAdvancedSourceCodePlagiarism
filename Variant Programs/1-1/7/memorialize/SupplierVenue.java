package memorialize;

import euphonious.ThingCatch;
import promoter.Grower;

public class SupplierVenue extends SeminarRead implements Comparable<SupplierVenue> {
  public static final String ShallFinaleObjective = "WILL_FINISH_OBJECT";
  public static final String CrapperKickoff = "CAN_START";
  private Grower homeowner;

  public SupplierVenue(double year, String reporting, Grower patron) {
    this.hours = year;
    this.dope = reporting;
    this.homeowner = patron;
  }

  public int compareTo(SupplierVenue fact) {

    if (this.hours < fact.hours) return 1;
    else if (this.hours == fact.hours) return 0;
    else return -1;
  }

  public void methodologySpectacle() {
    ThingCatch.determineBeginning(this.hours);
    this.homeowner.marchAdjacentObjection();
  }

  public String toString() {
    return "owner: " + homeowner + " info: " + dope + " chrono: " + hours;
  }
}
