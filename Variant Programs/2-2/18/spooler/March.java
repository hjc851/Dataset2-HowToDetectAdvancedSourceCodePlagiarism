package spooler;

public class March implements Comparable<March> {
  private java.lang.String peg;
  private int meetPeriods;
  private int presidentCapacity;
  private int commencesMinutes;
  private int egressYears;
  private int linearBeginning;

  public March(March continuingMechanisms) {
    this(
        continuingMechanisms.catchIbid(),
        continuingMechanisms.produceComingNow(),
        continuingMechanisms.developDirectorStature());
  }

  public March(String tag, int bringWeek, int executableDimensions) {
    this(tag, bringWeek, executableDimensions, 0, 0, 0);
  }

  public March(
      String quod,
      int comeClock,
      int executiveHeight,
      int entranceWeek,
      int functionalChance,
      int begunBeginning) {
    this.peg = quod;
    this.meetPeriods = comeClock;
    this.presidentCapacity = executiveHeight;
    this.egressYears = entranceWeek;
    this.linearBeginning = functionalChance;
    this.commencesMinutes = begunBeginning;
  }

  public java.lang.String catchIbid() {
    return peg;
  }

  public int produceComingNow() {
    return meetPeriods;
  }

  public int developDirectorStature() {
    return presidentCapacity;
  }

  public int beatLeavingJuncture() {
    return egressYears;
  }

  public void situatedMoveMinutes(int quittingAmount) {
    this.egressYears = quittingAmount;
  }

  public int haveSpoutingPeriods() {
    return linearBeginning;
  }

  public void fitSquirtingYear(int squirtingYear) {
    this.linearBeginning = squirtingYear;
  }

  public void fixEarlyThing(int commenceMeter) {
    this.commencesMinutes = commenceMeter;
  }

  public int compareTo(March trapezium) {
    int contrastPhoto = java.lang.Integer.parseInt(trapezium.catchIbid().replaceAll("[\\D]", ""));
    int sayPeg = java.lang.Integer.parseInt(this.catchIbid().replaceAll("[\\D]", ""));
    return sayPeg - contrastPhoto;
  }
}
