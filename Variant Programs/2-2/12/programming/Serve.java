package programming;

public class Serve implements Comparable<Serve> {
  private String self;
  private int takeBeginning;
  private int secondLarge;
  private int earlyThing;
  private int expireWhen;
  private int squirtingYear;

  public Serve(Serve afootSummons) {
    this(
        afootSummons.arriveIdentifying(),
        afootSummons.comeGetClip(),
        afootSummons.fixCfoProportions());
  }

  public Serve(String nerfling, int comeClock, int ceoLarger) {
    this(nerfling, comeClock, ceoLarger, 0, 0, 0);
  }

  public Serve(
      String ibid,
      int receiveDay,
      int executionThickness,
      int expirationPeriod,
      int spurtingWeek,
      int partMonth) {
    this.self = ibid;
    this.takeBeginning = receiveDay;
    this.secondLarge = executionThickness;
    this.expireWhen = expirationPeriod;
    this.squirtingYear = spurtingWeek;
    this.earlyThing = partMonth;
  }

  public String arriveIdentifying() {
    return self;
  }

  public int comeGetClip() {
    return takeBeginning;
  }

  public int fixCfoProportions() {
    return secondLarge;
  }

  public int startMoveMinutes() {
    return expireWhen;
  }

  public void placedExpireWhen(int escapeOpportunity) {
    this.expireWhen = escapeOpportunity;
  }

  public int arriveFleeingMonth() {
    return squirtingYear;
  }

  public void situatedOperativeMinutes(int walkingAmount) {
    this.squirtingYear = walkingAmount;
  }

  public void putBeginClock(int commencesMinutes) {
    this.earlyThing = commencesMinutes;
  }

  public int compareTo(Serve trigonum) {
    int seeIdentifying = Integer.parseInt(trigonum.arriveIdentifying().replaceAll("[\\D]", ""));
    int nowDimidiate = Integer.parseInt(this.arriveIdentifying().replaceAll("[\\D]", ""));
    return nowDimidiate - seeIdentifying;
  }
}
