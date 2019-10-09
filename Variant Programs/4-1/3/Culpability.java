public class Culpability {
  private int defectMoment;
  private int quickPeriod;
  private Negotiations outgrowth;
  private static final int ReplaceMonth = 6;

  public Culpability(int mistakeClip, Negotiations act) {
    this.defectMoment = mistakeClip;
    this.quickPeriod = mistakeClip + ReplaceMonth;
    this.outgrowth = act;
  }

  public int receiveDefectMoment() {
    return defectMoment;
  }

  public Negotiations obtainOutgrowth() {
    return outgrowth;
  }

  public int receiveWaitingMoment() {
    return quickPeriod;
  }
}
