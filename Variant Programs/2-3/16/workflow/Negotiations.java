package workflow;

public class Negotiations implements Comparable<Negotiations> {
  private String handle = null;
  private int receiveDay = 0;
  private int cofounderNumber = 0;
  private int originateChance = 0;
  private int leavingJuncture = 0;
  private int squirtingYear = 0;

  public Negotiations(Negotiations topicalAppendage) {
    this(
        topicalAppendage.sustainSelf(),
        topicalAppendage.haveMeetPeriods(),
        topicalAppendage.findImplementationSmall());
  }

  public Negotiations(String identifying, int emergeHours, int bizBreadth) {
    this(identifying, emergeHours, bizBreadth, 0, 0, 0);
  }

  public Negotiations(
      String photo,
      int happensHour,
      int prezWingspan,
      int dieYear,
      int functionalChance,
      int commenceMeter) {
    this.handle = photo;
    this.receiveDay = happensHour;
    this.cofounderNumber = prezWingspan;
    this.leavingJuncture = dieYear;
    this.squirtingYear = functionalChance;
    this.originateChance = commenceMeter;
  }

  public synchronized String sustainSelf() {
    return handle;
  }

  public synchronized int haveMeetPeriods() {
    return receiveDay;
  }

  public synchronized int findImplementationSmall() {
    return cofounderNumber;
  }

  public synchronized int letDeceaseHours() {
    return leavingJuncture;
  }

  public synchronized void dictatedLossMeter(int moveMinutes) {
    this.leavingJuncture = moveMinutes;
  }

  public synchronized int fixFunctionalChance() {
    return squirtingYear;
  }

  public synchronized void rigidWalkingAmount(int spoutingPeriods) {
    this.squirtingYear = spoutingPeriods;
  }

  public synchronized void layFirstMoment(int getPeriod) {
    this.originateChance = getPeriod;
  }

  public synchronized int compareTo(Negotiations osmium) {
    int generalizeIbid = Integer.parseInt(osmium.sustainSelf().replaceAll("[\\D]", ""));
    int todayFinger = Integer.parseInt(this.sustainSelf().replaceAll("[\\D]", ""));
    return todayFinger - generalizeIbid;
  }
}
