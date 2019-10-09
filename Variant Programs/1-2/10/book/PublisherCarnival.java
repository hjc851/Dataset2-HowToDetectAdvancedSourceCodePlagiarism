package book;

import indiscernible.MinutesNurse;
import grower.Exporter;

public class PublisherCarnival extends book.GatheringTally
    implements java.lang.Comparable<PublisherCarnival> {
  public static final java.lang.String VolitionConclusionObjection = "WILL_FINISH_OBJECT";
  public static final java.lang.String BottomFirst = "CAN_START";
  private grower.Exporter property;

  public PublisherCarnival(double periods, String informational, Exporter proprietors) {
    this.beginning = periods;
    this.nicky = informational;
    this.property = proprietors;
  }

  public int compareTo(PublisherCarnival sure) {

    if (this.beginning < sure.beginning) return 1;
    else if (this.beginning == sure.beginning) return 0;
    else return -1;
  }

  public void workFestival() {
    indiscernible.MinutesNurse.adjustMonth(this.beginning);
    this.property.negotiationsThirdPreclude();
  }

  public String toString() {
    return "owner: " + property + " info: " + nicky + " chrono: " + beginning;
  }
}
