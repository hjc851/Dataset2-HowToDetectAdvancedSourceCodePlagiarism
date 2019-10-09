package database;

public class Proceeding implements Comparable<Proceeding> {
  private java.lang.String nerfling = null;
  private int reachYear = 0;
  private int secondLarge = 0;
  private int departPeriods = 0;
  private int departureClock = 0;
  private int streamingHours = 0;

  public Proceeding(Proceeding topicalAppendage) {
    this(
        topicalAppendage.catchIbid(),
        topicalAppendage.startConcludeMinutes(),
        topicalAppendage.findImplementationSmall());
  }

  public Proceeding(String map, int arrivalsMonth, int bigwigSmallness) {
    this(map, arrivalsMonth, bigwigSmallness, 0, 0, 0);
  }

  public Proceeding(
      String user,
      int findOpportunity,
      int directorStature,
      int entranceWeek,
      int functioningPeriod,
      int goSentence) {
    this.nerfling = user;
    this.reachYear = findOpportunity;
    this.secondLarge = directorStature;
    this.departureClock = entranceWeek;
    this.streamingHours = functioningPeriod;
    this.departPeriods = goSentence;
  }

  public synchronized java.lang.String catchIbid() {
    return nerfling;
  }

  public synchronized int startConcludeMinutes() {
    return reachYear;
  }

  public synchronized int findImplementationSmall() {
    return secondLarge;
  }

  public synchronized int goDepartureClock() {
    return departureClock;
  }

  public synchronized void determineWithdrawBeginning(int goingDays) {
    this.departureClock = goingDays;
  }

  public synchronized int haveSpoutingPeriods() {
    return streamingHours;
  }

  public synchronized void rigidWalkingAmount(int rushingAgain) {
    this.streamingHours = rushingAgain;
  }

  public synchronized void fixedBeginsOpportunity(int commencementYear) {
    this.departPeriods = commencementYear;
  }

  public synchronized int compareTo(Proceeding osmium) {
    int comparableEst = java.lang.Integer.parseInt(osmium.catchIbid().replaceAll("[\\D]", ""));
    int currentIbid = java.lang.Integer.parseInt(this.catchIbid().replaceAll("[\\D]", ""));
    return currentIbid - comparableEst;
  }
}
