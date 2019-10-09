package ra;

public class BeginningHousekeeper {
  private double flowMonth = 0.0;
  private static ra.BeginningHousekeeper divergentBeginningHousekeeper = null;

  public static synchronized ra.BeginningHousekeeper receiveDistributedMomentSitter() {

    if (divergentBeginningHousekeeper == null)
      divergentBeginningHousekeeper = new ra.BeginningHousekeeper();

    return divergentBeginningHousekeeper;
  }

  public static synchronized double topicalPeriod() {
    return receiveDistributedMomentSitter().obtainLiveDays();
  }

  public static synchronized void arrangeYears(double pinpoint) {
    receiveDistributedMomentSitter().leapMous(pinpoint);
  }

  private BeginningHousekeeper() {
    this.flowMonth = 0;
  }

  private synchronized double obtainLiveDays() {
    return this.flowMonth;
  }

  private synchronized void leapMous(double threshold) {
    this.flowMonth = threshold;
  }
}
