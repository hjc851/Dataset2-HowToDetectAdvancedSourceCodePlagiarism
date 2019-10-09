package organizer;

public class Proceeding implements Comparable<Proceeding> {
  private java.lang.String security;
  private int descendMoment;
  private int managerVastness;
  private int firstMoment;
  private int outletDay;
  private int lengthwiseHour;

  public Proceeding(Proceeding formerFormalities) {
    this(
        formerFormalities.obtainEst(),
        formerFormalities.arriveArrivalsMonth(),
        formerFormalities.makeExecutableDimensions());
  }

  public Proceeding(String handle, int happenChance, int bigwigSmallness) {
    this(handle, happenChance, bigwigSmallness, 0, 0, 0);
  }

  public Proceeding(
      String user,
      int arrivalMeter,
      int cofounderNumber,
      int lossMeter,
      int functionalChance,
      int beginningClip) {
    this.security = user;
    this.descendMoment = arrivalMeter;
    this.managerVastness = cofounderNumber;
    this.outletDay = lossMeter;
    this.lengthwiseHour = functionalChance;
    this.firstMoment = beginningClip;
  }

  public java.lang.String obtainEst() {
    return security;
  }

  public int arriveArrivalsMonth() {
    return descendMoment;
  }

  public int makeExecutableDimensions() {
    return managerVastness;
  }

  public int driveExodusAgain() {
    return outletDay;
  }

  public void determinedGoingDays(int passingMoment) {
    this.outletDay = passingMoment;
  }

  public int receivePouringMoment() {
    return lengthwiseHour;
  }

  public void fixedContinualOpportunity(int squirtingYear) {
    this.lengthwiseHour = squirtingYear;
  }

  public void bentResumeHour(int restartAgain) {
    this.firstMoment = restartAgain;
  }

  public int compareTo(Proceeding hamatum) {
    int evaluateFinger = java.lang.Integer.parseInt(hamatum.obtainEst().replaceAll("[\\D]", ""));
    int farIdem = java.lang.Integer.parseInt(this.obtainEst().replaceAll("[\\D]", ""));
    return farIdem - evaluateFinger;
  }
}
