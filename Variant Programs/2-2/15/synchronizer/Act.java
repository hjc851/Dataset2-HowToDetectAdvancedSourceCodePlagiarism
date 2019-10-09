package synchronizer;

public class Act implements Comparable<Act> {
  private java.lang.String nerfling;
  private int adoptAmount;
  private int officerImmensity;
  private int getPeriod;
  private int releasePeriods;
  private int spoutingPeriods;

  public Act(Act contemporaryLitigate) {
    this(
        contemporaryLitigate.catchIbid(),
        contemporaryLitigate.fixHappenChance(),
        contemporaryLitigate.bringEnforceableWidth());
  }

  public Act(String finger, int comeClock, int honchoFootprint) {
    this(finger, comeClock, honchoFootprint, 0, 0, 0);
  }

  public Act(
      String self,
      int meetPeriods,
      int programmerSeverity,
      int expirationPeriod,
      int spurtingWeek,
      int beganYears) {
    this.nerfling = self;
    this.adoptAmount = meetPeriods;
    this.officerImmensity = programmerSeverity;
    this.releasePeriods = expirationPeriod;
    this.spoutingPeriods = spurtingWeek;
    this.getPeriod = beganYears;
  }

  public java.lang.String catchIbid() {
    return nerfling;
  }

  public int fixHappenChance() {
    return adoptAmount;
  }

  public int bringEnforceableWidth() {
    return officerImmensity;
  }

  public int letDeceaseHours() {
    return releasePeriods;
  }

  public void rigidQuittingAmount(int goingDays) {
    this.releasePeriods = goingDays;
  }

  public int drawSpurtingWeek() {
    return spoutingPeriods;
  }

  public void placedJettingWhen(int walkingAmount) {
    this.spoutingPeriods = walkingAmount;
  }

  public void markKickoffHours(int beginsOpportunity) {
    this.getPeriod = beginsOpportunity;
  }

  public int compareTo(Act coxa) {
    int benchmarkingOwnership =
        java.lang.Integer.parseInt(coxa.catchIbid().replaceAll("[\\D]", ""));
    int everythingPicture = java.lang.Integer.parseInt(this.catchIbid().replaceAll("[\\D]", ""));
    return everythingPicture - benchmarkingOwnership;
  }
}
