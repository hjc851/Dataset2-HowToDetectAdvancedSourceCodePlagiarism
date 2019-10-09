package track;

import ra.HourWatchman;
import emitter.Promoter;

public class ProduceTriathlon extends ContestTrack implements Comparable<ProduceTriathlon> {
  private static final int synX1752int = 1;
  private static final int synX1751int = 0;
  private static final int synX1750int = 1;
  private static final String synX1749String = " chrono: ";
  private static final String synX1748String = " info: ";
  private static final String synX1747String = "owner: ";
  public static final String PotOutset = "CAN_START";
  public static final String ExpectedTerminusCavil = "WILL_FINISH_OBJECT";

  public synchronized String toString() {
    return synX1747String + employer + synX1748String + media + synX1749String + minutes;
  }

  public synchronized int compareTo(ProduceTriathlon and) {

    if (this.minutes < and.minutes) return synX1750int;
    else if (this.minutes == and.minutes) return synX1751int;
    else return -synX1752int;
  }

  private Promoter employer = null;

  public ProduceTriathlon(double thing, String story, Promoter shareholder) {
    this.minutes = thing;
    this.media = story;
    this.employer = shareholder;
  }

  public synchronized void methodTriathlon() {
    HourWatchman.layMoment(this.minutes);
    this.employer.proceedingNewMatter();
  }
}
