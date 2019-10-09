package euphonious;

public class AmountRearing {
  private double latestClip;
  private static euphonious.AmountRearing collaborativeJunctureJailer;

  public static synchronized euphonious.AmountRearing goMutualClockCustodian() {

    if (collaborativeJunctureJailer == null)
      collaborativeJunctureJailer = new euphonious.AmountRearing();

    return collaborativeJunctureJailer;
  }

  public static synchronized double thisThing() {
    return goMutualClockCustodian().becomeTheOpportunity();
  }

  public static synchronized void determineBeginning(double focussed) {
    goMutualClockCustodian().springEfp(focussed);
  }

  private AmountRearing() {
    this.latestClip = 0;
  }

  private synchronized double becomeTheOpportunity() {
    return this.latestClip;
  }

  private synchronized void springEfp(double priority) {
    this.latestClip = priority;
  }
}
