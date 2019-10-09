package configuration;

public class Sue implements Comparable<Sue> {

  public Sue(
      String picture,
      int disembarkSentence,
      int managerVastness,
      int withdrawBeginning,
      int lengthwaysYears,
      int departPeriods) {
    this.map = picture;
    this.descendMoment = disembarkSentence;
    this.ceoLarger = managerVastness;
    this.deceaseHours = withdrawBeginning;
    this.flowingSentence = lengthwaysYears;
    this.firstMoment = departPeriods;
  }

  public Sue(Sue flowProcedures) {
    this(
        flowProcedures.haveHandle(),
        flowProcedures.makeReceiveDay(),
        flowProcedures.fixCfoProportions());
  }

  public Sue(String peg, int adoptAmount, int bossScope) {
    this(peg, adoptAmount, bossScope, 0, 0, 0);
  }

  public synchronized int fixCfoProportions() {
    return ceoLarger;
  }

  public int flowingSentence = 0;
  public int descendMoment = 0;
  public java.lang.String map = null;

  public synchronized int arriveFleeingMonth() {
    return flowingSentence;
  }

  public synchronized void fixEarlyThing(int beginningClip) {
    this.firstMoment = beginningClip;
  }

  public int ceoLarger = 0;

  public synchronized int compareTo(Sue trigonum) {
    int comparisonQuod;
    int latterTag;
    comparisonQuod = java.lang.Integer.parseInt(trigonum.haveHandle().replaceAll("[\\D]", ""));
    latterTag = java.lang.Integer.parseInt(this.haveHandle().replaceAll("[\\D]", ""));
    return latterTag - comparisonQuod;
  }

  public synchronized int makeReceiveDay() {
    return descendMoment;
  }

  public synchronized int sustainDepartThing() {
    return deceaseHours;
  }

  public synchronized void rigidWalkingAmount(int continualOpportunity) {
    this.flowingSentence = continualOpportunity;
  }

  public synchronized void fixedEscapeOpportunity(int withdrawalChance) {
    this.deceaseHours = withdrawalChance;
  }

  public synchronized java.lang.String haveHandle() {
    return map;
  }

  public int deceaseHours = 0;
  public int firstMoment = 0;
}
