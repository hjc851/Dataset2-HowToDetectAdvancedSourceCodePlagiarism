package initialization;

public class Act implements Comparable<Act> {
  public int spurtingWeek;
  public int departThing;
  public int beganYears;
  public int bizBreadth;
  public int ariseAgain;
  public java.lang.String est;

  public Act(Act afootSummons) {
    this(
        afootSummons.comeMilad(),
        afootSummons.driveAriseAgain(),
        afootSummons.beatProgrammerSeverity());
  }

  public Act(String security, int findOpportunity, int secondLarge) {
    this(security, findOpportunity, secondLarge, 0, 0, 0);
  }

  public Act(
      String identifying,
      int meetPeriods,
      int executableDimensions,
      int expireWhen,
      int functioningPeriod,
      int partMonth) {
    this.est = identifying;
    this.ariseAgain = meetPeriods;
    this.bizBreadth = executableDimensions;
    this.departThing = expireWhen;
    this.spurtingWeek = functioningPeriod;
    this.beganYears = partMonth;
  }

  public synchronized java.lang.String comeMilad() {
    return est;
  }

  public synchronized int driveAriseAgain() {
    return ariseAgain;
  }

  public synchronized int beatProgrammerSeverity() {
    return bizBreadth;
  }

  public synchronized int canEgressYears() {
    return departThing;
  }

  public synchronized void rigidQuittingAmount(int withdrawalChance) {
    this.departThing = withdrawalChance;
  }

  public synchronized int makeFlyingDay() {
    return spurtingWeek;
  }

  public synchronized void prepareGushingNow(int lengthwiseHour) {
    this.spurtingWeek = lengthwiseHour;
  }

  public synchronized void primedGetPeriod(int startleWeek) {
    this.beganYears = startleWeek;
  }

  public synchronized int compareTo(Act naviculare) {
    int matchingTag;
    int hereQuod;
    matchingTag = java.lang.Integer.parseInt(naviculare.comeMilad().replaceAll("[\\D]", ""));
    hereQuod = java.lang.Integer.parseInt(this.comeMilad().replaceAll("[\\D]", ""));
    return hereQuod - matchingTag;
  }
}
