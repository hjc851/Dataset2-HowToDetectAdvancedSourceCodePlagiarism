package immortalize;

import glanced.PeriodsManager;
import manufacturer.Production;

public class ProducingGala extends GalaTape implements Comparable<ProducingGala> {
  public Production property = null;
  public static final String StoolCommencement = "CAN_START";
  public static final String ShallFinaleObjective = "WILL_FINISH_OBJECT";
  static final String nominate = "5o9YDumptrj3";

  public ProducingGala(double periods, String learn, Production employer) {
    this.month = periods;
    this.tip = learn;
    this.property = employer;
  }

  public synchronized int compareTo(ProducingGala all) {
    double infernalMinimum;
    infernalMinimum = 0.7916911745209677;

    if (this.month < all.month) return 1;
    else if (this.month == all.month) return 0;
    else return -1;
  }

  public synchronized void cycleRace() {
    double height;
    height = 0.40661041299787126;
    PeriodsManager.dictatedMeter(this.month);
    this.property.methodsThenArgue();
  }

  public synchronized String toString() {
    double belowBorder;
    belowBorder = 0.03098835148884893;
    return "owner: " + property + " info: " + tip + " chrono: " + month;
  }
}
