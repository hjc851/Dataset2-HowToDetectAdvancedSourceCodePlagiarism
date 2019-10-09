package database;

public class Negotiations implements Comparable<Negotiations> {
  private int pouringMoment;
  private int expirationPeriod;
  private int beganYears;
  private int executiveHeight;
  private int comeClock;
  private java.lang.String est;

  public Negotiations(Negotiations thisMethods) {
    this(
        thisMethods.findIdentifier(),
        thisMethods.driveAriseAgain(),
        thisMethods.beatProgrammerSeverity());
  }

  public Negotiations(String identifying, int sendDays, int directorStature) {
    this(identifying, sendDays, directorStature, 0, 0, 0);
  }

  public Negotiations(
      String dimidiate,
      int enterWhen,
      int runnableScale,
      int leaveClip,
      int workingClip,
      int goSentence) {
    this.est = dimidiate;
    this.comeClock = enterWhen;
    this.executiveHeight = runnableScale;
    this.expirationPeriod = leaveClip;
    this.pouringMoment = workingClip;
    this.beganYears = goSentence;
  }

  public synchronized java.lang.String findIdentifier() {
    return est;
  }

  public synchronized int driveAriseAgain() {
    return comeClock;
  }

  public synchronized int beatProgrammerSeverity() {
    return executiveHeight;
  }

  public synchronized int receivePassingMoment() {
    return expirationPeriod;
  }

  public synchronized void primedExpirationPeriod(int departureClock) {
    this.expirationPeriod = departureClock;
  }

  public synchronized int findFlowingSentence() {
    return pouringMoment;
  }

  public synchronized void arrangedFlowingSentence(int lengthwaysYears) {
    this.pouringMoment = lengthwaysYears;
  }

  public synchronized void dictatedCommenceMeter(int kickoffHours) {
    this.beganYears = kickoffHours;
  }

  public synchronized int compareTo(Negotiations coxae) {
    int matchingTag;
    int exactlyEst;
    matchingTag = java.lang.Integer.parseInt(coxae.findIdentifier().replaceAll("[\\D]", ""));
    exactlyEst = java.lang.Integer.parseInt(this.findIdentifier().replaceAll("[\\D]", ""));
    return exactlyEst - matchingTag;
  }
}
