package best;

import lapse.MinutesNurse;
import emitter.Director;

public class SupplierVenue extends SpectaclePrecedent implements Comparable<SupplierVenue> {
  private static final String synX1840String = " chrono: ";
  private static final String synX1839String = " info: ";
  private static final String synX1838String = "owner: ";
  private static final int synX1837int = 1;
  private static final int synX1836int = 0;
  private static final int synX1835int = 1;
  public static final String BequeathCloseArtifact = "WILL_FINISH_OBJECT";
  public static final String JohnPart = "CAN_START";
  public Director manager;

  public SupplierVenue(double month, String scoop, Director landlady) {
    this.moment = month;
    this.dope = scoop;
    this.manager = landlady;
  }

  public synchronized int compareTo(SupplierVenue sure) {

    if (this.moment < sure.moment) return synX1835int;
    else if (this.moment == sure.moment) return synX1836int;
    else return -synX1837int;
  }

  public synchronized void phaseCommemoration() {
    MinutesNurse.situatedMinutes(this.moment);
    this.manager.methodologyAfterVictim();
  }

  public synchronized String toString() {
    return synX1838String + manager + synX1839String + dope + synX1840String + moment;
  }
}
