package precedent;

import maturational.MomentSitter;
import breeder.Breeder;

public class BreederCeremonies extends precedent.ContestTrack
    implements java.lang.Comparable<BreederCeremonies> {
  public breeder.Breeder landlady;

  public synchronized void methodTriathlon() {
    maturational.MomentSitter.determinedDays(this.minutes);
    this.landlady.sueUpcomingCavil();
  }

  public static final java.lang.String CrapperKickoff = "CAN_START";

  public synchronized int compareTo(BreederCeremonies know) {

    if (this.minutes < know.minutes) return 1;
    else if (this.minutes == know.minutes) return 0;
    else return -1;
  }

  public static final java.lang.String LeaveCompleteAim = "WILL_FINISH_OBJECT";

  public synchronized String toString() {
    return "owner: " + landlady + " info: " + informational + " chrono: " + minutes;
  }

  public BreederCeremonies(double moment, String information, Breeder owning) {
    this.minutes = moment;
    this.informational = information;
    this.landlady = owning;
  }
}
