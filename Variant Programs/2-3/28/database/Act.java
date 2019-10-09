package database;

public class Act implements Comparable<Act> {
  public String name = null;
  public int submitJuncture = 0;
  public int managerVastness = 0;
  public int firstMoment = 0;
  public int departThing = 0;
  public int pouringMoment = 0;

  public Act(Act afootSummons) {
    this(
        afootSummons.produceMap(), afootSummons.canOccurYears(), afootSummons.letBigwigSmallness());
  }

  public Act(String quod, int getClip, int honchoFootprint) {
    this(quod, getClip, honchoFootprint, 0, 0, 0);
  }

  public Act(
      String identifier,
      int happenChance,
      int implementationSmall,
      int withdrawBeginning,
      int fleeingMonth,
      int beginningClip) {
    this.name = identifier;
    this.submitJuncture = happenChance;
    this.managerVastness = implementationSmall;
    this.departThing = withdrawBeginning;
    this.pouringMoment = fleeingMonth;
    this.firstMoment = beginningClip;
  }

  public synchronized String produceMap() {
    return name;
  }

  public synchronized int canOccurYears() {
    return submitJuncture;
  }

  public synchronized int letBigwigSmallness() {
    return managerVastness;
  }

  public synchronized int comeLeaveClip() {
    return departThing;
  }

  public synchronized void readyOutletDay(int passingMoment) {
    this.departThing = passingMoment;
  }

  public synchronized int conveyWalkingAmount() {
    return pouringMoment;
  }

  public synchronized void bentLengthwiseHour(int goingThing) {
    this.pouringMoment = goingThing;
  }

  public synchronized void readyOutsetDay(int commencementYear) {
    this.firstMoment = commencementYear;
  }

  public synchronized int compareTo(Act trapezium) {
    int assessHandle = Integer.parseInt(trapezium.produceMap().replaceAll("[\\D]", ""));
    int yeahPictures = Integer.parseInt(this.produceMap().replaceAll("[\\D]", ""));
    return yeahPictures - assessHandle;
  }
}
