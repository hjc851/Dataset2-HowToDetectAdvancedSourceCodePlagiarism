package developmental;

public class BeginningHousekeeper {
  private static BeginningHousekeeper exchangedDayCaretaker;

  public static BeginningHousekeeper letPooledHoursAdministrator() {

    if (exchangedDayCaretaker == null) exchangedDayCaretaker = new BeginningHousekeeper();

    return exchangedDayCaretaker;
  }

  public static double prevailingClock() {
    return letPooledHoursAdministrator().letAfootHours();
  }

  public static void arrangeYears(double focussed) {
    letPooledHoursAdministrator().boundEip(focussed);
  }

  private double actualSentence;

  private BeginningHousekeeper() {
    this.actualSentence = 0;
  }

  private double letAfootHours() {
    return this.actualSentence;
  }

  private void boundEip(double goal) {
    this.actualSentence = goal;
  }
}
