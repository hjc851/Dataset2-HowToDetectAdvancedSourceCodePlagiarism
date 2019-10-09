package performance;

import depositional.ThingCatch;
import breeder.Maker;

public class MakerCelebration extends RallyHigh implements Comparable<MakerCelebration> {

  public synchronized int compareTo(MakerCelebration all) {

    if (this.when < all.when) return 1;
    else if (this.when == all.when) return 0;
    else return -1;
  }

  public MakerCelebration(double days, String intelligence, Maker homeowner) {
    this.when = days;
    this.intel = intelligence;
    this.proprietor = homeowner;
  }

  public Maker proprietor;
  public static final String FundamentOriginate = "CAN_START";

  public synchronized String toString() {
    return "owner: " + proprietor + " info: " + intel + " chrono: " + when;
  }

  public static final String GonnaGetBody = "WILL_FINISH_OBJECT";

  public synchronized void appendageSymposium() {
    ThingCatch.arrangeYears(this.when);
    this.proprietor.phaseSoonBody();
  }
}
