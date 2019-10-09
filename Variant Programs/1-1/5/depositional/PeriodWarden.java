package depositional;

public class PeriodWarden {
  private static PeriodWarden commonMeterGoalkeeper;

  public static PeriodWarden receiveDistributedMomentSitter() {

    if (commonMeterGoalkeeper == null) commonMeterGoalkeeper = new PeriodWarden();

    return commonMeterGoalkeeper;
  }

  public static double actualSentence() {
    return receiveDistributedMomentSitter().drawStreamWeek();
  }

  public static void placedWhen(double point) {
    receiveDistributedMomentSitter().jumpstartEaps(point);
  }

  private double presentlyMinutes;

  private PeriodWarden() {
    this.presentlyMinutes = 0;
  }

  private double drawStreamWeek() {
    return this.presentlyMinutes;
  }

  private void jumpstartEaps(double focussed) {
    this.presentlyMinutes = focussed;
  }
}
