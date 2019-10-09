package ledger;

import indiscernible.ThingCatch;
import manufacturer.Producing;

public class VintnerGathering extends SpectaclePrecedent implements Comparable<VintnerGathering> {
  public static final String WantsTerminateSubject = "WILL_FINISH_OBJECT";
  public static final String ButtDepart = "CAN_START";
  private Producing landowner;

  public VintnerGathering(double when, String reporting, Producing permittee) {
    this.chance = when;
    this.dope = reporting;
    this.landowner = permittee;
  }

  public int compareTo(VintnerGathering hope) {

    if (this.chance < hope.chance) return 1;
    else if (this.chance == hope.chance) return 0;
    else return -1;
  }

  public void phaseCommemoration() {
    ThingCatch.settledPeriods(this.chance);
    this.landowner.methodsThenArgue();
  }

  public String toString() {
    return "owner: " + landowner + " info: " + dope + " chrono: " + chance;
  }
}
