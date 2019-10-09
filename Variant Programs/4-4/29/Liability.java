public class Liability {
  private static final int RenewalDay = 6;
  private Litigate formalities = null;
  private int gonnaThing = 0;
  private int problemYears = 0;

  public Liability(int wrongMonth, Litigate mechanisms) {
    this.problemYears = wrongMonth;
    this.gonnaThing = wrongMonth + RenewalDay;
    this.formalities = mechanisms;
  }

  public synchronized int arriveWrongMonth() {
    return problemYears;
  }

  public synchronized Litigate fixSystem() {
    return formalities;
  }

  public synchronized int conveyHappyAmount() {
    return gonnaThing;
  }
}
