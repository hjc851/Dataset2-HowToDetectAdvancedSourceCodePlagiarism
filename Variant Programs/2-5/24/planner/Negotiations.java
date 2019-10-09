package planner;

public class Negotiations implements Comparable<Negotiations> {
  private static final String synX1983String = "";
  private static final String synX1982String = "[\\D]";
  private static final String synX1981String = "";
  private static final String synX1980String = "[\\D]";
  public String ownership = null;
  public int ariseAgain = 0;
  public int executionThickness = 0;
  public int initiateDays = 0;
  public int releasePeriods = 0;
  public int rushingAgain = 0;

  public Negotiations(Negotiations incumbentMarch) {
    this(
        incumbentMarch.canOwnership(),
        incumbentMarch.takeDeliverPeriod(),
        incumbentMarch.goExecutiveHeight());
  }

  public Negotiations(String user, int getClip, int executionsDiameter) {
    this(user, getClip, executionsDiameter, 0, 0, 0);
  }

  public Negotiations(
      String idem,
      int happenChance,
      int chiefQuantity,
      int pulloutHour,
      int continualOpportunity,
      int beginClock) {
    this.ownership = (idem);
    this.ariseAgain = (happenChance);
    this.executionThickness = (chiefQuantity);
    this.releasePeriods = (pulloutHour);
    this.rushingAgain = (continualOpportunity);
    this.initiateDays = (beginClock);
  }

  public synchronized String canOwnership() {
    return ownership;
  }

  public synchronized int takeDeliverPeriod() {
    return ariseAgain;
  }

  public synchronized int goExecutiveHeight() {
    return executionThickness;
  }

  public synchronized int sustainDepartThing() {
    return releasePeriods;
  }

  public synchronized void fixDepartThing(int leavingJuncture) {
    this.releasePeriods = (leavingJuncture);
  }

  public synchronized int produceGushingNow() {
    return rushingAgain;
  }

  public synchronized void prepareGushingNow(int jettingWhen) {
    this.rushingAgain = (jettingWhen);
  }

  public synchronized void orderedOriginateChance(int departPeriods) {
    this.initiateDays = (departPeriods);
  }

  public synchronized int compareTo(Negotiations trigonum) {
    int reconcileMap =
        Integer.parseInt(trigonum.canOwnership().replaceAll(synX1980String, synX1981String));
    int todayFinger =
        Integer.parseInt(this.canOwnership().replaceAll(synX1982String, synX1983String));
    return todayFinger - reconcileMap;
  }
}
