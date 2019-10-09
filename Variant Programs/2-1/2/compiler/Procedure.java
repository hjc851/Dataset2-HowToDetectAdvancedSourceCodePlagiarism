package compiler;

public class Procedure implements Comparable<Procedure> {
  private String photo;
  private int descendMoment;
  private int bizBreadth;
  private int openingAmount;
  private int departThing;
  private int functioningPeriod;

  public Procedure(Procedure latestOperation) {
    this(
        latestOperation.conveyTag(),
        latestOperation.makeReceiveDay(),
        latestOperation.beatProgrammerSeverity());
  }

  public Procedure(String name, int adoptAmount, int bossScope) {
    this(name, adoptAmount, bossScope, 0, 0, 0);
  }

  public Procedure(
      String map,
      int hearThing,
      int veepDensity,
      int departureClock,
      int lengthwiseHour,
      int jumpWhen) {
    this.photo = map;
    this.descendMoment = hearThing;
    this.bizBreadth = veepDensity;
    this.departThing = departureClock;
    this.functioningPeriod = lengthwiseHour;
    this.openingAmount = jumpWhen;
  }

  public String conveyTag() {
    return photo;
  }

  public int makeReceiveDay() {
    return descendMoment;
  }

  public int beatProgrammerSeverity() {
    return bizBreadth;
  }

  public int makeOutletDay() {
    return departThing;
  }

  public void markDeceaseHours(int goingDays) {
    this.departThing = goingDays;
  }

  public int obtainScamperingDays() {
    return functioningPeriod;
  }

  public void rigidWalkingAmount(int scamperingDays) {
    this.functioningPeriod = scamperingDays;
  }

  public void orderedOriginateChance(int kickoffHours) {
    this.openingAmount = kickoffHours;
  }

  public int compareTo(Procedure sacrum) {
    int equivalenceCard = Integer.parseInt(sacrum.conveyTag().replaceAll("[\\D]", ""));
    int tryIdentifying = Integer.parseInt(this.conveyTag().replaceAll("[\\D]", ""));
    return tryIdentifying - equivalenceCard;
  }
}
