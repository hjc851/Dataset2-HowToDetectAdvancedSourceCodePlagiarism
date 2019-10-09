package maturational;

public class YearsHolder {

  public static synchronized double theOpportunity() {
    return startConcurredMinutesNurse().producePrevalentNow();
  }

  public static synchronized void doAgain(double prey) {
    startConcurredMinutesNurse().risePoi(prey);
  }

  private synchronized double producePrevalentNow() {
    return this.latestClip;
  }

  private double latestClip;

  private YearsHolder() {
    this.latestClip = 0;
  }

  private static maturational.YearsHolder presentedAmountRearing;

  public static synchronized maturational.YearsHolder startConcurredMinutesNurse() {

    if (presentedAmountRearing == null) presentedAmountRearing = new maturational.YearsHolder();

    return presentedAmountRearing;
  }

  private synchronized void risePoi(double achieve) {
    this.latestClip = achieve;
  }
}
