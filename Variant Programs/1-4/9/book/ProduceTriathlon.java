package book;

import looked.MeterGoalkeeper;
import fabricator.Publisher;

public class ProduceTriathlon extends CarnivalDisk implements Comparable<ProduceTriathlon> {
  public static final String WilFinisArtefact = "WILL_FINISH_OBJECT";
  private Publisher owns = null;
  public static final String BunsCommences = "CAN_START";

  public synchronized int compareTo(ProduceTriathlon see) {

    if (this.hours < see.hours) return 1;
    else if (this.hours == see.hours) return 0;
    else return -1;
  }

  public synchronized String toString() {
    return "owner: " + owns + " info: " + enquiries + " chrono: " + hours;
  }

  public synchronized void methodologySpectacle() {
    MeterGoalkeeper.doAgain(this.hours);
    this.owns.serveFirstSubject();
  }

  public ProduceTriathlon(double periods, String stuff, Publisher proprietorship) {
    this.hours = periods;
    this.enquiries = stuff;
    this.owns = proprietorship;
  }
}
