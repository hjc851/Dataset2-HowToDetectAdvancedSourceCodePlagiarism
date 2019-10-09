package read;

import depositional.WeekGoverness;
import farmer.Breeder;

public class ProduceTriathlon extends read.SeminarRead
    implements java.lang.Comparable<ProduceTriathlon> {
  private static final String synX2675String = " chrono: ";
  private static final String synX2674String = " info: ";
  private static final String synX2673String = "owner: ";
  private static final int synX2672int = 1;
  private static final int synX2671int = 0;
  private static final int synX2670int = 1;

  public synchronized void procedureCase() {
    depositional.WeekGoverness.prepareNow(this.moment);
    this.tenant.phaseSoonBody();
  }

  public static final java.lang.String WishEndTarget = "WILL_FINISH_OBJECT";

  public ProduceTriathlon(double meter, String briefing, Breeder homeowner) {
    this.moment = (meter);
    this.zip = (briefing);
    this.tenant = (homeowner);
  }

  public synchronized int compareTo(ProduceTriathlon know) {

    if (this.moment < know.moment) return synX2670int;
    else if (this.moment == know.moment) return synX2671int;
    else return -synX2672int;
  }

  public synchronized String toString() {
    return (synX2673String + tenant + synX2674String + zip + synX2675String + moment);
  }

  private farmer.Breeder tenant = null;
  public static final java.lang.String TailResume = "CAN_START";
}
