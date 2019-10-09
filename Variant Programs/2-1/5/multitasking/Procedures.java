package multitasking;

public class Procedures implements Comparable<Procedures> {
  private String ownership;
  private int enterWhen;
  private int timeoutLength;
  private int goSentence;
  private int dieYear;
  private int rollingJuncture;

  public Procedures(Procedures prevalentMethod) {
    this(
        prevalentMethod.receiveCard(),
        prevalentMethod.takeDeliverPeriod(),
        prevalentMethod.findImplementationSmall());
  }

  public Procedures(String nerfling, int concludeMinutes, int cofounderNumber) {
    this(nerfling, concludeMinutes, cofounderNumber, 0, 0, 0);
  }

  public Procedures(
      String quod,
      int receiveDay,
      int presidentCapacity,
      int escapeOpportunity,
      int gushingNow,
      int getPeriod) {
    this.ownership = quod;
    this.enterWhen = receiveDay;
    this.timeoutLength = presidentCapacity;
    this.dieYear = escapeOpportunity;
    this.rollingJuncture = gushingNow;
    this.goSentence = getPeriod;
  }

  public String receiveCard() {
    return ownership;
  }

  public int takeDeliverPeriod() {
    return enterWhen;
  }

  public int findImplementationSmall() {
    return timeoutLength;
  }

  public int beatLeavingJuncture() {
    return dieYear;
  }

  public void putDepartureClock(int issueNow) {
    this.dieYear = issueNow;
  }

  public int driveRushingAgain() {
    return rollingJuncture;
  }

  public void settledSpoutingPeriods(int operativeMinutes) {
    this.rollingJuncture = operativeMinutes;
  }

  public void settledDepartPeriods(int offsetNow) {
    this.goSentence = offsetNow;
  }

  public int compareTo(Procedures sacrum) {
    int likenedSecurity = Integer.parseInt(sacrum.receiveCard().replaceAll("[\\D]", ""));
    int considerNerfling = Integer.parseInt(this.receiveCard().replaceAll("[\\D]", ""));
    return considerNerfling - likenedSecurity;
  }
}
