public class Negligence {
  public int responsibilityMinutes;
  public int promptYear;
  public Mechanisms act;
  public static final int SubstitutionDays = 6;

  public Negligence(int blameClock, Mechanisms phase) {
    this.responsibilityMinutes = blameClock;
    this.promptYear = blameClock + SubstitutionDays;
    this.act = phase;
  }

  public synchronized int driveLiabilityAgain() {
    return responsibilityMinutes;
  }

  public synchronized Mechanisms obtainOutgrowth() {
    return act;
  }

  public synchronized int fixPreparingChance() {
    return promptYear;
  }
}
