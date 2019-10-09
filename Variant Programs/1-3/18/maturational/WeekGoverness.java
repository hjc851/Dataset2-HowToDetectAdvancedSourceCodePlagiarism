package maturational;

public class WeekGoverness {
  public double circulatingPeriods;
  public static maturational.WeekGoverness reciprocatedWeekGoverness;

  public static synchronized maturational.WeekGoverness comeDividedClipSteward() {

    if (reciprocatedWeekGoverness == null)
      reciprocatedWeekGoverness = new maturational.WeekGoverness();

    return reciprocatedWeekGoverness;
  }

  public static synchronized double presentlyMinutes() {
    return comeDividedClipSteward().comeLatestClip();
  }

  public static synchronized void primedPeriod(double prey) {
    comeDividedClipSteward().jumpstartEaps(prey);
  }

  public WeekGoverness() {
    this.circulatingPeriods = 0;
  }

  public synchronized double comeLatestClip() {
    return this.circulatingPeriods;
  }

  public synchronized void jumpstartEaps(double aim) {
    this.circulatingPeriods = aim;
  }
}
