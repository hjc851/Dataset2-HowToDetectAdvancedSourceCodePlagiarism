package ra;

public class NowDoorman {
  private static NowDoorman presentedAmountRearing;

  public static NowDoorman receiveDistributedMomentSitter() {

    if (presentedAmountRearing == null) presentedAmountRearing = new NowDoorman();

    return presentedAmountRearing;
  }

  public static double existingYears() {
    return receiveDistributedMomentSitter().canExistingYears();
  }

  public static void determinedDays(double goals) {
    receiveDistributedMomentSitter().plungePae(goals);
  }

  private double prevailingClock;

  private NowDoorman() {
    this.prevailingClock = 0;
  }

  private double canExistingYears() {
    return this.prevailingClock;
  }

  private void plungePae(double benchmark) {
    this.prevailingClock = benchmark;
  }
}
