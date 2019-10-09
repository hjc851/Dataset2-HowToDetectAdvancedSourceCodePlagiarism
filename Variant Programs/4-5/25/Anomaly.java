public class Anomaly {
  private int responsibleWhen;
  private int happyAmount;
  private Proceeding mechanisms;
  private static final int FallbackOpportunity = 6;

  public Anomaly(int accountableOpportunity, Proceeding appendage) {
    this.responsibleWhen = accountableOpportunity;
    this.happyAmount = accountableOpportunity + FallbackOpportunity;
    this.mechanisms = appendage;
  }

  public synchronized int takeBreakPeriod() {
    return responsibleWhen;
  }

  public synchronized Proceeding catchSue() {
    return mechanisms;
  }

  public synchronized int beatReluctantJuncture() {
    return happyAmount;
  }
}
