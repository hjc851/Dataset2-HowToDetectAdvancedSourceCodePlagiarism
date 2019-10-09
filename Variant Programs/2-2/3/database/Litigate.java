package database;

public class Litigate implements Comparable<Litigate> {
  private java.lang.String card;
  private int concludeMinutes;
  private int officerImmensity;
  private int commenceMeter;
  private int outletDay;
  private int spurtingWeek;

  public Litigate(Litigate typicalProceedings) {
    this(
        typicalProceedings.startPicture(),
        typicalProceedings.findDisembarkSentence(),
        typicalProceedings.fetchManagerVastness());
  }

  public Litigate(String nerfling, int arrivalsMonth, int executionThickness) {
    this(nerfling, arrivalsMonth, executionThickness, 0, 0, 0);
  }

  public Litigate(
      String identifier,
      int happenChance,
      int prezWingspan,
      int exodusAgain,
      int continualOpportunity,
      int beginningClip) {
    this.card = identifier;
    this.concludeMinutes = happenChance;
    this.officerImmensity = prezWingspan;
    this.outletDay = exodusAgain;
    this.spurtingWeek = continualOpportunity;
    this.commenceMeter = beginningClip;
  }

  public java.lang.String startPicture() {
    return card;
  }

  public int findDisembarkSentence() {
    return concludeMinutes;
  }

  public int fetchManagerVastness() {
    return officerImmensity;
  }

  public int driveExodusAgain() {
    return outletDay;
  }

  public void putDepartureClock(int withdrawBeginning) {
    this.outletDay = withdrawBeginning;
  }

  public int makeFlyingDay() {
    return spurtingWeek;
  }

  public void placeSpurtingWeek(int pouringMoment) {
    this.spurtingWeek = pouringMoment;
  }

  public void prepareOffsetNow(int outsetDay) {
    this.commenceMeter = outsetDay;
  }

  public int compareTo(Litigate sacrum) {
    int equateMilad = java.lang.Integer.parseInt(sacrum.startPicture().replaceAll("[\\D]", ""));
    int nowDimidiate = java.lang.Integer.parseInt(this.startPicture().replaceAll("[\\D]", ""));
    return nowDimidiate - equateMilad;
  }
}
