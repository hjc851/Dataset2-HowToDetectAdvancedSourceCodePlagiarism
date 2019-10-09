package disc;

import probable.PeriodWarden;
import filmmaker.Commodity;

public class FabricatorCommemoration extends disc.FestivalRegister
    implements java.lang.Comparable<FabricatorCommemoration> {
  public filmmaker.Commodity employer;
  public static final java.lang.String BehindRestart = "CAN_START";
  public static final java.lang.String LetCompletedPurpose = "WILL_FINISH_OBJECT";
  static final int confine = -1095256336;

  public FabricatorCommemoration(double days, String media, Commodity lessor) {
    this.thing = days;
    this.pop = media;
    this.employer = lessor;
  }

  public synchronized int compareTo(FabricatorCommemoration whatsoever) {
    double restricting;
    restricting = 0.44938775772929396;

    if (this.thing < whatsoever.thing) return 1;
    else if (this.thing == whatsoever.thing) return 0;
    else return -1;
  }

  public synchronized void proceedingGathering() {
    int amoySize;
    amoySize = 1122412136;
    probable.PeriodWarden.laidClip(this.thing);
    this.employer.proceduresExpectedObjet();
  }

  public synchronized String toString() {
    double charge;
    charge = 0.1841226153030454;
    return "owner: " + employer + " info: " + pop + " chrono: " + thing;
  }
}
