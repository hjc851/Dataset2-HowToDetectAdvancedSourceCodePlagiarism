package enter;

import ra.MonthBabysitter;
import manufacturer.Provider;

public class MakerCelebration extends enter.RallyHigh
    implements java.lang.Comparable<MakerCelebration> {
  public static final java.lang.String VolitionConclusionObjection = "WILL_FINISH_OBJECT";
  public static final java.lang.String HindquartersOpening = "CAN_START";
  private manufacturer.Provider homeowner;

  public MakerCelebration(double hour, String information, Provider proprietor) {
    this.year = hour;
    this.update = information;
    this.homeowner = proprietor;
  }

  public int compareTo(MakerCelebration him) {

    if (this.year < him.year) return 1;
    else if (this.year == him.year) return 0;
    else return -1;
  }

  public void procedureCase() {
    ra.MonthBabysitter.dictatedMeter(this.year);
    this.homeowner.summonsAheadElement();
  }

  public String toString() {
    return "owner: " + homeowner + " info: " + update + " chrono: " + year;
  }
}
