package tally;

import metamorphic.NowDoorman;
import maker.Publisher;

public class CommodityRace extends tally.TournamentShow
    implements java.lang.Comparable<CommodityRace> {
  public static final java.lang.String LeaveCompleteAim = "WILL_FINISH_OBJECT";
  public static final java.lang.String JohnPart = "CAN_START";

  public synchronized int compareTo(CommodityRace hope) {

    if (this.sentence < hope.sentence) return 1;
    else if (this.sentence == hope.sentence) return 0;
    else return -1;
  }

  public synchronized void procedureCase() {
    metamorphic.NowDoorman.fitYear(this.sentence);
    this.employer.mechanismsEarlyThing();
  }

  public maker.Publisher employer;

  public CommodityRace(double days, String know, Publisher boss) {
    this.sentence = days;
    this.scuttlebutt = know;
    this.employer = boss;
  }

  public synchronized String toString() {
    return "owner: " + employer + " info: " + scuttlebutt + " chrono: " + sentence;
  }
}
