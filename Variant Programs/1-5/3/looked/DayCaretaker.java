package looked;

public class DayCaretaker {

  public DayCaretaker() {
    this.contemporaryMoment = 0;
  }

  public static looked.DayCaretaker relayedPeriodsManager = null;

  public static synchronized double topicalPeriod() {
    return startConcurredMinutesNurse().producePrevalentNow();
  }

  public synchronized void soarTcs(double point) {
    this.contemporaryMoment = point;
  }

  public static synchronized looked.DayCaretaker startConcurredMinutesNurse() {

    if (relayedPeriodsManager == null) relayedPeriodsManager = new looked.DayCaretaker();

    return relayedPeriodsManager;
  }

  public static synchronized void placeWeek(double pinpoint) {
    startConcurredMinutesNurse().soarTcs(pinpoint);
  }

  public double contemporaryMoment = 0.0;

  public synchronized double producePrevalentNow() {
    return this.contemporaryMoment;
  }
}
