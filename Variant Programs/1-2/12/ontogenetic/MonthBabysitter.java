package ontogenetic;

public class MonthBabysitter {
  private static MonthBabysitter commonMeterGoalkeeper;

  public static MonthBabysitter takeExchangingPeriodWarden() {

    if (commonMeterGoalkeeper == null) commonMeterGoalkeeper = new MonthBabysitter();

    return commonMeterGoalkeeper;
  }

  public static double flowMonth() {
    return takeExchangingPeriodWarden().conveyFormerAmount();
  }

  public static void dictatedMeter(double objectives) {
    takeExchangingPeriodWarden().plungePae(objectives);
  }

  private double prevalentNow;

  private MonthBabysitter() {
    this.prevalentNow = 0;
  }

  private double conveyFormerAmount() {
    return this.prevalentNow;
  }

  private void plungePae(double prey) {
    this.prevalentNow = prey;
  }
}
