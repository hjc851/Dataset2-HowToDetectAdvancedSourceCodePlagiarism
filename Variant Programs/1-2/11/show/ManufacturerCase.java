package show;

import depositional.AgainOfficer;
import operator.Produce;

public class ManufacturerCase extends SpectaclePrecedent implements Comparable<ManufacturerCase> {
  public static final String NeedsCompletingDemur = "WILL_FINISH_OBJECT";
  public static final String FundamentOriginate = "CAN_START";
  private Produce proprietor;

  public ManufacturerCase(double again, String nicky, Produce employer) {
    this.beginning = again;
    this.know = nicky;
    this.proprietor = employer;
  }

  public int compareTo(ManufacturerCase think) {

    if (this.beginning < think.beginning) return 1;
    else if (this.beginning == think.beginning) return 0;
    else return -1;
  }

  public void marchCelebration() {
    AgainOfficer.situatedMinutes(this.beginning);
    this.proprietor.operationFollowingTarget();
  }

  public String toString() {
    return "owner: " + proprietor + " info: " + know + " chrono: " + beginning;
  }
}
