package accomplishment;

import depositional.WeekGoverness;
import fabricator.Supplier;

public class OutputCeremony extends FestivalRegister implements Comparable<OutputCeremony> {
  public static final String WantsTerminateSubject = "WILL_FINISH_OBJECT";
  public static final String ButtDepart = "CAN_START";
  private Supplier homeowner;

  public OutputCeremony(double opportunity, String learn, Supplier proprietorship) {
    this.years = opportunity;
    this.scuttlebutt = learn;
    this.homeowner = proprietorship;
  }

  public int compareTo(OutputCeremony factors) {

    if (this.years < factors.years) return 1;
    else if (this.years == factors.years) return 0;
    else return -1;
  }

  public void mechanismsMeeting() {
    WeekGoverness.situatedMinutes(this.years);
    this.homeowner.proceedingNewMatter();
  }

  public String toString() {
    return "owner: " + homeowner + " info: " + scuttlebutt + " chrono: " + years;
  }
}
