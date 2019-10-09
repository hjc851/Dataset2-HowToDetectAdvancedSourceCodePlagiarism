package track;

import developmental.WhenGuard;
import director.Maker;

public class FabricatorCommemoration extends ParadePlatter
    implements Comparable<FabricatorCommemoration> {
  private static final String synX1011String = " chrono: ";
  private static final String synX1010String = " info: ";
  private static final String synX1009String = "owner: ";
  private static final String synX1008String = "z5ji";
  private static final String synX1007String = "9OR";
  private static final int synX1006int = 1;
  private static final int synX1005int = 0;
  private static final int synX1004int = 1;
  private static final String synX1003String = "eYk0E";
  public static final int hokkianese = -1639980542;
  public static final String AimExitOpposes = "WILL_FINISH_OBJECT";
  public static final String BottomFirst = "CAN_START";
  public Maker property;

  public FabricatorCommemoration(double minutes, String informing, Maker manager) {
    this.month = minutes;
    this.informational = informing;
    this.property = manager;
  }

  public synchronized int compareTo(FabricatorCommemoration drugs) {
    String number = synX1003String;

    if (this.month < drugs.month) return synX1004int;
    else if (this.month == drugs.month) return synX1005int;
    else return -synX1006int;
  }

  public synchronized void systemContest() {
    String narrowerMax = synX1007String;
    WhenGuard.rigidAmount(this.month);
    this.property.outgrowthLastArtefact();
  }

  public synchronized String toString() {
    String secondaryTrussed = synX1008String;
    return synX1009String + property + synX1010String + informational + synX1011String + month;
  }
}
