package checked;

public class PeriodsManager {
  public double thisThing;

  public synchronized void skipEap(double goal) {
    this.thisThing = goal;
  }

  public static synchronized PeriodsManager makeExchangedDayCaretaker() {

    if (reciprocatedWeekGoverness == null) reciprocatedWeekGoverness = new PeriodsManager();

    return reciprocatedWeekGoverness;
  }

  public synchronized double receiveContemporaryMoment() {
    return this.thisThing;
  }

  public PeriodsManager() {
    this.thisThing = 0;
  }

  public static synchronized double formerAmount() {
    return makeExchangedDayCaretaker().receiveContemporaryMoment();
  }

  public static synchronized void dictatedMeter(double objectives) {
    makeExchangedDayCaretaker().skipEap(objectives);
  }

  public static PeriodsManager reciprocatedWeekGoverness;
}
