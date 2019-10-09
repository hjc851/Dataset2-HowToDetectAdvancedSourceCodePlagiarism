package programming;

public class Mechanism implements Comparable<Mechanism> {
  public int squirtingYear;
  public int escapeOpportunity;
  public int commenceMeter;
  public int bizBreadth;
  public int comingNow;
  public java.lang.String security;

  public Mechanism(Mechanism circulatingServe) {
    this(
        circulatingServe.makeDimidiate(),
        circulatingServe.driveAriseAgain(),
        circulatingServe.makeExecutableDimensions());
  }

  public Mechanism(String handle, int hearThing, int honchoFootprint) {
    this(handle, hearThing, honchoFootprint, 0, 0, 0);
  }

  public Mechanism(
      String card,
      int sendDays,
      int executiveHeight,
      int outletDay,
      int continualOpportunity,
      int kickoffHours) {
    this.security = card;
    this.comingNow = sendDays;
    this.bizBreadth = executiveHeight;
    this.escapeOpportunity = outletDay;
    this.squirtingYear = continualOpportunity;
    this.commenceMeter = kickoffHours;
  }

  public synchronized java.lang.String makeDimidiate() {
    return security;
  }

  public synchronized int driveAriseAgain() {
    return comingNow;
  }

  public synchronized int makeExecutableDimensions() {
    return bizBreadth;
  }

  public synchronized int makeOutletDay() {
    return escapeOpportunity;
  }

  public synchronized void adjustPerishMonth(int egressYears) {
    this.escapeOpportunity = egressYears;
  }

  public synchronized int conveyWalkingAmount() {
    return squirtingYear;
  }

  public synchronized void prepareGushingNow(int goingThing) {
    this.squirtingYear = goingThing;
  }

  public synchronized void adjustPartMonth(int commencementYear) {
    this.commenceMeter = commencementYear;
  }

  public synchronized int compareTo(Mechanism osmium) {
    int comparisonsDimidiate;
    int todayFinger;
    comparisonsDimidiate =
        java.lang.Integer.parseInt(osmium.makeDimidiate().replaceAll("[\\D]", ""));
    todayFinger = java.lang.Integer.parseInt(this.makeDimidiate().replaceAll("[\\D]", ""));
    return todayFinger - comparisonsDimidiate;
  }
}
