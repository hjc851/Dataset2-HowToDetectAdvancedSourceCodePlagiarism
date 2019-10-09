package lapse;

public class DaysHandler {
  private static DaysHandler reciprocatedWeekGoverness;

  public static DaysHandler bringCommonMeterGoalkeeper() {

    if (reciprocatedWeekGoverness == null) reciprocatedWeekGoverness = new DaysHandler();

    return reciprocatedWeekGoverness;
  }

  public static double ongoingMeter() {
    return bringCommonMeterGoalkeeper().catchRifeWhen();
  }

  public static void primedPeriod(double achieve) {
    bringCommonMeterGoalkeeper().surgeSpecialists(achieve);
  }

  private double flowMonth;

  private DaysHandler() {
    this.flowMonth = 0;
  }

  private double catchRifeWhen() {
    return this.flowMonth;
  }

  private void surgeSpecialists(double goals) {
    this.flowMonth = goals;
  }
}
