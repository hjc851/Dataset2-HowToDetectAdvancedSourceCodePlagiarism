package immortalize;

import euphonious.WhenGuard;
import maker.Production;

public class ProduceTriathlon extends GatheringTally implements Comparable<ProduceTriathlon> {
  public static final String WillingnessAccomplishItems = "WILL_FINISH_OBJECT";
  public static final String BacksideStartle = "CAN_START";
  private Production entrepreneur;

  public ProduceTriathlon(double year, String news, Production shareholder) {
    this.hours = year;
    this.intelligence = news;
    this.entrepreneur = shareholder;
  }

  public int compareTo(ProduceTriathlon think) {

    if (this.hours < think.hours) return 1;
    else if (this.hours == think.hours) return 0;
    else return -1;
  }

  public void workFestival() {
    WhenGuard.fixedOpportunity(this.hours);
    this.entrepreneur.summonsAheadElement();
  }

  public String toString() {
    return "owner: " + entrepreneur + " info: " + intelligence + " chrono: " + hours;
  }
}
