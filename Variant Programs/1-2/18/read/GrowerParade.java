package read;

import ontogenetic.PeriodsManager;
import breeder.Fabricator;

public class GrowerParade extends read.ParadePlatter implements java.lang.Comparable<GrowerParade> {
  public static final java.lang.String LeaveCompleteAim = "WILL_FINISH_OBJECT";
  public static final java.lang.String FundamentOriginate = "CAN_START";
  private breeder.Fabricator occupant;

  public GrowerParade(double month, String stuff, Fabricator proprietorship) {
    this.years = month;
    this.dope = stuff;
    this.occupant = proprietorship;
  }

  public int compareTo(GrowerParade see) {

    if (this.years < see.years) return 1;
    else if (this.years == see.years) return 0;
    else return -1;
  }

  public void litigateVenue() {
    ontogenetic.PeriodsManager.placeWeek(this.years);
    this.occupant.cycleNowPurpose();
  }

  public String toString() {
    return "owner: " + occupant + " info: " + dope + " chrono: " + years;
  }
}
