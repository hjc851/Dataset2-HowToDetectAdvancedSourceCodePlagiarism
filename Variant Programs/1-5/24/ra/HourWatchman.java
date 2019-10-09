package ra;

public class HourWatchman {
  private static final int synX1753int = 0;

  public static synchronized HourWatchman produceCommunicatedNowDoorman() {

    if (pooledHoursAdministrator == null) pooledHoursAdministrator = new HourWatchman();

    return pooledHoursAdministrator;
  }

  private HourWatchman() {
    this.previousHour = synX1753int;
  }

  private synchronized double arriveFlowMonth() {
    return this.previousHour;
  }

  private synchronized void startleCss(double goal) {
    this.previousHour = goal;
  }

  public static synchronized double existingYears() {
    return produceCommunicatedNowDoorman().arriveFlowMonth();
  }

  public static synchronized void layMoment(double focusing) {
    produceCommunicatedNowDoorman().startleCss(focusing);
  }

  private static HourWatchman pooledHoursAdministrator = null;
  private double previousHour = 0.0;
}
