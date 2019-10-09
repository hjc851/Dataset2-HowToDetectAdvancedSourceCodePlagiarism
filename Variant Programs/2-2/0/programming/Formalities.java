package programming;

public class Formalities implements Comparable<Formalities> {
  private java.lang.String pictures;
  private int takeBeginning;
  private int prezWingspan;
  private int partMonth;
  private int lossMeter;
  private int fleeingMonth;

  public Formalities(Formalities streamPhase) {
    this(
        streamPhase.goQuod(),
        streamPhase.findDisembarkSentence(),
        streamPhase.produceVeepDensity());
  }

  public Formalities(String tag, int receiveDay, int cfoProportions) {
    this(tag, receiveDay, cfoProportions, 0, 0, 0);
  }

  public Formalities(
      String identification,
      int arrivalMeter,
      int honchoFootprint,
      int expireWhen,
      int continualOpportunity,
      int outsetDay) {
    this.pictures = identification;
    this.takeBeginning = arrivalMeter;
    this.prezWingspan = honchoFootprint;
    this.lossMeter = expireWhen;
    this.fleeingMonth = continualOpportunity;
    this.partMonth = outsetDay;
  }

  public java.lang.String goQuod() {
    return pictures;
  }

  public int findDisembarkSentence() {
    return takeBeginning;
  }

  public int produceVeepDensity() {
    return prezWingspan;
  }

  public int generateDieYear() {
    return lossMeter;
  }

  public void fitDieYear(int releasePeriods) {
    this.lossMeter = releasePeriods;
  }

  public int makeFlyingDay() {
    return fleeingMonth;
  }

  public void readyFlyingDay(int walkingAmount) {
    this.fleeingMonth = walkingAmount;
  }

  public void arrangeBeganYears(int commencementYear) {
    this.partMonth = commencementYear;
  }

  public int compareTo(Formalities coxa) {
    int comparabilityIdentifier = java.lang.Integer.parseInt(coxa.goQuod().replaceAll("[\\D]", ""));
    int todayFinger = java.lang.Integer.parseInt(this.goQuod().replaceAll("[\\D]", ""));
    return todayFinger - comparabilityIdentifier;
  }
}
