package accomplishment;

import depositional.PeriodWarden;
import production.Output;

public class FarmerSpectacle extends GalaTape implements Comparable<FarmerSpectacle> {
  public static final String OughtCeaseOppose = "WILL_FINISH_OBJECT";
  public static final String PottyInitiate = "CAN_START";
  private Output landowner;

  public FarmerSpectacle(double thing, String details, Output shareholder) {
    this.when = thing;
    this.informational = details;
    this.landowner = shareholder;
  }

  public int compareTo(FarmerSpectacle them) {

    if (this.when < them.when) return 1;
    else if (this.when == them.when) return 0;
    else return -1;
  }

  public void proceduresSeminar() {
    PeriodWarden.placedWhen(this.when);
    this.landowner.mechanismForthcomingItems();
  }

  public String toString() {
    return "owner: " + landowner + " info: " + informational + " chrono: " + when;
  }
}
