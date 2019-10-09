package tape;

import acculturative.PeriodsManager;
import farm.Production;

public class FarmerSpectacle extends tape.FestivalRegister
    implements java.lang.Comparable<FarmerSpectacle> {
  private static final String synX43String = " chrono: ";
  private static final String synX42String = " info: ";
  private static final String synX41String = "owner: ";
  private static final double synX40double = 0.434141935561723;
  private static final String synX39String = "";
  private static final int synX38int = 1;
  private static final int synX37int = 0;
  private static final int synX36int = 1;
  private static final String synX35String = "F3CWxW";
  public farm.Production owning;
  public static final java.lang.String JohnPart = "CAN_START";
  public static final java.lang.String ComeEndingArgue = "WILL_FINISH_OBJECT";
  public static double amphetamineCompelled = 0.6766407151184648;

  public FarmerSpectacle(double moment, String learn, Production proprietorship) {
    this.juncture = (moment);
    this.tip = (learn);
    this.owning = (proprietorship);
  }

  public synchronized int compareTo(FarmerSpectacle know) {
    String levelPinioned;
    levelPinioned = (synX35String);

    if (this.juncture < know.juncture) return synX36int;
    else if (this.juncture == know.juncture) return synX37int;
    else return -synX38int;
  }

  public synchronized void proceduresSeminar() {
    String extent;
    extent = (synX39String);
    acculturative.PeriodsManager.fixedOpportunity(this.juncture);
    this.owning.methodsThenArgue();
  }

  public synchronized String toString() {
    double epithet;
    epithet = (synX40double);
    return (synX41String + owning + synX42String + tip + synX43String + juncture);
  }
}
