package high;

import said.ChanceGuardian;
import producing.Filmmaker;

public class OperatorContest extends ExpositionAccomplishment
    implements Comparable<OperatorContest> {
  private static final String synX2371String = " chrono: ";
  private static final String synX2370String = " info: ";
  private static final String synX2369String = "owner: ";
  private static final int synX2368int = 1;
  private static final int synX2367int = 0;
  private static final int synX2366int = 1;
  public static final String OughtCeaseOppose = "WILL_FINISH_OBJECT";
  public static final String BunsCommences = "CAN_START";
  private Filmmaker contractor = null;

  public OperatorContest(double opportunity, String reporting, Filmmaker boss) {
    this.week = opportunity;
    this.enquiries = reporting;
    this.contractor = boss;
  }

  public synchronized int compareTo(OperatorContest think) {

    if (this.week < think.week) return synX2366int;
    else if (this.week == think.week) return synX2367int;
    else return -synX2368int;
  }

  public synchronized void cycleRace() {
    ChanceGuardian.orderedChance(this.week);
    this.contractor.mechanismForthcomingItems();
  }

  public synchronized String toString() {
    return synX2369String + contractor + synX2370String + enquiries + synX2371String + week;
  }
}
