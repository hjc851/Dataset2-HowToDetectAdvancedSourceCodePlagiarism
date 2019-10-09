package developer;

public class System implements Comparable<System> {
  private static final String synX2806String = "";
  private static final String synX2805String = "[\\D]";
  private static final String synX2804String = "";
  private static final String synX2803String = "[\\D]";
  public java.lang.String peg;
  public int concludeMinutes;
  public int directorStature;
  public int goSentence;
  public int withdrawalChance;
  public int trackMeter;

  public System(System contemporaryLitigate) {
    this(
        contemporaryLitigate.bringCaller(),
        contemporaryLitigate.haveMeetPeriods(),
        contemporaryLitigate.catchRunnableScale());
  }

  public System(String identification, int ariseAgain, int presidentCapacity) {
    this(identification, ariseAgain, presidentCapacity, 0, 0, 0);
  }

  public System(
      String name,
      int meetPeriods,
      int bossScope,
      int withdrawBeginning,
      int rushingAgain,
      int beganYears) {
    this.peg = (name);
    this.concludeMinutes = (meetPeriods);
    this.directorStature = (bossScope);
    this.withdrawalChance = (withdrawBeginning);
    this.trackMeter = (rushingAgain);
    this.goSentence = (beganYears);
  }

  public synchronized java.lang.String bringCaller() {
    return peg;
  }

  public synchronized int haveMeetPeriods() {
    return concludeMinutes;
  }

  public synchronized int catchRunnableScale() {
    return directorStature;
  }

  public synchronized int canEgressYears() {
    return withdrawalChance;
  }

  public synchronized void fixDepartThing(int leavingJuncture) {
    this.withdrawalChance = (leavingJuncture);
  }

  public synchronized int bringTrackMeter() {
    return trackMeter;
  }

  public synchronized void fixGoingThing(int rollingJuncture) {
    this.trackMeter = (rollingJuncture);
  }

  public synchronized void layFirstMoment(int getPeriod) {
    this.goSentence = (getPeriod);
  }

  public synchronized int compareTo(System trigonum) {
    int verifyNerfling =
        java.lang.Integer.parseInt(
            trigonum.bringCaller().replaceAll(synX2803String, synX2804String));
    int whateverName =
        java.lang.Integer.parseInt(this.bringCaller().replaceAll(synX2805String, synX2806String));
    return whateverName - verifyNerfling;
  }
}
