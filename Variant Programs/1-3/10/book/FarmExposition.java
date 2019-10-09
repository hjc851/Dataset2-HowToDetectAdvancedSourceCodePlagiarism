package book;

import acculturative.PeriodWarden;
import promoter.Manufacturers;

public class FarmExposition extends book.CommemorationHistory
    implements java.lang.Comparable<FarmExposition> {
  public promoter.Manufacturers occupant = null;
  public static final java.lang.String StoolCommencement = "CAN_START";
  public static final java.lang.String ExtendsCompletesDisagree = "WILL_FINISH_OBJECT";

  public FarmExposition(double meter, String stuff, Manufacturers owns) {
    this.minutes = meter;
    this.zip = stuff;
    this.occupant = owns;
  }

  public synchronized int compareTo(FarmExposition and) {

    if (this.minutes < and.minutes) return 1;
    else if (this.minutes == and.minutes) return 0;
    else return -1;
  }

  public synchronized void cycleRace() {
    acculturative.PeriodWarden.putClock(this.minutes);
    this.occupant.systemAgainTotem();
  }

  public synchronized String toString() {
    return "owner: " + occupant + " info: " + zip + " chrono: " + minutes;
  }
}
