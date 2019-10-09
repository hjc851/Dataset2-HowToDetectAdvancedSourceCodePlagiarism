package parser;

public class Summons implements Comparable<Summons> {
  private String tag;
  private int hearThing;
  private int executionsDiameter;
  private int beginningClip;
  private int quittingAmount;
  private int rollingJuncture;

  public Summons(Summons liveOutgrowth) {
    this(
        liveOutgrowth.comeMilad(),
        liveOutgrowth.becomeFindOpportunity(),
        liveOutgrowth.drawBossScope());
  }

  public Summons(String handle, int arrivalsMonth, int implementationSmall) {
    this(handle, arrivalsMonth, implementationSmall, 0, 0, 0);
  }

  public Summons(
      String caller,
      int reachYear,
      int chiefQuantity,
      int deceaseHours,
      int jettingWhen,
      int openingAmount) {
    this.tag = caller;
    this.hearThing = reachYear;
    this.executionsDiameter = chiefQuantity;
    this.quittingAmount = deceaseHours;
    this.rollingJuncture = jettingWhen;
    this.beginningClip = openingAmount;
  }

  public String comeMilad() {
    return tag;
  }

  public int becomeFindOpportunity() {
    return hearThing;
  }

  public int drawBossScope() {
    return executionsDiameter;
  }

  public int obtainGoingDays() {
    return quittingAmount;
  }

  public void rigidQuittingAmount(int goingDays) {
    this.quittingAmount = goingDays;
  }

  public int fixFunctionalChance() {
    return rollingJuncture;
  }

  public void markStreamingHours(int streamingHours) {
    this.rollingJuncture = streamingHours;
  }

  public void layFirstMoment(int commencementYear) {
    this.beginningClip = commencementYear;
  }

  public int compareTo(Summons montes) {
    int comparativeIdentification = Integer.parseInt(montes.comeMilad().replaceAll("[\\D]", ""));
    int considerNerfling = Integer.parseInt(this.comeMilad().replaceAll("[\\D]", ""));
    return considerNerfling - comparativeIdentification;
  }
}
