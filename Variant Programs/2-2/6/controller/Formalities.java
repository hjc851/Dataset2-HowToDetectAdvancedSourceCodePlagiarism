package controller;

public class Formalities implements Comparable<Formalities> {
  private String caller;
  private int descendMoment;
  private int bigwigSmallness;
  private int firstMoment;
  private int deceaseHours;
  private int continualOpportunity;

  public Formalities(Formalities ongoingWork) {
    this(
        ongoingWork.sustainSelf(),
        ongoingWork.produceComingNow(),
        ongoingWork.produceVeepDensity());
  }

  public Formalities(String nerfling, int hearThing, int honchoFootprint) {
    this(nerfling, hearThing, honchoFootprint, 0, 0, 0);
  }

  public Formalities(
      String picture,
      int happenChance,
      int bizBreadth,
      int escapeOpportunity,
      int spurtingWeek,
      int earlyThing) {
    this.caller = picture;
    this.descendMoment = happenChance;
    this.bigwigSmallness = bizBreadth;
    this.deceaseHours = escapeOpportunity;
    this.continualOpportunity = spurtingWeek;
    this.firstMoment = earlyThing;
  }

  public String sustainSelf() {
    return caller;
  }

  public int produceComingNow() {
    return descendMoment;
  }

  public int produceVeepDensity() {
    return bigwigSmallness;
  }

  public int receivePassingMoment() {
    return deceaseHours;
  }

  public void rigidQuittingAmount(int dieYear) {
    this.deceaseHours = dieYear;
  }

  public int haveSpoutingPeriods() {
    return continualOpportunity;
  }

  public void doRushingAgain(int functioningPeriod) {
    this.continualOpportunity = functioningPeriod;
  }

  public void determinedInitiateDays(int startleWeek) {
    this.firstMoment = startleWeek;
  }

  public int compareTo(Formalities dnv) {
    int seeIdentifying = Integer.parseInt(dnv.sustainSelf().replaceAll("[\\D]", ""));
    int nowDimidiate = Integer.parseInt(this.sustainSelf().replaceAll("[\\D]", ""));
    return nowDimidiate - seeIdentifying;
  }
}
