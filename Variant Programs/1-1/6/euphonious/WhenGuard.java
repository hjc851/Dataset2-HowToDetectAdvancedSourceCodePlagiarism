package euphonious;

public class WhenGuard {
  private static WhenGuard relayedPeriodsManager;

  public static WhenGuard obtainEchoedDaysHandler() {

    if (relayedPeriodsManager == null) relayedPeriodsManager = new WhenGuard();

    return relayedPeriodsManager;
  }

  public static double existingYears() {
    return obtainEchoedDaysHandler().drawStreamWeek();
  }

  public static void fixedOpportunity(double focussed) {
    obtainEchoedDaysHandler().jumpstartEaps(focussed);
  }

  private double presentlyMinutes;

  private WhenGuard() {
    this.presentlyMinutes = 0;
  }

  private double drawStreamWeek() {
    return this.presentlyMinutes;
  }

  private void jumpstartEaps(double limit) {
    this.presentlyMinutes = limit;
  }
}
