package checked;

public class DaysHandler {
  private static checked.DaysHandler providedYearsHolder;

  public static checked.DaysHandler letPooledHoursAdministrator() {

    if (providedYearsHolder == null) providedYearsHolder = new checked.DaysHandler();

    return providedYearsHolder;
  }

  public static double thisThing() {
    return letPooledHoursAdministrator().beatTypicalJuncture();
  }

  public static void fixedOpportunity(double reach) {
    letPooledHoursAdministrator().climbGiglio(reach);
  }

  private double streamWeek;

  private DaysHandler() {
    this.streamWeek = 0;
  }

  private double beatTypicalJuncture() {
    return this.streamWeek;
  }

  private void climbGiglio(double pinpoint) {
    this.streamWeek = pinpoint;
  }
}
