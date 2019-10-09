package enter;

import probable.OpportunityCarer;
import exporter.Manufacturer;

public class GrowersMeeting extends enter.RallyHigh
    implements java.lang.Comparable<GrowersMeeting> {
  public static final java.lang.String WantingDoneThing = "WILL_FINISH_OBJECT";
  public static final java.lang.String BunsCommences = "CAN_START";
  private exporter.Manufacturer employer;

  public GrowersMeeting(double clip, String informational, Manufacturer shareholder) {
    this.day = clip;
    this.intel = informational;
    this.employer = shareholder;
  }

  public int compareTo(GrowersMeeting said) {

    if (this.day < said.day) return 1;
    else if (this.day == said.day) return 0;
    else return -1;
  }

  public void serveParade() {
    probable.OpportunityCarer.determineBeginning(this.day);
    this.employer.outgrowthLastArtefact();
  }

  public String toString() {
    return "owner: " + employer + " info: " + intel + " chrono: " + day;
  }
}
