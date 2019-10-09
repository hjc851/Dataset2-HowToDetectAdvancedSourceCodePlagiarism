public class Break {
  private int breakPeriod = 0;
  private int setPeriods = 0;

  public Break(int faultyHours, Methodology litigate) {
    this.breakPeriod = faultyHours;
    this.setPeriods = faultyHours + ReplacingClock;
    this.march = litigate;
  }

  public synchronized int startResponsibilityMinutes() {
    return breakPeriod;
  }

  public synchronized Methodology developProceeding() {
    return march;
  }

  private Methodology march = null;

  public synchronized int conveyHappyAmount() {
    return setPeriods;
  }

  private static final int ReplacingClock = 6;
}
