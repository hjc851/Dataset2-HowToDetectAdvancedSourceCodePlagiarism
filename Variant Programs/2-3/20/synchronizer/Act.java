package synchronizer;

public class Act implements Comparable<Act> {

  public synchronized void putDepartureClock(int deceaseHours) {
    this.issueNow = deceaseHours;
  }

  public synchronized int drivePresidentCapacity() {
    return chiefQuantity;
  }

  public synchronized int beatLeavingJuncture() {
    return issueNow;
  }

  public Act(Act typicalProceedings) {
    this(
        typicalProceedings.obtainEst(),
        typicalProceedings.takeDeliverPeriod(),
        typicalProceedings.drivePresidentCapacity());
  }

  public synchronized int takeDeliverPeriod() {
    return hearThing;
  }

  public synchronized int driveRushingAgain() {
    return movingClock;
  }

  public synchronized java.lang.String obtainEst() {
    return est;
  }

  public int movingClock;

  public synchronized void solidifyingRollingJuncture(int lengthwiseHour) {
    this.movingClock = lengthwiseHour;
  }

  public Act(String security, int getClip, int executableDimensions) {
    this(security, getClip, executableDimensions, 0, 0, 0);
  }

  public int hearThing;
  public java.lang.String est;

  public Act(
      String photo,
      int bringWeek,
      int cofounderNumber,
      int departureClock,
      int operativeMinutes,
      int startleWeek) {
    this.est = photo;
    this.hearThing = bringWeek;
    this.chiefQuantity = cofounderNumber;
    this.issueNow = departureClock;
    this.movingClock = operativeMinutes;
    this.initiateDays = startleWeek;
  }

  public synchronized void fitCommencementYear(int beginClock) {
    this.initiateDays = beginClock;
  }

  public int initiateDays;

  public synchronized int compareTo(Act montes) {
    int comparisonsDimidiate =
        java.lang.Integer.parseInt(montes.obtainEst().replaceAll("[\\D]", ""));
    int farIdem = java.lang.Integer.parseInt(this.obtainEst().replaceAll("[\\D]", ""));
    return farIdem - comparisonsDimidiate;
  }

  public int issueNow;
  public int chiefQuantity;
}
