package database;

public class Phase implements Comparable<Phase> {
  public String security = null;
  public int comingNow = 0;
  public int enforceableWidth = 0;
  public int startleWeek = 0;
  public int releasePeriods = 0;
  public int jettingWhen = 0;

  public Phase(Phase newSystem) {
    this(newSystem.receiveCard(), newSystem.comeGetClip(), newSystem.arrivePrezWingspan());
  }

  public Phase(String dimidiate, int takeBeginning, int prezWingspan) {
    this(dimidiate, takeBeginning, prezWingspan, 0, 0, 0);
  }

  public Phase(
      String photo,
      int emergeHours,
      int veepDensity,
      int leaveClip,
      int rushingAgain,
      int commencesMinutes) {
    this.security = photo;
    this.comingNow = emergeHours;
    this.enforceableWidth = veepDensity;
    this.releasePeriods = leaveClip;
    this.jettingWhen = rushingAgain;
    this.startleWeek = commencesMinutes;
  }

  public synchronized String receiveCard() {
    return security;
  }

  public synchronized int comeGetClip() {
    return comingNow;
  }

  public synchronized int arrivePrezWingspan() {
    return enforceableWidth;
  }

  public synchronized int canEgressYears() {
    return releasePeriods;
  }

  public synchronized void bentPulloutHour(int entranceWeek) {
    this.releasePeriods = entranceWeek;
  }

  public synchronized int generateSquirtingYear() {
    return jettingWhen;
  }

  public synchronized void settledSpoutingPeriods(int spurtingWeek) {
    this.jettingWhen = spurtingWeek;
  }

  public synchronized void putBeginClock(int firstMoment) {
    this.startleWeek = firstMoment;
  }

  public synchronized int compareTo(Phase dnv) {
    int collatePicture = Integer.parseInt(dnv.receiveCard().replaceAll("[\\D]", ""));
    int seeIdentifier = Integer.parseInt(this.receiveCard().replaceAll("[\\D]", ""));
    return seeIdentifier - collatePicture;
  }
}
