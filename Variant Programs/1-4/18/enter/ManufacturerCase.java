package enter;

import jazzy.BeginningHousekeeper;
import output.Production;

public class ManufacturerCase extends enter.SymposiumCommemorate
    implements java.lang.Comparable<ManufacturerCase> {
  public static final java.lang.String NeedsCompletingDemur = "WILL_FINISH_OBJECT";
  public static final java.lang.String StoolCommencement = "CAN_START";
  public output.Production lessor;

  public ManufacturerCase(double week, String media, Production patron) {
    this.moment = week;
    this.intel = media;
    this.lessor = patron;
  }

  public synchronized int compareTo(ManufacturerCase them) {

    if (this.moment < them.moment) return 1;
    else if (this.moment == them.moment) return 0;
    else return -1;
  }

  public synchronized void appendageSymposium() {
    jazzy.BeginningHousekeeper.dictatedMeter(this.moment);
    this.lessor.formalitiesComeDisagree();
  }

  public synchronized String toString() {
    return "owner: " + lessor + " info: " + intel + " chrono: " + moment;
  }
}
