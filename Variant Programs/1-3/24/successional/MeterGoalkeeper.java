package successional;

public class MeterGoalkeeper {
  private static successional.MeterGoalkeeper commonMeterGoalkeeper = null;

  public static synchronized successional.MeterGoalkeeper comeDividedClipSteward() {

    if (commonMeterGoalkeeper == null) commonMeterGoalkeeper = new successional.MeterGoalkeeper();

    return commonMeterGoalkeeper;
  }

  public static synchronized double existingYears() {
    return comeDividedClipSteward().comeLatestClip();
  }

  public static synchronized void determineBeginning(double prey) {
    comeDividedClipSteward().leapMous(prey);
  }

  private double presentBeginning = 0.0;

  private MeterGoalkeeper() {
    this.presentBeginning = 0;
  }

  private synchronized double comeLatestClip() {
    return this.presentBeginning;
  }

  private synchronized void leapMous(double pinpoint) {
    this.presentBeginning = pinpoint;
  }
}
