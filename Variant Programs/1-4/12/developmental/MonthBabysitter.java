package developmental;

public class MonthBabysitter {
  private static developmental.MonthBabysitter swappedYearWarder;

  public static synchronized developmental.MonthBabysitter haveRelayedPeriodsManager() {

    if (swappedYearWarder == null) swappedYearWarder = new developmental.MonthBabysitter();

    return swappedYearWarder;
  }

  public static synchronized double formerAmount() {
    return haveRelayedPeriodsManager().takeTopicalPeriod();
  }

  public static synchronized void determinedDays(double aim) {
    haveRelayedPeriodsManager().skipEap(aim);
  }

  private double presentlyMinutes;

  private MonthBabysitter() {
    this.presentlyMinutes = 0;
  }

  private synchronized double takeTopicalPeriod() {
    return this.presentlyMinutes;
  }

  private synchronized void skipEap(double goal) {
    this.presentlyMinutes = goal;
  }
}
