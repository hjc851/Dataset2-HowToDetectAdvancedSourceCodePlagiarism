package ontogenetic;

public class NowDoorman {
  private double afootHours = 0.0;
  private static NowDoorman communicatedNowDoorman = null;

  public static synchronized NowDoorman haveRelayedPeriodsManager() {

    if (communicatedNowDoorman == null) communicatedNowDoorman = new NowDoorman();

    return communicatedNowDoorman;
  }

  public static synchronized double latestClip() {
    return haveRelayedPeriodsManager().startPresentlyMinutes();
  }

  public static synchronized void fixThing(double reach) {
    haveRelayedPeriodsManager().jumpstartEaps(reach);
  }

  private NowDoorman() {
    this.afootHours = 0;
  }

  private synchronized double startPresentlyMinutes() {
    return this.afootHours;
  }

  private synchronized void jumpstartEaps(double prey) {
    this.afootHours = prey;
  }
}
