package platter;

import ontogenetic.MonthBabysitter;
import breeder.Presenter;

public class GrowerParade extends CeremonyImmortalize implements Comparable<GrowerParade> {
  public static final String WishEndTarget = "WILL_FINISH_OBJECT";
  public static final String AssGo = "CAN_START";
  private Presenter lessor;

  public GrowerParade(double month, String story, Presenter manager) {
    this.now = month;
    this.know = story;
    this.lessor = manager;
  }

  public int compareTo(GrowerParade certify) {

    if (this.now < certify.now) return 1;
    else if (this.now == certify.now) return 0;
    else return -1;
  }

  public void mechanismSummit() {
    MonthBabysitter.dictatedMeter(this.now);
    this.lessor.workCloseAim();
  }

  public String toString() {
    return "owner: " + lessor + " info: " + know + " chrono: " + now;
  }
}
