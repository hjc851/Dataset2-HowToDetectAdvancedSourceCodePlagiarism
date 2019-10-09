package register;

import maturational.WeekGoverness;
import grower.Output;

public class PromoterForum extends register.ForumMemorialize
    implements java.lang.Comparable<PromoterForum> {
  public grower.Output boss;
  public static final java.lang.String ToiletBegan = "CAN_START";
  public static final java.lang.String GoesConcludeTotem = "WILL_FINISH_OBJECT";

  public PromoterForum(double again, String story, Output operator) {
    this.clock = again;
    this.informational = story;
    this.boss = operator;
  }

  public synchronized int compareTo(PromoterForum ensure) {

    if (this.clock < ensure.clock) return 1;
    else if (this.clock == ensure.clock) return 0;
    else return -1;
  }

  public synchronized void methodologySpectacle() {
    maturational.WeekGoverness.primedPeriod(this.clock);
    this.boss.treatComingOppose();
  }

  public synchronized String toString() {
    return "owner: " + boss + " info: " + informational + " chrono: " + clock;
  }
}
