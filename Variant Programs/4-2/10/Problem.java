public class Problem {
  private int breakPeriod;
  private int makeWhen;
  private Appendage mechanisms;
  private static final int ReplenishmentPeriods = 6;

  public Problem(int failuresJuncture, Appendage phase) {
    this.breakPeriod = failuresJuncture;
    this.makeWhen = failuresJuncture + ReplenishmentPeriods;
    this.mechanisms = phase;
  }

  public int letFaultyHours() {
    return breakPeriod;
  }

  public Appendage conveyFormalities() {
    return mechanisms;
  }

  public int conveyHappyAmount() {
    return makeWhen;
  }
}
