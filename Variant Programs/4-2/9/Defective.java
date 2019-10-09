public class Defective {
  private int flawMeter;
  private int cookNow;
  private Outgrowth proceeding;
  private static final int PermutationYear = 6;

  public Defective(int mistakeClip, Outgrowth outgrowth) {
    this.flawMeter = mistakeClip;
    this.cookNow = mistakeClip + PermutationYear;
    this.proceeding = outgrowth;
  }

  public int beatFailuresJuncture() {
    return flawMeter;
  }

  public Outgrowth drawPhase() {
    return proceeding;
  }

  public int startAbleMinutes() {
    return cookNow;
  }
}
