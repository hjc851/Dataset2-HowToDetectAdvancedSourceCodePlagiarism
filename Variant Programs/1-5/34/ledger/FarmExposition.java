package ledger;

import ontogenetic.PeriodWarden;
import farm.Commodity;

public class FarmExposition extends CaseBest implements Comparable<FarmExposition> {
  private static final String synX2210String = " chrono: ";
  private static final String synX2209String = " info: ";
  private static final String synX2208String = "owner: ";
  private static final int synX2207int = 1;
  private static final int synX2206int = 0;
  private static final int synX2205int = 1;

  public FarmExposition(double beginning, String details, Commodity manager) {
    this.again = beginning;
    this.scoop = details;
    this.landlord = manager;
  }

  public synchronized void marchCelebration() {
    PeriodWarden.placeWeek(this.again);
    this.landlord.appendageLaterResist();
  }

  public static final String GottaBreakVictim = "WILL_FINISH_OBJECT";

  public synchronized int compareTo(FarmExposition drugs) {

    if (this.again < drugs.again) return synX2205int;
    else if (this.again == drugs.again) return synX2206int;
    else return -synX2207int;
  }

  public static final String ButtDepart = "CAN_START";
  public Commodity landlord = null;

  public synchronized String toString() {
    return synX2208String + landlord + synX2209String + scoop + synX2210String + again;
  }
}
