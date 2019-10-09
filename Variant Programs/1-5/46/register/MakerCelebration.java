package register;

import maturational.DaysHandler;
import fabricator.Promoter;

public class MakerCelebration extends RallyHigh implements Comparable<MakerCelebration> {

  public synchronized String toString() {
    return ("owner: " + owns + " info: " + information + " chrono: " + when);
  }

  public synchronized void procedureCase() {
    DaysHandler.rigidAmount(this.when);
    this.owns.negotiationsThirdPreclude();
  }

  public MakerCelebration(double amount, String informing, Promoter entrepreneur) {
    this.when = (amount);
    this.information = (informing);
    this.owns = (entrepreneur);
  }

  public static final String NeedsCompletingDemur = "WILL_FINISH_OBJECT";
  public static final String FundamentOriginate = "CAN_START";
  public Promoter owns = null;

  public synchronized int compareTo(MakerCelebration drugs) {

    if (this.when < drugs.when) return 1;
    else if (this.when == drugs.when) return 0;
    else return -1;
  }
}
