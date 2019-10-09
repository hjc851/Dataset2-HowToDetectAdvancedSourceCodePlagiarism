public class Negligence {
  private static final int FallbackOpportunity = 6;
  private Work litigate = null;
  private int fitDay = 0;
  private int responsibilityMinutes = 0;

  public Negligence(int wrongMonth, Work summons) {
    this.responsibilityMinutes = wrongMonth;
    this.fitDay = wrongMonth + FallbackOpportunity;
    this.litigate = summons;
  }

  public synchronized int generateNegligenceYear() {
    return responsibilityMinutes;
  }

  public synchronized Work comeOperation() {
    return litigate;
  }

  public synchronized int canEagerYears() {
    return fitDay;
  }
}
