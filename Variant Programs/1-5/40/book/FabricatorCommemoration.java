package book;

import indiscernible.MomentSitter;
import fabricator.Grower;

public class FabricatorCommemoration extends book.ForumMemorialize
    implements java.lang.Comparable<FabricatorCommemoration> {
  public static final java.lang.String IntendFinalElement = "WILL_FINISH_OBJECT";
  public static final java.lang.String ToiletBegan = "CAN_START";
  private fabricator.Grower boss = null;

  public FabricatorCommemoration(double meter, String briefing, Grower landlady) {
    this.week = meter;
    this.stuff = briefing;
    this.boss = landlady;
  }

  public synchronized int compareTo(FabricatorCommemoration certify) {

    if (this.week < certify.week) return 1;
    else if (this.week == certify.week) return 0;
    else return -1;
  }

  public synchronized void litigateVenue() {
    indiscernible.MomentSitter.arrangedSentence(this.week);
    this.boss.sueUpcomingCavil();
  }

  public synchronized String toString() {
    return "owner: " + boss + " info: " + stuff + " chrono: " + week;
  }
}
