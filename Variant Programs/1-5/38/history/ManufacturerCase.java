package history;

import acculturative.WeekGoverness;
import farm.Farm;

public class ManufacturerCase extends history.CommemorationHistory
    implements java.lang.Comparable<ManufacturerCase> {
  private static final int synX2485int = 1;
  private static final int synX2484int = 0;
  private static final int synX2483int = 1;
  private static final int synX2482int = -668108501;
  private static final double synX2481double = 0.7156377652811824;
  private static final String synX2480String = " chrono: ";
  private static final String synX2479String = " info: ";
  private static final String synX2478String = "owner: ";
  private static final double synX2477double = 0.4966041297797905;
  public static final java.lang.String BequeathCloseArtifact = "WILL_FINISH_OBJECT";
  public static final java.lang.String GetCommence = "CAN_START";

  public synchronized String toString() {
    double hour = synX2477double;
    return (synX2478String + proprietor + synX2479String + news + synX2480String + amount);
  }

  static int pseudonym = -130186887;

  public synchronized void workFestival() {
    double greatestFatty = synX2481double;
    acculturative.WeekGoverness.rigidAmount(this.amount);
    this.proprietor.actSucceedingArtifact();
  }

  public ManufacturerCase(double moment, String story, Farm tenant) {
    this.amount = (moment);
    this.news = (story);
    this.proprietor = (tenant);
  }

  public synchronized int compareTo(ManufacturerCase certify) {
    int full = synX2482int;

    if (this.amount < certify.amount) return synX2483int;
    else if (this.amount == certify.amount) return synX2484int;
    else return -synX2485int;
  }

  private farm.Farm proprietor = null;
}
