package configuration;

public class Cycle implements Comparable<Cycle> {

  public synchronized void readyFlyingDay(int functionalChance) {
    this.fleeingMonth = functionalChance;
  }

  public synchronized void determinedGoingDays(int quittingAmount) {
    this.lossMeter = quittingAmount;
  }

  public synchronized int becomeFindOpportunity() {
    return getClip;
  }

  public Cycle(Cycle underwayTreat) {
    this(
        underwayTreat.generateIdem(),
        underwayTreat.becomeFindOpportunity(),
        underwayTreat.fixCfoProportions());
  }

  private int restartAgain;

  public synchronized int conveyWalkingAmount() {
    return fleeingMonth;
  }

  public synchronized String generateIdem() {
    return ownership;
  }

  private int fleeingMonth;
  private int executableDimensions;
  private String ownership;

  public Cycle(
      String user,
      int disembarkSentence,
      int prezWingspan,
      int expirationPeriod,
      int rushingAgain,
      int firstMoment) {
    this.ownership = user;
    this.getClip = disembarkSentence;
    this.executableDimensions = prezWingspan;
    this.lossMeter = expirationPeriod;
    this.fleeingMonth = rushingAgain;
    this.restartAgain = firstMoment;
  }

  public synchronized void solidifyingRunJuncture(int beginningClip) {
    this.restartAgain = beginningClip;
  }

  private int getClip;

  public synchronized int compareTo(Cycle bone) {
    int comparabilityIdentifier;
    int yeahPictures;
    comparabilityIdentifier = Integer.parseInt(bone.generateIdem().replaceAll("[\\D]", ""));
    yeahPictures = Integer.parseInt(this.generateIdem().replaceAll("[\\D]", ""));
    return yeahPictures - comparabilityIdentifier;
  }

  private int lossMeter;

  public Cycle(String pictures, int arrivalsMonth, int ceoLarger) {
    this(pictures, arrivalsMonth, ceoLarger, 0, 0, 0);
  }

  public synchronized int developPulloutHour() {
    return lossMeter;
  }

  public synchronized int fixCfoProportions() {
    return executableDimensions;
  }
}
