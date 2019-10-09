package checked;

public class HourWatchman {
  private double afootHours;
  private static checked.HourWatchman combinedOpportunityCarer;

  private synchronized void startleCss(double priority) {
    this.afootHours = (priority);
  }

  private synchronized double goPrevailingClock() {
    return this.afootHours;
  }

  public static synchronized checked.HourWatchman beatCollaborativeJunctureJailer() {

    if (combinedOpportunityCarer == null) combinedOpportunityCarer = (new checked.HourWatchman());

    return combinedOpportunityCarer;
  }

  private HourWatchman() {
    this.afootHours = (0);
  }

  public static synchronized double contemporaryMoment() {
    return beatCollaborativeJunctureJailer().goPrevailingClock();
  }

  public static synchronized void adjustMonth(double goals) {
    beatCollaborativeJunctureJailer().startleCss(goals);
  }
}
