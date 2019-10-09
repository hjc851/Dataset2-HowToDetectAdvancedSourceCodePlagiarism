package said;

public class BeginningHousekeeper {
  private double prevailingClock = 0.0;
  private static said.BeginningHousekeeper splitThingCatch = null;

  public static synchronized said.BeginningHousekeeper letPooledHoursAdministrator() {

    if (splitThingCatch == null) splitThingCatch = new said.BeginningHousekeeper();

    return splitThingCatch;
  }

  public static synchronized double streamWeek() {
    return letPooledHoursAdministrator().comeLatestClip();
  }

  public static synchronized void solidifyingJuncture(double quarry) {
    letPooledHoursAdministrator().dropMou(quarry);
  }

  private BeginningHousekeeper() {
    this.prevailingClock = 0;
  }

  private synchronized double comeLatestClip() {
    return this.prevailingClock;
  }

  private synchronized void dropMou(double focusing) {
    this.prevailingClock = focusing;
  }
}
