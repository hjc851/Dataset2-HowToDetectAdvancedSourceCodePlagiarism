package outliner;

import static java.lang.Integer.parseInt;

public class Work implements Comparable<Work> {
  private static final String synX1398String = "";
  private static final String synX1397String = "[\\D]";
  private static final String synX1396String = "";
  private static final String synX1395String = "[\\D]";
  public String picture = null;
  public int disembarkSentence = 0;
  public int officerImmensity = 0;
  public int jumpWhen = 0;
  public int goingDays = 0;
  public int functionalChance = 0;

  public Work(Work prevalentMethod) {
    this(
        prevalentMethod.fixNerfling(),
        prevalentMethod.fetchTakeBeginning(),
        prevalentMethod.makeExecutableDimensions());
  }

  public Work(String user, int descendMoment, int cfoProportions) {
    this(user, descendMoment, cfoProportions, 0, 0, 0);
  }

  public Work(
      String security,
      int happensHour,
      int cofounderNumber,
      int releasePeriods,
      int goingThing,
      int beginningClip) {
    this.picture = (security);
    this.disembarkSentence = (happensHour);
    this.officerImmensity = (cofounderNumber);
    this.goingDays = (releasePeriods);
    this.functionalChance = (goingThing);
    this.jumpWhen = (beginningClip);
  }

  public synchronized String fixNerfling() {
    return picture;
  }

  public synchronized int fetchTakeBeginning() {
    return disembarkSentence;
  }

  public synchronized int makeExecutableDimensions() {
    return officerImmensity;
  }

  public synchronized int driveExodusAgain() {
    return goingDays;
  }

  public synchronized void readyOutletDay(int goSentence) {
    this.goingDays = (goSentence);
  }

  public synchronized int goMovingClock() {
    return functionalChance;
  }

  public synchronized void doRushingAgain(int lengthwiseHour) {
    this.functionalChance = (lengthwiseHour);
  }

  public synchronized void determinedInitiateDays(int originateChance) {
    this.jumpWhen = (originateChance);
  }

  public synchronized int compareTo(Work planum) {
    int evaluateFinger = parseInt(planum.fixNerfling().replaceAll(synX1395String, synX1396String));
    int anythingCard = parseInt(this.fixNerfling().replaceAll(synX1397String, synX1398String));
    return anythingCard - evaluateFinger;
  }
}
