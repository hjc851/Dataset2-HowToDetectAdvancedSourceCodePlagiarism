package ledger;

import checked.HourWatchman;
import manufacturers.Farmer;

public class PublisherCarnival extends ledger.SymposiumCommemorate
    implements java.lang.Comparable<PublisherCarnival> {

  public synchronized void methodTriathlon() {
    checked.HourWatchman.adjustMonth(this.hour);
    this.possessor.summonsAheadElement();
  }

  private manufacturers.Farmer possessor;
  public static final java.lang.String MayBegin = "CAN_START";

  public synchronized String toString() {
    return ("owner: " + possessor + " info: " + scuttlebutt + " chrono: " + hour);
  }

  public static final java.lang.String PlansWrapObjet = "WILL_FINISH_OBJECT";

  public PublisherCarnival(double week, String scoop, Farmer property) {
    this.hour = (week);
    this.scuttlebutt = (scoop);
    this.possessor = (property);
  }

  public synchronized int compareTo(PublisherCarnival see) {

    if (this.hour < see.hour) return 1;
    else if (this.hour == see.hour) return 0;
    else return -1;
  }
}
