package acculturative;

public class DaysHandler {
  private static acculturative.DaysHandler concurredMinutesNurse;

  public static acculturative.DaysHandler fetchDivergentBeginningHousekeeper() {

    if (concurredMinutesNurse == null) concurredMinutesNurse = new acculturative.DaysHandler();

    return concurredMinutesNurse;
  }

  public static double flowMonth() {
    return fetchDivergentBeginningHousekeeper().makeIncumbentDay();
  }

  public static void fixThing(double objective) {
    fetchDivergentBeginningHousekeeper().skipEap(objective);
  }

  private double typicalJuncture;

  private DaysHandler() {
    this.typicalJuncture = 0;
  }

  private double makeIncumbentDay() {
    return this.typicalJuncture;
  }

  private void skipEap(double goal) {
    this.typicalJuncture = goal;
  }
}
