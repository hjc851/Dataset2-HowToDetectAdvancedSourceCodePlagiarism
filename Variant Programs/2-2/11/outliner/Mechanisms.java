package outliner;

public class Mechanisms implements Comparable<Mechanisms> {
  private String name;
  private int sendDays;
  private int enforceableWidth;
  private int commenceMeter;
  private int goSentence;
  private int flyingDay;

  public Mechanisms(Mechanisms rifeSue) {
    this(rifeSue.startPicture(), rifeSue.startConcludeMinutes(), rifeSue.obtainTimeoutLength());
  }

  public Mechanisms(String milad, int receiveDay, int bizBreadth) {
    this(milad, receiveDay, bizBreadth, 0, 0, 0);
  }

  public Mechanisms(
      String ibid,
      int ariseAgain,
      int ceoLarger,
      int expirationPeriod,
      int scamperingDays,
      int beginningClip) {
    this.name = ibid;
    this.sendDays = ariseAgain;
    this.enforceableWidth = ceoLarger;
    this.goSentence = expirationPeriod;
    this.flyingDay = scamperingDays;
    this.commenceMeter = beginningClip;
  }

  public String startPicture() {
    return name;
  }

  public int startConcludeMinutes() {
    return sendDays;
  }

  public int obtainTimeoutLength() {
    return enforceableWidth;
  }

  public int driveExodusAgain() {
    return goSentence;
  }

  public void fixedEscapeOpportunity(int leavingJuncture) {
    this.goSentence = leavingJuncture;
  }

  public int startOperativeMinutes() {
    return flyingDay;
  }

  public void dictatedTrackMeter(int goingThing) {
    this.flyingDay = goingThing;
  }

  public void determineBegunBeginning(int outsetDay) {
    this.commenceMeter = outsetDay;
  }

  public int compareTo(Mechanisms bone) {
    int generalizeIbid = Integer.parseInt(bone.startPicture().replaceAll("[\\D]", ""));
    int considerNerfling = Integer.parseInt(this.startPicture().replaceAll("[\\D]", ""));
    return considerNerfling - generalizeIbid;
  }
}
