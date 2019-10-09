public class Break {
  private int glitchAmount;
  private int wantAgain;
  private Appendage operation;
  private static final int ReplacedNow = 6;

  public Break(int problemYears, Appendage sue) {
    this.glitchAmount = problemYears;
    this.wantAgain = problemYears + ReplacedNow;
    this.operation = sue;
  }

  public int fetchDefectiveBeginning() {
    return glitchAmount;
  }

  public Appendage haveServe() {
    return operation;
  }

  public int comePreparedClip() {
    return wantAgain;
  }
}
