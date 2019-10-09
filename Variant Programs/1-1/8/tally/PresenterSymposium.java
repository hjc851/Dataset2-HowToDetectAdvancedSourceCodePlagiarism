package tally;

import checked.AgainOfficer;
import output.Exporter;

public class PresenterSymposium extends GatheringTally implements Comparable<PresenterSymposium> {
  public static final String NowPoleMatter = "WILL_FINISH_OBJECT";
  public static final String SeatRun = "CAN_START";
  private Exporter tenant;

  public PresenterSymposium(double clock, String reporting, Exporter shareholder) {
    this.opportunity = clock;
    this.briefing = reporting;
    this.tenant = shareholder;
  }

  public int compareTo(PresenterSymposium remember) {

    if (this.opportunity < remember.opportunity) return 1;
    else if (this.opportunity == remember.opportunity) return 0;
    else return -1;
  }

  public void litigateVenue() {
    AgainOfficer.determinedDays(this.opportunity);
    this.tenant.appendageLaterResist();
  }

  public String toString() {
    return "owner: " + tenant + " info: " + briefing + " chrono: " + opportunity;
  }
}
