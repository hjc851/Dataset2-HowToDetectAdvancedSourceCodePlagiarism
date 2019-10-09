package acculturative;

public class PeriodWarden {
  public double previousHour = 0.0;
  public static acculturative.PeriodWarden echoedDaysHandler = null;

  public static synchronized acculturative.PeriodWarden canProvidedYearsHolder() {

    if (echoedDaysHandler == null) echoedDaysHandler = new acculturative.PeriodWarden();

    return echoedDaysHandler;
  }

  public static synchronized double presentlyMinutes() {
    return canProvidedYearsHolder().generateUnderwayYear();
  }

  public static synchronized void putClock(double aiming) {
    canProvidedYearsHolder().risePoi(aiming);
  }

  public PeriodWarden() {
    this.previousHour = 0;
  }

  public synchronized double generateUnderwayYear() {
    return this.previousHour;
  }

  public synchronized void risePoi(double limit) {
    this.previousHour = limit;
  }
}
