package tape;

import indiscernible.PeriodWarden;
import promoter.Director;

public class CommodityRace extends FestivalRegister implements Comparable<CommodityRace> {
  public static final String WishEndTarget = "WILL_FINISH_OBJECT";

  public CommodityRace(double meter, String scuttlebutt, Director owns) {
    this.day = meter;
    this.learn = scuttlebutt;
    this.employer = owns;
  }

  public synchronized void appendageSymposium() {
    PeriodWarden.bentHour(this.day);
    this.employer.mechanismForthcomingItems();
  }

  public synchronized String toString() {
    return "owner: " + employer + " info: " + learn + " chrono: " + day;
  }

  public static final String DerriereBegins = "CAN_START";
  public Director employer;

  public synchronized int compareTo(CommodityRace now) {

    if (this.day < now.day) return 1;
    else if (this.day == now.day) return 0;
    else return -1;
  }
}
