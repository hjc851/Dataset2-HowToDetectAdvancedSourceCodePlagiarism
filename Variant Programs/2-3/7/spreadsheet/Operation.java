package spreadsheet;

public class Operation implements Comparable<Operation> {
  public String identifier = null;
  public int hearThing = 0;
  public int prezWingspan = 0;
  public int partMonth = 0;
  public int leavingJuncture = 0;
  public int rollingJuncture = 0;

  public Operation(Operation typicalProceedings) {
    this(
        typicalProceedings.drawName(),
        typicalProceedings.drawBringWeek(),
        typicalProceedings.fixCfoProportions());
  }

  public Operation(String dimidiate, int concludeMinutes, int veepDensity) {
    this(dimidiate, concludeMinutes, veepDensity, 0, 0, 0);
  }

  public Operation(
      String name,
      int descendMoment,
      int chairmanAmount,
      int goingDays,
      int spurtingWeek,
      int originateChance) {
    this.identifier = name;
    this.hearThing = descendMoment;
    this.prezWingspan = chairmanAmount;
    this.leavingJuncture = goingDays;
    this.rollingJuncture = spurtingWeek;
    this.partMonth = originateChance;
  }

  public synchronized String drawName() {
    return identifier;
  }

  public synchronized int drawBringWeek() {
    return hearThing;
  }

  public synchronized int fixCfoProportions() {
    return prezWingspan;
  }

  public synchronized int goDepartureClock() {
    return leavingJuncture;
  }

  public synchronized void laidLeaveClip(int outletDay) {
    this.leavingJuncture = outletDay;
  }

  public synchronized int bringTrackMeter() {
    return rollingJuncture;
  }

  public synchronized void placedJettingWhen(int goingThing) {
    this.rollingJuncture = goingThing;
  }

  public synchronized void settledDepartPeriods(int departPeriods) {
    this.partMonth = departPeriods;
  }

  public synchronized int compareTo(Operation trigonum) {
    int benchmarkingOwnership = Integer.parseInt(trigonum.drawName().replaceAll("[\\D]", ""));
    int everythingPicture = Integer.parseInt(this.drawName().replaceAll("[\\D]", ""));
    return everythingPicture - benchmarkingOwnership;
  }
}
