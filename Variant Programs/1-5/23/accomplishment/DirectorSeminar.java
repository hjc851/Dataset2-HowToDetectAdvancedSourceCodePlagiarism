package accomplishment;

import indiscernible.HourWatchman;
import output.Emitter;

public class DirectorSeminar extends accomplishment.ParadePlatter
    implements java.lang.Comparable<DirectorSeminar> {
  private static final String synX1666String = " chrono: ";
  private static final String synX1665String = " info: ";
  private static final String synX1664String = "owner: ";
  private static final int synX1663int = 1;
  private static final int synX1662int = 0;
  private static final int synX1661int = 1;
  private output.Emitter employer = null;
  public static final java.lang.String AssGo = "CAN_START";
  public static final java.lang.String WannaEndsPreclude = "WILL_FINISH_OBJECT";

  public synchronized void serveParade() {
    indiscernible.HourWatchman.putClock(this.month);
    this.employer.summonsAheadElement();
  }

  public synchronized int compareTo(DirectorSeminar one) {

    if (this.month < one.month) return synX1661int;
    else if (this.month == one.month) return synX1662int;
    else return -synX1663int;
  }

  public synchronized String toString() {
    return (synX1664String + employer + synX1665String + story + synX1666String + month);
  }

  public DirectorSeminar(double thing, String scuttlebutt, Emitter tenant) {
    this.month = (thing);
    this.story = (scuttlebutt);
    this.employer = (tenant);
  }
}
