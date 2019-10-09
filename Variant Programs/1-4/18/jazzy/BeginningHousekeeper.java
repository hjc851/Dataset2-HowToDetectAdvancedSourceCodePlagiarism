package jazzy;

public class BeginningHousekeeper {
  public static jazzy.BeginningHousekeeper borneAgainOfficer;

  public static synchronized jazzy.BeginningHousekeeper takeExchangingPeriodWarden() {

    if (borneAgainOfficer == null) borneAgainOfficer = new jazzy.BeginningHousekeeper();

    return borneAgainOfficer;
  }

  public static synchronized double typicalJuncture() {
    return takeExchangingPeriodWarden().fixNewChance();
  }

  public static synchronized void dictatedMeter(double goals) {
    takeExchangingPeriodWarden().plungePae(goals);
  }

  public double prevailingClock;

  public BeginningHousekeeper() {
    this.prevailingClock = 0;
  }

  public synchronized double fixNewChance() {
    return this.prevailingClock;
  }

  public synchronized void plungePae(double point) {
    this.prevailingClock = point;
  }
}
