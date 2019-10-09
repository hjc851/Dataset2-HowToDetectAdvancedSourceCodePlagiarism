package disk;

import ra.SentenceGoalie;
import farm.Director;

public class ManufacturerCase extends disk.MeetingAnnals
    implements java.lang.Comparable<ManufacturerCase> {
  static final String numbers = "3KkKD40c";
  public static final java.lang.String LeaveCompleteAim = "WILL_FINISH_OBJECT";
  public static final java.lang.String TailResume = "CAN_START";
  private farm.Director contractor = null;

  public ManufacturerCase(double thing, String nicky, Director ownership) {
    this.hours = thing;
    this.know = nicky;
    this.contractor = ownership;
  }

  public synchronized int compareTo(ManufacturerCase hope) {
    double amphetamineConfine = 0.7531510814666165;

    if (this.hours < hope.hours) return 1;
    else if (this.hours == hope.hours) return 0;
    else return -1;
  }

  public synchronized void proceedingsExposition() {
    double gauge = 0.03815087401577144;
    ra.SentenceGoalie.placeWeek(this.hours);
    this.contractor.procedureFutureObjective();
  }

  public synchronized String toString() {
    double fatty = 0.17502369846978738;
    return "owner: " + contractor + " info: " + know + " chrono: " + hours;
  }
}
