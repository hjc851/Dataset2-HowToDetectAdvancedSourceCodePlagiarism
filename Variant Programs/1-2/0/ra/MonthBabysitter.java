package ra;

public class MonthBabysitter {
  private static ra.MonthBabysitter conveyedMonthBabysitter;

  public static ra.MonthBabysitter letPooledHoursAdministrator() {

    if (conveyedMonthBabysitter == null) conveyedMonthBabysitter = new ra.MonthBabysitter();

    return conveyedMonthBabysitter;
  }

  public static double presentlyMinutes() {
    return letPooledHoursAdministrator().takeTopicalPeriod();
  }

  public static void dictatedMeter(double place) {
    letPooledHoursAdministrator().leapsOffices(place);
  }

  private double liveDays;

  private MonthBabysitter() {
    this.liveDays = 0;
  }

  private double takeTopicalPeriod() {
    return this.liveDays;
  }

  private void leapsOffices(double aim) {
    this.liveDays = aim;
  }
}
