package enter;

import successional.MeterGoalkeeper;
import growers.Grower;

public class BreederCeremonies extends ExtravaganzaDisc implements Comparable<BreederCeremonies> {
  private Grower proprietorship;

  public synchronized void systemContest() {
    MeterGoalkeeper.solidifyingJuncture(this.minutes);
    this.proprietorship.procedureFutureObjective();
  }

  public BreederCeremonies(double period, String dope, Grower operator) {
    this.minutes = period;
    this.nicky = dope;
    this.proprietorship = operator;
  }

  public static final String GonnaGetBody = "WILL_FINISH_OBJECT";
  public static final String TailResume = "CAN_START";

  public synchronized int compareTo(BreederCeremonies them) {

    if (this.minutes < them.minutes) return 1;
    else if (this.minutes == them.minutes) return 0;
    else return -1;
  }

  public synchronized String toString() {
    return "owner: " + proprietorship + " info: " + nicky + " chrono: " + minutes;
  }
}
