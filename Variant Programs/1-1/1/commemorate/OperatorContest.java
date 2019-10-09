package commemorate;

import euphonious.YearsHolder;
import fabricator.Emitter;

public class OperatorContest extends CeremoniesLedger implements Comparable<OperatorContest> {
  public static final String NowPoleMatter = "WILL_FINISH_OBJECT";
  public static final String FannyBegun = "CAN_START";
  private Emitter owns;

  public OperatorContest(double clip, String media, Emitter tenant) {
    this.beginning = clip;
    this.intel = media;
    this.owns = tenant;
  }

  public int compareTo(OperatorContest fact) {

    if (this.beginning < fact.beginning) return 1;
    else if (this.beginning == fact.beginning) return 0;
    else return -1;
  }

  public void negotiationsCeremonies() {
    YearsHolder.laidClip(this.beginning);
    this.owns.methodSecondDemur();
  }

  public String toString() {
    return "owner: " + owns + " info: " + intel + " chrono: " + beginning;
  }
}
