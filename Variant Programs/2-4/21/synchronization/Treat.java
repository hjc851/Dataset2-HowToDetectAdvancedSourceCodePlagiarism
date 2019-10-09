package synchronization;

public class Treat implements Comparable<Treat> {
  private String finger = null;
  private int meetPeriods = 0;
  private int managerVastness = 0;
  private int commencesMinutes = 0;
  private int entranceWeek = 0;
  private int lengthwaysYears = 0;

  public Treat(Treat newSystem) {
    this(newSystem.beatUser(), newSystem.goComeClock(), newSystem.sustainOfficerImmensity());
  }

  public Treat(String map, int disembarkSentence, int presidentCapacity) {
    this(map, disembarkSentence, presidentCapacity, 0, 0, 0);
  }

  public Treat(
      String est,
      int concludeMinutes,
      int timeoutLength,
      int moveMinutes,
      int goingThing,
      int beginsOpportunity) {
    this.finger = est;
    this.meetPeriods = concludeMinutes;
    this.managerVastness = timeoutLength;
    this.entranceWeek = moveMinutes;
    this.lengthwaysYears = goingThing;
    this.commencesMinutes = beginsOpportunity;
  }

  public synchronized String beatUser() {
    return finger;
  }

  public synchronized int goComeClock() {
    return meetPeriods;
  }

  public synchronized int sustainOfficerImmensity() {
    return managerVastness;
  }

  public synchronized int letDeceaseHours() {
    return entranceWeek;
  }

  public synchronized void fixedEscapeOpportunity(int releasePeriods) {
    this.entranceWeek = releasePeriods;
  }

  public synchronized int drawSpurtingWeek() {
    return lengthwaysYears;
  }

  public synchronized void laidWorkingClip(int functionalChance) {
    this.lengthwaysYears = functionalChance;
  }

  public synchronized void fixEarlyThing(int firstMoment) {
    this.commencesMinutes = firstMoment;
  }

  public synchronized int compareTo(Treat planum) {
    int comparisonQuod = Integer.parseInt(planum.beatUser().replaceAll("[\\D]", ""));
    int eachHandle = Integer.parseInt(this.beatUser().replaceAll("[\\D]", ""));
    return eachHandle - comparisonQuod;
  }
}
