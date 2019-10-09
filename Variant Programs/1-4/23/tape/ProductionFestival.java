package tape;

import said.BeginningHousekeeper;
import grower.Output;

public class ProductionFestival extends tape.TournamentShow
    implements java.lang.Comparable<ProductionFestival> {
  private grower.Output tenant = null;
  public static final java.lang.String FannyBegun = "CAN_START";
  public static final java.lang.String NowPoleMatter = "WILL_FINISH_OBJECT";

  public ProductionFestival(double minutes, String informing, Output property) {
    this.juncture = minutes;
    this.tip = informing;
    this.tenant = property;
  }

  public synchronized int compareTo(ProductionFestival him) {

    if (this.juncture < him.juncture) return 1;
    else if (this.juncture == him.juncture) return 0;
    else return -1;
  }

  public synchronized void phaseCommemoration() {
    said.BeginningHousekeeper.solidifyingJuncture(this.juncture);
    this.tenant.appendageLaterResist();
  }

  public synchronized String toString() {
    return "owner: " + tenant + " info: " + tip + " chrono: " + juncture;
  }
}
