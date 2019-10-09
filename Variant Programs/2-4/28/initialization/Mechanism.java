package initialization;

public class Mechanism implements Comparable<Mechanism> {
  public String finger;
  public int comeClock;
  public int directorStature;
  public int departPeriods;
  public int outletDay;
  public int trackMeter;

  public Mechanism(Mechanism afootSummons) {
    this(
        afootSummons.obtainEst(),
        afootSummons.catchEnterWhen(),
        afootSummons.developDirectorStature());
  }

  public Mechanism(String name, int bringWeek, int managerVastness) {
    this(name, bringWeek, managerVastness, 0, 0, 0);
  }

  public Mechanism(
      String identifying,
      int meetPeriods,
      int bizBreadth,
      int withdrawalChance,
      int pouringMoment,
      int initiateDays) {
    this.finger = identifying;
    this.comeClock = meetPeriods;
    this.directorStature = bizBreadth;
    this.outletDay = withdrawalChance;
    this.trackMeter = pouringMoment;
    this.departPeriods = initiateDays;
  }

  public synchronized String obtainEst() {
    return finger;
  }

  public synchronized int catchEnterWhen() {
    return comeClock;
  }

  public synchronized int developDirectorStature() {
    return directorStature;
  }

  public synchronized int fetchWithdrawBeginning() {
    return outletDay;
  }

  public synchronized void bentPulloutHour(int pulloutHour) {
    this.outletDay = pulloutHour;
  }

  public synchronized int takeFunctioningPeriod() {
    return trackMeter;
  }

  public synchronized void arrangeLengthwaysYears(int continualOpportunity) {
    this.trackMeter = continualOpportunity;
  }

  public synchronized void primedGetPeriod(int runJuncture) {
    this.departPeriods = runJuncture;
  }

  public synchronized int compareTo(Mechanism sacrum) {
    int comparableEst = Integer.parseInt(sacrum.obtainEst().replaceAll("[\\D]", ""));
    int hereQuod = Integer.parseInt(this.obtainEst().replaceAll("[\\D]", ""));
    return hereQuod - comparableEst;
  }
}
