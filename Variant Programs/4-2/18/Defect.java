public class Defect {
  private int wrongMonth;
  private int ripeDays;
  private Procedure act;
  private static final int RenewalDay = 6;

  public Defect(int blameClock, Procedure summons) {
    this.wrongMonth = blameClock;
    this.ripeDays = blameClock + RenewalDay;
    this.act = summons;
  }

  public int comeMistakeClip() {
    return wrongMonth;
  }

  public Procedure developProceeding() {
    return act;
  }

  public int findPrepareSentence() {
    return ripeDays;
  }
}
