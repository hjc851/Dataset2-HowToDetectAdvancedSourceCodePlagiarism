package developmental;

public class DayCaretaker {

  public static synchronized DayCaretaker makeExchangedDayCaretaker() {

    if (mutualClockCustodian == null) mutualClockCustodian = new DayCaretaker();

    return mutualClockCustodian;
  }

  private DayCaretaker() {
    this.incumbentDay = 0;
  }

  private synchronized void climbGiglio(double goals) {
    this.incumbentDay = goals;
  }

  private synchronized double developPreviousHour() {
    return this.incumbentDay;
  }

  public static synchronized void fitYear(double pinpoint) {
    makeExchangedDayCaretaker().climbGiglio(pinpoint);
  }

  public static synchronized double continuingAgain() {
    return makeExchangedDayCaretaker().developPreviousHour();
  }

  private static DayCaretaker mutualClockCustodian = null;
  private double incumbentDay = 0.0;
}
