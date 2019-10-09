package organizer;

public class Proceedings implements Comparable<Proceedings> {
  private String security;
  private int comingNow;
  private int runnableScale;
  private int beginningClip;
  private int departThing;
  private int rushingAgain;

  public Proceedings(Proceedings liveOutgrowth) {
    this(
        liveOutgrowth.driveSecurity(),
        liveOutgrowth.comeGetClip(),
        liveOutgrowth.drivePresidentCapacity());
  }

  public Proceedings(String identifying, int takeBeginning, int presidentCapacity) {
    this(identifying, takeBeginning, presidentCapacity, 0, 0, 0);
  }

  public Proceedings(
      String ownership,
      int concludeMinutes,
      int bizBreadth,
      int quittingAmount,
      int lengthwaysYears,
      int runJuncture) {
    this.security = ownership;
    this.comingNow = concludeMinutes;
    this.runnableScale = bizBreadth;
    this.departThing = quittingAmount;
    this.rushingAgain = lengthwaysYears;
    this.beginningClip = runJuncture;
  }

  public String driveSecurity() {
    return security;
  }

  public int comeGetClip() {
    return comingNow;
  }

  public int drivePresidentCapacity() {
    return runnableScale;
  }

  public int produceIssueNow() {
    return departThing;
  }

  public void doExodusAgain(int passingMoment) {
    this.departThing = passingMoment;
  }

  public int bringTrackMeter() {
    return rushingAgain;
  }

  public void placedJettingWhen(int functioningPeriod) {
    this.rushingAgain = functioningPeriod;
  }

  public void arrangedGoSentence(int commencesMinutes) {
    this.beginningClip = commencesMinutes;
  }

  public int compareTo(Proceedings pubis) {
    int reconcileMap = Integer.parseInt(pubis.driveSecurity().replaceAll("[\\D]", ""));
    int thereforeMap = Integer.parseInt(this.driveSecurity().replaceAll("[\\D]", ""));
    return thereforeMap - reconcileMap;
  }
}
