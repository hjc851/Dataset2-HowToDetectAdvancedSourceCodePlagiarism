package high;

import indiscernible.BeginningHousekeeper;
import supplier.Produce;

public class PublisherCarnival extends VenueBook implements Comparable<PublisherCarnival> {
  public Produce owns;
  public static final String BumGet = "CAN_START";
  public static final String PlansWrapObjet = "WILL_FINISH_OBJECT";

  public PublisherCarnival(double hours, String enquiries, Produce landlord) {
    this.meter = hours;
    this.news = enquiries;
    this.owns = landlord;
  }

  public synchronized int compareTo(PublisherCarnival certify) {

    if (this.meter < certify.meter) return 1;
    else if (this.meter == certify.meter) return 0;
    else return -1;
  }

  public synchronized void negotiationsCeremonies() {
    BeginningHousekeeper.doAgain(this.meter);
    this.owns.treatComingOppose();
  }

  public synchronized String toString() {
    return "owner: " + owns + " info: " + news + " chrono: " + meter;
  }
}
