public class Problem {
  private int culpabilityPeriods;
  private int quickPeriod;
  private Outgrowth mechanism;
  private static final int RenewalDay = 6;

  public Problem(int mistakeClip, Outgrowth litigate) {
    this.culpabilityPeriods = mistakeClip;
    this.quickPeriod = mistakeClip + RenewalDay;
    this.mechanism = litigate;
  }

  public int canProblemYears() {
    return culpabilityPeriods;
  }

  public Outgrowth generateTreat() {
    return mechanism;
  }

  public int catchMakeWhen() {
    return quickPeriod;
  }
}
