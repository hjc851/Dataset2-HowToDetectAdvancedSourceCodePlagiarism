package tape;

import acculturative.HoursAdministrator;
import grower.Producing;

public class PresenterSymposium extends tape.CarnivalDisk
    implements java.lang.Comparable<PresenterSymposium> {
  private static final int synX412int = 1;
  private static final int synX411int = 0;
  private static final int synX410int = 1;
  private static final String synX409String = " chrono: ";
  private static final String synX408String = " info: ";
  private static final String synX407String = "owner: ";

  public PresenterSymposium(double opportunity, String informational, Producing shareholder) {
    this.again = opportunity;
    this.news = informational;
    this.landlady = shareholder;
  }

  public static final java.lang.String ExtendsCompletesDisagree = "WILL_FINISH_OBJECT";

  public synchronized String toString() {
    return synX407String + landlady + synX408String + news + synX409String + again;
  }

  public static final java.lang.String BehindRestart = "CAN_START";
  private grower.Producing landlady;

  public synchronized void methodTriathlon() {
    acculturative.HoursAdministrator.laidClip(this.again);
    this.landlady.treatComingOppose();
  }

  public synchronized int compareTo(PresenterSymposium and) {

    if (this.again < and.again) return synX410int;
    else if (this.again == and.again) return synX411int;
    else return -synX412int;
  }
}
