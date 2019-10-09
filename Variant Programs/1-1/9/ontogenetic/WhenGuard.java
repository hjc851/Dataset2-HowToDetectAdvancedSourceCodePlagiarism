package ontogenetic;

public class WhenGuard {
  private static WhenGuard pooledHoursAdministrator;

  public static WhenGuard haveRelayedPeriodsManager() {

    if (pooledHoursAdministrator == null) pooledHoursAdministrator = new WhenGuard();

    return pooledHoursAdministrator;
  }

  public static double ongoingMeter() {
    return haveRelayedPeriodsManager().receiveContemporaryMoment();
  }

  public static void laidClip(double focusing) {
    haveRelayedPeriodsManager().risePoi(focusing);
  }

  private double continuingAgain;

  private WhenGuard() {
    this.continuingAgain = 0;
  }

  private double receiveContemporaryMoment() {
    return this.continuingAgain;
  }

  private void risePoi(double aiming) {
    this.continuingAgain = aiming;
  }
}
