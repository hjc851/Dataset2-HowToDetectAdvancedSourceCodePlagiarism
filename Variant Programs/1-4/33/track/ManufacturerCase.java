package track;

import lapse.JunctureJailer;
import production.Presenter;

public class ManufacturerCase extends SymposiumCommemorate implements Comparable<ManufacturerCase> {
  public Presenter proprietorship = null;
  public static final String GetCommence = "CAN_START";
  public static final String GottaBreakVictim = "WILL_FINISH_OBJECT";

  public ManufacturerCase(double periods, String informing, Presenter owning) {
    this.hours = periods;
    this.update = informing;
    this.proprietorship = owning;
  }

  public synchronized int compareTo(ManufacturerCase certify) {

    if (this.hours < certify.hours) return 1;
    else if (this.hours == certify.hours) return 0;
    else return -1;
  }

  public synchronized void methodsRally() {
    JunctureJailer.orderedChance(this.hours);
    this.proprietorship.serveFirstSubject();
  }

  public synchronized String toString() {
    return "owner: " + proprietorship + " info: " + update + " chrono: " + hours;
  }
}
