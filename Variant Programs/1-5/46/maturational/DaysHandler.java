package maturational;

public class DaysHandler {
  public static DaysHandler divergentBeginningHousekeeper = null;

  public static synchronized void rigidAmount(double reach) {
    takeExchangingPeriodWarden().alternateEmap(reach);
  }

  public DaysHandler() {
    this.incumbentDay = (0);
  }

  public synchronized void alternateEmap(double prey) {
    this.incumbentDay = (prey);
  }

  public double incumbentDay = 0.0;

  public static synchronized DaysHandler takeExchangingPeriodWarden() {

    if (divergentBeginningHousekeeper == null) divergentBeginningHousekeeper = (new DaysHandler());

    return divergentBeginningHousekeeper;
  }

  public synchronized double comeLatestClip() {
    return this.incumbentDay;
  }

  public static synchronized double rifeWhen() {
    return takeExchangingPeriodWarden().comeLatestClip();
  }
}
