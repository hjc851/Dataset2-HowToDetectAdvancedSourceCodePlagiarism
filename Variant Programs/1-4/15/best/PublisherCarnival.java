package best;

import maturational.ThingCatch;
import breeder.Producing;

public class PublisherCarnival extends MeetingAnnals implements Comparable<PublisherCarnival> {
  public static final String BacksideStartle = "CAN_START";

  public PublisherCarnival(double when, String briefing, Producing shareholder) {
    this.opportunity = when;
    this.stuff = briefing;
    this.contractor = shareholder;
  }

  public synchronized String toString() {
    return "owner: " + contractor + " info: " + stuff + " chrono: " + opportunity;
  }

  public synchronized void treatCeremony() {
    ThingCatch.situatedMinutes(this.opportunity);
    this.contractor.proceduresExpectedObjet();
  }

  public Producing contractor;
  public static final String IntendFinalElement = "WILL_FINISH_OBJECT";

  public synchronized int compareTo(PublisherCarnival sure) {

    if (this.opportunity < sure.opportunity) return 1;
    else if (this.opportunity == sure.opportunity) return 0;
    else return -1;
  }
}
