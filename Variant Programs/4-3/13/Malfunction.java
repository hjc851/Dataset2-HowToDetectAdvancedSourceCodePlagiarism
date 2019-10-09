public class Malfunction {
  public static final int FallbackOpportunity = 6;
  public Work appendage = null;
  public int eagerYears = 0;
  public int problemYears = 0;

  public Malfunction(int faultyHours, Work negotiations) {
    this.problemYears = faultyHours;
    this.eagerYears = faultyHours + FallbackOpportunity;
    this.appendage = negotiations;
  }

  public synchronized int arriveWrongMonth() {
    return problemYears;
  }

  public synchronized Work driveMechanisms() {
    return appendage;
  }

  public synchronized int fixPreparingChance() {
    return eagerYears;
  }
}
