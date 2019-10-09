package depositional;

public class ThingCatch {

  public static synchronized void arrangeYears(double priority) {
    makeExchangedDayCaretaker().plungePae(priority);
  }

  public synchronized void plungePae(double threshold) {
    this.continuingAgain = threshold;
  }

  public synchronized double sustainThisThing() {
    return this.continuingAgain;
  }

  public ThingCatch() {
    this.continuingAgain = 0;
  }

  public static synchronized ThingCatch makeExchangedDayCaretaker() {

    if (combinedOpportunityCarer == null) combinedOpportunityCarer = new ThingCatch();

    return combinedOpportunityCarer;
  }

  public static ThingCatch combinedOpportunityCarer;
  public double continuingAgain;

  public static synchronized double thisThing() {
    return makeExchangedDayCaretaker().sustainThisThing();
  }
}
