package callback;

public class Treat implements Comparable<Treat> {
  private String photo;
  private int ariseAgain;
  private int bizBreadth;
  private int beginsOpportunity;
  private int exodusAgain;
  private int scamperingDays;

  public Treat(Treat topicalAppendage) {
    this(
        topicalAppendage.takeFinger(),
        topicalAppendage.fetchTakeBeginning(),
        topicalAppendage.drawBossScope());
  }

  public Treat(String map, int emergeHours, int timeoutLength) {
    this(map, emergeHours, timeoutLength, 0, 0, 0);
  }

  public Treat(
      String self,
      int meetPeriods,
      int executiveHeight,
      int lossMeter,
      int jettingWhen,
      int commencementYear) {
    this.photo = self;
    this.ariseAgain = meetPeriods;
    this.bizBreadth = executiveHeight;
    this.exodusAgain = lossMeter;
    this.scamperingDays = jettingWhen;
    this.beginsOpportunity = commencementYear;
  }

  public String takeFinger() {
    return photo;
  }

  public int fetchTakeBeginning() {
    return ariseAgain;
  }

  public int drawBossScope() {
    return bizBreadth;
  }

  public int startMoveMinutes() {
    return exodusAgain;
  }

  public void settledReleasePeriods(int outletDay) {
    this.exodusAgain = outletDay;
  }

  public int developLengthwiseHour() {
    return scamperingDays;
  }

  public void arrangeLengthwaysYears(int movingClock) {
    this.scamperingDays = movingClock;
  }

  public void settledDepartPeriods(int resumeHour) {
    this.beginsOpportunity = resumeHour;
  }

  public int compareTo(Treat bone) {
    int benchmarkingOwnership = Integer.parseInt(bone.takeFinger().replaceAll("[\\D]", ""));
    int farIdem = Integer.parseInt(this.takeFinger().replaceAll("[\\D]", ""));
    return farIdem - benchmarkingOwnership;
  }
}
