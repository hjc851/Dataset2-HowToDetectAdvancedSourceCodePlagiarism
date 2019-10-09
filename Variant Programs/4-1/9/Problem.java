public class Problem {
  private int mistakeClip;
  private int quickPeriod;
  private Serve proceeding;
  private static final int SubstituteMeter = 6;

  public Problem(int culpabilityPeriods, Serve sue) {
    this.mistakeClip = culpabilityPeriods;
    this.quickPeriod = culpabilityPeriods + SubstituteMeter;
    this.proceeding = sue;
  }

  public int receiveDefectMoment() {
    return mistakeClip;
  }

  public Serve catchSue() {
    return proceeding;
  }

  public int fetchPreppedBeginning() {
    return quickPeriod;
  }
}
