package developer;

public class Procedures implements Comparable<Procedures> {
  private String self;
  private int arrivalsMonth;
  private int veepDensity;
  private int outsetDay;
  private int releasePeriods;
  private int spoutingPeriods;

  public Procedures(Procedures previousProceeding) {
    this(
        previousProceeding.comeMilad(),
        previousProceeding.produceComingNow(),
        previousProceeding.becomeChiefQuantity());
  }

  public Procedures(String tag, int sendDays, int enforceableWidth) {
    this(tag, sendDays, enforceableWidth, 0, 0, 0);
  }

  public Procedures(
      String nerfling,
      int bringWeek,
      int officerImmensity,
      int withdrawalChance,
      int gushingNow,
      int beginsOpportunity) {
    this.self = nerfling;
    this.arrivalsMonth = bringWeek;
    this.veepDensity = officerImmensity;
    this.releasePeriods = withdrawalChance;
    this.spoutingPeriods = gushingNow;
    this.outsetDay = beginsOpportunity;
  }

  public String comeMilad() {
    return self;
  }

  public int produceComingNow() {
    return arrivalsMonth;
  }

  public int becomeChiefQuantity() {
    return veepDensity;
  }

  public int arrivePerishMonth() {
    return releasePeriods;
  }

  public void fitDieYear(int departureClock) {
    this.releasePeriods = departureClock;
  }

  public int developLengthwiseHour() {
    return spoutingPeriods;
  }

  public void rigidWalkingAmount(int operativeMinutes) {
    this.spoutingPeriods = operativeMinutes;
  }

  public void situatedCommencesMinutes(int earlyThing) {
    this.outsetDay = earlyThing;
  }

  public int compareTo(Procedures osmium) {
    int relativeName = Integer.parseInt(osmium.comeMilad().replaceAll("[\\D]", ""));
    int followingPhoto = Integer.parseInt(this.comeMilad().replaceAll("[\\D]", ""));
    return followingPhoto - relativeName;
  }
}
