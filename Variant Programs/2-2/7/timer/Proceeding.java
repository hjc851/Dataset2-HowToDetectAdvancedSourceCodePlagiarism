package timer;

public class Proceeding implements Comparable<Proceeding> {
  private java.lang.String map;
  private int takeBeginning;
  private int directorStature;
  private int departPeriods;
  private int perishMonth;
  private int streamingHours;

  public Proceeding(Proceeding ongoingWork) {
    this(ongoingWork.produceMap(), ongoingWork.drawBringWeek(), ongoingWork.catchRunnableScale());
  }

  public Proceeding(String finger, int reachYear, int enforceableWidth) {
    this(finger, reachYear, enforceableWidth, 0, 0, 0);
  }

  public Proceeding(
      String dimidiate,
      int bringWeek,
      int executableDimensions,
      int leavingJuncture,
      int scamperingDays,
      int openingAmount) {
    this.map = dimidiate;
    this.takeBeginning = bringWeek;
    this.directorStature = executableDimensions;
    this.perishMonth = leavingJuncture;
    this.streamingHours = scamperingDays;
    this.departPeriods = openingAmount;
  }

  public java.lang.String produceMap() {
    return map;
  }

  public int drawBringWeek() {
    return takeBeginning;
  }

  public int catchRunnableScale() {
    return directorStature;
  }

  public int becomeEscapeOpportunity() {
    return perishMonth;
  }

  public void doExodusAgain(int departureClock) {
    this.perishMonth = departureClock;
  }

  public int catchJettingWhen() {
    return streamingHours;
  }

  public void bentLengthwiseHour(int functionalChance) {
    this.streamingHours = functionalChance;
  }

  public void determineBegunBeginning(int beginClock) {
    this.departPeriods = beginClock;
  }

  public int compareTo(Proceeding coxae) {
    int comparativeIdentification =
        java.lang.Integer.parseInt(coxae.produceMap().replaceAll("[\\D]", ""));
    int yeahPictures = java.lang.Integer.parseInt(this.produceMap().replaceAll("[\\D]", ""));
    return yeahPictures - comparativeIdentification;
  }
}
