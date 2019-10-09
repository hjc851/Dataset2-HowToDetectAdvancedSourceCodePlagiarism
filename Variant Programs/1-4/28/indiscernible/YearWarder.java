package indiscernible;

public class YearWarder {

  public static synchronized void settledPeriods(double focusing) {
    canProvidedYearsHolder().springEfp(focusing);
  }

  private static YearWarder exchangedDayCaretaker;

  private YearWarder() {
    this.underwayYear = 0;
  }

  public static synchronized YearWarder canProvidedYearsHolder() {

    if (exchangedDayCaretaker == null) exchangedDayCaretaker = new YearWarder();

    return exchangedDayCaretaker;
  }

  public static synchronized double liveDays() {
    return canProvidedYearsHolder().arriveFlowMonth();
  }

  private synchronized void springEfp(double direct) {
    this.underwayYear = direct;
  }

  private double underwayYear;

  private synchronized double arriveFlowMonth() {
    return this.underwayYear;
  }
}
