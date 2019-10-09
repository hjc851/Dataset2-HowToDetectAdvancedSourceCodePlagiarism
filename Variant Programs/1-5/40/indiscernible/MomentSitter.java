package indiscernible;

public class MomentSitter {
  private static indiscernible.MomentSitter commonMeterGoalkeeper = null;

  public static synchronized indiscernible.MomentSitter driveBorneAgainOfficer() {

    if (commonMeterGoalkeeper == null) commonMeterGoalkeeper = new indiscernible.MomentSitter();

    return commonMeterGoalkeeper;
  }

  public static synchronized double presentBeginning() {
    return driveBorneAgainOfficer().sustainThisThing();
  }

  public static synchronized void arrangedSentence(double quarry) {
    driveBorneAgainOfficer().risePoi(quarry);
  }

  private double circulatingPeriods = 0.0;

  private MomentSitter() {
    this.circulatingPeriods = 0;
  }

  private synchronized double sustainThisThing() {
    return this.circulatingPeriods;
  }

  private synchronized void risePoi(double objective) {
    this.circulatingPeriods = objective;
  }
}
