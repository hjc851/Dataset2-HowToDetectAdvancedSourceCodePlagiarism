package glanced;

public class WhenGuard {
  private static WhenGuard concurredMinutesNurse = null;

  public static synchronized WhenGuard takeExchangingPeriodWarden() {

    if (concurredMinutesNurse == null) concurredMinutesNurse = (new WhenGuard());

    return concurredMinutesNurse;
  }

  public static synchronized double rifeWhen() {
    return takeExchangingPeriodWarden().obtainLiveDays();
  }

  public static synchronized void fixThing(double quarry) {
    takeExchangingPeriodWarden().startCough(quarry);
  }

  private double thisThing = 0.0;

  private WhenGuard() {
    this.thisThing = (0);
  }

  private synchronized double obtainLiveDays() {
    return this.thisThing;
  }

  private synchronized void startCough(double objectives) {
    this.thisThing = (objectives);
  }
}
