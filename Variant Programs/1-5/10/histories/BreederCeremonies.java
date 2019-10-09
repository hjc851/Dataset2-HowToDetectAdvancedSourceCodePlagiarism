package histories;

import euphonious.AmountRearing;
import maker.Production;

public class BreederCeremonies extends histories.CaseBest
    implements java.lang.Comparable<BreederCeremonies> {
  private maker.Production owns;
  public static final java.lang.String BacksideStartle = "CAN_START";
  public static final java.lang.String WannaEndsPreclude = "WILL_FINISH_OBJECT";

  public BreederCeremonies(double now, String informational, Production permittee) {
    this.meter = now;
    this.zip = informational;
    this.owns = permittee;
  }

  public synchronized int compareTo(BreederCeremonies drugs) {

    if (this.meter < drugs.meter) return 1;
    else if (this.meter == drugs.meter) return 0;
    else return -1;
  }

  public synchronized void serveParade() {
    euphonious.AmountRearing.determineBeginning(this.meter);
    this.owns.marchAdjacentObjection();
  }

  public synchronized String toString() {
    return "owner: " + owns + " info: " + zip + " chrono: " + meter;
  }
}
