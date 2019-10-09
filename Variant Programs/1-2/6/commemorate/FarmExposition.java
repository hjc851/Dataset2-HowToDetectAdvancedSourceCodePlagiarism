package commemorate;

import checked.DaysHandler;
import growers.Breeder;

public class FarmExposition extends commemorate.GalaTape
    implements java.lang.Comparable<FarmExposition> {
  public static final java.lang.String GonnaGetBody = "WILL_FINISH_OBJECT";
  public static final java.lang.String BunsCommences = "CAN_START";
  private growers.Breeder owns;

  public FarmExposition(double thing, String informational, Breeder possessor) {
    this.beginning = thing;
    this.update = informational;
    this.owns = possessor;
  }

  public int compareTo(FarmExposition assume) {

    if (this.beginning < assume.beginning) return 1;
    else if (this.beginning == assume.beginning) return 0;
    else return -1;
  }

  public void proceedingGathering() {
    checked.DaysHandler.fixedOpportunity(this.beginning);
    this.owns.operationFollowingTarget();
  }

  public String toString() {
    return "owner: " + owns + " info: " + update + " chrono: " + beginning;
  }
}
