package read;

import lapse.DaysHandler;
import production.Fabricator;

public class VintnerGathering extends CeremoniesLedger implements Comparable<VintnerGathering> {
  public static final String ExpectedTerminusCavil = "WILL_FINISH_OBJECT";
  public static final String DerriereBegins = "CAN_START";
  private Fabricator employer;

  public VintnerGathering(double opportunity, String scoop, Fabricator operator) {
    this.chance = opportunity;
    this.update = scoop;
    this.employer = operator;
  }

  public int compareTo(VintnerGathering all) {

    if (this.chance < all.chance) return 1;
    else if (this.chance == all.chance) return 0;
    else return -1;
  }

  public void appendageSymposium() {
    DaysHandler.primedPeriod(this.chance);
    this.employer.systemAgainTotem();
  }

  public String toString() {
    return "owner: " + employer + " info: " + update + " chrono: " + chance;
  }
}
