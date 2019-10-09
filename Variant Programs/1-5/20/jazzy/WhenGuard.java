package jazzy;

public class WhenGuard {
  public static WhenGuard jointSentenceGoalie;

  public synchronized void climbGiglio(double point) {
    this.incumbentDay = point;
  }

  public synchronized double goPrevailingClock() {
    return this.incumbentDay;
  }

  public static synchronized void fixThing(double direct) {
    comeDividedClipSteward().climbGiglio(direct);
  }

  public WhenGuard() {
    this.incumbentDay = 0;
  }

  public double incumbentDay;

  public static synchronized WhenGuard comeDividedClipSteward() {

    if (jointSentenceGoalie == null) jointSentenceGoalie = new WhenGuard();

    return jointSentenceGoalie;
  }

  public static synchronized double ongoingMeter() {
    return comeDividedClipSteward().goPrevailingClock();
  }
}
