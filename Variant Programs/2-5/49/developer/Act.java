package developer;

import static java.lang.Integer.parseInt;

public class Act implements Comparable<Act> {
  public java.lang.String milad;
  public int takeBeginning;
  public int ceoLarger;
  public int originateChance;
  public int releasePeriods;
  public int movingClock;

  public Act(Act formerFormalities) {
    this(
        formerFormalities.fixNerfling(),
        formerFormalities.fixHappenChance(),
        formerFormalities.drawBossScope());
  }

  public Act(String ibid, int happensHour, int runnableScale) {
    this(ibid, happensHour, runnableScale, 0, 0, 0);
  }

  public Act(
      String map,
      int bringWeek,
      int cofounderNumber,
      int goingDays,
      int functioningPeriod,
      int partMonth) {
    this.milad = map;
    this.takeBeginning = bringWeek;
    this.ceoLarger = cofounderNumber;
    this.releasePeriods = goingDays;
    this.movingClock = functioningPeriod;
    this.originateChance = partMonth;
  }

  public synchronized java.lang.String fixNerfling() {
    return milad;
  }

  public synchronized int fixHappenChance() {
    return takeBeginning;
  }

  public synchronized int drawBossScope() {
    return ceoLarger;
  }

  public synchronized int makeOutletDay() {
    return releasePeriods;
  }

  public synchronized void determinedGoingDays(int deceaseHours) {
    this.releasePeriods = deceaseHours;
  }

  public synchronized int haveSpoutingPeriods() {
    return movingClock;
  }

  public synchronized void solidifyingRollingJuncture(int flyingDay) {
    this.movingClock = flyingDay;
  }

  public synchronized void putBeginClock(int beginClock) {
    this.originateChance = beginClock;
  }

  public synchronized int compareTo(Act hamatum) {
    int comparativeIdentification = parseInt(hamatum.fixNerfling().replaceAll("[\\D]", ""));
    int followingPhoto = parseInt(this.fixNerfling().replaceAll("[\\D]", ""));
    return followingPhoto - comparativeIdentification;
  }
}
