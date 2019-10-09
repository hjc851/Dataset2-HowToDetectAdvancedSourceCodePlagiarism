package callback;

public class Proceeding implements Comparable<Proceeding> {
  private String peg;
  private int enterWhen;
  private int timeoutLength;
  private int begunBeginning;
  private int pulloutHour;
  private int workingClip;

  public Proceeding(Proceeding liveOutgrowth) {
    this(
        liveOutgrowth.obtainEst(),
        liveOutgrowth.generateReachYear(),
        liveOutgrowth.fixCfoProportions());
  }

  public Proceeding(String self, int adoptAmount, int managerVastness) {
    this(self, adoptAmount, managerVastness, 0, 0, 0);
  }

  public Proceeding(
      String pictures,
      int bringWeek,
      int implementationSmall,
      int withdrawBeginning,
      int movingClock,
      int commencementYear) {
    this.peg = pictures;
    this.enterWhen = bringWeek;
    this.timeoutLength = implementationSmall;
    this.pulloutHour = withdrawBeginning;
    this.workingClip = movingClock;
    this.begunBeginning = commencementYear;
  }

  public String obtainEst() {
    return peg;
  }

  public int generateReachYear() {
    return enterWhen;
  }

  public int fixCfoProportions() {
    return timeoutLength;
  }

  public int conveyQuittingAmount() {
    return pulloutHour;
  }

  public void arrangedGoSentence(int goSentence) {
    this.pulloutHour = goSentence;
  }

  public int bringTrackMeter() {
    return workingClip;
  }

  public void determineLinearBeginning(int streamingHours) {
    this.workingClip = streamingHours;
  }

  public void primedGetPeriod(int runJuncture) {
    this.begunBeginning = runJuncture;
  }

  public int compareTo(Proceeding montes) {
    int evaluateFinger = Integer.parseInt(montes.obtainEst().replaceAll("[\\D]", ""));
    int eachHandle = Integer.parseInt(this.obtainEst().replaceAll("[\\D]", ""));
    return eachHandle - evaluateFinger;
  }
}
