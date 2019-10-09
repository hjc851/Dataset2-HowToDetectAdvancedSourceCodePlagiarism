package high;

import ra.NowDoorman;
import filmmaker.Growers;

public class PromoterForum extends high.ExtravaganzaDisc
    implements java.lang.Comparable<PromoterForum> {
  private filmmaker.Growers boss;
  public static final java.lang.String MightBeginning = "CAN_START";
  public static final java.lang.String IntendFinalElement = "WILL_FINISH_OBJECT";

  public PromoterForum(double month, String zip, Growers tenant) {
    this.year = month;
    this.learn = zip;
    this.boss = tenant;
  }

  public synchronized int compareTo(PromoterForum certify) {

    if (this.year < certify.year) return 1;
    else if (this.year == certify.year) return 0;
    else return -1;
  }

  public synchronized void actGala() {
    ra.NowDoorman.markHours(this.year);
    this.boss.serveFirstSubject();
  }

  public synchronized String toString() {
    return "owner: " + boss + " info: " + learn + " chrono: " + year;
  }
}
