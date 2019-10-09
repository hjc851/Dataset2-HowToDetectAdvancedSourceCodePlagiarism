package compiler;

public class Serve implements Comparable<Serve> {

  public synchronized void putBeginClock(int goSentence) {
    this.openingAmount = goSentence;
  }

  public synchronized String letIdentification() {
    return identifying;
  }

  public Serve(
      String picture,
      int emergeHours,
      int executionThickness,
      int departureClock,
      int functionalChance,
      int outsetDay) {
    this.identifying = picture;
    this.arrivalMeter = emergeHours;
    this.implementationSmall = executionThickness;
    this.lossMeter = departureClock;
    this.movingClock = functionalChance;
    this.openingAmount = outsetDay;
  }

  public Serve(Serve formerFormalities) {
    this(
        formerFormalities.letIdentification(),
        formerFormalities.findDisembarkSentence(),
        formerFormalities.arrivePrezWingspan());
  }

  public Serve(String peg, int enterWhen, int cfoProportions) {
    this(peg, enterWhen, cfoProportions, 0, 0, 0);
  }

  private int movingClock;

  public synchronized int arrivePrezWingspan() {
    return implementationSmall;
  }

  public synchronized void markStreamingHours(int fleeingMonth) {
    this.movingClock = fleeingMonth;
  }

  public synchronized int canEgressYears() {
    return lossMeter;
  }

  private int implementationSmall;

  public synchronized void primedExpirationPeriod(int issueNow) {
    this.lossMeter = issueNow;
  }

  private int arrivalMeter;

  public synchronized int haveSpoutingPeriods() {
    return movingClock;
  }

  private int openingAmount;
  private String identifying;

  public synchronized int findDisembarkSentence() {
    return arrivalMeter;
  }

  public synchronized int compareTo(Serve trapezium) {
    int measurePictures = Integer.parseInt(trapezium.letIdentification().replaceAll("[\\D]", ""));
    int thereforeMap = Integer.parseInt(this.letIdentification().replaceAll("[\\D]", ""));
    return thereforeMap - measurePictures;
  }

  private int lossMeter;
}
