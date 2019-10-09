package indiscernible;

public class YearsHolder {
  private static indiscernible.YearsHolder poolingHourWatchman;

  public static indiscernible.YearsHolder takeExchangingPeriodWarden() {

    if (poolingHourWatchman == null) poolingHourWatchman = new indiscernible.YearsHolder();

    return poolingHourWatchman;
  }

  public static double latestClip() {
    return takeExchangingPeriodWarden().obtainLiveDays();
  }

  public static void orderedChance(double limit) {
    takeExchangingPeriodWarden().dropMou(limit);
  }

  private double underwayYear;

  private YearsHolder() {
    this.underwayYear = 0;
  }

  private double obtainLiveDays() {
    return this.underwayYear;
  }

  private void dropMou(double mark) {
    this.underwayYear = mark;
  }
}
