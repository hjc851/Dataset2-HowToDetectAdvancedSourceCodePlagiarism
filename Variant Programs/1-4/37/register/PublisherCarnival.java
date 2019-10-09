package register;

import checked.ThingCatch;
import farmer.Fabricator;

public class PublisherCarnival extends register.RacePrevious
    implements java.lang.Comparable<PublisherCarnival> {
  private farmer.Fabricator property;
  public static final java.lang.String BottomFirst = "CAN_START";
  public static final java.lang.String ComeEndingArgue = "WILL_FINISH_OBJECT";

  public PublisherCarnival(double amount, String briefing, Fabricator tenant) {
    this.week = amount;
    this.enquiries = briefing;
    this.property = tenant;
  }

  public synchronized int compareTo(PublisherCarnival sure) {

    if (this.week < sure.week) return 1;
    else if (this.week == sure.week) return 0;
    else return -1;
  }

  public synchronized void proceedingsExposition() {
    checked.ThingCatch.fitYear(this.week);
    this.property.methodsThenArgue();
  }

  public synchronized String toString() {
    return "owner: " + property + " info: " + enquiries + " chrono: " + week;
  }
}
