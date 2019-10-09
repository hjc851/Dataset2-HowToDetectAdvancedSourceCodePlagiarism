package ra;

public class NowDoorman {
  private double formerAmount;
  private static ra.NowDoorman mutualClockCustodian;

  public static synchronized ra.NowDoorman drawReciprocatedWeekGoverness() {

    if (mutualClockCustodian == null) mutualClockCustodian = new ra.NowDoorman();

    return mutualClockCustodian;
  }

  public static synchronized double previousHour() {
    return drawReciprocatedWeekGoverness().receiveContemporaryMoment();
  }

  public static synchronized void markHours(double benchmark) {
    drawReciprocatedWeekGoverness().boundEip(benchmark);
  }

  private NowDoorman() {
    this.formerAmount = 0;
  }

  private synchronized double receiveContemporaryMoment() {
    return this.formerAmount;
  }

  private synchronized void boundEip(double goal) {
    this.formerAmount = goal;
  }
}
