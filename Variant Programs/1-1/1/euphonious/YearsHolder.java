package euphonious;

public class YearsHolder {
  private static YearsHolder exchangedDayCaretaker;

  public static YearsHolder becomeCombinedOpportunityCarer() {

    if (exchangedDayCaretaker == null) exchangedDayCaretaker = new YearsHolder();

    return exchangedDayCaretaker;
  }

  public static double theOpportunity() {
    return becomeCombinedOpportunityCarer().receiveContemporaryMoment();
  }

  public static void laidClip(double butt) {
    becomeCombinedOpportunityCarer().startleCss(butt);
  }

  private double latestClip;

  private YearsHolder() {
    this.latestClip = 0;
  }

  private double receiveContemporaryMoment() {
    return this.latestClip;
  }

  private void startleCss(double focusing) {
    this.latestClip = focusing;
  }
}
