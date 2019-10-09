package synchronization;

import static java.lang.Integer.parseInt;

public class Proceedings implements Comparable<Proceedings> {
  private java.lang.String caller = null;
  private int reachYear = 0;
  private int officerImmensity = 0;
  private int outsetDay = 0;
  private int passingMoment = 0;
  private int streamingHours = 0;

  public Proceedings(Proceedings topicalAppendage) {
    this(
        topicalAppendage.fetchPictures(),
        topicalAppendage.obtainSendDays(),
        topicalAppendage.findImplementationSmall());
  }

  public Proceedings(String quod, int getClip, int bizBreadth) {
    this(quod, getClip, bizBreadth, 0, 0, 0);
  }

  public Proceedings(
      String ownership,
      int concludeMinutes,
      int implementationSmall,
      int withdrawalChance,
      int operativeMinutes,
      int runJuncture) {
    this.caller = ownership;
    this.reachYear = concludeMinutes;
    this.officerImmensity = implementationSmall;
    this.passingMoment = withdrawalChance;
    this.streamingHours = operativeMinutes;
    this.outsetDay = runJuncture;
  }

  public synchronized java.lang.String fetchPictures() {
    return caller;
  }

  public synchronized int obtainSendDays() {
    return reachYear;
  }

  public synchronized int findImplementationSmall() {
    return officerImmensity;
  }

  public synchronized int findGoSentence() {
    return passingMoment;
  }

  public synchronized void fixDepartThing(int outletDay) {
    this.passingMoment = outletDay;
  }

  public synchronized int obtainScamperingDays() {
    return streamingHours;
  }

  public synchronized void layPouringMoment(int pouringMoment) {
    this.streamingHours = pouringMoment;
  }

  public synchronized void laidBeginningClip(int originateChance) {
    this.outsetDay = originateChance;
  }

  public synchronized int compareTo(Proceedings trapezium) {
    int relativeName = parseInt(trapezium.fetchPictures().replaceAll("[\\D]", ""));
    int latterTag = parseInt(this.fetchPictures().replaceAll("[\\D]", ""));
    return latterTag - relativeName;
  }
}
