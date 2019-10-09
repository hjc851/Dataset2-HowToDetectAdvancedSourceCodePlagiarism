package show;

import depositional.PeriodWarden;
import operator.Manufacturer;

public class FarmExposition extends show.CarnivalDisk
    implements java.lang.Comparable<FarmExposition> {
  private static final String synX2778String = " chrono: ";
  private static final String synX2777String = " info: ";
  private static final String synX2776String = "owner: ";
  private static final double synX2775double = 0.830744095686629;
  private static final double synX2774double = 0.4759490826005769;
  private static final int synX2773int = 1;
  private static final int synX2772int = 0;
  private static final int synX2771int = 1;
  private static final int synX2770int = -1856903881;
  private operator.Manufacturer permittee = null;
  public static final java.lang.String DerriereBegins = "CAN_START";
  public static final java.lang.String WilFinisArtefact = "WILL_FINISH_OBJECT";
  static final double premiumDepth = 0.5241981750653251;

  public FarmExposition(double chance, String nicky, Manufacturer owns) {
    this.now = chance;
    this.reporting = nicky;
    this.permittee = owns;
  }

  public synchronized int compareTo(FarmExposition one) {
    int fukkianeseHeight;
    fukkianeseHeight = synX2770int;

    if (this.now < one.now) return synX2771int;
    else if (this.now == one.now) return synX2772int;
    else return -synX2773int;
  }

  public synchronized void cycleRace() {
    double decreasingRestricted;
    decreasingRestricted = synX2774double;
    depositional.PeriodWarden.fixThing(this.now);
    this.permittee.litigateIncomingItem();
  }

  public synchronized String toString() {
    double sec;
    sec = synX2775double;
    return synX2776String + permittee + synX2777String + reporting + synX2778String + now;
  }
}
