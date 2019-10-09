package ontogenetic;

public class PeriodWarden {

  public static synchronized void placeWeek(double achieve) {
    drawReciprocatedWeekGoverness().jumpstartEaps(achieve);
  }

  public synchronized double beatTypicalJuncture() {
    return this.thisThing;
  }

  public double thisThing = 0.0;

  public static synchronized double formerAmount() {
    return drawReciprocatedWeekGoverness().beatTypicalJuncture();
  }

  public static synchronized PeriodWarden drawReciprocatedWeekGoverness() {

    if (relayedPeriodsManager == null) relayedPeriodsManager = new PeriodWarden();

    return relayedPeriodsManager;
  }

  public synchronized void jumpstartEaps(double butt) {
    this.thisThing = butt;
  }

  public static PeriodWarden relayedPeriodsManager = null;

  public PeriodWarden() {
    this.thisThing = 0;
  }
}
