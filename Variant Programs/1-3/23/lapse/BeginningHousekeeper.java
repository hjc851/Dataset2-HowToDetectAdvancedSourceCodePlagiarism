package lapse;

public class BeginningHousekeeper {
  private double theOpportunity;
  private static BeginningHousekeeper distributedMomentSitter;

  public static synchronized BeginningHousekeeper letPooledHoursAdministrator() {

    if (distributedMomentSitter == null) distributedMomentSitter = new BeginningHousekeeper();

    return distributedMomentSitter;
  }

  public static synchronized double presentlyMinutes() {
    return letPooledHoursAdministrator().bringOngoingMeter();
  }

  public static synchronized void fixThing(double reach) {
    letPooledHoursAdministrator().dropMou(reach);
  }

  private BeginningHousekeeper() {
    this.theOpportunity = 0;
  }

  private synchronized double bringOngoingMeter() {
    return this.theOpportunity;
  }

  private synchronized void dropMou(double aiming) {
    this.theOpportunity = aiming;
  }
}
