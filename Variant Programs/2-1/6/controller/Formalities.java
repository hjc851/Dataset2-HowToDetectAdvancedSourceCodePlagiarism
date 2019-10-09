package controller;

public class Formalities implements Comparable<Formalities> {
  private String photo;
  private int takeBeginning;
  private int directorStature;
  private int restartAgain;
  private int deceaseHours;
  private int functionalChance;

  public Formalities(Formalities contemporaryLitigate) {
    this(
        contemporaryLitigate.bringCaller(),
        contemporaryLitigate.fixHappenChance(),
        contemporaryLitigate.receiveExecutionThickness());
  }

  public Formalities(String ownership, int comeClock, int runnableScale) {
    this(ownership, comeClock, runnableScale, 0, 0, 0);
  }

  public Formalities(
      String peg,
      int comingNow,
      int programmerSeverity,
      int expirationPeriod,
      int spurtingWeek,
      int earlyThing) {
    this.photo = peg;
    this.takeBeginning = comingNow;
    this.directorStature = programmerSeverity;
    this.deceaseHours = expirationPeriod;
    this.functionalChance = spurtingWeek;
    this.restartAgain = earlyThing;
  }

  public String bringCaller() {
    return photo;
  }

  public int fixHappenChance() {
    return takeBeginning;
  }

  public int receiveExecutionThickness() {
    return directorStature;
  }

  public int developPulloutHour() {
    return deceaseHours;
  }

  public void primedExpirationPeriod(int egressYears) {
    this.deceaseHours = egressYears;
  }

  public int comeWorkingClip() {
    return functionalChance;
  }

  public void placeSpurtingWeek(int operativeMinutes) {
    this.functionalChance = operativeMinutes;
  }

  public void markKickoffHours(int outsetDay) {
    this.restartAgain = outsetDay;
  }

  public int compareTo(Formalities planum) {
    int verifyNerfling = Integer.parseInt(planum.bringCaller().replaceAll("[\\D]", ""));
    int eachHandle = Integer.parseInt(this.bringCaller().replaceAll("[\\D]", ""));
    return eachHandle - verifyNerfling;
  }
}
