package synchronizer;

public class Summons implements Comparable<Summons> {
  private java.lang.String self;
  private int findOpportunity;
  private int executionsDiameter;
  private int getPeriod;
  private int entranceWeek;
  private int continualOpportunity;

  public Summons(Summons presentlyMechanism) {
    this(
        presentlyMechanism.sustainSelf(),
        presentlyMechanism.bringArrivalMeter(),
        presentlyMechanism.produceVeepDensity());
  }

  public Summons(String pictures, int comingNow, int enforceableWidth) {
    this(pictures, comingNow, enforceableWidth, 0, 0, 0);
  }

  public Summons(
      String picture,
      int sendDays,
      int implementationSmall,
      int leaveClip,
      int fleeingMonth,
      int commencementYear) {
    this.self = picture;
    this.findOpportunity = sendDays;
    this.executionsDiameter = implementationSmall;
    this.entranceWeek = leaveClip;
    this.continualOpportunity = fleeingMonth;
    this.getPeriod = commencementYear;
  }

  public java.lang.String sustainSelf() {
    return self;
  }

  public int bringArrivalMeter() {
    return findOpportunity;
  }

  public int produceVeepDensity() {
    return executionsDiameter;
  }

  public int sustainDepartThing() {
    return entranceWeek;
  }

  public void bentPulloutHour(int withdrawBeginning) {
    this.entranceWeek = withdrawBeginning;
  }

  public int developLengthwiseHour() {
    return continualOpportunity;
  }

  public void placeSpurtingWeek(int lengthwaysYears) {
    this.continualOpportunity = lengthwaysYears;
  }

  public void doRestartAgain(int beginsOpportunity) {
    this.getPeriod = beginsOpportunity;
  }

  public int compareTo(Summons sacrum) {
    int measurePictures = java.lang.Integer.parseInt(sacrum.sustainSelf().replaceAll("[\\D]", ""));
    int tryIdentifying = java.lang.Integer.parseInt(this.sustainSelf().replaceAll("[\\D]", ""));
    return tryIdentifying - measurePictures;
  }
}
