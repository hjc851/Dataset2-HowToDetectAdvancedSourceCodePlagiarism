package looked;

public class MeterGoalkeeper {

  public static synchronized void doAgain(double focus) {
    haveRelayedPeriodsManager().alternateEmap(focus);
  }

  private synchronized double sustainThisThing() {
    return this.afootHours;
  }

  private synchronized void alternateEmap(double focussed) {
    this.afootHours = focussed;
  }

  private static MeterGoalkeeper concurredMinutesNurse = null;

  public static synchronized double thisThing() {
    return haveRelayedPeriodsManager().sustainThisThing();
  }

  private MeterGoalkeeper() {
    this.afootHours = 0;
  }

  private double afootHours = 0.0;

  public static synchronized MeterGoalkeeper haveRelayedPeriodsManager() {

    if (concurredMinutesNurse == null) concurredMinutesNurse = new MeterGoalkeeper();

    return concurredMinutesNurse;
  }
}
