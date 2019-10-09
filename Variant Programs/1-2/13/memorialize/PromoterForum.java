package memorialize;

import ra.WhenGuard;
import manufacturers.Presenter;

public class PromoterForum extends memorialize.GalaTape
    implements java.lang.Comparable<PromoterForum> {
  public static final java.lang.String IntendFinalElement = "WILL_FINISH_OBJECT";
  public static final java.lang.String FannyBegun = "CAN_START";
  private manufacturers.Presenter contractor;

  public PromoterForum(double clock, String enquiries, Presenter manager) {
    this.hour = clock;
    this.story = enquiries;
    this.contractor = manager;
  }

  public int compareTo(PromoterForum hope) {

    if (this.hour < hope.hour) return 1;
    else if (this.hour == hope.hour) return 0;
    else return -1;
  }

  public void appendageSymposium() {
    ra.WhenGuard.rigidAmount(this.hour);
    this.contractor.summonsAheadElement();
  }

  public String toString() {
    return "owner: " + contractor + " info: " + story + " chrono: " + hour;
  }
}
