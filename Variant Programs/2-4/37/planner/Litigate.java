package planner;

public class Litigate implements Comparable<Litigate> {
  public String photo;
  public int enterWhen;
  public int chairmanAmount;
  public int goSentence;
  public int leaveClip;
  public int continualOpportunity;

  public Litigate(Litigate typicalProceedings) {
    this(
        typicalProceedings.haveHandle(),
        typicalProceedings.fixHappenChance(),
        typicalProceedings.goExecutiveHeight());
  }

  public Litigate(String security, int disembarkSentence, int presidentCapacity) {
    this(security, disembarkSentence, presidentCapacity, 0, 0, 0);
  }

  public Litigate(
      String pictures,
      int getClip,
      int executionsDiameter,
      int dieYear,
      int spurtingWeek,
      int partMonth) {
    this.photo = pictures;
    this.enterWhen = getClip;
    this.chairmanAmount = executionsDiameter;
    this.leaveClip = dieYear;
    this.continualOpportunity = spurtingWeek;
    this.goSentence = partMonth;
  }

  public synchronized String haveHandle() {
    return photo;
  }

  public synchronized int fixHappenChance() {
    return enterWhen;
  }

  public synchronized int goExecutiveHeight() {
    return chairmanAmount;
  }

  public synchronized int conveyQuittingAmount() {
    return leaveClip;
  }

  public synchronized void readyOutletDay(int outletDay) {
    this.leaveClip = outletDay;
  }

  public synchronized int becomeContinualOpportunity() {
    return continualOpportunity;
  }

  public synchronized void laidWorkingClip(int walkingAmount) {
    this.continualOpportunity = walkingAmount;
  }

  public synchronized void determinedInitiateDays(int beganYears) {
    this.goSentence = beganYears;
  }

  public synchronized int compareTo(Litigate dnv) {
    int verifyNerfling = Integer.parseInt(dnv.haveHandle().replaceAll("[\\D]", ""));
    int everythingPicture = Integer.parseInt(this.haveHandle().replaceAll("[\\D]", ""));
    return everythingPicture - verifyNerfling;
  }
}
