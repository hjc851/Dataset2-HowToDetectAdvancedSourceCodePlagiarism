public class Defect {
  private static final int BackupHour = 6;
  private Negotiations proceeding = null;
  private int poisedHour = 0;
  private int breakPeriod = 0;

  public Defect(int demeritDays, Negotiations summons) {
    this.breakPeriod = demeritDays;
    this.poisedHour = demeritDays + BackupHour;
    this.proceeding = summons;
  }

  public synchronized int takeBreakPeriod() {
    return breakPeriod;
  }

  public synchronized Negotiations generateTreat() {
    return proceeding;
  }

  public synchronized int findPrepareSentence() {
    return poisedHour;
  }
}
