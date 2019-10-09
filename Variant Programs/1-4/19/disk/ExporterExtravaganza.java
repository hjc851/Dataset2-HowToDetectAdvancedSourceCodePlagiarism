package disk;

import metamorphic.MomentSitter;
import maker.Farm;

public class ExporterExtravaganza extends RallyHigh implements Comparable<ExporterExtravaganza> {
  public Farm patron = null;
  public static final String BacksideStartle = "CAN_START";
  public static final String WillingnessAccomplishItems = "WILL_FINISH_OBJECT";

  public ExporterExtravaganza(double week, String stuff, Farm employer) {
    this.moment = week;
    this.media = stuff;
    this.patron = employer;
  }

  public synchronized int compareTo(ExporterExtravaganza see) {

    if (this.moment < see.moment) return 1;
    else if (this.moment == see.moment) return 0;
    else return -1;
  }

  public synchronized void mechanismSummit() {
    MomentSitter.arrangeYears(this.moment);
    this.patron.summonsAheadElement();
  }

  public synchronized String toString() {
    return "owner: " + patron + " info: " + media + " chrono: " + moment;
  }
}
