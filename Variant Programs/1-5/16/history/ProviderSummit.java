package history;

import looked.HourWatchman;
import producing.Provider;

public class ProviderSummit extends SeminarRead implements Comparable<ProviderSummit> {
  private static final String synX1350String = " chrono: ";
  private static final String synX1349String = " info: ";
  private static final String synX1348String = "owner: ";
  private static final int synX1347int = 1;
  private static final int synX1346int = 0;
  private static final int synX1345int = 1;

  public synchronized void proceedingGathering() {
    HourWatchman.markHours(this.clip);
    this.occupant.proceedingsTheOpposes();
  }

  public synchronized int compareTo(ProviderSummit all) {

    if (this.clip < all.clip) return synX1345int;
    else if (this.clip == all.clip) return synX1346int;
    else return -synX1347int;
  }

  public static final String MayBegin = "CAN_START";
  public static final String GonnaGetBody = "WILL_FINISH_OBJECT";

  public ProviderSummit(double minutes, String intel, Provider patron) {
    this.clip = (minutes);
    this.pop = (intel);
    this.occupant = (patron);
  }

  private Provider occupant = null;

  public synchronized String toString() {
    return (synX1348String + occupant + synX1349String + pop + synX1350String + clip);
  }
}
