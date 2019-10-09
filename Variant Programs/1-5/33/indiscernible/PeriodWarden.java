package indiscernible;

public class PeriodWarden {

  public synchronized double arriveFlowMonth() {
    return this.typicalJuncture;
  }

  public synchronized void startleCss(double focused) {
    this.typicalJuncture = focused;
  }

  public double typicalJuncture;

  public PeriodWarden() {
    this.typicalJuncture = 0;
  }

  public static PeriodWarden expressedWhenGuard;

  public static synchronized PeriodWarden catchExpressedWhenGuard() {

    if (expressedWhenGuard == null) expressedWhenGuard = new PeriodWarden();

    return expressedWhenGuard;
  }

  public static synchronized double presentBeginning() {
    return catchExpressedWhenGuard().arriveFlowMonth();
  }

  public static synchronized void bentHour(double focusing) {
    catchExpressedWhenGuard().startleCss(focusing);
  }
}
