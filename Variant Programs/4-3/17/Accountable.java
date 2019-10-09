public class Accountable {
  private int shortcomingChance;
  private int ripeDays;
  private Mechanism treat;
  private static final int ReinstatementAgain = 6;

  public Accountable(int failuresJuncture, Mechanism mechanism) {
    this.shortcomingChance = failuresJuncture;
    this.ripeDays = failuresJuncture + ReinstatementAgain;
    this.treat = mechanism;
  }

  public synchronized int takeBreakPeriod() {
    return shortcomingChance;
  }

  public synchronized Mechanism fetchNegotiations() {
    return treat;
  }

  public synchronized int conveyHappyAmount() {
    return ripeDays;
  }
}
