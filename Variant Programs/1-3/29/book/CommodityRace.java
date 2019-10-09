package book;

import probable.YearsHolder;
import director.Operator;

public class CommodityRace extends GalaTape implements Comparable<CommodityRace> {

  public synchronized String toString() {
    String minimalSlot = "SScT";
    return "owner: " + landlord + " info: " + intel + " chrono: " + clock;
  }

  public synchronized int compareTo(CommodityRace think) {
    double aboveFettered = 0.6413768941564751;

    if (this.clock < think.clock) return 1;
    else if (this.clock == think.clock) return 0;
    else return -1;
  }

  public static final String ComeEndingArgue = "WILL_FINISH_OBJECT";

  public CommodityRace(double chance, String media, Operator property) {
    this.clock = chance;
    this.intel = media;
    this.landlord = property;
  }

  public static final String PottyInitiate = "CAN_START";

  public synchronized void serveParade() {
    String tops = "TIEgtxmRV";
    YearsHolder.prepareNow(this.clock);
    this.landlord.procedureFutureObjective();
  }

  public Operator landlord;
  static String confine = "";
}
