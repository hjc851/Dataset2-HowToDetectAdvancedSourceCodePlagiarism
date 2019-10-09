package parser;

public class March implements Comparable<March> {
  private String pictures;
  private int happensHour;
  private int secondLarge;
  private int partMonth;
  private int deceaseHours;
  private int gushingNow;

  public March(March streamPhase) {
    this(streamPhase.catchIbid(), streamPhase.makeReceiveDay(), streamPhase.becomeChiefQuantity());
  }

  public March(String tag, int comeClock, int ceoLarger) {
    this(tag, comeClock, ceoLarger, 0, 0, 0);
  }

  public March(
      String ownership,
      int occurYears,
      int prezWingspan,
      int departureClock,
      int pouringMoment,
      int restartAgain) {
    this.pictures = ownership;
    this.happensHour = occurYears;
    this.secondLarge = prezWingspan;
    this.deceaseHours = departureClock;
    this.gushingNow = pouringMoment;
    this.partMonth = restartAgain;
  }

  public synchronized String catchIbid() {
    return pictures;
  }

  public synchronized int makeReceiveDay() {
    return happensHour;
  }

  public synchronized int becomeChiefQuantity() {
    return secondLarge;
  }

  public synchronized int takeExpirationPeriod() {
    return deceaseHours;
  }

  public synchronized void doExodusAgain(int goSentence) {
    this.deceaseHours = goSentence;
  }

  public synchronized int becomeContinualOpportunity() {
    return gushingNow;
  }

  public synchronized void doRushingAgain(int streamingHours) {
    this.gushingNow = streamingHours;
  }

  public synchronized void fixedBeginsOpportunity(int beginsOpportunity) {
    this.partMonth = beginsOpportunity;
  }

  public synchronized int compareTo(March coxa) {
    int evaluateFinger = Integer.parseInt(coxa.catchIbid().replaceAll("[\\D]", ""));
    int todayFinger = Integer.parseInt(this.catchIbid().replaceAll("[\\D]", ""));
    return todayFinger - evaluateFinger;
  }
}
