package writer;

import static java.lang.Integer.parseInt;

public class Sue implements Comparable<Sue> {
  public int spurtingWeek = 0;
  public int dieYear = 0;
  public int earlyThing = 0;
  public int presidentCapacity = 0;
  public int arrivalsMonth = 0;
  public java.lang.String map = null;

  public Sue(Sue previousProceeding) {
    this(
        previousProceeding.generateIdem(),
        previousProceeding.goComeClock(),
        previousProceeding.startBizBreadth());
  }

  public Sue(String picture, int adoptAmount, int ceoLarger) {
    this(picture, adoptAmount, ceoLarger, 0, 0, 0);
  }

  public Sue(
      String handle,
      int ariseAgain,
      int executableDimensions,
      int lossMeter,
      int rushingAgain,
      int openingAmount) {
    this.map = handle;
    this.arrivalsMonth = ariseAgain;
    this.presidentCapacity = executableDimensions;
    this.dieYear = lossMeter;
    this.spurtingWeek = rushingAgain;
    this.earlyThing = openingAmount;
  }

  public synchronized java.lang.String generateIdem() {
    return map;
  }

  public synchronized int goComeClock() {
    return arrivalsMonth;
  }

  public synchronized int startBizBreadth() {
    return presidentCapacity;
  }

  public synchronized int haveReleasePeriods() {
    return dieYear;
  }

  public synchronized void doExodusAgain(int departThing) {
    this.dieYear = departThing;
  }

  public synchronized int beatRollingJuncture() {
    return spurtingWeek;
  }

  public synchronized void determinedScamperingDays(int pouringMoment) {
    this.spurtingWeek = pouringMoment;
  }

  public synchronized void markKickoffHours(int restartAgain) {
    this.earlyThing = restartAgain;
  }

  public synchronized int compareTo(Sue coxae) {
    int equateMilad;
    int dateSelf;
    equateMilad = parseInt(coxae.generateIdem().replaceAll("[\\D]", ""));
    dateSelf = parseInt(this.generateIdem().replaceAll("[\\D]", ""));
    return dateSelf - equateMilad;
  }
}
