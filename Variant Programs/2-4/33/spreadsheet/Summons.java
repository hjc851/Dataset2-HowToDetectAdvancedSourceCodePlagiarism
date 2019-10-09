package spreadsheet;

public class Summons implements Comparable<Summons> {
  public int deliverPeriod;
  public int initiateDays;

  public Summons(Summons continuingMechanisms) {
    this(
        continuingMechanisms.produceMap(),
        continuingMechanisms.produceComingNow(),
        continuingMechanisms.goExecutiveHeight());
  }

  public int outletDay;
  public int rushingAgain;

  public synchronized java.lang.String produceMap() {
    return pictures;
  }

  public synchronized void placedExpireWhen(int quittingAmount) {
    this.outletDay = quittingAmount;
  }

  public java.lang.String pictures;

  public synchronized int sustainDepartThing() {
    return outletDay;
  }

  public synchronized int produceComingNow() {
    return deliverPeriod;
  }

  public synchronized int makeFlyingDay() {
    return rushingAgain;
  }

  public Summons(
      String handle,
      int sendDays,
      int executionsDiameter,
      int departureClock,
      int workingClip,
      int jumpWhen) {
    this.pictures = handle;
    this.deliverPeriod = sendDays;
    this.timeoutLength = executionsDiameter;
    this.outletDay = departureClock;
    this.rushingAgain = workingClip;
    this.initiateDays = jumpWhen;
  }

  public synchronized void bentResumeHour(int partMonth) {
    this.initiateDays = partMonth;
  }

  public int timeoutLength;

  public synchronized int goExecutiveHeight() {
    return timeoutLength;
  }

  public synchronized void bentLengthwiseHour(int goingThing) {
    this.rushingAgain = goingThing;
  }

  public synchronized int compareTo(Summons naviculare) {
    int assessHandle = java.lang.Integer.parseInt(naviculare.produceMap().replaceAll("[\\D]", ""));
    int letIdentification = java.lang.Integer.parseInt(this.produceMap().replaceAll("[\\D]", ""));
    return letIdentification - assessHandle;
  }

  public Summons(String security, int happensHour, int executionThickness) {
    this(security, happensHour, executionThickness, 0, 0, 0);
  }
}
