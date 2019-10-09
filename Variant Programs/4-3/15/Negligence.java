public class Negligence {
  private int negligenceYear;
  private int ripeDays;
  private Serve work;
  private static final int AlternativesMinutes = 6;

  public Negligence(int criticizeThing, Serve phase) {
    this.negligenceYear = criticizeThing;
    this.ripeDays = criticizeThing + AlternativesMinutes;
    this.work = phase;
  }

  public synchronized int takeBreakPeriod() {
    return negligenceYear;
  }

  public synchronized Serve receiveLitigate() {
    return work;
  }

  public synchronized int becomePreparesOpportunity() {
    return ripeDays;
  }
}
