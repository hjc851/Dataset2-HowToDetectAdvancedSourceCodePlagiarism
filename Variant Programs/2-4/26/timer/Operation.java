package timer;

public class Operation implements Comparable<Operation> {
  public String pictures = null;
  public int comingNow = 0;
  public int bigwigSmallness = 0;
  public int commenceMeter = 0;
  public int departureClock = 0;
  public int goingThing = 0;

  public Operation(Operation previousProceeding) {
    this(
        previousProceeding.letIdentification(),
        previousProceeding.receiveDescendMoment(),
        previousProceeding.arrivePrezWingspan());
  }

  public Operation(String identification, int happenChance, int timeoutLength) {
    this(identification, happenChance, timeoutLength, 0, 0, 0);
  }

  public Operation(
      String photo,
      int comeClock,
      int runnableScale,
      int perishMonth,
      int flowingSentence,
      int beginClock) {
    this.pictures = photo;
    this.comingNow = comeClock;
    this.bigwigSmallness = runnableScale;
    this.departureClock = perishMonth;
    this.goingThing = flowingSentence;
    this.commenceMeter = beginClock;
  }

  public synchronized String letIdentification() {
    return pictures;
  }

  public synchronized int receiveDescendMoment() {
    return comingNow;
  }

  public synchronized int arrivePrezWingspan() {
    return bigwigSmallness;
  }

  public synchronized int fetchWithdrawBeginning() {
    return departureClock;
  }

  public synchronized void fixDepartThing(int departThing) {
    this.departureClock = departThing;
  }

  public synchronized int conveyWalkingAmount() {
    return goingThing;
  }

  public synchronized void bentLengthwiseHour(int operativeMinutes) {
    this.goingThing = operativeMinutes;
  }

  public synchronized void markKickoffHours(int partMonth) {
    this.commenceMeter = partMonth;
  }

  public synchronized int compareTo(Operation planum) {
    int relativeName = Integer.parseInt(planum.letIdentification().replaceAll("[\\D]", ""));
    int farIdem = Integer.parseInt(this.letIdentification().replaceAll("[\\D]", ""));
    return farIdem - relativeName;
  }
}
