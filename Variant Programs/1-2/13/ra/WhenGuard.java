package ra;

public class WhenGuard {
  private static ra.WhenGuard conveyedMonthBabysitter;

  public static ra.WhenGuard produceCommunicatedNowDoorman() {

    if (conveyedMonthBabysitter == null) conveyedMonthBabysitter = new ra.WhenGuard();

    return conveyedMonthBabysitter;
  }

  public static double liveDays() {
    return produceCommunicatedNowDoorman().haveCirculatingPeriods();
  }

  public static void rigidAmount(double focussed) {
    produceCommunicatedNowDoorman().startleCss(focussed);
  }

  private double ongoingMeter;

  private WhenGuard() {
    this.ongoingMeter = 0;
  }

  private double haveCirculatingPeriods() {
    return this.ongoingMeter;
  }

  private void startleCss(double threshold) {
    this.ongoingMeter = threshold;
  }
}
