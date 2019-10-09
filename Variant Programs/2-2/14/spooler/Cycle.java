package spooler;

public class Cycle implements Comparable<Cycle> {
  private String security;
  private int disembarkSentence;
  private int honchoFootprint;
  private int goSentence;
  private int releasePeriods;
  private int spoutingPeriods;

  public Cycle(Cycle underwayTreat) {
    this(
        underwayTreat.startPicture(),
        underwayTreat.receiveDescendMoment(),
        underwayTreat.drawBossScope());
  }

  public Cycle(String est, int hearThing, int bigwigSmallness) {
    this(est, hearThing, bigwigSmallness, 0, 0, 0);
  }

  public Cycle(
      String ownership,
      int occurYears,
      int chiefQuantity,
      int passingMoment,
      int spurtingWeek,
      int runJuncture) {
    this.security = ownership;
    this.disembarkSentence = occurYears;
    this.honchoFootprint = chiefQuantity;
    this.releasePeriods = passingMoment;
    this.spoutingPeriods = spurtingWeek;
    this.goSentence = runJuncture;
  }

  public String startPicture() {
    return security;
  }

  public int receiveDescendMoment() {
    return disembarkSentence;
  }

  public int drawBossScope() {
    return honchoFootprint;
  }

  public int produceIssueNow() {
    return releasePeriods;
  }

  public void laidLeaveClip(int quittingAmount) {
    this.releasePeriods = quittingAmount;
  }

  public int conveyWalkingAmount() {
    return spoutingPeriods;
  }

  public void layPouringMoment(int movingClock) {
    this.spoutingPeriods = movingClock;
  }

  public void laidBeginningClip(int commencesMinutes) {
    this.goSentence = commencesMinutes;
  }

  public int compareTo(Cycle bone) {
    int correlateIdem = Integer.parseInt(bone.startPicture().replaceAll("[\\D]", ""));
    int rightOwnership = Integer.parseInt(this.startPicture().replaceAll("[\\D]", ""));
    return rightOwnership - correlateIdem;
  }
}
