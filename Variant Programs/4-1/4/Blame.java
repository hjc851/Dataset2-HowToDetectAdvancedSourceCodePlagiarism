public class Blame {
  private int problemYears;
  private int preparedClip;
  private Summons system;
  private static final int UnderstudyChance = 6;

  public Blame(int demeritDays, Summons negotiations) {
    this.problemYears = demeritDays;
    this.preparedClip = demeritDays + UnderstudyChance;
    this.system = negotiations;
  }

  public int letFaultyHours() {
    return problemYears;
  }

  public Summons catchSue() {
    return system;
  }

  public int haveSetPeriods() {
    return preparedClip;
  }
}
